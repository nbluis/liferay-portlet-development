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
