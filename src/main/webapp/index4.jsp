<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: krzysztofszczeciak
  Date: 30/01/2019
  Time: 09:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:set var="langSel"  value="${cookie.lang.value}"/>

<c:if test="${langSel == 'pl'}">
    <c:out value="${lang['en']}"></c:out><br>
</c:if>

<c:choose>
    <c:when test="${langSel =='en'}">
        <c:out value="${lang['en']}"></c:out><br>
    </c:when>
    <c:when test="${langSel =='pl'}">
        <c:out value="${lang['pl']}"></c:out><br>
    </c:when>
    <c:when test="${langSel =='de'}">
        <c:out value="${lang['de']}"></c:out><br>
    </c:when>
    <c:when test="${langSel =='es'}">
        <c:out value="${lang['es']}"></c:out><br>
    </c:when>
    <c:when test="${langSel =='fr'}">
        <c:out value="${lang['fr']}"></c:out><br>
    </c:when>
    <c:otherwise>
        Podaj język
    </c:otherwise>
</c:choose>



<form action="/Servlet01_2" method="post" id="language">
    <select name="lang" form="language">
        <c:forEach items="${lang}" var="lang">
            <option value="${lang.key}">${lang.key}</option>
        </c:forEach>
    </select>
    <input type="submit" value="submit">
</form>



</body>
</html>
