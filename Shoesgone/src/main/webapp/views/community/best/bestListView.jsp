<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<!-- meta character set -->
	<meta charset="UTF-8">
	<!-- Site Title -->
	<title>슈즈곤</title>
	
</head>

<body id="category">

	<%@ include file="/views/common/menubar.jsp" %>

	<!-- Start Banner Area -->
	<section class="banner-area organic-breadcrumb">
		<div class="container">
			<div class="breadcrumb-banner d-flex flex-wrap align-items-center justify-content-end">
				<div class="col-first">
					<h1>Best 게시판</h1>
					<nav class="d-flex align-items-center">
						<a href="index.jsp">Home<span class="lnr lnr-arrow-right"></span></a>
						<a href="#">Community Category<span class="lnr lnr-arrow-right"></span></a>
						<a href="Best.jsp">Best 게시판</a>
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
						<li class="main-nav-list"><a href="/Shoesgone/freelist" aria-expanded="false" ><span
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
				<div class="filter-bar d-flex flex-wrap align-items-center">
					<div class="mr-auto">
					</div>
					<div class="default-select" id="default-select">
						<select style="display: none;">
							<option value="1">정렬</option>
							<option value="1">인기순↓</option>
							<option value="1">인기순↑</option>
							<option value="1">최신순↓</option>
							<option value="1">최신순↑</option>
							<option value="1">사진글</option>
						</select><div class="nice-select" tabindex="0"><span class="current">정렬</span><ul class="list"><li data-value=" 1" class="option selected focus">정렬</li><li data-value="1" class="option">인기순↓</li><li data-value="1" class="option">인기순↑</li><li data-value="1" class="option">최신순↓</li><li data-value="1" class="option">최신순↑</li><li data-value="1" class="option">사진글</li></ul></div>
					</div>
				</div>
				<!-- End Filter Bar -->
				<!-- Start Best Seller -->
				<section class="lattest-product-area pb-40 category-list">
					<div class="progress-table-wrap">
						<div class="progress-table">
							<div class="table-head">
								<div class="boardno">번호</div>
								<div class="boardtitle">제목</div>
								<div class="register">작성자</div>
								<div class="registdate">작성일</div>
								<div class="hitcount">조회수</div>
							</div>

							<div class="table-row">
								<div class="boardno">1</div>
								<div class="boardtitle">제목이 길어서 슬픈 밤</div>
								<div class="register">작성식</div>
								<div class="registdate">2021-07-11</div>
								<div class="hitcount">645032</div>
							</div>
							<div class="table-row">
								<div class="boardno">2</div>
								<div class="boardtitle">asdf</div>
								<div class="register">정혜인</div>
								<div class="registdate">2021-06-20</div>
								<div class="hitcount">2350</div>
							</div>
						</div>
					</div>
				</section>
				<!-- End Best Seller -->
				<!-- Start Filter Bar -->
				<div class="filter-bar d-flex flex-wrap align-items-center">
					<div class="sorting mr-auto">
						<select>
							<option value="1">Show 5</option>
							<option value="1">Show 10</option>
							<option value="1">Show 20</option>
						</select>
					</div>
					<div class="pagination">
						<a href="#" class="prev-arrow"><i class="fa fa-long-arrow-left" aria-hidden="true"></i></a>
						<a href="#" class="active">1</a>
						<a href="#">2</a>
						<a href="#">3</a>
						<a href="#">4</a>
						<a href="#">5</a>
						<a href="#" class="dot-dot"><i class="fa fa-ellipsis-h" aria-hidden="true"></i></a>
						<a href="#">9</a>
						<a href="#" class="next-arrow"><i class="fa fa-long-arrow-right" aria-hidden="true"></i></a>
					</div>
					<div class="button-group-area mt-40 ml-auto">
						<a href="#" class="genric-btn primary default circle">글쓰기</a>
					</div>
				</div>
				<!-- End Filter Bar -->
			</div>
		</div>
	</div>

	<br><br><br><br><br>

	<!-- start footer Area -->
		<%@ include file="/views/common/footer.jsp" %>

	<!-- End footer Area -->

	<!-- Modal Quick Product View -->
	



	
	
	
	<!--gmaps Js-->
	<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCjCGmQ0Uq4exrzdcL6rvxywDDOvfAu6eE"></script>
	<script src="/Shoesgone/resources/js/gmaps.min.js"></script>
	<script src="/Shoesgone/resources/js/main.js"></script>
</body>
</html>