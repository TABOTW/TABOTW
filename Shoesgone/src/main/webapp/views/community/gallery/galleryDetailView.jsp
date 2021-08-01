<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="community.gallery.model.vo.Gallery"%>
<%
	Gallery gallery = (Gallery)request.getAttribute("gallery");
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

	<!-- Start Header Area -->
	<header class="header_area sticky-header">
		<div class="main_menu">
			<nav class="navbar navbar-expand-lg navbar-light main_box">
				<div class="container">
					<!-- Brand and toggle get grouped for better mobile display -->
					<a class="navbar-brand logo_h" href="index.html"><img src="/Shoesgone/resources/img/logo.png" alt=""></a>
					<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
					 aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse offset" id="navbarSupportedContent">
						<ul class="nav navbar-nav menu_nav ml-auto">
							<li class="nav-item"><a class="nav-link" href="index.html">Home</a></li>
							<li class="nav-item submenu dropdown">
								<a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
								 aria-expanded="false">Shop</a>
								<ul class="dropdown-menu">
									<li class="nav-item"><a class="nav-link" href="blog.html">Blog</a></li>
									<li class="nav-item"><a class="nav-link" href="single-blog.html">Blog Details</a></li>
								</ul>
							</li>
							<li class="nav-item submenu dropdown active">
								<a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
								 aria-expanded="false">Community Category</a>
								<ul class="dropdown-menu">
									<li class="nav-item active"><a class="nav-link" href="Best.jsp">Best 게시판</a></li>
									<li class="nav-item"><a class="nav-link" href="review.jsp">리뷰 게시판</a></li>
									<li class="nav-item"><a class="nav-link" href="gallery.jsp">Gallery</a></li>
									<li class="nav-item"><a class="nav-link" href="free.jsp">자유게시판</a></li>
									<li class="nav-item"><a class="nav-link" href="QnA.jsp">Q&A</a></li>
								</ul>
							</li>
							<li class="nav-item"><a class="nav-link" href="contact.jsp">고객센터</a></li>
							<li class="nav-item submenu dropdown">
								<a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
								 aria-expanded="false">로그인</a>
								<ul class="dropdown-menu">
									<li class="nav-item"><a class="nav-link" href="login.jsp">Login</a></li>
									<li class="nav-item"><a class="nav-link" href="tracking.jsp">Tracking</a></li>
									<li class="nav-item"><a class="nav-link" href="elements.jsp">Elements</a></li>
								</ul>
							</li>
						</ul>
						<ul class="nav navbar-nav navbar-right">
							<li class="nav-item">
								<button class="search"><span class="lnr lnr-magnifier" id="search"></span></button>
							</li>
						</ul>
					</div>
				</div>
			</nav>
		</div>
		<div class="search_input" id="search_input_box">
			<div class="container">
				<form class="d-flex justify-content-between">
					<input type="text" class="form-control" id="search_input" placeholder="Search Here">
					<button type="submit" class="btn"></button>
					<span class="lnr lnr-cross" id="close_search" title="Close Search"></span>
				</form>
			</div>
		</div>
	</header>
	<!-- End Header Area -->


	

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
							
							<th width="10%">제목</th>
							<td width="60%" colspan="3">여기에는 제목이 들어갑니다.</td>
							<th width="10%">번호</th>
							<td width="5%">22</td>
						</tr>
						
						<tr>
							<th width="10%">작성자</th>
							<td width="10%">작성식</td>
							<th width="10%">작성일</th>
							<td width="15%">2021-01-21</td>
							<th>조회수</th>
							<td width="">999</td>
						</tr>
						<tr>
							<th colspan="1">내용</th>
							<th colspan="5">매우 긴 내용이 들어가야할 것 같습니다.매우 긴 내용이 들어가야할 것 같습니다.매우 긴 내용이 들어가야할 것 같습니다.매우 긴 내용이 들어가야할 것 같습니다.매우 긴 내용이 들어가야할 것 같습니다.매우 긴 내용이 들어가야할 것 같습니다.매우 긴 내용이 들어가야할 것 같습니다.매우 긴 내용이 들어가야할 것 같습니다.</th>
						</tr>
						<tr align="center">
						<th colspan="6">
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