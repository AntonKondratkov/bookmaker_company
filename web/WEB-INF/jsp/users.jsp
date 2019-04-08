<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Users</title>
</head>
<body>
<ul>
    <c:forEach var="user" items="${users_list}">
        <li><a href="/users${user.userName}">${user.userName}</a></li>
    </c:forEach>
</ul>
</body>
</html>
