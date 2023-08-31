<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>테스트2</title>
</head>
<body>
	
	
	
	<h1>HOT 5</h1>
		<table>
			<tr>
				<td>순위</td>
				<td>제목</td>
			</tr>
	<c:forEach var="music" items="${musicRanking}" varStatus="status" >
			<tr>
				<td>${status.count}</td>
				<td>${music}</td>
			</tr>
		</table>
	</c:forEach>

</body>
</html>