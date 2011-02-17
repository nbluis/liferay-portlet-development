<%@include file="/html/init.jsp" %>
<liferay-ui:success key="publisher-added" message="publisher-added-successfully" />
<liferay-ui:success key="publisher-updated" message="publisher-updated-successfully" />
<liferay-ui:success key="publisher-deleted" message="publisher-deleted-successfully" />

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