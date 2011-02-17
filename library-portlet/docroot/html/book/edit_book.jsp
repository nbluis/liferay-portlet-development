<%@include file="/html/init.jsp"%>

<%
Book book = null;

long bookId = ParamUtil.getLong(request, "bookId");

if (bookId > 0) {
	book = BookLocalServiceUtil.getBook(bookId);
}

List<Publisher> publishers = PublisherLocalServiceUtil.getPublishersByGroupId(scopeGroupId);

String redirect = ParamUtil.getString(request, "redirect");
%>

<liferay-ui:header
	backURL="<%= redirect %>"
	title='<%= (book != null) ? book.getTitle(locale) : "New Book" %>'
/>

<aui:model-context bean="<%= book %>" model="<%= Book.class %>" />

<portlet:actionURL name='<%= book == null ? "addBook" : "updateBook" %>' var="editBookURL" />

<aui:form action="<%= editBookURL %>" method="POST" name="fm">
	<aui:fieldset>
		<aui:input type="hidden" name="redirect" value="<%= redirect %>" />

		<aui:input type="hidden" name="bookId" value='<%= book == null ? "" : book.getBookId() %>'/>

		<aui:input name="title" />

		<aui:input name="authorName" />

		<aui:input name="publicationDate" />

		<aui:select name="publisherId" showEmptyOption="<%= true %>">

	 		<%
				for(Publisher publisher: publishers){
			%>
			<aui:option value="<%= publisher.getPublisherId() %>" selected="<%= book != null && publisher.getPublisherId() == book.getPublisherId() %>"><%=publisher.getName()%></aui:option>
			<%
				}
			%>

		</aui:select>
	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit" />

		<aui:button type="cancel" onClick="<%= redirect %>" />
	</aui:button-row>
</aui:form>