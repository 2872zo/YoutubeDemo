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

				$("a").on("click",function(){
					$("#selectedId").val($(this).next().val());
	
					var openwin = window.open("/play", "player", "width=660, height=380");
				});
			});
		</script>
		<title>search</title>
	</header>
	<body>
		<input type="hidden" id="selectedId"/>
	
		<form>
			<input type="text" value="${search.keyword}"/>
			<input type="submit" value="검색"/>
		</form>
		
		<c:forEach items="${videoList}" var="video">
			<div>
				<a class="thumnail" href="#">
					<img 
						alt="이미지 에러" 
						src="${video.snippet.thumbnails.medium.url}" 
						width="${video.snippet.thumbnails.medium.width }" 
						height="${video.snippet.thumbnails.medium.height }"/>
				</a>
				<input type="hidden" name="videoId" value="${video.id.videoId}"/>
				<p>${video.snippet.title }</p>
				<p></p>
			</div>
		</c:forEach>
	</body>
</html>