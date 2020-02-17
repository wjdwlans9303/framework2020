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
	<h1>수정페이지</h1>
	<form action="update.bit" method="post">
		<div>
			<label for="sabun">sabun</label>
			<input type="text" name="sabun" id="sabun" value="${bean.sabun }"/>
		</div>
		<div>
			<label for="name">name</label>
			<input type="text" name="name" id="name" value="${bean.name }"/>
		</div>
		<div>
			<label for="nalja">nalja</label> ${bean.nalja }
			<input type="hidden" name="nalja" id="nalja" value="${bean.nalja }"/>
		</div>
		<div>
			<label for="pay">pay</label>
			<input type="text" name="pay" id="pay" value="${bean.pay }"/>
		</div>
		<div>
			<button>수 정</button>
		</div>
	</form>
	
</body>
</html>