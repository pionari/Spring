<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="insertRes.do" method="post">
	<table border="1">
		<tr>
			<th>제목</th>
			<td><input type="text" name="mytitle" value="${dto.mytitle }"></td>
		</tr>
		<tr>
			<th>작성자</th>
			<td><input type="text" name="myname" value="${dto.myname }" readonly="readonly"></td>
		</tr>
		<tr>
			<th>내용</th>
			<td><input type="text" name="mycontent" value="${dto.mycontent }"></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="작성">
				<input type="button" value="취소" onclick="location.href='list.do'">
			</td>
		</tr>
	</table>
	</form>
</body>
</html>