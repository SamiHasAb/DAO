<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>view one emp</h3>
<hr>


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
				<td><a href="">Update</a>|<a href="deleteEmp"onclick="if(!confirm('Are you sure to delete the Employee?')) return false">Delete</a></td>
		</tr>
	

	</table>

</body>
</html>