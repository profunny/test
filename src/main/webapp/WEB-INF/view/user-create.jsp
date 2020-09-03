<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Hata
  Date: 20.05.2020
  Time: 22:57
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form method="post" action="/user-form/add" modelAttribute="user">
    <table>
        <tr>
            <td><form:label path="name">name</form:label></td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td><form:label path="email">email</form:label></td>
            <td><form:input path="email"/></td>
        </tr>
        <tr>
            <td><form:label path="status">status</form:label></td>
            <td><form:input path="status"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="submit">
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>

