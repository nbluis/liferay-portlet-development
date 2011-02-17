package com.liferay.training.library.portlet;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.training.library.model.Book;
import com.liferay.training.library.model.impl.BookImpl;
import com.liferay.training.library.service.BookLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequest;

/**
 * Portlet implementation class BookPortlet
 */
public class BookPortlet extends MVCPortlet {

	/**
	 * Adds a new book to the database.
	 * 
	 */
	public void addBook(ActionRequest request, ActionResponse response) throws Exception {

		ArrayList<String> errors = new ArrayList<String>();

		Book book = bookFromRequest(request);

		BookLocalServiceUtil.addBook(book);

		/* Placeholder for SessionMessages */

		sendRedirect(request, response);
	}

	/**
	 * Updates the database record of an existing book.
	 * 
	 */
	public void updateBook(ActionRequest request, ActionResponse response) throws Exception {

		Book book = bookFromRequest(request);

		BookLocalServiceUtil.updateBook(book);

		/* Placeholder for SessionMessages */

		sendRedirect(request, response);
	}

	/**
	 * Deletes a book from the database.
	 * 
	 */
	public void deleteBook(ActionRequest request, ActionResponse response) throws Exception {

		long bookId = ParamUtil.getLong(request, "bookId");

		BookLocalServiceUtil.deleteBook(bookId);

		/* Placeholder for SessionMessages */

		sendRedirect(request, response);
	}

	/**
	 * Sets the preferences for how many books can be viewed per page and the
	 * format for the date.
	 * 
	 */
	public void setBookPref(ActionRequest request, ActionResponse response) throws Exception {

		String rowsPerPage = ParamUtil.getString(request, "rowsPerPage");
		String dateFormat = ParamUtil.getString(request, "dateFormat");

		ArrayList<String> errors = new ArrayList<String>();

		PortletPreferences prefs = request.getPreferences();

		prefs.setValue("rowsPerPage", rowsPerPage);
		prefs.setValue("dateFormat", dateFormat);

		prefs.store();
	}

	/**
	 * Convenience method to create a Book object out of the request. Used by
	 * the Add / Edit methods.
	 * 
	 */
	private Book bookFromRequest(PortletRequest request) {
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

		int publicationDateMonth = ParamUtil.getInteger(request, "publicationDateMonth");
		int publicationDateDay = ParamUtil.getInteger(request, "publicationDateDay");
		int publicationDateYear = ParamUtil.getInteger(request, "publicationDateYear");

		Date publicationDate = PortalUtil.getDate(publicationDateMonth, publicationDateDay, publicationDateYear);
		Map<Locale, String> titleMap = LocalizationUtil.getLocalizationMap(request, "title");

		Book book = new BookImpl();

		book.setBookId(ParamUtil.getLong(request, "bookId"));
		book.setTitleMap(titleMap);
		book.setAuthorName(ParamUtil.getString(request, "authorName"));
		book.setPublicationDate(publicationDate);
		book.setPublisherId(ParamUtil.getLong(request, "publisherId"));
		book.setCompanyId(themeDisplay.getCompanyId());
		book.setGroupId(themeDisplay.getScopeGroupId());

		return book;
	}

	private static Log _log = LogFactoryUtil.getLog(BookPortlet.class);

}
