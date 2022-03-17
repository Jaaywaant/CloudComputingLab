<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Here are all your details:<br>
	<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://127.0.0.1:3306/students" user="root" password="Athuvarade6"/>
	<sql:query var="rs" dataSource="${db}">select * from atharva_111915021_salary,atharva_111915021_detail 
	where atharva_111915021_salary.Employee_ID_Number=atharva_111915021_detail.Employee_ID_Number and Employee_ID_Number=?
	<sql:param value = "${username}" /></sql:query>
	 <table border = "1" width = "100%">
         <tr>
            <th>Emp_ID</th>
            <th>First name</th>
            <th>Last name</th>
            <th>Contact</th>
            <th>Job_role</th>
            <th>Monthly salary</th>
            <th>Yearly bonus</th>
         </tr>
         <c:forEach var = "row" items = "${result.rows}">
            <tr>
               <td> <c:out value = "${row.Employee_ID_Number}"/></td>
               <td> <c:out value = "${row.Fname}"/></td>
               <td> <c:out value = "${row.Lname}"/></td>
               <td> <c:out value = "${row.Contact}"/></td>
               <td> <c:out value = "${row.Job_role}"/></td>
               <td> <c:out value = "${row.Monthly}"/></td>
               <td> <c:out value = "${row.Year_bonus}"/></td>
            </tr>
         </c:forEach>
      </table>
      
</body>
</html>