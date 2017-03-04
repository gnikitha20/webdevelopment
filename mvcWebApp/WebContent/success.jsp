<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="mvcWebAppService.LoginService"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success Message</title>
</head>
<body>
<%LoginService ls = new LoginService(); %>
Login Successful!!!
<br>
<jsp:useBean id="loginService" class="mvcWebAppService.LoginService" scope="request"></jsp:useBean>
<jsp:useBean id="user" scope="request" class="model.User">
	<jsp:setProperty property="userId" name="user" param="uName"/>
</jsp:useBean>
Hello : <jsp:getProperty property="userId" name="user"/>
</body>
</html>