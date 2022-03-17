<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body bgcolor="green">
<% 
	response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");
	response.setHeader("Expires","0");
	
	if(session.getAttribute("username")==null)
	{
		response.sendRedirect("login.jsp");
	}
%>
	WELCOME ${username}.... what's up?<br>
	Employ Details <a href="details.jsp">here</a>
	
	<form action="logout">
		<input type="submit" value="Logout">
	</form>
</body>
</html>