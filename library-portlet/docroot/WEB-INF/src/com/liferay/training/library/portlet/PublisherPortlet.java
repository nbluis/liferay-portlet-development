package com.liferay.training.library.portlet;

import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.training.library.model.Publisher;
import com.liferay.training.library.model.impl.PublisherImpl;
import com.liferay.training.library.service.PublisherLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.sun.corba.se.spi.servicecontext.UEInfoServiceContext;

import java.util.ArrayList;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequest;

/**
 * Portlet implementation class PublisherPortlet
 */
public class PublisherPortlet extends MVCPortlet {

	/**
	 * Adds a new publisher to the database
	 * 
	 */
	public void addPublisher(ActionRequest request, ActionResponse response) throws Exception {

		Publisher publisher = publisherFromRequest(request);

		ArrayList<String> errors = new ArrayList<String>();

		if (PublisherValidator.validatePublisher(publisher, errors)) {
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
			PublisherLocalServiceUtil.addPublisher(publisher, themeDisplay.getUserId());

			SessionMessages.add(request, "publisher-added");

			sendRedirect(request, response);
		} else {
			for (String error : errors) {
				SessionErrors.add(request, error);
			}

			PortalUtil.copyRequestParameters(request, response);

			response.setRenderParameter("jspPage", "/html/publisher/edit_publisher.jsp");
		}
	}

	/**
	 * Updates the database record of an existing publisher.
	 * 
	 */
	public void updatePublisher(ActionRequest request, ActionResponse response) throws Exception {

		Publisher publisher = publisherFromRequest(request);

		ArrayList<String> errors = new ArrayList<String>();

		if (PublisherValidator.validatePublisher(publisher, errors)) {
			PublisherLocalServiceUtil.updatePublisher(publisher);

			SessionMessages.add(request, "publisher-updated");

			sendRedirect(request, response);
		} else {
			for (String error : errors) {
				SessionErrors.add(request, error);
			}

			PortalUtil.copyRequestParameters(request, response);

			response.setRenderParameter("jspPage", "/html/publisher/edit_publisher.jsp");
		}
	}

	/**
	 * Deletes a publisher from the database.
	 * 
	 */
	public void deletePublisher(ActionRequest request, ActionResponse response) throws Exception {

		long publisherId = ParamUtil.getLong(request, "publisherId");

		if (Validator.isNotNull(publisherId)) {
			PublisherLocalServiceUtil.deletePublisher(publisherId);

			SessionMessages.add(request, "publisher-deleted");

			sendRedirect(request, response);
		} else {
			SessionErrors.add(request, "error-deleting");
		}
	}

	/**
	 * Sets the preferences for how many publishers can be viewed per page and
	 * the format for the phone number
	 * 
	 */
	public void setPublisherPref(ActionRequest request, ActionResponse response) throws Exception {

		String rowsPerPage = ParamUtil.getString(request, "rowsPerPage");
		String phoneFormat = ParamUtil.getString(request, "phoneFormat");

		PortletPreferences prefs = request.getPreferences();

		prefs.setValue("rowsPerPage", rowsPerPage);
		prefs.setValue("phoneFormat", phoneFormat);

		prefs.store();
	}

	/**
	 * Convenience method to create a Publisher object out of the request. Used
	 * by the Add / Edit methods.
	 * 
	 */
	private Publisher publisherFromRequest(PortletRequest request) {
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

		PublisherImpl publisher = new PublisherImpl();

		publisher.setPublisherId(ParamUtil.getLong(request, "publisherId"));
		publisher.setName(ParamUtil.getString(request, "name"));
		publisher.setEmailAddress(ParamUtil.getString(request, "emailAddress"));
		publisher.setWebsite(ParamUtil.getString(request, "website"));
		publisher.setPhoneNumber(ParamUtil.getString(request, "phoneNumber"));
		publisher.setCompanyId(themeDisplay.getCompanyId());
		publisher.setGroupId(themeDisplay.getScopeGroupId());

		return publisher;
	}

}
