<%--
  Created by IntelliJ IDEA.
  User: Apurbo
  Date: 11/26/2016
  Time: 8:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>documentSetup</title>
</head>
<body>

<form  class="form-group" action="/savedocumentSetup" method="POST">
    <fieldset>
        <legend>Document Setup</legend>

        <div><label>Document Id</label>
            <input type="text" name="documentId" id="documentId"
                   value="${documentId}" tabindex="1">
        </div>

        <div class="">
            <label>Document Type</label>
            <input type="text" name="documentName" id="documentType" value="${documentName}" tabindex="2">
        </div>
        <div class="">
            <label>Document Name</label>
            <input type="text" name="documentName" id="documentName" value="${documentName}" tabindex="2">
        </div>
        <input type="submit" name="save" value="save" tabindex="4"/>
    </fieldset>

</form>
</body>
</html>
