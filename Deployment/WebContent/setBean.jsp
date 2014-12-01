<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
This is the bean setter.

<jsp:useBean id="user" class="beans.User"  scope = "session"></jsp:useBean>
<jsp:setProperty name="user" property="name" value="sanjiv"/>
<jsp:setProperty name="user" property="email" value="sanjivsanjiv@hotmail.com"/>

<a href="/Deployment/BeanController">click here to see the saved bean</a>

</body>
</html>