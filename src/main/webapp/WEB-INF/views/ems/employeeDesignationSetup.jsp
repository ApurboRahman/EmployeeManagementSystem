<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Apurbo
  Date: 11/22/2016
  Time: 7:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<jsp:include page="../header.jsp"/>
<head>
    <title>employeeDesignationSetup</title>
</head>
<body>
<div class="page_title">
    <span class="title">Employee Designation Setup</span>
    <span class="sub_title">Employee Designation Setup</span>
</div>

<form action="/saveEmployeeDesignation" method="POST">
   <fieldset>
       <legend>Employee Designation Setup</legend>
       <div><label>Employee Type Id</label>
           <input type="text" name="employeeDesignationType" id="employeeDesignationType"
                  value="${employeeDesignationType}" tabindex="1">
           <label>Type Name</label>
           <input type="text" name="shortName" id="shortName" value="${shortName}" tabindex="2">
       </div>

       <div class="">

       </div>
       <div>
           <label>Type Name</label>
           <input type="text" name="fullName" id="fullName" value="${fullName}" tabindex="3">
       </div>
       <input type="submit" name="save" value="save" tabindex="4"/>
   </fieldset>

</form>
</body>
<jsp:include page="../footer.jsp"/>
</html>
