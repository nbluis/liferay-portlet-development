<%@include file="/html/init.jsp" %>
<liferay-ui:success key="publisher-added" message="publisher-added-successfully" />
<liferay-ui:success key="publisher-updated" message="publisher-updated-successfully" />
<liferay-ui:success key="publisher-deleted" message="publisher-deleted-successfully" />

<%
	boolean hasAddPermission = permissionChecker.hasPermission(
			scopeGroupId, "com.liferay.training.library.model",
			scopeGroupId, "ADD_PUBLISHER");
	boolean hasConfigurePermission = permissionChecker.hasPermission(
			scopeGroupId, Group.class.getName(), scopeGroupId,
			ActionKeys.PERMISSIONS);

	String redirect = PortalUtil.getCurrentURL(renderRequest);
%>

<c:if test='<%= hasAddPermission %>'>
	<portlet:renderURL var="addPublisherURL">
		<portlet:param name="jspPage" value="/html/publisher/edit_publisher.jsp" />
		<portlet:param name="redirect" value="<%= redirect %>" />
	</portlet:renderURL>

	<aui:button value="add-publisher" onClick="<%= addPublisherURL.toString() %>"/>
</c:if>
<c:if test='<%= hasConfigurePermission %>'>
	<liferay-security:permissionsURL
	  modelResource="com.liferay.training.library.model"
	  modelResourceDescription="library-top-level-actions"
	  resourcePrimKey="<%= String.valueOf(scopeGroupId) %>"
	  var="permissionsURL"
	/>

	<aui:button value="permissions" onClick="<%= permissionsURL %>"/>
</c:if>

	    

<liferay-ui:search-container delta='<%= GetterUtil.getInteger(prefs.getValue("rowsPerPage", "5")) %>' emptyResultsMessage="publisher-empty-results-message">
	<liferay-ui:search-container-results
		results="<%= PublisherLocalServiceUtil.getPublishersByGroupId(scopeGroupId, searchContainer.getStart(), searchContainer.getEnd()) %>"
		total="<%= PublisherLocalServiceUtil.getPublishersCountByGroupId(scopeGroupId) %>"
	/>

	<liferay-ui:search-container-row
		className="com.liferay.training.library.model.Publisher"
		keyProperty="publisherId"
		modelVar="publisher"
	>
		<liferay-ui:search-container-column-text
			name="name"
			value="<%= publisher.getName() %>"
		/>

		<liferay-ui:search-container-column-text
			name="email-address"
			property="emailAddress"
		/>

		<liferay-ui:search-container-column-text
			name="phone-number"
			property="phoneNumber"
		/>

		<liferay-ui:search-container-column-text
			name="website"
			property="website"
		/>

		<liferay-ui:search-container-column-jsp
			align="right"
			path="/html/publisher/publisher_actions.jsp"
		/>
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>