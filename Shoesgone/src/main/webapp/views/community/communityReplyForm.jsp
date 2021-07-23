<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<!-- Mobile Specific Meta -->
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<!-- Favicon-->
	<link rel="shortcut icon" href="../../resources/img/fav.png">
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

	<!--
            CSS
            ============================================= -->
	<link rel="stylesheet" href="../../resources/css/linearicons.css">
	<link rel="stylesheet" href="../../resources/css/owl.carousel.css">
	<link rel="stylesheet" href="../../resources/css/font-awesome.min.css">
	<link rel="stylesheet" href="../../resources/css/themify-icons.css">
	<link rel="stylesheet" href="../../resources/css/nice-select.css">
	<link rel="stylesheet" href="../../resources/css/nouislider.min.css">
	<link rel="stylesheet" href="../../resources/css/bootstrap.css">
	<link rel="stylesheet" href="../../resources/css/main.css">
</head>

<body id="category">

	<!-- Start Header Area -->
	<header class="header_area sticky-header">
		<div class="main_menu">
			<nav class="navbar navbar-expand-lg navbar-light main_box">
				<div class="container">
					<!-- Brand and toggle get grouped for better mobile display -->
					<a class="navbar-brand logo_h" href="index.jsp"><img src="../../resources/img/logo.png" alt=""></a>
					<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
					 aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse offset" id="navbarSupportedContent">
						<ul class="nav navbar-nav menu_nav ml-auto">
							<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>
							<li class="nav-item submenu dropdown">
								<a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
								 aria-expanded="false">Shop</a>
								<ul class="dropdown-menu">
									<li class="nav-item"><a class="nav-link" href="blog.jsp">Blog</a></li>
									<li class="nav-item"><a class="nav-link" href="single-blog.jsp">Blog Details</a></li>
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
						<li class="main-nav-list"><a href="/SProject/views/community/Best.jsp" aria-expanded="false"><span
								 class="lnr lnr-arrow-right"></span>Best 게시판</a>
						</li>
						<li class="main-nav-list"><a href="/SProject/views/community/review.jsp" aria-expanded="false"><span
								 class="lnr lnr-arrow-right"></span>리뷰 게시판</a>
							</li>
						<li class="main-nav-list"><a href="/SProject/views/community/gallery.jsp" aria-expanded="false"><span
								 class="lnr lnr-arrow-right"></span>갤러리</a>
							</li>
						<li class="main-nav-list"><a href="/SProject/views/community/free.jsp" aria-expanded="false"><span
								 class="lnr lnr-arrow-right"></span>자유게시판</a>
							</li>
						<li class="main-nav-list"><a href="/SProject/views/community/QnA.jsp" aria-expanded="false"><span
								 class="lnr lnr-arrow-right"></span>Q&A</a>
							</li>
					</ul>
				</div>
			</div>
			<div class="col-xl-9 col-lg-8 col-md-7">
				<!-- Start Filter Bar -->
				
				<!-- End Filter Bar -->
				<!-- Start Best Seller -->
				<section class="lattest-product-area pb-40 category-list">
				<div class="WritingWrp">
					
                	
                </div>
				</section>
				<!-- End Best Seller -->
				<!-- Start Filter Bar -->
				<div class="comments-area ">
                        <h4>댓글 : 3</h4>
                        <div class="comment-list">
                            <div class="single-comment justify-content-between d-flex">
                                <div class="user justify-content-between d-flex">
                                    <div class="thumb">
                                        <img src="img/blog/c1.jpg" alt="">
                                    </div>
                                    <div class="desc">
                                        <h5><a href="#">작성자1</a></h5>
                                        <p class="date">December 4, 2018 at 3:12 pm </p>
                                        <p class="comment">
                                            댓글내용 1
                                        </p>
                                    </div>
                                </div>
                                <div class="reply-btn">
                                	<a href="" class="btn-reply text-uppercase">추천</a>
                                    <a href="" class="btn-reply text-uppercase">답글달기</a>
                                </div>
                            </div>
                        </div>
                        <div class="comment-list left-padding">
                            <div class="single-comment justify-content-between d-flex">
                                <div class="user justify-content-between d-flex">
                                    <div class="thumb">
                                        <img src="img/blog/c2.jpg" alt="">
                                    </div>
                                    <div class="desc">
                                        <h5><a href="#">답글1</a></h5>
                                        <p class="date">December 4, 2018 at 3:12 pm </p>
                                        <p class="comment">
                                            답글1
                                        </p>
                                    </div>
                                </div>
                                <div class="reply-btn">
                                	<a href="" class="btn-reply text-uppercase">추천</a>
                                </div>
                            </div>
                        </div>
                        
                        <div class="comment-list">
                            <div class="single-comment justify-content-between d-flex">
                                <div class="user justify-content-between d-flex">
                                    <div class="thumb">
                                        <img src="img/blog/c4.jpg" alt="">
                                    </div>
                                    <div class="desc">
                                        <h5><a href="#">작성자2</a></h5>
                                        <p class="date">December 4, 2018 at 3:12 pm </p>
                                        <p class="comment">
                                            댓글내용 2
                                        </p>
                                    </div>
                                </div>
                                <div class="reply-btn">
                                	<a href="" class="btn-reply text-uppercase">추천</a>
                                    <a href="" class="btn-reply text-uppercase">답글달기</a>
                                </div>
                            </div>
                        </div>
                    </div>
                    
                    <div class="comment-form">
                        <h4>댓글 남기기</h4>
                        <form>
                            <div class="form-group form-inline">
                                <div class="form-group col-lg-6 col-md-6 name"> 
                                    <input type="text" class="form-control" id="name" placeholder="작성자" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Enter Name'">
                                </div> &nbsp; &nbsp; &nbsp; &nbsp;
                                <a href="#" class="primary-btn submit_btn">등록</a>
                            </div>
                            
                            <div class="form-group">
                                <textarea class="form-control mb-10" rows="5" name="message" placeholder="내용을 입력해주세요." onfocus="this.placeholder = ''" onblur="this.placeholder = 'Messege'" required=""></textarea>
                            </div>
                            
                        </form>
                    </div>
				<!-- End Filter Bar -->
			</div>
		</div>
	</div>
