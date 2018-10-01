<%--
  Created by IntelliJ IDEA.
  User: Apurbo
  Date: 11/21/2016
  Time: 9:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>maritalStatusSetup</title>
</head>
<body>
<h1>Martial Status Setup</h1>
<form action="/saveMaritalStatus" method="POST" class="form-group">
   <fieldset>
       <legend>Martial Status Setup</legend>
       <label>Status Id</label>
       <input type="text" name="statusId" id="statusId" value="${statusId}"> <br>
       <label>Status Name</label>
       <input type="text" name="statusName" id="statusName" value="${statusName}"> <br>
       <input type="submit" name="save" value="save"/>
   </fieldset>
</form>
</body>
</html>
