<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<nav>
		<a href="index.bit">HOME</a>
		<a href="list.bit">B B S</a>
		<a href="login.bit">LOGIN</a>
	</nav>
	<h1>상세페이지</h1>
	<div>
		<span>sabun</span>
		<span>${bean.sabun }</span>
	</div>
	<div>
		<span>name</span>
		<span>${bean.name}</span>
	</div>
	<div>
		<span>nalja</span>
		<span>${bean.nalja }</span>
	</div>
	<div>
		<span>pay</span>
		<span>${bean.pay }</span>
	</div>
	<div>
		<a href="edit.bit?sabun=${bean.sabun }">수 정</a>
		<a href="delete.bit?sabun=${bean.sabun }">삭 제</a>
	</div>
</body>
</html>
