<%--
  Created by IntelliJ IDEA.
  User: mansoura
  Date: 03/06/2020
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Homepage</title>
</head>
<body>
    <h1>Welcome</h1>
    <form:form action="${pageContext.request.contextPath}/logout" method="POST">
        <input type="submit" value="Logout">
    </form:form>
</body>
</html>
