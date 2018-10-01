<%--
  Created by IntelliJ IDEA.
  User: Apurbo
  Date: 11/25/2016
  Time: 9:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>employeeWorkHistory</title>
</head>
<body>
<form action="/saveEmployeeWorkHistory" method="POST" class="form-group">
    <fieldset>
        <legend>Employee Work History</legend>

        <div><label>Employee Id</label>
            <input type="text" name="employeeId" id="employeeId"
                   value="${employeeId}" tabindex="1">
        </div>

        <div class="">
            <label>Company Name</label>
            <input type="text" name="companyName" id="companyName" value="${companyName}" tabindex="2">
        </div>
        <div>
            <label>Job Title</label>
            <input type="text" name="jobTitle" id="jobTitle" value="${jobTitle}" tabindex="3">
        </div>
        <div>
            <label>Joining Date</label>
            <input type="text" name="joiningDate" id="joiningDate" value="${joiningDate}" tabindex="3">
        </div>
        <div>
            <label>Termination Date</label>
            <input type="text" name="terminationDate" id="terminationDate" value="${terminationDate}" tabindex="3">
        </div>

        <div>
            <label>Reason For Termination</label>
            <input type="text" name="terminationReason" id="terminationReason" value="${terminationReason}"
                   tabindex="3">
        </div>
        <div>
            <label>Company Address</label>
            <input type="text" name="companyAddress" id="companyAddress" value="${companyAddress}" tabindex="3">
        </div>
        <div>
            <label>Contact Person</label>
            <input type="text" name="contactPerson" id="contactPerson" value="${contactPerson}" tabindex="3">
        </div>

        <div>
            <label>Contact Number</label>
            <input type="text" name="contactNumber" id="contactNumber" value="${contactNumber}" tabindex="3">
        </div>
        <input type="submit" name="save" value="save" tabindex="4"/>
    </fieldset>

</form>
</body>
</html>
