<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>날씨 추가</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="css/test02.css" type="text/css">

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
					<div>
					<h1 class="mt-3 ml-5" >날씨 입력</h1>
						
						<form method="get" action="/weather/create">
						
						<div clapp="d-flex">
							
							<label>날짜</label><input type="text" name="date">
							<label>날씨</label>
							<select name="weather">
					            <option>--날씨선택--</option>
					            <option>맑음</option>
					            <option>구름조금</option>
					            <option>흐림</option>
					            <option>비</option>
					       </select>
							
						  <label>미세먼지</label>
						  <select name="microDust">
					            <option>--미세먼지선택--</option>
					            <option >보통</option>
					            <option >좋음</option>
					            <option >나쁨</option>
					            <option >최악</option>
					      </select>
					
						</div>
						
						
						<div class="mt-3 d-flex" >
							<div class="input-group mb-3">
								  <label class="text-center">기온</label><input type="text" name="temperatures" >
								  <span class="input-group-text">℃</span>
							</div>
							
							<div class="input-group mb-3">
								  <label class="text-center">강수량</label><input type="text" name="precipitation" >
								  <span class="input-group-text">mm</span>
							</div>		
						
						
							<div class="input-group mb-3">
								  <label class="text-center">풍속</label><input type="text" name="windSpeed">
								  <span class="input-group-text">km/h</span>
							</div>		
						</div>						
						<div class="d-flex justify-content-end">
                            <button class="btn btn-success mt-3 mr-5" type="submit">저장</button>
                        </div>
                        </form>
					
					</div>
			
					

				
				
				</section>
				
				
				
			<footer class="d-flex">
                <div class="footer-left col-2 text-center text-secondary mt-3"> <img src="https://www.job-post.co.kr/news/photo/202205/52730_52696_1440.jpg" width="50" alt="기상청 이미지">기상청</div>
                <div class="copyright col-10">(07062)서울시 동작구 여의대로방로16길 61
                <div>Copyright©2020 KMA. ALL Right RESERVED</div></div>
                
            </footer>
				
			</div>
			










	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>	
	


</body>
</html>