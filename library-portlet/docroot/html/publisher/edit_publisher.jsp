<%@include file="/html/init.jsp" %>

<%
	Publisher publisher = null;

	long publisherId = ParamUtil.getLong(request, "publisherId");

	if (publisherId > 0) {
		publisher = PublisherLocalServiceUtil.getPublisher(publisherId);
	}

	String redirect = ParamUtil.getString(request, "redirect");
%>

<liferay-ui:header
	backURL="<%= redirect %>"
	title='<%= (publisher != null) ? publisher.getName() : "New Publisher" %>'
/>


<aui:model-context bean="<%= publisher %>" model="<%= Publisher.class %>" />

<portlet:actionURL name='<%= publisher == null ? "addPublisher" : "updatePublisher" %>' var="editPublisherURL" />

<aui:form action="<%= editPublisherURL %>" method="POST" name="fm">
	<aui:fieldset>
		<aui:input type="hidden" name="redirect" value="<%= redirect %>" />

		<aui:input type="hidden" name="publisherId" value='<%= publisher == null ? "" : publisher.getPublisherId() %>'/>

		<aui:input name="name" />

		<aui:input name="emailAddress" />

		<aui:input name="website" />

		<aui:input name="phoneNumber" />
	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit" />

		<aui:button type="cancel"  onClick="<%= redirect %>" />
	</aui:button-row>
</aui:form>