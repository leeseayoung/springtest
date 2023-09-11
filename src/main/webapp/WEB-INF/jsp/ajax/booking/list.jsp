<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>      
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>booking 리스트</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>
		<div>
	          <header class="mt-4">
	                <div class="text-center display-4">통나무 팬션</div>
	                <nav class="mt-4">
	                    <ul class="nav nav-fill bg-warning">
	                        <li class="nav-item"><a class="nav-link text-white" href="#">팬션소개</a></li>
	                        <li class="nav-item"><a class="nav-link text-white" href="#">객실보기</a></li>
	                        <li class="nav-item"><a class="nav-link text-white" href="http://localhost:8080/booking/input">예약하기</a></li>
	                        <li class="nav-item"><a class="nav-link text-white" href="http://localhost:8080/booking/list">예약목록</a></li>
	                    </ul>
	                </nav>
	            </header>
	            <div><h1 class="text-center mt-3">예약 목록 보기</h1></div>
	            <table class="table text-center mt-3">
	            	<thead>
						<tr>
							<th>이름</th>
							<th>예약날짜</th>
							<th>숙박일수</th>
							<th>숙박인원</th>
							<th>전화번호</th>
							<th>예약상태</th>
			
						</tr>
					</thead>
					<tbody>
						<c:forEach var="booking" items="${bookingList}">
							<tr>
								<td>${booking.name}</td>
								<td><fmt:formatDate value="${booking.date}" pattern="yyyy년 M월 d일 "/></td>
								<td>${booking.day}</td>
								<td>${booking.headcount}</td>
								<td>${booking.phoneNumber}</td>
								
								<c:choose>
									<c:when test="${booking.state eq '대기중'}">
										<td class="text-info">${booking.state}</td>			
									</c:when>
									<c:when test="${booking.state eq '취소'}">
										<td class="text-danger">${booking.state}</td>
									</c:when>
									<c:otherwise>
										<td class="text-success">${booking.state}</td>
									</c:otherwise>
								</c:choose>
								
								<td><button type="button" data-booking-id ="${booking.id}" class="btn btn-danger btn-sm delete-btn" id="deleteBtn">삭제</button></td>
							
							</tr>
						</c:forEach>
					</tbody>
	            </table>
				<footer class="mt-3 ml-4">
		                <address>
		                    제주특별자치도 제주시 애월읍  <br>
		                    사업자등록번호: 111-22-255222 / 농어촌민박사업자지정 / 대표:김통목 <br>
		                    Copyright 2025 tongnamu All right reserved
		                </address>
	
	            </footer>
		</div>

	<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>	
	
	
	<script>
		$(document).ready(function () {
			
			$(".delete-btn").on("click", function() {
				
				let id = $(this).data("booking-id")
				
				$.ajax({
					
					type:"get"
					, url:"/booking/delete"
					, data:{"id":id}
					, success:function(data) {
						// 성공 : {"result": "success"}
						// 실패 : {"result": "fail"}
						if(data.result == "success") {
							location.reload();
						} else {
							alert("삭제 실패");
						}
					}
					, error:function() {
						alert("삭제 에러!!")
					}
					
				});
				
			});
			
			
		});
	</script>
	


</body>
</html>