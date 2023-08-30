<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공인중개사 정보</title>
</head>
<body>

	<h1>공인중개사 정보</h1>
	<table>
		<tr>
			<td>id</td>
			<td>${Realtor.id}</td>
		</tr>
		<tr>
			<td>상호명</td>
			<td>${Realtor.office}</td>
		</tr>
		<tr>
			<td>전화번호</td>
			<td>${Realtor.phoneNumber}</td>
		</tr>
		<tr>
			<td>주소</td>
			<td>${Realtor.address}</td>
		</tr>
		<tr>
			<td>등급</td>
			<td>${Realtor.grade}</td>
		</tr>										

	</table>
	
	
	<h3>ID : ${realtor.id}</h3>
	<h3>상호명 : ${realtor.office}</h3><hr>
	<h3>전화번호 : ${realtor.phoneNumber}</h3><hr>
	<h3>주소 :  ${realtor.address}</h3><hr>
	<h3>등급 :  ${realtor.grade}</h3><hr>
	
</body>
</html>