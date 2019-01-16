<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table style="background-color: cyan; margin: auto;" border="1">
		<c:forEach var="c" items="${requestScope.city}">
			<tr>
				<td>${c.sub_area}</td>
				<td><a href="<spring:url value='/login/add'/>">AddHotel</a></td>
				<td><a href="<spring:url value='/login/delete'/>">DeleteHotel</a></td>	
			</tr>
		</c:forEach>
	</table>
	<h4>
		<a href="<spring:url value='/customer/logout'/>">Log Out</a>
	</h4>
</body>
</html>