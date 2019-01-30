<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: krzysztofszczeciak
  Date: 30/01/2019
  Time: 18:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
dodaj bilet:<br>
<br>

<form action="/Servlet02" method="post" id="airports">
    miejsce odlotu:<br>
    <select name="airportDep" form="airports">
        <c:forEach items="${airports}" var="lang">
            <option value="${lang.name}">${lang.name}</option>
        </c:forEach>
    </select><br>
    miejsce przylotu:<br>
    <select name="airportAri" form="airports">
        <c:forEach items="${airports}" var="lang">
            <option value="${lang.name}">${lang.name}</option>
        </c:forEach>
    </select><br>
    <input type="datetime-local" name="timeDep" placeholder="data wylotu"><br>
    <input type="datetime-local" name="timeAri" placeholder="data przylotu"><br>
    <input type="number" name="timeFlight" min="0" step="1" placeholder="godziny"><br>
    <input type="number" name="price" min="0" step="0.01" placeholder="cena"><br>
    <input type="submit" value="submit">
</form>

</body>
</html>
