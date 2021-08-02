<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<!-- meta character set -->
	<meta charset="UTF-8">
	<!-- Site Title -->
	<title>나의글보기</title>

<style type="text/css">
ul#menubar {
	text-align: center;
	align: center;
	list-style: none;
	position: relative;
	
	/* top: -30px; */
}
ul#menubar li {
	algin: center;
	text-align: center;
	display:inline-block;
	width: 120px;
	height: 30px;
	
	padding: 0;
}
ul#menubar li a {
	text-decoration: none;
	width: 120px;
	height: 30px;
	display: block;
	background: orange;
	color: white;
	text-align: center;
	
	margin: 0;
	
	padding-top: 5px;
}
ul#menubar li a:hover {
	text-decoration: none;
	width: 120px;
	height: 30px;
	display: block;
	background: white;
	color: orange;
	text-align: center;
	font-weight: bold;
	margin: 0;
	padding-top: 5px;
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
			<div class="breadcrumb-banner d-flex flex-wrap align-items-center justify-content-end">
				<div class="col-first">
					<h1>나의 글 보기</h1>
					<nav class="d-flex align-items-center">
					</nav>
				</div>
			</div>
		</div>
	</section>
	
	<!--================Contact Area =================-->

<section>
<br><br>
<h2 align="center">나의 글 보기</h2>
<center>
<ul id="menubar" style="align:center;">
	<li><a href="/Shoesgone/nlist">Best게시판</a></li>
	<li><a href="/Shoesgone/flist">리뷰게시판</a></li>
	<li><a href="/Shoesgone/qulist">갤러리</a></li>
	<li><a href="#">자유게시판</a></li>
	<li><a href="#">QnA</a></li>
</ul></center>
<br>
<hr>
		<section class="product_description_area">
			<div class="container">
			<center><h3>Best게시판</h3></center><br>
				<table class="sub_news" border="0" cellpadding="7px"
							summary="게시판의 글제목 리스트" align="center" text-align="center">
							
							<colgroup>
								<col width="50" >
								<col width="450">
								<col width="150">
								<col width="100">
								<col width="100">
							</colgroup>
							<thead style="border-bottom:0.5px solid #444444 ; border-collapse : collapse;
							">
								<tr>
								    <th scope="col" style = "text-align:center">번호</th>
									<th scope="col" style = "text-align:center">제목</th>
									<th scope="col" style = "text-align:center">작성자</th>
									<th scope="col" style = "text-align:center">작성일</th>
									<th scope="col" style = "text-align:center">조회수</th>
									
								</tr>
							</thead>
							
							<tbody>
								<tr>
								
									<td class="name" style = "text-align:center">1</td>
									<td class="title" style = "text-align:center"><a href="#">게시판 제목
										</td>
									<td class="name" style = "text-align:center">글쓴이이름</td>
									<td class="date" style = "text-align:center">2021-01-01</td>
									<td class="hit" style = "text-align:center">1234</td>
								</tr>
								
								<!-- -->
							</tbody>
						</table><br>
						 
 <br><br>

					
					<hr>
					</div>
					</div><br><center><a href="/Shoesgone/contact.jsp" class="genric-btn primary">목록보기</a></center>
		</section>
</section>
	<!--================Contact Area =================-->

	<%@ include file="../common/footer.jsp" %>
</body>

</html>