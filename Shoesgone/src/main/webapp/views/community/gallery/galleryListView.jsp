<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	
</head>

<body id="category">

	<%@ include file="/views/common/menubar.jsp" %>

	<!-- Start Banner Area -->
	<section class="banner-area organic-breadcrumb">
		<div class="container">
			<div class="breadcrumb-banner d-flex flex-wrap align-items-center justify-content-end">
				<div class="col-first">
					<h1>Gallery</h1>
					<nav class="d-flex align-items-center">
						<a href="index.jsp">Home<span class="lnr lnr-arrow-right"></span></a>
						<a href="#">Community Category<span class="lnr lnr-arrow-right"></span></a>
						<a href="gallery.jsp">Gallery</a>
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
				<div class="filter-bar d-flex flex-wrap align-items-center">
					<div class="mr-auto">
					</div>
					<div class="default-select" id="default-select" "="">
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
					<div class="row">
						<!-- single product -->
						<div class="col-lg-4 col-md-6">
							<div class="single-product">
								<img class="img-fluid" src="/Shoesgone/resources/img/product/p1.jpg" alt="">
								<div class="product-details">
									<h6>addidas New Hammer sole
										for Sports person</h6>
									
									
								</div>
							</div>
						</div>
						<!-- single product -->
						<div class="col-lg-4 col-md-6">
							<div class="single-product">
								<img class="img-fluid" src="/Shoesgone/resources/img/product/p2.jpg" alt="">
								<div class="product-details">
									<h6>addidas New Hammer sole
										for Sports person</h6>
									
									
								</div>
							</div>
						</div>
						<!-- single product -->
						<div class="col-lg-4 col-md-6">
							<div class="single-product">
								<img class="img-fluid" src="/Shoesgone/resources/img/product/p3.jpg" alt="">
								<div class="product-details">
									<h6>addidas New Hammer sole
										for Sports person</h6>
									
									
								</div>
							</div>
						</div>
						<!-- single product -->
						<div class="col-lg-4 col-md-6">
							<div class="single-product">
								<!-- 나중에 Gallery.getGalleryRenameFilename() 부분을 이걸로 감싸면 될 듯 넹! -->
								<img class="img-fluid" src="/Shesgone/resources/community_upfiles/gallery/Gallery.getGalleryRenameFilename()" alt="">
								<div class="product-details">
									<h6>addidas New Hammer sole
										for Sports person</h6>
									<div class="price">
										<h6>$150.00</h6>
										<h6 class="l-through">$210.00</h6>
									</div>
									
								</div>
							</div>
						</div>
						<!-- single product -->
						<div class="col-lg-4 col-md-6">
							<div class="single-product">
								<img class="img-fluid" src="/Shoesgone/resources/img/product/p5.jpg" alt="">
								<div class="product-details">
									<h6>addidas New Hammer sole
										for Sports person</h6>
									<div class="price">
										<h6>$150.00</h6>
										<h6 class="l-through">$210.00</h6>
									</div>
								
								</div>
							</div>
						</div>
						<!-- single product -->
						<div class="col-lg-4 col-md-6">
							<div class="single-product">
								<img class="img-fluid" src="/Shoesgone/resources/img/product/p6.jpg" alt="">
								<div class="product-details">
									<h6>addidas New Hammer sole
										for Sports person</h6>
									<div class="price">
										<h6>$150.00</h6>
										<h6 class="l-through">$210.00</h6>
									</div>
									
								</div>
							</div>
						</div>
					</div>
				</section>
				<!-- End Best Seller -->
				<!-- Start Filter Bar -->
				<div class="filter-bar d-flex flex-wrap align-items-center">
					<div class="sorting mr-auto">
						<select>
							<option value="1">Show 6</option>
							<option value="1">Show 9</option>
							<option value="1">Show 12</option>
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
	
</body>
</html>