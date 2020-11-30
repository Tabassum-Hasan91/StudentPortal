<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form method="post" action="enroll">
		Enter name:
		<input type="text" name="sname"/>
		Select course name:
		<select name="course">
			<option value="cpp">C++</option>
			<option value="java">Java</option>
			<option value="servlet">Servlets</option>
		</select>
		
		<input type="submit" value="Enroll">
	</form>
</body>
</html>