<br><br><br><br><br>
	<!-- start footer Area -->
	<footer class="footer-area section_gap">
		<div class="container">
			<div class="row">
				<div class="col-lg-3  col-md-6 col-sm-6">
					<div class="single-footer-widget">
						<h6>About Us</h6>
						<p>
							Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore dolore
							magna aliqua.
						</p>
					</div>
				</div>
				<div class="col-lg-4  col-md-6 col-sm-6">
					<div class="single-footer-widget">
						<h6>Newsletter</h6>
						<p>Stay update with our latest</p>
						<div class="" id="mc_embed_signup">

							<form target="_blank" novalidate="true" action="https://spondonit.us12.list-manage.com/subscribe/post?u=1462626880ade1ac87bd9c93a&amp;id=92a4423d01"
							 method="get" class="form-inline">

								<div class="d-flex flex-row">

									<input class="form-control" name="EMAIL" placeholder="Enter Email" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Enter Email '"
									 required="" type="email">


									<button class="click-btn btn btn-default"><i class="fa fa-long-arrow-right" aria-hidden="true"></i></button>
									<div style="position: absolute; left: -5000px;">
										<input name="b_36c4fd991d266f23781ded980_aefe40901a" tabindex="-1" value="" type="text">
									</div>

									<!-- <div class="col-lg-4 col-md-4">
													<button class="bb-btn btn"><span class="lnr lnr-arrow-right"></span></button>
												</div>  -->
								</div>
								<div class="info"></div>
							</form>
						</div>
					</div>
				</div>
				<div class="col-lg-3  col-md-6 col-sm-6">
					<div class="single-footer-widget mail-chimp">
						<h6 class="mb-20">Instragram Feed</h6>
						<ul class="instafeed d-flex flex-wrap">
							<li><img src="../../resources/img/i1.jpg" alt=""></li>
							<li><img src="../../resources/img/i2.jpg" alt=""></li>
							<li><img src="../../resources/img/i3.jpg" alt=""></li>
							<li><img src="../../resources/img/i4.jpg" alt=""></li>
							<li><img src="../../resources/img/i5.jpg" alt=""></li>
							<li><img src="../../resources/img/i6.jpg" alt=""></li>
							<li><img src="../../resources/img/i7.jpg" alt=""></li>
							<li><img src="../../resources/img/i8.jpg" alt=""></li>
						</ul>
					</div>
				</div>
				<div class="col-lg-2 col-md-6 col-sm-6">
					<div class="single-footer-widget">
						<h6>Follow Us</h6>
						<p>Let us be social</p>
						<div class="footer-social d-flex align-items-center">
							<a href="#"><i class="fa fa-facebook"></i></a>
							<a href="#"><i class="fa fa-twitter"></i></a>
							<a href="#"><i class="fa fa-dribbble"></i></a>
							<a href="#"><i class="fa fa-behance"></i></a>
						</div>
					</div>
				</div>
			</div>
			<div class="footer-bottom d-flex justify-content-center align-items-center flex-wrap">
				<p class="footer-text m-0"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
