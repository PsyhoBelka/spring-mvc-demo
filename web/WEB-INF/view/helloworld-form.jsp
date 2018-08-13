<%--
  Created by IntelliJ IDEA.
  User: PsyhoBelka
  Date: 13.08.2018
  Time: 12:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HelloWord Form</title>
</head>
<body>
<form class="form-container" action="hello/processForm3" method="get">
    <div class="form-title"><h2>Sign up</h2></div>
    <div class="form-title">Name</div>
    <input class="form-field" type="text" name="firstname"/><br/>
    <div class="form-title">Email</div>
    <input class="form-field" type="text" name="email"/><br/>
    <div class="submit-container">
        <input class="submit-button" type="submit" value="Submit"/>
    </div>
</form>
</body>
</html>
