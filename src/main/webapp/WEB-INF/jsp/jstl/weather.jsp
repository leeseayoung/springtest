<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>     

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>종합문제1</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="css/test01.css" type="text/css">

</head>
<body>
	<html>
		<head>
			<meta harset="utf-8">
			<title>종합문제1</title>
			
		</head>
		<body>
			<div id="wrap">
				<section class="contents d-flex ">
	                <nav class="main-menu col-2 p-0 bg-info w-25" >
	                    <ul class="nav flex-column ">
	                     	<li class="nav-item menu-item"><a href="#" class="nav-link text-white text-center font-weight-bold"> <img src="https://www.job-post.co.kr/news/photo/202205/52730_52696_1440.jpg" width="50" alt="기상청 이미지"> 기상청</a></li>
	                        <li class="nav-item menu-item"><a href="#" class="nav-link text-white font-weight-bold">날씨</a></li>
	                        <li class="nav-item menu-item"><a href="#" class="nav-link text-white font-weight-bold">날씨입력</a></li>
	                        <li class="nav-item menu-item"><a href="#" class="nav-link text-white font-weight-bold">테마날씨</a></li>
	                        <li class="nav-item menu-item"><a href="#" class="nav-link text-white font-weight-bold">관측 기후</a></li>
	                    </ul>
	                </nav>				

				<article>
					<h1>과거 날씨</h1>
					<table class="table text-center">
						<thead>
							<tr>
								<th>날짜</th>
								<th>날씨</th>
								<th>기온</th>
								<th>강수량</th>
								<th>미세먼지</th>
								<th>풍속</th>
	
							</tr>						
						</thead>
						<tbody>
							<!-- 
							<c:forEach var="weather" items="${weatherList}"  >
							</c:forEach>
							 -->
							<tr>
								<td>${weather.date}</td>

							</tr>
							
						</tbody>
						
					</table>
				</article>
					

				
				
				</section>
				
				
				
			<footer class="d-flex">
                <div class="footer-left col-2 text-center text-secondary mt-3"> <img src="https://www.job-post.co.kr/news/photo/202205/52730_52696_1440.jpg" width="50" alt="기상청 이미지">기상청</div>
                <div class="copyright col-10">(07062)서울시 동작구 여의대로방로16길 61
                <div>Copyright©2020 KMA. ALL Right RESERVED</div></div>
                
            </footer>
				
			</div>
			
		</body>
	</html>



	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>	
	

</body>
</html>