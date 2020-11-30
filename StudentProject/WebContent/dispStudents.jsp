<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.ArrayList, com.niit.model.Student, java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<%--Here we will retreive the studList from the request object --%>
	<% ArrayList<Student> l=(ArrayList<Student>)request.getAttribute("studList");%>
	
	<table border=1 class="table">
		<tr>
			<td>Name</td>
			<td>Course</td>
		</tr>
		<%for(Student s:l)
		{
			out.print("<tr class='success'>");
			out.println("<td>"+s.getName()+"</td>");
			out.println("<td>"+s.getCourse()+"</td>");
			out.print("</tr>");
		}
		%>
	</table>
</body>
</html>