</p>
			</div>
		</div>
	</footer>
	<!-- End footer Area -->

	<!-- Modal Quick Product View -->
	<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="container relative">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<div class="product-quick-view">
					<div class="row align-items-center">
						<div class="col-lg-6">
							<div class="quick-view-carousel">
								<div class="item" style="background: url(img/organic-food/q1.jpg);">

								</div>
								<div class="item" style="background: url(img/organic-food/q1.jpg);">

								</div>
								<div class="item" style="background: url(img/organic-food/q1.jpg);">

								</div>
							</div>
						</div>
						<div class="col-lg-6">
							<div class="quick-view-content">
								<div class="top">
									<h3 class="head">Mill Oil 1000W Heater, White</h3>
									<div class="price d-flex align-items-center"><span class="lnr lnr-tag"></span> <span class="ml-10">$149.99</span></div>
									<div class="category">Category: <span>Household</span></div>
									<div class="available">Availibility: <span>In Stock</span></div>
								</div>
								<div class="middle">
									<p class="content">Mill Oil is an innovative oil filled radiator with the most modern technology. If you are
										looking for something that can make your interior look awesome, and at the same time give you the pleasant
										warm feeling during the winter.</p>
									<a href="#" class="view-full">View full Details <span class="lnr lnr-arrow-right"></span></a>
								</div>
								<div class="bottom">
									<div class="color-picker d-flex align-items-center">Color:
										<span class="single-pick"></span>
										<span class="single-pick"></span>
										<span class="single-pick"></span>
										<span class="single-pick"></span>
										<span class="single-pick"></span>
									</div>
									<div class="quantity-container d-flex align-items-center mt-15">
										Quantity:
										<input type="text" class="quantity-amount ml-15" value="1" />
										<div class="arrow-btn d-inline-flex flex-column">
											<button class="increase arrow" type="button" title="Increase Quantity"><span class="lnr lnr-chevron-up"></span></button>
											<button class="decrease arrow" type="button" title="Decrease Quantity"><span class="lnr lnr-chevron-down"></span></button>
										</div>

									</div>
									<div class="d-flex mt-20">
										<a href="#" class="view-btn color-2"><span>Add to Cart</span></a>
										<a href="#" class="like-btn"><span class="lnr lnr-layers"></span></a>
										<a href="#" class="like-btn"><span class="lnr lnr-heart"></span></a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>



	<script src="../../resources/js/vendor/jquery-2.2.4.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4"
	 crossorigin="anonymous"></script>
	<script src="../../resources/js/vendor/bootstrap.min.js"></script>
	<script src="../../resources/js/jquery.ajaxchimp.min.js"></script>
	<script src="../../resources/js/jquery.nice-select.min.js"></script>
	<script src="../../resources/js/jquery.sticky.js"></script>
	<script src="../../resources/js/nouislider.min.js"></script>
	<script src="../../resources/js/jquery.magnific-popup.min.js"></script>
	<script src="../../resources/js/owl.carousel.min.js"></script>
	<!--gmaps Js-->
	<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCjCGmQ0Uq4exrzdcL6rvxywDDOvfAu6eE"></script>
	<script src="../../resources/js/gmaps.min.js"></script>
	<script src="../../resources/js/main.js"></script>
</body>
</html>