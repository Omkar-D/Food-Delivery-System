<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--importing spring supplied JSP tag lib --%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">



   select city
	 <select name="city">
   <c:forEach var="v" items="${sessionScope.city}">
			
			<option value="${v.sub_area}">${v.sub_area}</option>
			
		</c:forEach>
</select>
	<h5>
		<a href="<spring:url value='/customer/menu'/>">Submit</a>
	</h5>
	
</body>
</html>