<%--
  Created by IntelliJ IDEA.
  User: mansoura
  Date: 02/06/2020
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login</title>
    <style>
        .failed {
            color: red;
        }
    </style>
</head>
<body>
    <h3>Login Page</h3>
    <form:form action="${pageContext.request.contextPath}/authenticateUser" method="POST">

        <c:if test="${param.error != null}">
            <i class="failed">Sorry! You entered an invalid username/password!</i>
        </c:if>

        <p>
            Username: <input type="text" name="username"/>
        </p>
        <p>
            Password: <input type="password" name="password"/>
        </p>
        <input type="submit" value="Login">
    </form:form>
</body>
</html>
