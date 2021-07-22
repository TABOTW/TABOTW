<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="notice.model.vo.Notice, java.util.ArrayList" %>    
<%
	ArrayList<Notice> list = (ArrayList<Notice>)request.getAttribute("list");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>first</title>
</head>
<body>

<hr>
<h1 align="center">공지사항</h1>
<br>
<table align="center" width="500" border="1" cellspacing="0" 
 cellpadding="0">
<tr>
	<th>번호</th>
	<th>제목</th>
	<th>작성자</th>
	<th>첨부파일</th>
	<th>날짜</th>
</tr>
<% for(Notice n : list){ %>
<tr>
	<td align="right"><%= n.getNoticeNo() %></td>
	<td><a href="/first/ndetail?noticeno=<%= n.getNoticeNo() %>"><%= n.getNoticeTitle() %></a></td>
	<td align="center"><%= n.getNoticeWriter() %></td>
	<td align="center">
		<% if(n.getOriginalFilepath() != null){ %>
			◎
		<% }else{ %>
			&nbsp;
		<% } %>
	</td>
	<td align="center"><%= n.getNoticeDate() %></td>
</tr>
<% } %> 
</table>
<br>
<hr>

</body>
</html>





