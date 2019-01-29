<%--
  Created by IntelliJ IDEA.
  User: krzysztofszczeciak
  Date: 29/01/2019
  Time: 19:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    ${empty param.author ? "brak podanej wartosci" : "podany author: "}<br>
    ${param.author}<br>

</body>
</html>
