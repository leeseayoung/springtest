<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>seller 추가</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>

	<form method="post" action="/jsp/test/create">
		<label>닉네임 : </label><br><input type="text" name="nickname"><br>
		<label>프로필 사진url : </label><br><input type="text" name="profileImage"><br>
		<label>온도 : </label><br><input type="text" name="temperature"><br>
		<button type="submit">추가</button>
	</form>
	
</body>
</html>