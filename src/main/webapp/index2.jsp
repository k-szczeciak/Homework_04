<%--
  Created by IntelliJ IDEA.
  User: krzysztofszczeciak
  Date: 29/01/2019
  Time: 21:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach var = "i" begin = "${param.begin}" end = "50" step = "${param.step}">
        ${i}<br>
    </c:forEach>
</body>
</html>
