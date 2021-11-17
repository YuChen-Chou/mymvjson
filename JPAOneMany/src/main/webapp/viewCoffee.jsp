<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1" width="60%">
<tr>
<th>Coffee Name</th>
<th>Coffee Price</th>
<th>Supplier ID</th>
<th>Supplier Name</th>
</tr>
<c:forEach var="rows" items="${coffee}">
<tr>
	<td><c:out value="${rows.cofName}"/></td>
	<td><c:out value="${rows.price}"/></td>
	<td><c:out value="${rows.supplier.supId}"/></td>
	<td><c:out value="${rows.supplier.supName}"/></td>
</tr>
</c:forEach>
Hello
</table>
</body>
</html>