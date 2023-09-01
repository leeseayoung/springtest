<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>국전 삼국지</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>



	<h1>회원 정보 리스트</h1>
	<table class="table text-center">
		<thead>
			<tr>
				<th>No</th>
				<th>이름</th>
				<th>전화번호</th>
				<th>국적</th>
				<th>이메일</th>
				<th>자기소개</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="country" items="${memberList}" varStatus="status">
		
			<tr>
				<td>${status.count}</td>
			
			
			<c:choose>
				<c:when test="${country.name eq '황충'}">
					<td><b>${country.name}</b></td>
				</c:when>  
				
				<c:otherwise>
					<td>${country.name}</td>
				</c:otherwise>		
			</c:choose>	
				
				
			<c:choose>
					<c:when test="${fn:substring(country.phoneNumber, 0, 3) eq '010'}" >
						<td>${country.phoneNumber}</td>
					</c:when>
					<c:otherwise>
						<td>유효하지 않는 전화번호</td>
					</c:otherwise>
			</c:choose>		


				
				
				
				
				<c:set var="nationality" value="${country.nationality}"/>
				<td>${fn:replace(nationality, "삼국시대", "삼국 -") }</td>
				
				<%-- 연습 --%>
				<td><b>${fn:split(country.email, "@")[0] }</b>@${fn:split(country.email, "@")[1] }</td>
				
				
				
				<td>${fn:substring (country.introduce, 0 , 15)}
					<c:if test="${fn:length(country.introduce) > 15 }">
					 	....
					</c:if>
				</td>
			</tr>
		
		</c:forEach>
		
	
		</tbody>
	</table>













	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>	
	


</body>
</html>