<%--
  Created by IntelliJ IDEA.
  User: Apurbo
  Date: 11/22/2016
  Time: 11:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>departmentSetup</title>
</head>
<body>
<div class="page_title">
    <span class="title">Department Setup</span>
    <span class="sub_title">Department Setup</span>
</div>

<form action="/saveDepartmentSetup" method="post" class="form-group">
   <fieldset>
       <legend>Department Setup</legend>
       <div>
           <label>Department ID</label>
           <input type="text" name="departmentId" value="${departmentId}">
       </div>
       <div>
           <label>Short Name</label>
           <input type="text" name="deptShortName" id="deptShortName" value="${deptShortName}">
       </div>
       <div>
           <label>Full Name</label>
           <input type="text" name="deptFullName" id="deptFullName" value="${deptFullName}">
       </div>
       <div>
           <label>Department Type</label>
           <input type="text" name="departmentType" id="departmentType" value="${departmentType}">
       </div>

       <div>
           <label>Create Date</label>
           <input type="text" name="deptCreateDate" id="deptCreateDate" value="${deptCreateDate}">
       </div>

       <div>
           <label>Description</label>
           <input type="text" name="deptDescription" id="deptDescription" value="${deptDescription}">
       </div>
       <input type="submit" name="save" value="save"/>
   </fieldset>


</form>
</body>
</html>
