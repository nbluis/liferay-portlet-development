package com.liferay.training.demo;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * Portlet implementation class DemoPortlet
 */
public class DemoPortlet extends GenericPortlet {

    public void init() {
    	
        editJSP = getInitParameter("edit-jsp");
        helpJSP = getInitParameter("help-jsp");
        viewJSP = getInitParameter("view-jsp");
        
        System.out.println("Inside of init()");
    }

    public void destroy() {
        System.out.println("Inside of destroy()");
    	super.destroy();
    }

    public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException{
    	
    	System.out.println("Inside of render()");
    	
    	super.render(renderRequest, renderResponse);
    	
    }
    
	public void doDispatch(
			RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {
		
		//System.out.println("Inside doDispatch()");
		
		super.doDispatch(renderRequest, renderResponse);
		
	}

    public void doEdit(
            RenderRequest renderRequest, RenderResponse renderResponse)
        throws IOException, PortletException {
        
    	//System.out.println("Inside doEdit()");

    	include(editJSP, renderRequest, renderResponse);
    }
    
    public void doHelp(
            RenderRequest renderRequest, RenderResponse renderResponse)
        throws IOException, PortletException {
        
    	//System.out.println("Inside doHelp()");
    	
        include(helpJSP, renderRequest, renderResponse);
    }
    
    public void doView(
            RenderRequest renderRequest, RenderResponse renderResponse)
        throws IOException, PortletException {
        
    	//System.out.println("Inside doView()");
    	
        include(viewJSP, renderRequest, renderResponse);
    }

    public void processAction(
            ActionRequest actionRequest, ActionResponse actionResponse)
        throws IOException, PortletException {
    	
    	System.out.println("Inside of processAction()");
    	
    }
    
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
	throws PortletException, IOException{
	
		System.out.println("Inside serveResource()");
		resourceResponse.setContentType("text/html");
		resourceResponse.getWriter().write("Resource served successfully!");
	}


    protected void include(
            String path, RenderRequest renderRequest,
            RenderResponse renderResponse)
        throws IOException, PortletException {

        PortletRequestDispatcher portletRequestDispatcher =
            getPortletContext().getRequestDispatcher(path);

        if (portletRequestDispatcher == null) {
            _log.error(path + " is not a valid include");
        }
        else {
            portletRequestDispatcher.include(renderRequest, renderResponse);
        }
    }
 
    protected String editJSP;
    protected String helpJSP;
    protected String viewJSP;

    private static Log _log = LogFactoryUtil.getLog(DemoPortlet.class);

}
