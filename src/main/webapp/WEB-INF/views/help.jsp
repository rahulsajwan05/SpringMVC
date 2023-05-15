<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 
		
 		<h1>Hello My Name is 
 		${name}
 		</h1>
 		
 		<h1>Hello Roll no is 
 		${id}
 		</h1>
 		
 		<h1>Time is  
 		${time}
 		</h1>
 		
 		<c:forEach var="item" items=" ${marks}"> 
 			<h1>${item}</h1>
 		</c:forEach>
</body>
</html>