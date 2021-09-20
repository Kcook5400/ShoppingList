<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c"uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>shopping list </title>
</head>
<body>
<table>
<c:forEach items = "${requestScope.allItems}" var = "currentitem">
<tr>
<td> <input type = "radio" name = "id" value="${currentitem.id}"></td>
<td> ${currentitem.store}</td>
<td> ${currentitem.item }</td>
</tr>
</c:forEach>
</table>
</body>
</html>