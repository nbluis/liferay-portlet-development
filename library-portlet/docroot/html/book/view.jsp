<%@include file="/html/init.jsp" %>

<%
String redirect = PortalUtil.getCurrentURL(renderRequest);
%>

<aui:button-row>
	<portlet:renderURL var="addBookURL">
		<portlet:param name="jspPage" value="/html/book/edit_book.jsp" />
		<portlet:param name="redirect" value="<%= redirect %>" />
	</portlet:renderURL>

	<aui:button name="addBookButton" value="Add Book" onClick="<%=addBookURL %>"/>
</aui:button-row>
