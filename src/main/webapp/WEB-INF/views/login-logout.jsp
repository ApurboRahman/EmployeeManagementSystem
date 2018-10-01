<%--
  Created by IntelliJ IDEA.
  User: Apurbo
  Date: 8/30/2016
  Time: 7:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>employeeManagementSystem</title>
    <meta name="decorator" content="/WEB-INF/views/login-layout.jsp">
</head>

<body>
<div id="login" class="login span3 well well-large offset4">
    <h4>Account Panel</h4>

    <form class="form-group" action="/home" method="POST">
        <input type="hidden"  name="${_csrf.parameterName}"   value="${_csrf.token}"/>
        <input type="text" placeholder="Email"name="userId"  value="${userId}"/>
        <input type="password" placeholder="Password" name="password" value="${password}"/>
        <input class="btn btn-primary" type="submit" value="Login" />
    </form>
</div>
</body>
</html>
