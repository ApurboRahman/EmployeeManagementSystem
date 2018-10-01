<%--
  Created by IntelliJ IDEA.
  User: Apurbo
  Date: 11/20/2016
  Time: 11:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>employeeTypeSetup</title>
</head>
<body>
<h1>Employee Type Setup</h1>

<form action="/saveEmployeeType" method="POST">
   <fieldset>
       <legend>Employee Type Setup</legend>
       <label>Employee Type Id</label>
       <input type="text" name="employeeTypeId" id="employeeTypeId" value="${employeeTypeId}"> <br>
       <label>Type Name</label>
       <input type="text" name="typeName" id="typeName" value="${typeName}"> <br>

       <input type="submit" name="save" value="save"/>
   </fieldset>
</form>
</body>
</html>
