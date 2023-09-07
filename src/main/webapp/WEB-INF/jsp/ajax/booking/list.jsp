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
		
          <header class="mt-4">
                <div class="text-center display-4">통나무 팬션</div>
                <nav class="mt-4">
                    <ul class="nav nav-fill bg-warning">
                        <li class="nav-item"><a class="nav-link text-white" href="#">팬션소개</a></li>
                        <li class="nav-item"><a class="nav-link text-white" href="#">객실보기</a></li>
                        <li class="nav-item"><a class="nav-link text-white" href="#">예약하기</a></li>
                        <li class="nav-item"><a class="nav-link text-white" href="#">예약목록</a></li>
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
							<td>${booking.PHONEnUMBER}</td>
							<td>${booking.state}</td>
	
							<td><button type="button" class="btn btn-danger btn-sm">삭제</button></td>
						
						</tr>
					</c:forEach>
				</tbody>
            </table>


	<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>	
	

</body>
</html>