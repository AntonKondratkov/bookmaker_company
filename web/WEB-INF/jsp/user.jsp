<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User_page</title>
</head>
<body>
<h1>Welcome to Your page, ${user.userName}!</h1>
<a href="/">Logout</a>
</body>
</html>
