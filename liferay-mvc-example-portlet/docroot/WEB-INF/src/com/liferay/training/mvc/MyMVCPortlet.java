package com.liferay.training.mvc;

import com.liferay.util.bridges.mvc.MVCPortlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletMode;

public class MyMVCPortlet extends MVCPortlet {

	public void processAction(ActionRequest request, ActionResponse response) throws IOException, PortletException {

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String employeeId = request.getParameter("employeeId");

		System.out.println("Adding new employee:  " + firstName + " " + lastName + " " + employeeId);

		response.setPortletMode(PortletMode.VIEW);
	}
}
