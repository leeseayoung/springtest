<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>      
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예약하기</title>
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
	            
	            <div><h1 class="text-center mt-3">예약 하기</h1></div>
				
				<section class="contents d-flex justify-content-center">
	                <div class="join-box my-2">
	                    
	                    <label class="mt-3">이름</label>
	                    <input type="text" class="form-control" id="nameInput" >
	
	                    <label class="mt-2">예약날짜</label>
	                    <input type=text" class="form-control" id="dateInput">
	
	                    <label class="mt-2">숙박일수</label>
	                    <input type=text" class="form-control" id="daycountInput">
	
	                    <label class="mt-2">숙박인원</label>
	                    <input type="text" class="form-control" id="headcountInput">
	
	                    <label class="mt-2">전화번호</label>
	                    <input type="text" class="form-control" id="phonenumberInput">

	                    <button type="button"  class="btn btn-warning btn-block mt-3" id="bookingBtn">가입하기</button>
	                </div>
            	</section>
				
				
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
			$(document).ready(function() {
				
				$("#bookingBtn").on("click", function() {
				
					let name = $("#nameInput").val();
					let date = $("#dateInput").val();
					let day = $("#daycountInput").val();
					let headcount = $("#headcountInput").val();
					let phonenumber = $("#phonenumberInput").val();
					
					
					if(name == ""){
						alert("이름을 입력하세요");
							return ;
					}
			
					if(date == ""){
						alert("날짜를 입력하세요");
							return ;
					}
					
					// Not a Number
					if(isNaN(day)) {
						alert("숙박일수는 숫자만 입력 가능합니다");
						return;
					}
					
					if(isNaN(headcount)) {
						alert("숙박인원는 숫자만 입력 가능합니다");
						return;
					}
					
					if(phonenumber == ""){
						alert("전화번호를 입력하세요");
							return ;
					}
						
					
					$.ajax({
						
						type:"get"
						, url:"/booking/create"
						, data:{"name":name, "date":date, "day":day, "headcount":headcount, "phonenumber":phonenumber}
						, success:function(data) {
							
							if(data.result == "success") {
								
								location.href = "/booking/list";
							} else {
								
								alert("예약 실패!");
							}
							
							
						}
						, error:function() {
							alert("예약 에러!")
						}
						
					});
					
					
					
				
					
					
				});	
			
			});

	



					

		</script>



</body>
</html>