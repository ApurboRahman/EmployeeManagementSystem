<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Apurbo
  Date: 11/20/2016
  Time: 7:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Gender Setup</title>
</head>
<body>
<form action="/saveGender" method="POST">
   <fieldset>
       <legend>Gender Setup</legend>
       <label>Short Name</label>
       <input type="text" name="shortName" id="shortName" value="${shortName}"> <br>
       <label>Full Name</label>
       <input type="text" name="fullName" id="fullName" value="${fullName}"> <br>
       <input type="submit" name="save" value="save"/>
   </fieldset>
</form>

</body>
</html>
