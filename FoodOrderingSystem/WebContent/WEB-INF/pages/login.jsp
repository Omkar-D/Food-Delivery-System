<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
<h3 align="center">${requestScope.status}</h3>
	<form method="post">
		<table style="background-color: cyan; margin: auto;">
			<tr>
				<td>Enter Username or Email</td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>Enter Password</td>
				<td><input type="password" name="pass" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Login" /></td>
			</tr>
			
		</table>
	</form>
</body>
</html>