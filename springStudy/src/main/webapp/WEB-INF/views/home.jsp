<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%
	String serverTime = (String)request.getAttribute("serverTime");
%>
<html>
<head>
	<title>Home</title>
	<meta charset="utf-8">
</head>
<body>
<h1>
	Hello world! Spring <%= serverTime %>
</h1>

<P>  The time on the server is ${serverTime}. </P>
<p> 
	<a href="<%=request.getContextPath() %>/sample.do">sample.do 로 이동</a>
	<!-- 
		위 링크 클릭시 ex01.jsp 를 포워드 해보세요.
	 -->
</p>
<p>
	<%--
		<%= request.getContextPath() %> => /controller
	 --%>
	<a href="<%= request.getContextPath() %>/board/list.do">board/list.do로 이동</a>
</p>






</body>
</html>
