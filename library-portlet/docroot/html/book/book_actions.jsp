<%@include file="/html/init.jsp" %>

<%
ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
Book book = (Book)row.getObject();

long groupId = book.getGroupId();
String name = Book.class.getName();
long bookId = book.getBookId();

String redirect = PortalUtil.getCurrentURL(renderRequest);
%>

<liferay-ui:icon-menu >
	<portlet:renderURL var="editURL">
		<portlet:param name="jspPage" value="/html/book/edit_book.jsp" />
		<portlet:param name="bookId" value="<%= String.valueOf(bookId) %>"/>
		<portlet:param name="redirect" value="<%= redirect %>"/>
	</portlet:renderURL>

	<liferay-ui:icon image="edit" url="<%=editURL.toString() %>" />

	<portlet:actionURL name="deleteBook" var="deleteURL">
		<portlet:param name="bookId" value="<%= String.valueOf(bookId) %>" />
		<portlet:param name="redirect" value="<%= PortalUtil.getCurrentURL(renderRequest) %>"/>
	</portlet:actionURL>
		
	<liferay-ui:icon image="delete" url="<%=deleteURL.toString() %>" />
</liferay-ui:icon-menu>