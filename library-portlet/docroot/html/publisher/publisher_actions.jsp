<%@include file="/html/init.jsp" %>

<%
ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
Publisher publisher = (Publisher)row.getObject();

long groupId = publisher.getGroupId();
String name = Publisher.class.getName();
long publisherId = publisher.getPublisherId();

String redirect = PortalUtil.getCurrentURL(renderRequest);
%>

<liferay-ui:icon-menu>
	<c:if test="<%= permissionChecker.hasPermission(groupId, name, publisherId, ActionKeys.UPDATE) %>">
		<portlet:renderURL var="editURL">
			<portlet:param name="jspPage" value="/html/publisher/edit_publisher.jsp" />
			<portlet:param name="publisherId" value="<%= String.valueOf(publisherId) %>"/>
			<portlet:param name="redirect" value="<%= redirect %>"/>
		</portlet:renderURL>
	
		<liferay-ui:icon image="edit" url="<%=editURL.toString() %>" />
	</c:if>

	<c:if test="<%= permissionChecker.hasPermission(groupId, name, publisherId, ActionKeys.DELETE) %>">
		<portlet:actionURL name="deletePublisher" var="deleteURL">
			<portlet:param name="publisherId" value="<%= String.valueOf(publisherId) %>" />
			<portlet:param name="redirect" value="<%= redirect %>"/>
		</portlet:actionURL>
		
		<liferay-ui:icon image="delete" url="<%=deleteURL.toString() %>" />
	</c:if>
	
	<c:if test="<%= permissionChecker.hasPermission(groupId, name, publisherId, ActionKeys.PERMISSIONS) %>">
		<liferay-security:permissionsURL
			modelResource="<%= Publisher.class.getName() %>"
			modelResourceDescription="<%= publisher.getName() %>"
			resourcePrimKey="<%= String.valueOf(publisherId) %>"
			var="permissionsURL"
		/>
		
		<liferay-ui:icon image="permissions" url="<%= permissionsURL %>" />
	</c:if>
</liferay-ui:icon-menu>