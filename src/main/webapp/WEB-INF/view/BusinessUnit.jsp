<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/view/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Facility Management System</title>
</head>
<body>
<h1>Business Unit</h1>
<form:form action="BusinessUnit.do" method="POST" commandName="BusinessUnit">
	<table>
		<tr>
			<td>ID</td>
			<td><form:input path="ID" /></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><form:input path="NAME" /></td>
		</tr>
		<tr>
			<td>Description</td>
			<td><form:input path="DESCRIPTION" /></td>
		</tr>
		<tr>
			<td>Location</td>
			<td><form:input path="LOCATION" /></td>
		</tr>
		<tr>
			<td>Additional Feature</td>
			<td><form:input path="ADDITIONAL_FEATURES" /></td>
		</tr>
		<tr>
			<td>Status</td>
			<td><form:input path="STATUS" /></td>
		</tr>
		<tr>
			<td>Available</td>
			<td><form:input path="IS_AVAILABLE" /></td>
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
		<td>Name</td>
		<td>Description</td>
		<td>Location</td>
		<td>Additional Feature</td>
		<td>Status</td>
		<td>Available</td>
	</tr>

	<c:forEach items="${BusinessUnitList}" var="BusinessUnit">
		<tr>
			<td>${BusinessUnit.ID}</td>
			<td>${BusinessUnit.NAME}</td>
			<td>${BusinessUnit.DESCRIPTION}</td>
			<td>${BusinessUnit.LOCATION}</td>
			<td>${BusinessUnit.ADDITIONAL_FEATURES}</td>
			<td>${BusinessUnit.STATUS}</td>
			<td>${BusinessUnit.IS_AVAILABLE}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>