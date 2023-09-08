<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>홈페이지</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="css/homepage.css" type="text/css">
</head>
<body>
	
			<div id="wrap" >
	            <header class="mt-4">
	                <div class="text-center display-4">통나무 팬션</div>
	                <nav class="mt-4">
	                    <ul class="nav nav-fill">
	                        <li class="nav-item"><a class="nav-link" href="#">팬션소개</a></li>
	                        <li class="nav-item"><a class="nav-link" href="#">객실보기</a></li>
	                        <li class="nav-item"><a class="nav-link" href="http://localhost:8080/booking/input">예약하기</a></li>
	                        <li class="nav-item"><a class="nav-link" href="http://localhost:8080/booking/list">예약목록</a></li>
	                    </ul>
	                </nav>
	            </header>
	
	            <section class="banner">
	                <img src="test06_banner1.jpg" id="bannerImage">
	            </section>
	            <sction class="d-flex">
	                <article class="reservation d-flex justify-content-center align-items-center">
	                    <div class="display-4">
	                        실시간 <br>
	                        예약 하기 
	                    </div>
	                </article>
	                <article class="reservation-confirm">
	                    <div class="m-4">
	                        <div class="d-flex align-items-end">
	                            <h3 class="mr-4">예약 확인</h3>
	                        </div>
	                        <div class="member-input mt-3" id="member">
	                            <div class="input-gorup form-inline">
	                                <label class="input-label">이름 :</label>
	                                <input type="text" class="form-control text-input" id="name">
	                            </div>
	                            <div class="input-gorup form-inline mt-3">
	                                <label class="input-label">전화번호 :</label>
	                                <input type="text" class="form-control text-input" id="phoneNumber">
	                            </div>
	
	                        </div>
	
	                 
	                        <div class="d-flex justify-content-end">
	                            <button class="btn btn-success mt-3 mr-5" id="findBtn">조회 하기</button>
	                        </div>
	                    </div>
	                </article>
	                <article class="reservation-call d-flex justify-content-center align-items-center">
	                    <div>
	                        <h3>예약문의 : </h3>
	                        <h1>010-</h1>
	                        <h1>000-1111</h1>
	                    </div>
	                </article>
	            </sction>
	
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
	
		$(documeny).ready(function() {
			
			$("#findBtn").on("click", function() {
				alert("안녕")
				let name =  ("#name").val();
				let phonenumber =  ("#phoneNumber").val();
				
				
				if(name == ""){
					alert("이름을 입력하세요");
						return ;
				}
				
				if(phonenumber == ""){
					alert("전화번호를 입력하세요");
						return ;
				}
			
			
				$.ajax({
					
					type:"get"
					, url:"/booking/search"
					, data{"name":name, "phonenumber":phonenumber}
					, success:function(data) {
						
						if(data == ""){
							
							alert("조회 결과가 없습니다!")
						} else {
							
						alert("이름": + data.name  + "\n"
								+"날짜" + data.date.substring(0, 10) + "\n"
								+"일수" + data.day + "\n"
								+"인원" + data.headcount + "\n"
								+"상태" + data.state);		
						}
						
						
					}
					, error:function() {
						
						alert("조회 에러")
					}
				});
			
			
			
			
			
			
			
			
			
			});
			
			
		});
		
	
	</script>
	
	
	
	
	
	
	
</body>
</html>