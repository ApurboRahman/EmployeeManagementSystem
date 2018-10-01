<%--
  Created by IntelliJ IDEA.
  User: Apurbo
  Date: 11/27/2016
  Time: 8:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>employeeEducationDetailsSetup</title>
</head>
<body>
<h1>Employee Designation Setup</h1>
<form action="/saveEmployeeEducationDetails" method="POST">
    <fieldset>
        <legend>Employee Designation Setup</legend>
        <div><label>Employee ID</label>
            <input type="text" name="employeeId" id="employeeId"
                   value="${employeeId}" tabindex="1">
        </div>

        <div class="">
            <label>Exam Name</label>
            <input type="text" name="examName" id="examName" value="${examName}" tabindex="2">
        </div>
        <div>
            <label>Subject Name</label>
            <input type="text" name="subjectName" id="subjectName" value="${subjectName}" tabindex="3">
        </div>
        <div>
            <label>Duration</label>
            <input type="text" name="duration" id="duration" value="${duration}" tabindex="3">
        </div>
        <div>
            <label>Result</label>
            <input type="text" name="result" id="result" value="${result}" tabindex="3">
        </div>
        <div>
            <label>Passing Year</label>
            <input type="text" name="passingYear" id="passingYear" value="${passingYear}" tabindex="3">
        </div>
        <div>
            <label>University Name</label>
            <input type="text" name="universityName" id="universityName" value="${universityName}" tabindex="3">
        </div>
        <div>
            <label>Roll Number</label>
            <input type="text" name="rollNumber" id="rollNumber" value="${rollNumber}" tabindex="3">
        </div>
        <div>
            <label>Registration Number</label>
            <input type="text" name="registrationNumber" id="registrationNumber" value="${registrationNumber}" tabindex="3">
        </div>
        <input type="submit" name="save" value="save" tabindex="4"/>
    </fieldset>

</form>
</body>
</html>
