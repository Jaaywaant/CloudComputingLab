<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="login" method="post">
		User ID: <input type="number" name="Employee_ID_Number"><br>
		Password: <input type="password" name="pass"><br>
		<input type="submit" value="login">	<br>
		
		Don't have an account click here
		<a href="signup.jsp">here</a>	
	</form>
</body>
</html>