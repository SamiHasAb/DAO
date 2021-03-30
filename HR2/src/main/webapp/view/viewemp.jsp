<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>List of Employees</h2>
	<hr />



	<table border="1" align="left">
		<tr>
			<th>Employee ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Address</th>
			<th>Salary</th>
			<th>Hiring Date</th>
			<th>Birth Date</th>
			<th>Department No</th>
			<th>Operations No</th>
		</tr>
		<c:forEach var="emp" items="${empList}">
			<tr>
				<td>${emp.empNo}</td>
				<td>${emp. empName}</td>
				<td>${emp.empLastName}</td>
				<td>${emp.email}</td>
				<td>${emp. address}</td>
				<td>${emp.salary}</td>
				<td>${emp.hiringDate}</td>
				<td>${emp. birthDate}</td>
				<td>${emp.deptNo}</td>
				<td><a href="">Update</a>|<a href="deleteEmp?id="+ ${emp.empNo}   onclick="if(!confirm('Are you sure to delete the Employee?')) return false ">Delete</a></td>


			</tr>
		</c:forEach>

	</table>




</body>
</html>