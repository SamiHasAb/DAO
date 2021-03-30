<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>welcom to index</h1>

<a href="${pageContext.request.contextPath}/viewemp">Emp</a><p>
<a href="${pageContext.request.contextPath}/viewempbyid">Emp By ID</a><p>
<hr>
				<form action="getOneEmp" method="get">
 				Enter Emp id : <input type="text" name="id">
 		 		<input type="submit" value="Search">
 		 		</form>
<hr>
<hr>
				<form action="getEmpByName" method="get">
 				Enter Emp Name : <input type="text" name="ename">
 		 		<input type="submit" value="Search">
 		 		</form>
<hr>

			<table>
			<form:form modelAttribute="empData" action="addUser" method="post">

			<tr><td>First Name : <form:input path="empName"/> 
			<tr><td>Last Name : <form:input path="empLastName"/>
			<tr><td>Email : <form:input path="email"/>
			<tr><td>Address : <form:input path="address"/> 
			<tr><td>Salary : <form:input path="salary"/> 
			<tr><td>Hiring Date : <form:input path="hiringDate"/> 
			<tr><td>Birth Date : <form:input path="birthDate"/> 
			<tr><td>Department Number : <form:input path="deptNo"/> 
			
			<tr><td><input type="submit" value="Add"></td></tr>
			</form:form>
			</table>

</body>
</html>