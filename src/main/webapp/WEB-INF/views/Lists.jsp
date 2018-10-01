<%--
  Created by IntelliJ IDEA.
  User: Apurbo
  Date: 10/3/2016
  Time: 9:27 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>emsLists</title>
</head>
<body>
<form action="/list" method="get">
    <h3>Lists of Information</h3>
    <table>
        <thead>
        <th>Id</th>
        <th>Age</th>
        <th>First Name</th>
        <th>Last Name</th>
        </thead>
        <tbody>

        <c:forEach items="${getList}" var="employee">
            <tr>

                <td> ${employee[0]}</td>
                <td> ${employee[1]}</td>
                <td> ${employee[2]}</td>
                <td> ${employee[3]}</td>
            </tr>
        </c:forEach>

        </tbody>
    </table>

</form>
<a href="/" >home</a>
<a href="" >index</a>

</body>
</html>
