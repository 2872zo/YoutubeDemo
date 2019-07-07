<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<header>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script>
			$(function(){
				$("input:submit").on("click",function(){
					$("form").attr("method", "GET").attr("action", "/list").submit();
				});
			});
		</script>
		<title>search</title>
	</header>
	<body>
		<form>
			<input type="text" name="keyword"/>
			<input type="submit" value="검색"/>
		</form>
	</body>
</html>