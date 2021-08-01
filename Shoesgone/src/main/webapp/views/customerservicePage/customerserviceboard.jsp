<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="notice.model.vo.Notice" %>    
<%
	Notice notice = (Notice)request.getAttribute("notice");
%>  
<!DOCTYPE html>
<html>

<head>
<!-- meta character set -->
<meta charset="UTF-8">
<!-- Site Title -->
<title>고객센터</title>
<style type="text/css">
#floatdiv {

    position:fixed; _position:absolute; _z-index:-1;

    width:100px;

    display:inline-block;/* overflow:hidden;  같은 의미? */

    right:0px; /* //화면 오른쪽에 위치한다. left로 변경가능 */

    top:20%; /* //화면 위쪽과의 간격 */

    background-color: transparent;

    margin:0;

}

#floatdiv ul  { list-style: none; }

#floatdiv li  { margin-bottom: 2px; text-align: left; }

#floatdiv a   { color: #5D5D5D; border: 0; text-decoration: none; display: float; }

#floatdiv a:hover, #floatdiv .menu  { background-color: #5D5D5D; color: #fff; } /* 마우스오버 시 배경/글씨 색깔 */

#floatdiv .menu, #floatdiv .last    { margin-bottom: 0px; }

 

 

#floatContent {

    padding:5px;

border-width: 2px;

border-color: #7f7f7f;

border-style: solid;

border-bottom-left-radius: 10px;

border-bottom-right-radius: 10px;

}

 

#floatTitle {

width:100px;

height:30px;

line-height:30px;

background-color: #7f7f7f;

/* 텍스트 */

color: #fff;

text-align: center;

text-decoration: none;

font-weight:bold;

font-size:12px;

/* 모양 */

border-top-left-radius: 10px;

border-top-right-radius: 10px;

 

}
.sub_news{
 font-size: 16px;

 
}

	
	
</style>
</head>

<body>

	<!-- Start Header Area -->
	<%@ include file="../common/menubar.jsp" %>
	<!-- End Header Area -->

	<!-- Start Banner Area -->
	<section class="banner-area organic-breadcrumb">
		<div class="container">
			<div
				class="breadcrumb-banner d-flex flex-wrap align-items-center justify-content-end">
				<div class="col-first">
					<h1>고객센터</h1>
					<nav class="d-flex align-items-center">
					</nav>
				</div>
			</div>
		</div>
	</section>

	<!--================Contact Area =================-->
	<section><br><br><br>
	<h2 align="center">고객센터</h2><hr>
		<div class="container">
		<div class="row">
			<table class="table table-striped" style="text-align: center; border: 1px solid #dddddd">
				<thead>
					<tr>
						<th colspan="2" style="background-color: #eeeeee; text-align: center;">상세보기</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td style="width: 20%;">글 제목</td>
						<td colspan="2" style="text-align: left;"><%= notice.getNoticeTitle() %></td>
					</tr>
					<tr>
						<td>작성자</td>
						<td colspan="2" style="text-align: left;"><%= notice.getNoticeWriter() %></td>
					</tr>
					<tr>
						<td>작성일자</td>
						<td colspan="2" style="text-align: left;"><%= notice.getNoticeDate() %></td>
					</tr>
					<tr>
						<td>내용</td>
						<td colspan="2" style="height: 200px; text-align: left;"><%= notice.getNoticeContent() %></td>
					</tr>
				</tbody>
			</table>
		
			
	
			<!-- 해당 글의 작성자가 본인이라면 수정과 삭제가 가능하도록 코드 추가 -->
			
		</div>
 <br>	
			<center><button onclick="javascript:history.go(-1);" class="genric-btn primary">목록</button></a></center><br><br>
		
		
		
		</div>
					<div id="floatdiv">

<div id="floatTitle">상담채널</div>

<div id="floatContent">

<ul>

<li>

<img src="/Shoesgone/resources/img/kakach.png" width = "80px"><a href="#"></a>

</li>

<li>

<img src="/Shoesgone/resources/img/chatbot.jpg" width = "80px"><a href="#"></a>

</li>

</ul>

</div>



<!-- //floatMenu -->
		</section>
		<!--================Contact Area =================-->

		<!-- start footer Area -->
			<%@ include file="../common/footer.jsp" %>
		<!-- End footer Area -->
</body>

</html>