<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="community.free.model.vo.Free"%>
<%
	Free free = (Free)request.getAttribute("free");
%>
<!DOCTYPE html>
<html>
<head>
	<!-- Mobile Specific Meta -->
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<!-- Favicon-->
	<link rel="shortcut icon" href="/Shoesgone/resources/img/fav.png">
	<!-- Author Meta -->
	<meta name="author" content="CodePixar">
	<!-- Meta Description -->
	<meta name="description" content="">
	<!-- Meta Keyword -->
	<meta name="keywords" content="">
	<!-- meta character set -->
	<meta charset="UTF-8">
	<!-- Site Title -->
	<title>슈즈곤</title>

	<!-- CSS ============================================= -->
	<link rel="stylesheet" href="/Shoesgone/resources/css/linearicons.css">
	<link rel="stylesheet" href="/Shoesgone/resources/css/owl.carousel.css">
	<link rel="stylesheet" href="/Shoesgone/resources/css/font-awesome.min.css">
	<link rel="stylesheet" href="/Shoesgone/resources/css/themify-icons.css">
	<link rel="stylesheet" href="/Shoesgone/resources/css/nice-select.css">
	<link rel="stylesheet" href="/Shoesgone/resources/css/nouislider.min.css">
	<link rel="stylesheet" href="/Shoesgone/resources/css/bootstrap.css">
	<link rel="stylesheet" href="/Shoesgone/resources/css/main.css">
</head>

<body id="category">

	<%@ include file="../common/menubar.jsp" %>

	<!-- Start Banner Area -->
	<section class="banner-area organic-breadcrumb">
		<div class="container">
			<div class="breadcrumb-banner d-flex flex-wrap align-items-center justify-content-end">
				<div class="col-first">
					<h1>리뷰 게시판</h1>
					<nav class="d-flex align-items-center">
						<a href="index.jsp">Home<span class="lnr lnr-arrow-right"></span></a>
						<a href="#">Community Category<span class="lnr lnr-arrow-right"></span></a>
						<a href="review.jsp">리뷰 게시판</a>
					</nav>
				</div>
			</div>
		</div>
	</section>
	<!-- End Banner Area -->
	<div class="container">
		<div class="row">
			<div class="col-xl-3 col-lg-4 col-md-5">
				<div class="sidebar-categories">
					<div class="head">커뮤니티</div>
					<ul class="main-categories">
						<li class="main-nav-list"><a href="/Shoesgone/views/community/best/bestListView.jsp" aria-expanded="false" ><span
								 class="lnr lnr-arrow-right"></span>Best 게시판</a>
						</li>
						<li class="main-nav-list"><a href="/Shoesgone/views/community/review/reviewListView.jsp" aria-expanded="false" ><span
								 class="lnr lnr-arrow-right"></span>리뷰 게시판</a>
							</li>
						<li class="main-nav-list"><a href="/Shoesgone/views/community/gallery/galleryListView.jsp" aria-expanded="false" ><span
								 class="lnr lnr-arrow-right"></span>갤러리</a>
							</li>
						<li class="main-nav-list"><a href="/Shoesgone/views/community/free/freeListView.jsp" aria-expanded="false" ><span
								 class="lnr lnr-arrow-right"></span>자유게시판</a>
							</li>
						<li class="main-nav-list"><a href="/Shoesgone/views/community/qna/qnaListView.jsp" aria-expanded="false" ><span
								 class="lnr lnr-arrow-right"></span>Q&A</a>
							</li>
					</ul>
				</div>
			</div>
			<div class="col-xl-9 col-lg-8 col-md-7">
				<!-- Start Filter Bar -->
				<div class="order_details_table">
				
				<div class="table-responsive">
					<table class="table">
						<tr>
							
							<th colspan="6">제목</th>
							<th>번호</th>
								<td width="120"></td>
						</tr>
						
						<tr>
							<th>작성자</th>
								<td width="120"></td>
							<th>작성일</th>
								<td width="20"></td>
							<th colspan="1">조회수</th>
								<td width="20"></td>
						</tr>
						<tr>
							<th colspan="6">내용</th>
						</tr>
						<tr>
						<th>
							<button>신고</button>
							<button>추천</button>
						</th>
						</tr>
					</table>
				</div>
			</div>
				
						
				
				
				<!-- End Filter Bar -->
				<!-- Start Best Seller -->
				<section class="lattest-product-area pb-40 category-list">
				<div class="WritingWrp">
					
                	
                </div>
				</section>
				<!-- End Best Seller -->
				<!-- Start Filter Bar -->
				
				
				
				<!-- End Filter Bar -->
			</div>
		</div>
	</div>

	
<br><br><br><br><br>
	<%@ include file="../common/footer.jsp" %>
</body>
</html>