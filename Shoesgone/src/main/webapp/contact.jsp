<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="zxx" class="no-js">

<head>
	<!-- Mobile Specific Meta -->
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<!-- Favicon-->
	<link rel="shortcut icon" href="img/fav.png">
	<!-- Author Meta -->
	<meta name="author" content="CodePixar">
	<!-- Meta Description -->
	<meta name="description" content="">
	<!-- Meta Keyword -->
	<meta name="keywords" content="">
	<!-- meta character set -->
	<meta charset="UTF-8">
	<!-- Site Title -->
	<title>Shoesgone</title>

	<!--
            CSS
            ============================================= -->
<link rel="stylesheet" href="/Shoesgone/resources/css/linearicons.css">
<link rel="stylesheet" href="/Shoesgone/resources/css/owl.carousel.css">
<link rel="stylesheet" href="/Shoesgone/resources/css/themify-icons.css">
<link rel="stylesheet" href="/Shoesgone/resources/css/font-awesome.min.css">
<link rel="stylesheet" href="/Shoesgone/resources/css/nice-select.css">
<link rel="stylesheet" href="/Shoesgone/resources/css/nouislider.min.css">
<link rel="stylesheet" href="/Shoesgone/resources/css/bootstrap.css">
<link rel="stylesheet" href="/Shoesgone/resources/css/main.css">
	<style type="text/css">
	</style>
</head>

<body>
	<!-- Start Header Area -->
	<%@ include file="/views/common/menubar.jsp" %>
	<!-- End Header Area -->

	<!-- Start Banner Area -->
	<section class="banner-area organic-breadcrumb">
		<div class="container">
			<div class="breadcrumb-banner d-flex flex-wrap align-items-center justify-content-end">
				<div class="col-first">
					<h1>Mypage</h1>
					<nav class="d-flex align-items-center">
						<a href="index.html">Home<span class="lnr lnr-arrow-right"></span></a>
						<a href="category.html">Mypage</a>
					</nav>
				</div>
			</div>
		</div>
	</section>
	<!-- End Banner Area -->
<section class="features-area section_gap">
		<div class="container">
			<div class="row features-inner">
				<!-- single features -->
				<div class="col-lg-2 col-md-6 col-sm-6">
					<div class="single-features">
						<div class="f-icon">
							<a href="/Shoesgone/olist?userNo=<%= loginMember.getUserNo() %>"><img src="resources/img/joo.png" alt="" width="60px" height="60px"></a>
						</div>
						<h6>주문내역조회</h6>
						<p>주문하신 상품 내역을 <br>확인하실 수 있습니다.</p>
					</div>
				</div>
				<!-- single features -->
				<div class="col-lg-2 col-md-6 col-sm-6">
					<div class="single-features">
						<div class="f-icon">
							<a href="/Shoesgone/ilist?userid=<%= loginMember.getUserId() %>"><img src="resources/img/soo.png" alt="" width="60px" height="60px"></a>
						</div>
						<h6>회원정보수정</h6>
						<p>개인정보를 수정하고<br> 관리할 수 있습니다.</p>
					</div>
				</div>
				<!-- single features -->
				<div class="col-lg-2 col-md-6 col-sm-6">
					<div class="single-features">
						<div class="f-icon">
							<a href="/Shoesgone/plist?userNo=<%= loginMember.getUserNo() %>"><img src="resources/img/point.png" alt="" width="60px" height="60px"></a>
						</div>
						<h6>포인트조회</h6>
						<p>보유하고 계신 포인트<br> 내역을 확인합니다.</p>
					</div>
				</div>
				<!-- single features -->
				<div class="col-lg-2 col-md-6 col-sm-6">
					<div class="single-features">
						<div class="f-icon">
							<a href="/Shoesgone/wlist?userNo=<%= loginMember.getUserNo() %>"><img src="resources/img/heart.png" alt="" width="60px" height="60px"></a>
						</div>
						<h6>관심상품</h6>
						<p>관심상품으로 등록하신<br> 상품을 확인합니다.</p>
					</div>
				</div>
				<br><br>
					<!-- single features -->
				<div class="col-lg-2 col-md-6 col-sm-6">
					<div class="single-features">
						<div class="f-icon">
							<a href="views/myPage/boardview.jsp"><img src="resources/img/gg.png" alt="" width="60px" height="60px"></a>
						</div>
						<h6>나의글보기</h6>
						<p>나의 질문,답변,게시글 등을<br>
						한눈에 확인합니다.</p>
					</div>
				</div>
				<div class="col-lg-2 col-md-6 col-sm-6">
					<div class="single-features" style="border-right: none">
						<div class="f-icon">
							<a href="/Shoesgone/nlist"><img src="resources/img/goo.png" alt="" width="60px" height="60px"></a>
						</div>
						<h6>고객센터</h6>
						<p>
						고객센터페이지로<br> 이동합니다.</p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--================Contact Area =================-->
	
	<!--================Contact Area =================-->

	<!-- start footer Area -->
	<%@ include file="/views/common/footer.jsp" %>
	<!-- End footer Area -->

	<!--================Contact Success and Error message Area =================-->
	<div id="success" class="modal modal-message fade" role="dialog">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<i class="fa fa-close"></i>
					</button>
					<h2>Thank you</h2>
					<p>Your message is successfully sent...</p>
				</div>
			</div>
		</div>
	</div>

	<!-- Modals error -->

	<div id="error" class="modal modal-message fade" role="dialog">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<i class="fa fa-close"></i>
					</button>
					<h2>Sorry !</h2>
					<p> Something went wrong </p>
				</div>
			</div>
		</div>
	</div>
	<!--================End Contact Success and Error message Area =================-->


	
		<script src="/Shoesgone/resources/js/vendor/jquery-2.2.4.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4"
	 crossorigin="anonymous"></script>
	<script src="/Shoesgone/resources/js/vendor/bootstrap.min.js"></script>
	<script src="/Shoesgone/resources/js/jquery.ajaxchimp.min.js"></script>
	<script src="/Shoesgone/resources/js/jquery.nice-select.min.js"></script>
	<script src="/Shoesgone/resources/js/jquery.sticky.js"></script>
	<script src="/Shoesgone/resources/js/nouislider.min.js"></script>
	<script src="/Shoesgone/resources/js/jquery.magnific-popup.min.js"></script>
	<script src="/Shoesgone/resources/js/owl.carousel.min.js"></script>
	<!--gmaps Js-->
	<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCjCGmQ0Uq4exrzdcL6rvxywDDOvfAu6eE"></script>
	<script src="/Shoesgone/resources/js/gmaps.min.js"></script>
	<script src="/Shoesgone/resources/js/main.js"></script>
</body>

</html>