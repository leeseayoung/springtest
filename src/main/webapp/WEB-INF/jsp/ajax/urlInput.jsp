<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>url Input</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>

	<h1>즐겨 찾기 추가하기</h1>

		<div>
			<label>제목</label><br>
			<input type="text" class="form-control mt-1" id="nameInput"><br>
	
			<label>주소</label><br>
			<div class="d-flex justify-content-end">
	
				<input type="text" class="form-control mt-1" id="urlInput">
		
				<button type="button"  class="btn btn-info ml-3" id="duplicateBtn">중복 확인</button><br>
			</div>
			
			<!-- span을 이용 불가능할때 -->
			<span id="faileMessage"class="text-danger"></span>
			
			<!-- 가능할때 -->
			<span id="successMessage" class="text-success"></span>
			
		</div>
	 	
	 	
	 	
	 	
	 	<div class="d-flex justify-content-end mt-3">
	       <button type="button" class="btn btn-success" id="addBtn">추가</button>
	    </div>
	    
	    

	
	
	<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>	
	
	
	
	
	
	
	<script>
		$(document).ready(function() {
	
			//9월 6일 수업 
			$("#duplicateBtn").on("click", function() {
				 let url = $("#urlInput").val();
				
				 
				if(url == ""){
					alert("주소를 입력하세요");
						return ;
				}
				 
				$.ajax({
					
					type:"get"
					, url:"/ajax/url/duplicate-url"
					, data:{"url":url}
					, success:function(data) {
						
						if(data.isDuplicate) {
							//중복이면
							//alert("중복된 url 입니다!")
							$("#faileMessage").text("중복된 URL 입니다.");
						} else {
							//alert("저장 가능한 url 입니다.")
							$("#successMessage").text("저장 가능한 URL 입니다.");
						}
						
					}
					, error:function() {
						
						alert("에러!")
					
					}
				
				
				});	
				
					 
				 
			});
			
			
			
			
			
			
			
			
			
			$("#addBtn").on("click", function() {
				let name = $("#nameInput").val();
				let url = $("#urlInput").val();
				
				// 오류
				//console.log(name + " " + url );
				
				
				
				if(name == ""){
					alert("제목을 입력하세요");
					return ;
				}
				
				if(url == ""){
					alert("주소를 입력하세요");
					return ;
				}
				
				//주소가 http
				// 주소가 http로 시작하지 않고 https 로도 시작하지 않으면
				if(!url.startsWith("http://") && !url.startsWith("https://")) {
					alert("주소형식을 확인해 주세요!")
					return ;
				}
				
				
				
				$.ajax({
					type:"post"
					, url:"/ajax/url/create"
					, data:{"name":name , "url":url}
					, success:function(data) {
					
					// 성공 : {"result : success}
					// 실패 : {"result : fail"}
					
					if(data.result == "success") {
						// 성공
						// 리스트 페이지로 이동
						location.href="/ajax/url/list";
					} else {
						// 실패
						alert("추가 실패!!!");
					  }
					
						
					} 
						
					, error:function() {
						 alert("추가 에러!!")
					}
				
				});

				
			});
			
		});
	</script>
	
	
	
	
	
	
	

</body>
</html>