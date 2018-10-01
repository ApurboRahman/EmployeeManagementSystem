<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Apurbo
  Date: 11/18/2016
  Time: 9:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>personalInformationSetup</title>
</head>
<body>
<h1>personal Information Setup</h1>
<form class="globalForm"
      id="frmPersonalInformation"
      action="<c:url value='/personalInformation/'/>" method="post">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

    <fieldset>
        <legend>Personal Information Setup</legend>
        <div class="form-group">
            <label>Personal ID Number</label>
            <input type="text" name="personalIdNumber" id="personalIdNumber" value="${personalIdNumber}">
        </div>
        <div class="form-group">
            <label>First Name</label>
            <input type="text" name="firstName" id="firstName" value="${firstName}">
        </div>
        <div class="form-group">
            <label>Middle Name</label>
            <input type="text" name="middleName" id="middleName" value="${middleName}">
        </div>
        <div class="form-group">
            <label>Last Name</label>
            <input type="text" name="lastName" id="lastName" value="${lastName}">
        </div>

        <div class="form-group">
            <label>dateOfBirth</label>
            <input type="text" name="dateOfBirth" id="datepicker"  value="${dateOfBirth}">
        </div>
        <div class="form-group">
            <label>Cell Phone</label>
            <input type="text" name="cellPhone" id="cellPhone" value="${cellPhone}">
        </div>

        <div class="form-group">
            <label>Home Phone</label>
            <input type="text" name="homePhone" id="homePhone" value="${homePhone}">
        </div>

        <div class="form-group">
            <label>Email</label>
            <input type="text" name="email" id="email" value="${email}">
        </div>
        <div class="form-group">
            <label>Address</label>
            <input type="text" name="address" id="address" value="${address}">
        </div>

        <div class="form-group">
            <label>City</label>
            <input type="text" name="city" id="city" value="${city}">
        </div>
        <div class="form-group">
            <label>Postal Code</label>
            <input type="text" name="postalCode" id="postalCode" value="${postalCode}">
        </div>

        <div class="form-group">
            <label>Gender</label>
            <input type="text" name="gender" id="gender" value="${gender}">
        </div>
        <div class="form-group">
            <label>MaritalStatuse</label>
            <input type="text" name="maritalStatus" id="maritalStatus" value="${maritalStatus}">
        </div>
        <div class="form-group"><input type="submit" name="save" id="submit" value="save"/></div>
    </fieldset>
    <fieldset>
        <legend>List of Personal Information</legend>
        <table class="table table-striped table-inverse">
            <thead>
            <th class="col-lg-2 ">Id Number</th>
            <th class="col-lg-2">Name</th>
            <th class="col-lg-2">Birth Date</th>
            <th class="col-lg-2">Gender</th>
            <th class="col-lg-2">Marital Status</th>
            <th class="col-lg-2">Cell Phone</th>
            <th class="col-lg-2">Home Phone</th>
            <th class="col-lg-2">Email</th>
            <th class="col-lg-2">Address</th>
            <th class="col-lg-2">City</th>
            <th class="col-lg-2">Post Code</th>
            </thead>
            <tbody>
            <c:forEach items="${personalInfoList}" var="personalInfoList">
                <tr>
                    <td> ${personalInfoList[0]}</td>
                    <td> ${personalInfoList[1]}</td>
                    <td> ${personalInfoList[2]}</td>
                    <td> ${personalInfoList[3]}</td>
                    <td> ${personalInfoList[4]}</td>
                    <td> ${personalInfoList[5]}</td>
                    <td> ${personalInfoList[6]}</td>
                    <td> ${personalInfoList[7]}</td>
                    <td> ${personalInfoList[8]}</td>
                    <td> ${personalInfoList[9]}</td>
                    <td> ${personalInfoList[10]}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </fieldset>
    <div class="form-group"><input type="submit" name="List" value="List"/></div>
</form>

<%--<form action="/personalInformationList" method="get">
</form>--%>
</body>
</html>
