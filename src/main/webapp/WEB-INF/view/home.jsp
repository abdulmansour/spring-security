<%--
  Created by IntelliJ IDEA.
  User: mansoura
  Date: 03/06/2020
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Homepage</title>
</head>
<body>
    <h3>User Info</h3>
    <p>
        User ID: <security:authentication property="principal.username"/>
    </p>
    <p>
        User Role: <security:authentication property="principal.authorities"/>
    </p>
    <form:form action="${pageContext.request.contextPath}/logout" method="POST">
        <input type="submit" value="Logout">
    </form:form>
</body>
</html>
