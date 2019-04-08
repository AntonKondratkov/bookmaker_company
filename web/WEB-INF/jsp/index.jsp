<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%--<%@taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>--%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>--%>
<%--<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>--%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<html>
  <head>
    <title>Букмекерская контора</title>
    <link rel="stylesheet" href="../../style.css">
    <%--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">--%>
    <%--<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>--%>
    <%--<script src="https://code.jquery.com/jquery-3.3.1.min.js" type="text/javascript"></script>--%>
    <%--<!-- jQuery library -->--%>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <%--<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>--%>

  </head>

  <body>
  <li><a href="${contextPath}/users">Вывести всех пользователей</a></li>
  <%--<a href="${contextPath}/admin/users"/>--%>
  <%--<ul class="list">--%>
    <%--<li class="column"><a href="">Компания</a></li>--%>
    <%--<li class="column"><a href="">Новости</a></li>--%>
    <%--<li class="column"><a href="">Результаты матчей</a></li>--%>
    <%--<li class="column"><a href="">Войти</a></li>--%>
    <%--<li class="column"><a href="">Зарегистрироваться</a></li>--%>
  <%--</ul>--%>
  <%--<br>--%>
  <%--<table align="right">--%>
    <%--<caption>Матчи</caption>--%>
    <%--<tr><th>Заголовок</th><th>Заголовок</th></tr> <!--ряд с ячейками заголовков-->--%>
    <%--<tr><td>данные</td><td>данные</td></tr> <!--ряд с ячейками тела таблицы-->--%>
  <%--</table>--%>
  <%--<br>--%>
  <%--<label>Найти значение: </label>--%>
  <%--<select>--%>
    <%--<option>Значение 1</option>--%>
    <%--<option>Значение 2</option>--%>
    <%--<option>Значение 3</option>--%>
    <%--<option>Значение 4</option>--%>
    <%--<option>Значение 5</option>--%>
  <%--</select>--%>
  <%--<p><input type="submit" value="Найти"></p>--%>
  </body>
</html>
