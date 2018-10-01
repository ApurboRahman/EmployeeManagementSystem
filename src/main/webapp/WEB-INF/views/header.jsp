<%--
  Created by IntelliJ IDEA.
  User: Apurbo
  Date: 11/23/2016
  Time: 8:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<header>

<div class="form-group"><h4 class="col-lg-12">Employee Management System</h4></div>
    <form class="form-group" action="/logOut" method="get">
        <input class="btn btn-primary" type="submit" value="Logout" />
    </form>
    <p>Welcome   ${userId}</p>
</header>
