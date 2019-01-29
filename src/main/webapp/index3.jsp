
<%--
  Created by IntelliJ IDEA.
  User: krzysztofszczeciak
  Date: 29/01/2019
  Time: 22:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:set var="someName" value="Witaj w coderslab ."/>
    <c:if test="${fn:contains (someName, 'coderslab')}"> Jest ok - zawiera
    </c:if>

    <c:if test="${!fn:contains (someName, 'coderslab')}"> nie zawiera
    </c:if>


</body>
</html>
