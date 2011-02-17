package com.liferay.training.ipc;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.io.IOException;
import java.util.Random;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.xml.namespace.QName;

/**
 * Portlet implementation class PitcherPortlet
 */
public class PitcherPortlet extends GenericPortlet {

	public void init() {
		viewJSP = getInitParameter("view-jsp");
	}

	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {

		include(viewJSP, renderRequest, renderResponse);
	}

	@ProcessAction(name = "pitchBall")
	public void pitchBall(ActionRequest request, ActionResponse response) {
		String pitchType = null;
		// Send an Event that the ball has been pitched.
		Random random = new Random(System.currentTimeMillis());
		int pitch = random.nextInt(3) + 1;
		switch (pitch) {
		case 1:
			pitchType = "Fast Ball";
			break;
		case 2:
			pitchType = "Curve Ball";
			break;
		case 3:
			pitchType = "Slider";
			break;
		// should never print
		default:
			pitchType = "Screw Ball";
		}
		QName qName = new QName("http://liferay.com/events", "ipc.pitch");
		response.setEvent(qName, pitchType);
	}

	protected void include(String path, RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {

		PortletRequestDispatcher portletRequestDispatcher = getPortletContext().getRequestDispatcher(path);

		if (portletRequestDispatcher == null) {
			_log.error(path + " is not a valid include");
		} else {
			portletRequestDispatcher.include(renderRequest, renderResponse);
		}
	}

	protected String viewJSP;

	private static Log _log = LogFactoryUtil.getLog(PitcherPortlet.class);

}
