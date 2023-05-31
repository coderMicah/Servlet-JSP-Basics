<!-- Directives -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
    
<%@ include file="error.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- Declarations  -->
	<%! int total = 77; %>

	<!-- Scriplet  -->
	<%
	int i = 10;
	int j = 15;
	int total = i + j;
	int k = 9/0;
	out.println("The sum of "+ i + "and" + j + " is :" + total);
	%>
	
	<!-- Expression  -->	
	<%="Hello Stranger"%>

</body>
</html>