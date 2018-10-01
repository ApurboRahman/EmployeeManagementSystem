<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Apurbo
  Date: 11/29/2016
  Time: 8:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--
<form action="/list" method="get"><input type="submit" name="Lists" value="list"/></form>
<form action="/personalInformationSetup" method="get"><input type="submit" name="personalInformationSetup" value="personalInformationSetup"/></form>
<form action="/genderSetup" method="get"><input type="submit" name="genderSetup" value="genderSetup"/></form>
<form action="/employeeTypeSetup" method="get"><input type="submit" name="employeeTypeSetup" value="employeeTypeSetup"/></form>
<form action="/maritalStatusSetup" method="get"><input type="submit" name="maritalStatusSetup" value="maritalStatusSetup"/></form>
<form action="/employeeDesignationSetup" method="get"><input type="submit" name="employeeDesignationSetup" value="employeeDesignationSetup"/></form>
<form action="/departmentSetup" method="get"><input type="submit" name="departmentSetup" value="departmentSetup"/></form>
<form action="/employeeWorkHistory" method="get"><input type="submit" name="employeeWorkHistory" value="employeeWorkHistory"/></form>
<form action="/employeeEducationDetailsSetup" method="get"><input type="submit" name="employeeEducationDetailsSetup" value="employeeEducationDetailsSetup"/></form>
--%>

<list>
    <ul>
        <li>
            <a href=" <c:url value="/departmentSetup"/>">Department Setup</a>
        </li>
        <li>
            <a href=" <c:url value="/documentSetup"/>">Document Setup</a>
        </li>
        <li>
            <a href=" <c:url value="/employeeDesignationSetup"/>">Employee Designation Setup</a>
        </li>
        <li>
            <a href=" <c:url value="/employeeEducationDetailsSetup"/>">Employee Education Setup</a>
        </li>
        <li>
            <a href=" <c:url value="/employeeTypeSetup"/>">Employee Type Setup</a>
        </li>
        <li>
            <a href=" <c:url value="/employeeWorkHistory"/>">Employee Work History</a>
        </li>
        <li>
            <a href=" <c:url value="/genderSetup"/>">Gender Setup</a>
        </li>
        <li>
            <a href=" <c:url value="/maritalStatusSetup"/>">Martial Setup</a>
        </li>
        <li>
            <a href=" <c:url value="/personalInformation"/>">Personal Information Setup</a>
        </li>
    </ul>
</list>