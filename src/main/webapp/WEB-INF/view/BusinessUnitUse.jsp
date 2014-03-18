<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/view/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Facility Management System</title>
</head>
<body>
<h1>Rent</h1>
<form:form action="USER.do" method="POST" commandName="USER">
	<table>
		<tr>
			<td>Rent ID</td>
			<td><form:input path="USE_ID" /></td>
		</tr>
		<tr>
			<td>Business Unit</td>
			<td><form:input path="BUSINESS_UNIT_ID" /></td>
		</tr>
		<tr>
			<td>Renew/New</td>
			<td>
				<form:select path="IS_RENEW">
					<form:option value="0" label="No" />
					<form:option value="1" label="Yes" />
				</form:select>
			</td>
		</tr>
		<tr>
			<td>Tenant Name</td>
			<td><form:input path="USER_ID" /></td>
		</tr>
		<tr>
			<td>Start Date</td>
			<td><form:input path="LEASE_START_DATE" /></td>
		</tr>
		<tr>
			<td>End Date</td>
			<td><form:input path="LEASE_END_DATE" /></td>
		</tr>
		<tr>
			<td>Monthly Rent</td>
			<td><form:input path="RENT" /></td>
		</tr>
		<tr>
			<td>Security Deposit</td>
			<td><form:input path="SECURITY_DEPOSIT" /></td>
		</tr>
		<tr>
			<td>Utilities</td>
			<td><form:input path="UTILIITES" /></td>
			
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
		<td>Rent ID</td>
		<td>Business Unit</td>	
		<td>Renew/New</td>
		<td>Tenant Name</td>
		<td>Start Date</td>
		<td>End Date</td>
		<td>Monthly Rent</td>
		<td>Security Deposit</td>
		<td>Utilities</td>
	</tr>
	<c:forEach items="${USERList}" var="USER">
		<tr>
			<td>${USER.USE_ID}</td>
			<td>${USER.BUSINESS_UNIT_ID}</td>
			<td>${USER.IS_RENEW}</td>
			<td>${USER.USER_ID}</td>
			<td>${USER.LEASE_START_DATE}</td>
			<td>${USER.LEASE_END_DATE}</td>
			<td>${USER.RENT}</td>
			<td>${USER.SECURITY_DEPOSIT}</td>
			<td>${USER.UTILIITES}</td>
		</tr>
	</c:forEach>
</table>

</body>
</html>