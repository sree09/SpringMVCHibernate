<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
<form method="post" action="http://localhost:8080/springMVChibernate/car/register.do">
Name :<input name="fullName" type="text">
User_Name :<input name="userName" type="text">
Password:<input name="password" type="text">
<input type="submit" value="Register">
</form>
</body>
</html>