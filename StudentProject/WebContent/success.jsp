<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<H1>Thank You <%=request.getParameter("sname") %></H1>
	<h3> You have enrolled for <%=request.getParameter("course") %></h3>
</body>
</html>