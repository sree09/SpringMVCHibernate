<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Form</title>
</head>
<body>
<form action="http://localhost:8080/springMVChibernate/car/auth.do" method="post">
UserName : <input type="text" name="name" /><br/>
password: <input type = "password" name="pass"/>
<input type="submit" value="submit" />
</form>
<form method="post" action="Register.jsp">
New User? Then<input type="submit" value ="Register" /> 
</form>
</body></html>