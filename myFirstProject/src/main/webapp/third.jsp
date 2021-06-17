<%--
  Created by IntelliJ IDEA.
  User: karolina
  Date: 13.06.2021
  Time: 09:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--${empty param.name ? "empty" : "not"}--%>
${empty param.a ? "brak" : param.a}
${empty param.b ? "brak" : param.b}


</body>
</html>
