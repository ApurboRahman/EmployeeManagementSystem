<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Apurbo
  Date: 8/19/2016
  Time: 8:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="ISO-8859-1"%>

<html>
<head>
    <title>submit</title>
</head>
<body>
<h1>Submit Success</h1>
<form action="/submit" method="GET">

    <label>First Name</label>
    <input type="text" name="firstName" value="${firstName}">
    <label>Last Name</label>
    <input type="text" name="lastName" value="${lastName}">
    <label>Age</label>
    <input type="text" name="age" value="${age}">
    <label>ID</label>
    <input type="text" name="id" value="${id}">
    <input type="submit" name="submit" value="edit"/>
</form>
<form action="/list" method="get"><input type="submit" name="Lists" value="list"/></form>
</body>
</html>
