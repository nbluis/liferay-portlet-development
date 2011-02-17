<%@include file="/html/init.jsp" %>

<portlet:actionURL name="setPublisherPref" var="setPublisherPrefUrl" />

<aui:form action="<%= setPublisherPrefUrl %>" method="POST" name="fm" >
	<aui:input name="rowsPerPage" value='<%= prefs.getValue("rowsPerPage","") %>' size="45" type="text" />

	<aui:input name="phoneFormat" value='<%= prefs.getValue("phoneFormat","") %>' size="45" type="text"  />

	<aui:button-row>
		<aui:button type="submit" />
	</aui:button-row>
</aui:form>