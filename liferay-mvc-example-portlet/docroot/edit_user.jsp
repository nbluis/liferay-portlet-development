<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<form action="<portlet:actionURL name="myNewAction"/>" method="post" name="<portlet:namespace />fm">
	<table>
		<tr>
			<td><label for="name">First Name:</label></td>
			<td><input name="<portlet:namespace />firstName" type="text" /></td>
		</tr>
		<tr>
			<td><label for="name">Last Name:</label></td>
			<td><input name="<portlet:namespace />lastName" type="text" /></td>
		</tr>
		<tr>
			<td><label for="name">Employee ID:</label></td>
			<td><input name="<portlet:namespace />employeeId" type="text" /></td>
		</tr>
	</table>
	<input type="submit" />
</form>