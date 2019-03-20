<%--
  Created by IntelliJ IDEA.
  User: 11
  Date: 09.03.2019
  Time: 3:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<html>
  <head>
    <title>Букмекерская контора</title>
    <link rel="stylesheet" href="style.css">
  </head>
  <body>
  <a href="${contextPath}/admin/users"/>
  <ul class="list">
    <li class="column"><a href="">Компания</a></li>
    <li class="column"><a href="">Новости</a></li>
    <li class="column"><a href="">Результаты матчей</a></li>
    <li class="column"><a href="">Войти</a></li>
    <li class="column"><a href="">Зарегистрироваться</a></li>
  </ul>
  <br>
  <table align="right">
    <caption>Матчи</caption>
    <tr><th>Заголовок</th><th>Заголовок</th></tr> <!--ряд с ячейками заголовков-->
    <tr><td>данные</td><td>данные</td></tr> <!--ряд с ячейками тела таблицы-->
  </table>
  <br>
  <label>Найти значение: </label>
  <select>
    <option>Значение 1</option>
    <option>Значение 2</option>
    <option>Значение 3</option>
    <option>Значение 4</option>
    <option>Значение 5</option>
  </select>
  <p><input type="submit" value="Найти"></p>
  </body>

</html>
