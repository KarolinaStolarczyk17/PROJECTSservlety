<%--
  Created by IntelliJ IDEA.
  User: karolina
  Date: 13.06.2021
  Time: 12:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Title</title>
</head>
<body>

<c:out value="${book.title}" default="brak wybranej książki."/>


</body>
</html>
