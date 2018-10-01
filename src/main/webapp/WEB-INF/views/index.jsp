<%--
  Created by IntelliJ IDEA.
  User: Apurbo
  Date: 8/19/2016
  Time: 12:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
    <script src="<c:url value="/resources/js/jquery.1.10.2.min.js" />"></script>
    <script src="<c:url value="/resources/js/main.js" />"></script>
</head>

--%>
<html>
<head>
    <head>
        <link href="<c:url value="/resources/css/homeCss.css" />" rel="stylesheet">
       <%-- <script src="<c:url value="/resources/js/jquery.1.10.2.min.js" />"></script>--%>
        <script src="<c:url value="/resources/js/index.js" />"></script>
    </head>

    <title>index</title>

</head>
<jsp:include page="header.jsp"/>
<body class="wrapper">
<h1>Welcome To Employee Management System</h1>

<form class="form-group" action="/submit" method="POST">
    <label>First Name</label>
    <input type="text" name="firstName" value="${firstName}"> <br>
    <label>Last Name</label>
    <input type="text" name="lastName" value="${lastName}"> <br>
    <label>Age</label>
    <input type="text" name="age" value="${age}"> <br>
    <label>ID</label>
    <input type="text" name="id" value="${id}"> <br>
    <input type="submit" name="submit" value="submit"/>
    <%--<form action="/index/submit " method="get"><input type="submit" name="submit" value="submit"/></form>--%>
</form>

<%--<form action="/list" method="get"><input type="submit" name="Lists" value="list"/></form>
<form action="/personalInformationSetup" method="get"><input type="submit" name="personalInformationSetup" value="personalInformationSetup"/></form>
<form action="/genderSetup" method="get"><input type="submit" name="genderSetup" value="genderSetup"/></form>
<form action="/employeeTypeSetup" method="get"><input type="submit" name="employeeTypeSetup" value="employeeTypeSetup"/></form>
<form action="/maritalStatusSetup" method="get"><input type="submit" name="maritalStatusSetup" value="maritalStatusSetup"/></form>
<form action="/employeeDesignationSetup" method="get"><input type="submit" name="employeeDesignationSetup" value="employeeDesignationSetup"/></form>
<form action="/departmentSetup" method="get"><input type="submit" name="departmentSetup" value="departmentSetup"/></form>
<form action="/employeeWorkHistory" method="get"><input type="submit" name="employeeWorkHistory" value="employeeWorkHistory"/></form>
<form action="/employeeEducationDetailsSetup" method="get"><input type="submit" name="employeeEducationDetailsSetup" value="employeeEducationDetailsSetup"/></form>--%>
</body>
<jsp:include page="footer.jsp"/>
</html>
