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

<liferay-ui:search-container delta='<%= new Integer(prefs.getValue("rowsPerPage", "5")) %>' emptyResultsMessage="book-empty-results-message">
	<liferay-ui:search-container-results
		results="<%= BookLocalServiceUtil.getBooksByGroupId(scopeGroupId, searchContainer.getStart(), searchContainer.getEnd()) %>"
		total="<%= BookLocalServiceUtil.getBooksCountByGroupId(scopeGroupId) %>"
	/>

	<liferay-ui:search-container-row
		className="com.liferay.training.library.model.Book"
		keyProperty="bookId"
		modelVar="book"
	>
		<liferay-ui:search-container-column-text
			name="title"
			value="<%= book.getTitle(locale) %>"
		/>

		<liferay-ui:search-container-column-text
			name="author-name"
			property="authorName"
		/>

		<%
		SimpleDateFormat dateFormat = new SimpleDateFormat(prefs.getValue("dateFormat", "yyyy/MM/dd"));
		%>

		<liferay-ui:search-container-column-text
			name="publication-date"
			value="<%= dateFormat.format(book.getPublicationDate()) %>"
		/>

		<%
		String publisherName = "";

		try {
			publisherName =	PublisherLocalServiceUtil.getPublisher(book.getPublisherId()).getName();
		}
		catch (Exception ex) {
		}
		%>

		<liferay-ui:search-container-column-text
			name="publisher"
			value="<%= publisherName %>"
		/>

		<liferay-ui:search-container-column-jsp
			align="right"
			path="/html/book/book_actions.jsp"
		/>
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>