<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%--<%@taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>--%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%--<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>--%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<html>
  <head>
    <title>Букмекерская контора</title>
    <link rel="stylesheet" href="../../style.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <%--<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>--%>
    <%--<script src="https://code.jquery.com/jquery-3.3.1.min.js" type="text/javascript"></script>--%>
    <%--<!-- jQuery library -->--%>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <style>
      <%@include file="/WEB-INF/css/index.css"%>
    </style>

  </head>

  <body>
  <li><a href="${contextPath}/users">Вывести всех пользователей</a></li>
  <div id="Login" class="modal fade" tabindex="-1">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <button class="close" data-dismiss="modal">x</button>
          <h4 class="modal-title">Вход</h4>
        </div>
        <div class="modal-body">
          <form method="POST" action="${contextPath}/login" class="form-horizontal" >
            <div class="form-group">
              <label class="control-label col-md-3" for="userName">
                Имя пользователя:
              </label>
              <div class="col-md-9">
                <input type="text" class="form-control" id="userName" name="userName" >
              </div>
            </div>
            <div class="form-group">
              <label class="control-label col-md-3" for="password">Пароль</label>
              <div class="col-md-9">
                <input type="password" class="form-control" id="password" name="password">
              </div>
            </div>
            <br/>
            <div class="form-group">
              <div class="col-md-offset-3 col-md-9">
                <input type="submit" class="btn btn-primary" value="Войти">
                <input type="reset" class="btn btn-default" value="Очистить форму">
              </div>
            </div>
          </form>
        </div>
      </div>
    </div>
  </div>
  <li><a href="#" data-toggle="modal" data-target="#Login">Вход</a></li>

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
