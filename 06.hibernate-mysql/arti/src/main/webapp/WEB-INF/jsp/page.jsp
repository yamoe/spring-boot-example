<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>page</title>
</head>
<body>

<h1>Hello</h1>
<c:if test="${not empty fruit}" >
    <div>${fruit}</div>
</c:if>
</body>
</html>
