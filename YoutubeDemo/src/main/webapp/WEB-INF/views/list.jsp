<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<header>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script>
		</script>
		<title>search</title>
	</header>
	<body>
		<form>
			<input type="text" value="${search.keyword}"/>
			<input type="submit" value="°Ë»ö"/>
		</form>
	</body>
</html>