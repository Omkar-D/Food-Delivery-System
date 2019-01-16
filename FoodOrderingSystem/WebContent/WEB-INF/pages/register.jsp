<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">

<h3 align="center">Welcome to Food App</h3>
<h3 align="center">${requestScope.STATUS}</h3>
<form method="post">
<fieldset>
<legend>Registration Form</legend>
<center>
<table margin=auto;>
<tr><td>Enter First Name<input type="text" name="fname" /></td></tr>
<tr><td>Enter Last Name<input type="text" name="lname" ></td></tr>
<tr><td>Enter email<input type="email" name="email" ></td></tr>
<tr><td>Enter Password<input type="password" name="pass1"></td></tr>
<tr><td>Confirm Password<input type="password" name="pass2"></td></tr>
<tr><td>Enter Mobile No.<input type="number" name="mob"></td></tr>
<tr><td><h3>Address Details</h3></td></tr>
<tr><td>House No.<input type="number" name="house_no"></td></tr>
<tr><td>Street<input type="text" name="street"></td></tr>
<tr><td>City<input type="text" name="city"></td></tr>
<tr><td>Sub-area
<select id="city_id">
   <c:forEach var="v" items="${sessionScope.city}">
			
			<option value="A">${v.sub_area}</option>
			
		</c:forEach>
</select></td></tr>
<tr><td>Pin Code<input type="number" name="pin" ></td></tr>
 <tr><td><input type="submit" value="Register" /></td><td><input type="submit" value="Cancle"/></td></tr>


 
  
 
</table>
</center>
</fieldset>
</form>
</body>
</html>