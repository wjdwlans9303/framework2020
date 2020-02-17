<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
	<h1>add page</h1>
	<form action="insert.bit" method="post">
		<div>
			<label for="sabun">sabun</label>
			<input type="text" name="sabun" id="sabun"/>
		</div>
		<div>
			<label for="name">name</label>
			<input type="text" name="name" id="name"/>
		</div>
		<div>
			<label for="pay">pay</label>
			<input type="text" name="pay" id="pay"/>
		</div>
		<div>
			<button>입 력</button>
		</div>
	</form>
</body>
</html>