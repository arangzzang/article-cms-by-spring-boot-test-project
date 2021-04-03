<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path" value="${pageContext.request.contextPath }" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-3.5.1.min.js" type="text/javascript"></script>
</head>
<body>
	<h2>메인화면</h2>
	<h3>test project</h3>
	<button id="btn">인사</button>
	<br>
	<input type="text" id="userId" placeholder="아이디입력">
	<button id="search">조회</button>
	<div id="container"></div>
	
	<script>
		$(function(){
			$("#btn").click(e=>{
				$.get("${pageContext.request.contextPath}/test",data=>{
					$("#container").html(data);
				})
			})
			$("#search").click(e=>{
				$.get("${pageContext.request.contextPath}/members"+$("#userId").val(),
						data=>{
							console.log(data);
							$("#container").html(data.userId+data.password);
						})
			})
		})
	</script>
</body>
</html>