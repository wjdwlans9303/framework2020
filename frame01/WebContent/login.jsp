<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<a href="./">Home</a>
		<a href="./ex01.bit">Ex01</a>
		<a href="./ex02.bit">Ex02</a>
		<a href="./login.jsp">login</a>
	</div>
	<h1>login page</h1>
	<form action="login.bit" method="post">
		<input type="text" name="id">
		<input type="text" name="pw">
		<button>로그인</button>
	</form>
</body>
</html>