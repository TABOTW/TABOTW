<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="member.model.vo.Member" %>
<%
	//로그인 확인을 위해서 내장된 session 객체를 이용
	Member loginMember = (Member)session.getAttribute("loginMember");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<style type="text/css">
ul#menubar {
	list-style: none;
	position: relative;
	left: 150px;
	/* top: -30px; */
}
ul#menubar li {
	float: left;
	width: 120px;
	height: 30px;
	margin-right: 5px;
	padding: 0;
}
ul#menubar li a {
	text-decoration: none;
	width: 120px;
	height: 30px;
	display: block;
	background: orange;
	color: navy;
	text-align: center;
	font-weight: bold;
	margin: 0;
	text-shadow: 1px 1px 2px white;
	padding-top: 5px;
}
ul#menubar li a:hover {
	text-decoration: none;
	width: 120px;
	height: 30px;
	display: block;
	background: navy;
	color: white;
	text-align: center;
	font-weight: bold;
	margin: 0;
	text-shadow: 1px 1px 2px navy;
	padding-top: 5px;
}
hr { clear: both; }
</style>
</head>
<body>
<% if(loginMember == null){ //로그인하지 않았을 때 %>
<ul id="menubar">
	<li><a href="/first/nlist">공지사항</a></li>
	<li><a href="/first/blist?page=1">게시글</a></li>
	<li><a href="#">QnA</a></li>
	<li><a href="/first/views/test_api/testList.html">테스트</a></li>
	<li><a href="/first/index.jsp">홈</a></li>
</ul>
<% }else if(loginMember.getAdmin().equals("Y")){ //관리자가 로그인했을 때 %>
<ul id="menubar">
	<li><a href="/first/mlist">회원관리</a></li>
	<li><a href="/first/nlist.ad">공지사항관리</a></li>
	<li><a href="/first/blist?page=1">게시글관리</a></li>
	<li><a href="#">사진게시판관리</a></li>
	<li><a href="/first/index.jsp">홈</a></li>
</ul>
<% }else { //일반 회원이 로그인했을 때 %>
<ul id="menubar">
	<li><a href="/first/nlist">공지사항</a></li>
	<li><a href="/first/blist?page=1">게시글</a></li>
	<li><a href="#">QnA</a></li>
	<li><a href="#">암호화회원가입</a></li>
	<li><a href="/first/index.jsp">홈</a></li>
</ul>
<% } %>
</body>
</html>






