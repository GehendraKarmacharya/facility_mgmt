<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/view/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Facility Management System</title>
</head>
<body>
<h1>Users</h1>
<form:form action="USER.do" method="POST" commandName="USER">
	<table>
		<tr>
			<td>ID</td>
			<td><form:input path="ID" /></td>
		</tr>
		<tr>
			<td>First Name</td>
			<td><form:input path="FIRST_NAME" /></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><form:input path="LAST_NAME" /></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><form:input path="EMAIL" /></td>
		</tr>
		<tr>
			<td>Telephone</td>
			<td><form:input path="TELEPHONE" /></td>
		</tr>
		<tr>
			<td>Address</td>
			<td><form:input path="ADDRESS" /></td>
		</tr>
		<tr>
			<td>User Type</td>
			<td>
				<form:select path="TYPE">
					<form:option value="1" label="Teenant" />
					<form:option value="0" label="Employee" />
				</form:select>
			</td>
		</tr>
		<tr>
			<td>Schedule</td>
			<td><form:input path="SCHEDULE" /></td>
		</tr>
		<tr>
			<td>Hourly Rate</td>
			<td><form:input path="HOURLY_RATE" /></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" name="action" value="Add" />
				<input type="submit" name="action" value="Update" />
				<input type="submit" name="action" value="Delete" />
				<input type="submit" name="action" value="Search" />
			</td>
		</tr>
	</table>
</form:form>
<br>
<table border="1">
	<tr>
		<td>ID</td>
		<td>First Name</td>
		<td>Last Name</td>
		<td>Email</td>
		<td>Telephone</td>
		<td>Address</td>
		<td>User Type</td>
		<td>Schedule</td>
		<td>Hourly Rate</td>
	</tr>
	<c:forEach items="${USERList}" var="USER">
		<tr>
			<td>${USER.ID}</td>
			<td>${USER.FIRST_NAME}</td>
			<td>${USER.LAST_NAME}</td>
			<td>${USER.EMAIL}</td>
			<td>${USER.TELEPHONE}</td>
			<td>${USER.ADDRESS}</td>
			<td>${USER.TYPE}</td>
			<td>${USER.SCHEDULE}</td>
			<td>${USER.HOURLY_RATE}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>