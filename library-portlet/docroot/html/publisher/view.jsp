<%@include file="/html/init.jsp" %>

<%
	String redirect = PortalUtil.getCurrentURL(renderRequest);	
%>

<aui:button-row>
	<portlet:renderURL var="addPublisherURL">
		<portlet:param name="jspPage" value="/html/publisher/edit_publisher.jsp" />
		<portlet:param name="redirect" value="<%= redirect %>" />
	</portlet:renderURL>

	<aui:button value="Add Publisher" onClick="<%= addPublisherURL.toString() %>"/>
</aui:button-row>