<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="loginPage.model.vo.Login"%>
<%
	// 로그인 확인을 위해서 내장된 session 객체를 이용
	Login loginMember = (Login)session.getAttribute("loginMember");
%>
<!DOCTYPE html>
<html lang="zxx" class="no-js">

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
	<title>회원가입</title>

	<style>
		#userid-error{
			font-size:1px;
			color: red;
		}
		#upwd-error{
			font-size:1px;
			color: red;
		}
		.register-info{
			text-align: left;
			color: black;
			font-weight: bold;
			margin-left: 10px;
		}
		.agree-check{
			color: black;
			margin-left: 5px;
		}
		details[open] > summary ~ * { animation:reveal 0.5s; margin-left: 45px;}
		.tpt { color: black; }
	</style>
	
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
	<link rel="stylesheet" href="/Shoesgone/resources/css/newMine.css">
</head>

<body>

	<!-- Start Header Area -->
	<header class="header_area sticky-header">
		<div class="main_menu">
			<nav class="navbar navbar-expand-lg navbar-light main_box">
				<div class="container">
					<!-- Brand and toggle get grouped for better mobile display -->
					<a class="navbar-brand logo_h" href="/Shoesgone/index.jsp">슈즈곤</a>
					<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
					 aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse offset" id="navbarSupportedContent">
						<ul class="nav navbar-nav menu_nav ml-auto">
							<li class="nav-item"><a class="nav-link" href="/Shoesgone/views/itemPage/category.jsp">SHOP</a></li>
							<li class="nav-item"><a class="nav-link" href="#">고객센터</a></li>
							<% if(loginMember == null){ %>
							<li class="nav-item"><a class="nav-link" href="/Shoesgone/views/loginPage/login.jsp">로그인</a></li>
							<% }else{ %>
							<li class="nav-item"><a class="nav-link" onclick="javascript:location.href='/Shoesgone/logout';">로그아웃</a></li>
							<% } %>
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
					<h1>회원가입</h1>
					<nav class="d-flex align-items-center">
					</nav>
				</div>
			</div>
		</div>
	</section>
	<!-- End Banner Area -->

	<!--================Login Box Area =================-->
	<section class="login_box_area section_gap">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="login_form_inner">
						<h1>회원가입</h1><br>
						<form class="row login_form" action="/Shoesgone/enroll" method="post" id="contactForm" novalidate="novalidate">
							
							<div class="col-md-12 form-group">
							<h6 class="register-info">이메일 주소 *</h6>
								<input type="email" class="form-control" id="userid" name="userid" placeholder="예) ShoesGone@shoes.co.kr" onfocus="this.placeholder = ''" onblur="this.placeholder = '예) ShoesGone@shoes.co.kr'">
							</div>
							<div class="col-md-12 form-group">
							<h6 class="register-info">비밀번호 *</h6>
								<input type="password" class="form-control" id="upwd" name="userpwd" placeholder="영문, 숫자, 특수문자 조합 8-16자" onfocus="this.placeholder = ''" onblur="this.placeholder = '영문, 숫자, 특수문자 조합 8-16자'">
								<!-- <p style="font-size:1px; color: red; margin-right:110px;">영문, 숫자, 특수문자를 조합하여 입력해주세요. (8-16자)</p> -->
							</div>
							<div class="col-md-12 form-group">
							<h6 class="register-info">신발 사이즈(선택)</h6>
								<input type="text" class="form-control" id="shoesSize" name="shoesSize" placeholder="선택하세요" onfocus="this.placeholder = ''" onblur="this.placeholder = '선택하세요'">
							</div>
							<div class="col-md-12 form-group">
								<div class="creat_account">
									<details>
										<summary class="agree-check"><label><input type="checkbox" id="ageAgree" name="ageAgree" onclick="ageCheckAll();">[필수] 만14세 이상이며 모두 동의합니다.</label></summary>
										<div class="tpt"><input type="checkbox" id="tos" name="tos" onclick="tos_pp_check();">이용약관</div>
										<div class="tpt"><input type="checkbox" id="privacyPolicy" name="privacyPolicy" onclick="tos_pp_check();">개인정보처리방침</div>
									</details>
									<details>
										<summary class="agree-check"><label><input type="checkbox" id="adAgree" name="adAgree" onclick="adCheckAll();">[선택] 광고성 정보 수신에 모두 동의합니다.</label></summary>
										<div class="tpt"><input type="checkbox" id="appPush" name="appPush" onclick="ap_msg_email();">앱 푸시</div>
										<div class="tpt"><input type="checkbox" id="message" name="message" onclick="ap_msg_email();">문자 메시지</div>
										<div class="tpt"><input type="checkbox" id="email" name="email" onclick="ap_msg_email();">이메일</div>
									</details>
								</div>
							</div>
							<div class="col-md-12 form-group">
								<button type="submit" value="submit" class="primary-btn">가입하기</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--================End Login Box Area =================-->

	<!-- Start exclusive deal Area -->
	<section class="exclusive-deal-area">
		<div class="container-fluid">
			<div class="row justify-content-center align-items-center">
				<div class="col-lg-6 no-padding exclusive-left">
					<div class="row clock_sec clockdiv" id="clockdiv">
						<div class="col-lg-12">
							<p>SERVICE GUIDE</p>
							<h1>슈즈곤 처음이지? <br>서비스 소개를 확인해보세요.</h1>
						</div>
					</div>
					<a href="blog.html" class="primary-btn">서비스 안내</a>
				</div>
				<div class="col-lg-6 no-padding exclusive-right">
						<!-- single exclusive carousel -->
						<div class="single-exclusive-slider">
							<img  class="img-fluid" src="/Shoesgone/resources/img/product/e-p1.png" alt="">
							<div class="product-details">
								<div class="price">
									<h6>$150.00</h6>
									<h6 class="l-through">$210.00</h6>
								</div>
								<p>DOWNLOAD THE APP</p>
								<h4>슈즈곤 앱을 설치하여<br> 한정판 스니커즈를 FLEX 하세요!</h4>
								<div class="add-bag d-flex align-items-center justify-content-center">
									<a href="appInstall.html" class="primary-btn" onclick="window.open(this.href, '_blank', 'width=500px, height=500px, toolbars=no, scrollbars=yes'); return false;">앱 설치하기</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
	</section>
	<!-- End exclusive deal Area -->

	<!-- Start brand Area -->
	<section class="brand-area section_gap">
		<div class="container-new">
		<div class="row">
			<div class="right-side">
				<h5>이용안내</h5><br>
				<p><a style="color: grey" href="inspection.html" onclick="window.open(this.href, '_blank', 'width=500px, height=500px, toolbars=no, scrollbars=yes'); return false;">검수기준</a></p>
				<p><a style="color: grey" href="policy.html" onclick="window.open(this.href, '_blank', 'width=500px, height=500px, toolbars=no, scrollbars=yes'); return false;">이용정책</a></p>
				<p><a style="color: grey" href="penalty.html" onclick="window.open(this.href, '_blank', 'width=500px, height=500px, toolbars=no, scrollbars=yes'); return false;">페널티 정책</a></p>
				<p><a style="color: grey" href="guideline.html" onclick="window.open(this.href, '_blank', 'width=500px, height=500px, toolbars=no, scrollbars=yes'); return false;">커뮤니티 가이드라인</a></p>
			</div>
			<div class="right-side">
				<h5>고객지원</h5><br>
				<p><a style="color: grey" href="#">공지사항</a></p>
				<p><a style="color: grey" href="blog.html">서비스 소개</a></p>
				<p><a style="color: grey" href="single-blog.html">쇼룸 안내</a></p>
				<p><a style="color: grey" href="#">판매자 방문접수</a></p>
			</div>
			<div class="right-0 right-side">
				<h5>고객센터 1588-9999</h5><br>
				<p>운영시간 평일 11:00 - 18:00 (토 ∙ 일, 공휴일 휴무) 점심시간</p>
				<p>점심시간 평일 13:00 - 14:00</p>
				<h6>1:1 문의하기는 앱에서만 가능합니다.</h6><br>
				<a href="#" class="primary-btn">자주 묻는 질문</a>
			</div>
			</div>
		</div>
	</section>
	<!-- End brand Area -->

	<!-- start footer Area -->
	<footer class="footer-area section_gap">
		<div class="container">
			<div class="row">
				<div class="col-lg-3  col-md-6 col-sm-6">
					<div class="single-footer-widget">
						<h6><a style="color: white" href="privacy-policy.html">개인정보처리방침</a></h6>
						<p>
							Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore dolore
							magna aliqua.
						</p>
					</div>
				</div>
				<div class="col-lg-4  col-md-6 col-sm-6">
					<div class="single-footer-widget">
						<h6><a style="color: white" href="TOS.html">이용약관</a></h6>
						
						<div class="" id="mc_embed_signup">

							<form target="_blank" novalidate="true" action="https://spondonit.us12.list-manage.com/subscribe/post?u=1462626880ade1ac87bd9c93a&amp;id=92a4423d01"
							 method="get" class="form-inline">

								<div class="d-flex flex-row">
				
									<div style="position: absolute; left: -5000px;">
										<input name="b_36c4fd991d266f23781ded980_aefe40901a" tabindex="-1" value="" type="text">
									</div>

								</div>
								<div class="info"></div>
							</form>
						</div>
					</div>
				</div>
				<div class="col-lg-3  col-md-6 col-sm-6">
					<div class="single-footer-widget mail-chimp">
					</div>
				</div>
				<div class="col-lg-2 col-md-6 col-sm-6">
					<div class="single-footer-widget">
						<div class="footer-social d-flex align-items-center">
							<a href="https://www.instagram.com/"><i class="fa fa-instagram"></i></a>
							<a href="https://www.facebook.com/"><i class="fa fa-facebook"></i></a>
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


	<script src="/Shoesgone/resources/js/jquery-3.6.0.min.js"></script>
	<script src="/Shoesgone/resources/js/jquery-validation-1.19.3/dist/jquery.validate.min.js"></script>
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
	<script type="text/javascript">
		$("#contactForm").validate({
			rules : {
				userid : {
					required : true,
					email : true,
					remote : {
						type : "post",
						url : "/Shoesgone/validate"
					}
				},
				userpwd : {
					required : true,
					pw_regexp : true,
					minlength : 8,
					maxlength : 16
				},
				ageAgree : {
					required : true
				}
			},
			messages : {
				userid : {
					required : "이메일 주소를 정확히 입력해주세요.",
					email : "이메일 주소를 정확히 입력해주세요.",
					remote : "이미 사용 중인 이메일입니다."
				},
				userpwd : {
					required : "영문, 숫자, 특수문자를 조합하여 입력해주세요. (8-16자)",
					pw_regexp : "영문, 숫자, 특수문자를 조합하여 입력해주세요. (8-16자)",
					minlength : "영문, 숫자, 특수문자를 조합하여 입력해주세요. (8-16자)",
					maxlength : "영문, 숫자, 특수문자를 조합하여 입력해주세요. (8-16자)"
				},
				ageAgree : {
					required : ""
				}
			},
			errorClass : "error-info"
		});

		$.validator.addMethod("pw_regexp", function(value, element) {
			return this.optional(element)
					|| /^.*(?=.*\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*$/
							.test(value);
		});

		function ageCheckAll() {
			if ($("#ageAgree").is(':checked')) {
				$("input[name=tos]").prop("checked", true);
				$("input[name=privacyPolicy]").prop("checked", true);
			} else {
				$("input[name=tos]").prop("checked", false);
				$("input[name=privacyPolicy]").prop("checked", false);
			}
		}

		function adCheckAll() {
			if ($("#adAgree").is(':checked')) {
				$("input[name=appPush]").prop("checked", true);
				$("input[name=message]").prop("checked", true);
				$("input[name=email]").prop("checked", true);
			} else {
				$("input[name=appPush]").prop("checked", false);
				$("input[name=message]").prop("checked", false);
				$("input[name=email]").prop("checked", false);
			}
		}

		function tos_pp_check() {
			if($("#tos").is(':checked') && $("#privacyPolicy").is(':checked')){
				$("input[name=ageAgree]").prop("checked", true);
			}
			else{
				$("input[name=ageAgree]").prop("checked", false);
			}
		}
		
		function ap_msg_email() {
			if($("#appPush").is(':checked') && $("#message").is(':checked') && $("#email").is(':checked')){
				$("input[name=adAgree]").prop("checked", true);
			}
			else{
				$("input[name=adAgree]").prop("checked", false);
			}
		}
	</script>
</body>

</html>