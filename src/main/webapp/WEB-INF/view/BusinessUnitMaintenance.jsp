<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/view/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Facility Management System</title>
</head>
<body>
<h1>Maintenance</h1>
<form:form action="BusinessUnitMaintenance.do" method="POST" commandName="BusinessUnitMaintenance">
	<table>
		<tr>
			<td>MAINTENANCE ID</td>
			<td><form:input path="MAINTENANCE_ID" /></td>
		</tr>
		<tr>
			<td>Business Unit</td>
			<td><form:input path="BUSINESS_UNIT_ID" /></td>
		</tr>
		<tr>
			<td>Employee ID</td>
			<td><form:input path="USER_ID" /></td>
		</tr>
		<tr>
			<td>Start Date</td>
			<td><form:input path="START_DATE" /></td>
		</tr>
		<tr>
			<td>End Date</td>
			<td><form:input path="END_DATE" /></td>
		</tr>
		<tr>
			<td>Status</td>
			<td><form:input path="STATUS" /></td>
		</tr>
		<tr>
			<td>Maintenance Cost</td>
			<td><form:input path="COST" /></td>
		</tr>
		<tr>
			<td>Note</td>
			<td><form:input path="NOTE" /></td>
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
		<td>MAINTENANCE ID</td>
		<td>Business Unit</td>
		<td>Employee ID</td>
		<td>Start Date</td>
		<td>End Date</td>
		<td>Status</td>
		<td>Maintenance Cost</td>
		<td>Note</td>
	</tr>
	<c:forEach items="${BusinessUnitMaintenanceList}" var="BusinessUnitMaintenance">
		<tr>
			<td>${BusinessUnitMaintenance.MAINTENANCE_ID}</td>
			<td>${BusinessUnitMaintenance.BUSINESS_UNIT_ID}</td>
			<td>${BusinessUnitMaintenance.USER_ID}</td>
			<td>${BusinessUnitMaintenance.START_DATE}</td>
			<td>${BusinessUnitMaintenance.END_DATE}</td>
			<td>${BusinessUnitMaintenance.STATUS}</td>
			<td>${BusinessUnitMaintenance.COST}</td>
			<td>${BusinessUnitMaintenance.NOTE}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>