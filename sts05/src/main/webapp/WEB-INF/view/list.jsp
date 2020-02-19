<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:url value="/" var="root"></c:url>
	<nav>
		<a href="${root }home.bit">HOME</a>
		<a href="${root }list.bit">LIST</a>
		<a href="${root }login.bit">LOGIN</a>
	</nav>
	<table>
		<tr>
			<th>사번</th>
			<th>이름</th>
			<th>날짜</th>
			<th>금액</th>
		</tr>
		<c:forEach begin="1" end="5" var="bean">
			<tr>
				<td>${bean }</td>
				<td>${bean }</td>
				<td>${bean }</td>
				<td>${bean }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>