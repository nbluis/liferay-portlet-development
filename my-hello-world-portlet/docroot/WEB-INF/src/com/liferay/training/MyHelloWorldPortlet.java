package com.liferay.training;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.EventRequest;
import javax.portlet.EventResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletMode;
import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * Portlet implementation class MyHelloWorldPortlet
 */
public class MyHelloWorldPortlet extends GenericPortlet {

	public void init() {
		editJSP = getInitParameter("edit-jsp");
		viewJSP = getInitParameter("view-jsp");
	}

	public void processAction(ActionRequest request, ActionResponse response) throws IOException, PortletException {

		String name = request.getParameter("name");

		PortletPreferences prefs = request.getPreferences();

		prefs.setValue("NAME", name);
		prefs.store();

		response.setPortletMode(PortletMode.VIEW);
	}

	public void doEdit(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {

		include(editJSP, renderRequest, renderResponse);
	}

	public void doView(RenderRequest request, RenderResponse response) throws IOException, PortletException {

		PortletPreferences prefs = request.getPreferences();

		String defaultValue = "";

		String name = (String) prefs.getValue("NAME", defaultValue);

		request.setAttribute("ATTRIBUTE_NAME", name);

		include(viewJSP, request, response);
	}

	protected void include(String path, RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {

		PortletRequestDispatcher portletRequestDispatcher = getPortletContext().getRequestDispatcher(path);

		if (portletRequestDispatcher == null) {
			_log.error(path + " is not a valid include");
		} else {
			portletRequestDispatcher.include(renderRequest, renderResponse);
		}
	}

	protected String editJSP;
	protected String viewJSP;

	private static Log _log = LogFactoryUtil.getLog(MyHelloWorldPortlet.class);

}
