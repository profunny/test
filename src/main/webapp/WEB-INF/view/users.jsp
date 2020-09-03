<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Hata
  Date: 20.05.2020
  Time: 23:41
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${!empty users}">
    <table>
        <tr>
            <th>id</th>
            <th>name</th>
            <th>email</th>
            <th>status</th>
        </tr>
        <c:forEach items="${users}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.email}</td>
                <td>${user.status}</td>
                <td><a href="<c:url value='/user-update/${user.id}'/>">edit</a></td>
                <td><a href="<c:url value='/user-delete/${user.id}'/>">remove</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>
