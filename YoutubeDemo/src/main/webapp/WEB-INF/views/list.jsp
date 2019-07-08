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

				$("a").on("click",function(e){
					e.preventDefault();
					$("#selectedId").val($(this).next().val());
					var openwin = window.open("/play", "player", "width=660, height=380");
				});
			});

			<!-- 무한스크롤을 위한 자바스크립트 -->
			let isEnd = false;
			let isActive = false;
			let nextPageToken = "${search.nextPageToken}";
			
			$(function(){
		        $(window).scroll(function(){
		            let $window = $(this);
		            let scrollTop = $window.scrollTop();
		            let windowHeight = document.body.clientHeight;
// 		            let windowHeight = $window.height();
		            let documentHeight = $(document).height();
		            
		            console.log("documentHeight:" + documentHeight + " | scrollTop:" + scrollTop + " | windowHeight: " + windowHeight );
		            
		            // scrollbar의 thumb가 바닥 전 30px까지 도달 하면 리스트를 가져온다.
		            if( scrollTop + windowHeight + 30 > documentHeight && isActive == false){
			            isActive = true;
		                fetchList();
		            }
		        })
		    });

			function fetchList(){
				if(isEnd == true){
		            return;
		        }

				let jsonObject = { nextPageToken : nextPageToken, keyword : $("[name=keyword]").val()};
		        
		        // 방명록 리스트를 가져올 때 시작 번호
		        // ajax에서는 data- 속성의 값을 가져오기 위해 data() 함수를 제공.
		        $.ajax({
		            url:"/appendContent",
		            type: "POST",
		            contentType: "application/json",
		            dataType: "json",
		            data: JSON.stringify(jsonObject),
		            success: function(result){

			            alert("current : " + nextPageToken + "\nnext : " + result.search.nextPageToken);
			            		            
		            	nextPageToken = result.search.nextPageToken;
			            let length = result.videoList.length;
			            if(length < 0){
							isEnd = true;
				        }
				        
		                $.each(result.videoList, function(index, vo){
		                    renderList(false, vo);
		                })

		                isActive = false;
		            }
		        });		
			}

			let renderList = function(mode, vo){
// 				console.log(vo.snippet.thumbnails.medium.url);
				
		        // 리스트 html을 정의
		        let html = "<a class='thumnail' href='#'>"
							+ "<img"  
							+	" alt='이미지 에러'"
							+	" src='" + vo.snippet.thumbnails.medium.url + "'" 
							+	" width='" + vo.snippet.thumbnails.medium.width + "'" 
							+	" height='" + vo.snippet.thumbnails.medium.height + "'/>"
						+"</a>"
						+"<input type='hidden' name='videoId' value='" + vo.id.videoId + "'/>"
						+"<p>" + vo.snippet.title + "</p>";
						
		        if( mode ){
		            $("#list-guestbook").prepend(html);
		        }
		        else{
		            $("div").append(html);
		        }
		    }
		</script>
		<title>search</title>
	</header>
	<body>
		<input type="hidden" id="selectedId"/>
	
		<form>
			<input type="text" value="${search.keyword}" name="keyword"/>
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