package com.liferay.training.library.portlet;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.training.library.model.Publisher;
import com.liferay.training.library.model.impl.PublisherImpl;
import com.liferay.training.library.service.PublisherLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
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

		PublisherLocalServiceUtil.addPublisher(publisher);

		/* Placeholder for SessionMessages */

		sendRedirect(request, response);
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

	private static Log _log = LogFactoryUtil.getLog(PublisherPortlet.class);

}
