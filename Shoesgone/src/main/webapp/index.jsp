<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="itemPage.model.vo.Item, itemPage.model.vo.Picture, itemPage.model.vo.SellBid, itemPage.model.vo.BuyBid, java.util.ArrayList" %>
<%
	ArrayList<Item> regItem1 = (ArrayList<Item>)request.getAttribute("regItem1");
	ArrayList<Picture> regItem2 = (ArrayList<Picture>)request.getAttribute("regItem2");
	ArrayList<Item> hotItem1 = (ArrayList<Item>)request.getAttribute("hotItem1");
	ArrayList<Picture> hotItem2 = (ArrayList<Picture>)request.getAttribute("hotItem2");
	ArrayList<Item> recItem1 = (ArrayList<Item>)request.getAttribute("recItem1");
	ArrayList<Picture> recItem2 = (ArrayList<Picture>)request.getAttribute("recItem2");
	ArrayList<Item> newBuyPrice1 = (ArrayList<Item>)request.getAttribute("newBuyPrice1");
	ArrayList<Picture> newBuyPrice2 = (ArrayList<Picture>)request.getAttribute("newBuyPrice2");
	ArrayList<SellBid> newBuyPrice3 = (ArrayList<SellBid>)request.getAttribute("newBuyPrice3");
	ArrayList<Item> newSellPrice1 = (ArrayList<Item>)request.getAttribute("newSellPrice1");
	ArrayList<Picture> newSellPrice2 = (ArrayList<Picture>)request.getAttribute("newSellPrice2");
	ArrayList<BuyBid> newSellPrice3 = (ArrayList<BuyBid>)request.getAttribute("newSellPrice3");
%>
<!DOCTYPE html>
<html>
<head>
	<!-- meta character set -->
	<meta charset="UTF-8">
	<!-- Site Title -->
	<title>슈즈곤</title>
	<!--
		CSS
		============================================= -->
	<link rel="stylesheet" href="/Shoesgone/resources/css/ion.rangeSlider.css" />
	<link rel="stylesheet" href="/Shoesgone/resources/css/ion.rangeSlider.skinFlat.css" />
	<link rel="stylesheet" href="/Shoesgone/resources/css/magnific-popup.css">
	
	<style>
		#ad-image-margin{
			margin-left: auto;
			margin-right: auto;
		}
		
		#ad1-style{
			background-color: rgb(54, 130, 176);
			text-align: center;
			cursor: pointer;
		}
		
		#ad2-style{
			background-color: rgb(227, 31, 106);
			text-align: center;
			cursor: pointer;
		}
		
		#ad3-style{
			background-color: rgb(160, 185, 190);
			text-align: center;
			cursor: pointer;
		}
		
		#ad4-style{
			background-color: rgb(255, 103, 17);
			text-align: center;
			cursor: pointer;
		}
		
		#today-style, #shoesgone-style{
			width: 100%;
			margin: 3em auto;
			display: flex;
			flex-wrap: wrap;
		}
		
		#today-style li, #shoesgone-style li{
			width: 16%;
			list-style: none;
			padding: 15px;
			margin-left: auto;
			margin-right: auto;
		}
		
		#today-style li img, #shoesgone-style li img{
			width: 100%;
		}
		
		#cursor-pointer{
			cursor: pointer;
		}
	</style>
</head>
<body>

	<%@ include file="views/common/menubar.jsp" %>

	<!-- start banner Area -->
	<section class="banner-area">
		<div class="container">
			<div class="row fullscreen align-items-center justify-content-start">
				<div class="col-lg-12">
					<div class="active-banner-slider owl-carousel">
						<!-- single-slide -->
						<div class="row single-slide align-items-center d-flex" id="cursor-pointer" onclick="location.href='/Shoesgone/ndetail?noticeNo=11';">
							<div class="col-lg-5 col-md-6">
								<div class="banner-content">
									<h1>택배사 휴무 안내</h1>
									<p>테스트 페이지입니다.</p>
									<div class="add-bag d-flex align-items-center">
									</div>
								</div>
							</div>
							<div class="col-lg-7">
								<div class="banner-img">
									<img class="img-fluid" src="/Shoesgone/resources/img/banner/banner-img.png" alt="">
								</div>
							</div>
						</div>
						<!-- single-slide -->
						<div class="row single-slide" id="cursor-pointer" onclick="location.href='/Shoesgone/ndetail?noticeNo=10';">
							<div class="col-lg-5">
								<div class="banner-content">
									<h1>개인정보 이용 처리방침 변경 안내</h1>
									<p>테스트 페이지입니다.</p>
									<div class="add-bag d-flex align-items-center">
									</div>
								</div>
							</div>
							<div class="col-lg-7">
								<div class="banner-img">
									<img class="img-fluid" src="/Shoesgone/resources/img/banner/banner-img.png" alt="">
								</div>
							</div>
						</div>
						<!-- single-slide -->
						<div class="row single-slide align-items-center d-flex" id="cursor-pointer" onclick="location.href='/Shoesgone/ndetail?noticeNo=9';">
							<div class="col-lg-5 col-md-6">
								<div class="banner-content">
									<h1>부정거래 이용제한 조치 안내</h1>
									<p>테스트 페이지입니다.</p>
									<div class="add-bag d-flex align-items-center">
									</div>
								</div>
							</div>
							<div class="col-lg-7">
								<div class="banner-img">
									<img class="img-fluid" src="/Shoesgone/resources/img/banner/banner-img.png" alt="">
								</div>
							</div>
						</div>
						<div class="row single-slide align-items-center d-flex" id="cursor-pointer" onclick="location.href='/Shoesgone/ndetail?noticeNo=8';">
							<div class="col-lg-5 col-md-6">
								<div class="banner-content">
									<h1>가품거래 시도와 관련한 조치사항</h1>
									<p>테스트 페이지입니다.</p>
									<div class="add-bag d-flex align-items-center">
									</div>
								</div>
							</div>
							<div class="col-lg-7">
								<div class="banner-img">
									<img class="img-fluid" src="/Shoesgone/resources/img/banner/banner-img.png" alt="">
								</div>
							</div>
						</div>
						<div class="row single-slide align-items-center d-flex" id="cursor-pointer" onclick="location.href='/Shoesgone/ndetail?noticeNo=7';">
							<div class="col-lg-5 col-md-6">
								<div class="banner-content">
									<h1>이용약관 변경 안내</h1>
									<p>테스트 페이지입니다.</p>
									<div class="add-bag d-flex align-items-center">
									</div>
								</div>
							</div>
							<div class="col-lg-7">
								<div class="banner-img">
									<img class="img-fluid" src="/Shoesgone/resources/img/banner/banner-img.png" alt="">
								</div>
							</div>
						</div>
						<div class="row single-slide align-items-center d-flex" id="cursor-pointer" onclick="location.href='/Shoesgone/ndetail?noticeNo=6';">
							<div class="col-lg-5 col-md-6">
								<div class="banner-content">
									<h1>7월 이벤트 당첨자 안내</h1>
									<p>테스트 페이지입니다.</p>
									<div class="add-bag d-flex align-items-center">
									</div>
								</div>
							</div>
							<div class="col-lg-7">
								<div class="banner-img">
									<img class="img-fluid" src="/Shoesgone/resources/img/banner/banner-img.png" alt="">
								</div>
							</div>
						</div>
						<div class="row single-slide align-items-center d-flex" id="cursor-pointer" onclick="location.href='/Shoesgone/ndetail?noticeNo=5';">
							<div class="col-lg-5 col-md-6">
								<div class="banner-content">
									<h1>휴무일 안내</h1>
									<p>테스트 페이지입니다.</p>
									<div class="add-bag d-flex align-items-center">
									</div>
								</div>
							</div>
							<div class="col-lg-7">
								<div class="banner-img">
									<img class="img-fluid" src="/Shoesgone/resources/img/banner/banner-img.png" alt="">
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- End banner Area -->
	
	<!-- start product Area -->
	<section>
		<!-- single product slide -->
		<div class="single-product-slider">
			<div class="container">
				<div class="row justify-content-center">
					<div class="col-lg-6 text-center">
						<div class="section-title">
							<h1></h1>			
						</div>
					</div>
				</div>
				<div class="row justify-content-center">
					<div class="col-lg-6 text-center">
						<div class="section-title">
							<h1>발매 상품</h1>			
						</div>
					</div>
				</div>
				<div class="row">
					<!-- single product -->
					<div class="col-lg-3 col-md-6" id="cursor-pointer" onclick="location.href='/Shoesgone/ItemDV?itemno=<%= regItem1.get(0).getItemNo() %>';">
						<div class="single-product">
							<img class="img-fluid" src="/Shoesgone/resources/img/shoes_images/<%= regItem2.get(0).getPicturepath() %>" alt="">
							<div class="product-details">
								<h6><%= regItem1.get(0).getItemKrName() %></h6>
								<div class="price">
									<h6><%= regItem1.get(0).getPrice() %>원</h6>
								</div>
								<div class="prd-bottom">
								</div>
							</div>
						</div>
					</div>
					<!-- single product -->
					<div class="col-lg-3 col-md-6" id="cursor-pointer" onclick="location.href='/Shoesgone/ItemDV?itemno=<%= regItem1.get(1).getItemNo() %>';">
						<div class="single-product">
							<img class="img-fluid" src="/Shoesgone/resources/img/shoes_images/<%= regItem2.get(1).getPicturepath() %>" alt="">
							<div class="product-details">
								<h6><%= regItem1.get(1).getItemKrName() %></h6>
								<div class="price">
									<h6><%= regItem1.get(1).getPrice() %>원</h6>
								</div>
								<div class="prd-bottom">
								</div>
							</div>
						</div>
					</div>
					<!-- single product -->
					<div class="col-lg-3 col-md-6" id="cursor-pointer" onclick="location.href='/Shoesgone/ItemDV?itemno=<%= regItem1.get(2).getItemNo() %>';">
						<div class="single-product">
							<img class="img-fluid" src="/Shoesgone/resources/img/shoes_images/<%= regItem2.get(2).getPicturepath() %>" alt="">
							<div class="product-details">
								<h6><%= regItem1.get(2).getItemKrName() %></h6>
								<div class="price">
									<h6><%= regItem1.get(2).getPrice() %>원</h6>
								</div>
								<div class="prd-bottom">
								</div>
							</div>
						</div>
					</div>
					<!-- single product -->
					<div class="col-lg-3 col-md-6" id="cursor-pointer" onclick="location.href='/Shoesgone/ItemDV?itemno=<%= regItem1.get(3).getItemNo() %>';">
						<div class="single-product">
							<img class="img-fluid" src="/Shoesgone/resources/img/shoes_images/<%= regItem2.get(3).getPicturepath() %>" alt="">
							<div class="product-details">
								<h6><%= regItem1.get(3).getItemKrName() %></h6>
								<div class="price">
									<h6><%= regItem1.get(3).getPrice() %>원</h6>
								</div>
								<div class="prd-bottom">
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="single-product-slider">
			<div class="container">
				<div class="row justify-content-center">
					<div class="col-lg-6 text-center">
						<div class="section-title">
							<h1></h1>			
						</div>
					</div>
				</div>
				<div class="row justify-content-center">
					<div class="col-lg-6 text-center">
						<div class="section-title">
							<h1>오늘의 스타일</h1>			
						</div>
					</div>
				</div>
					<div id="today-style"></div>
			</div>
		</div>
		<div class="row justify-content-center">
			<div class="col-lg-6 text-center">
				<div class="section-title">
					<h1></h1>			
				</div>
			</div>
		</div>
		<section id="ad1-style" onclick="location.href='/Shoesgone/ItemDV?itemno=21';">
			<div class="col-lg-4" id="ad-image-margin">
				<img class="img-fluid" src="/Shoesgone/resources/img/shoes_images/DH3227-105_0.png" alt="">
			</div>
			<div>
				<h1 id="white-color">조던 1 x 트래비스 스캇 x 프라그먼트 레트로 하이 OG SP 밀리터리 블루</h1><br>
			</div>
		</section>
		<!-- single product slide -->
		<div class="single-product-slider">
			<div class="container">
				<div class="row justify-content-center">
					<div class="col-lg-6 text-center">
						<div class="section-title">
							<h1></h1>			
						</div>
					</div>
				</div>
				<div class="row justify-content-center">
					<div class="col-lg-6 text-center">
						<div class="section-title">
							<h1>인기 상품</h1>
						</div>
					</div>
				</div>
				<div class="row">
					<!-- single product -->
					<div class="col-lg-3 col-md-6" id="cursor-pointer" onclick="location.href='/Shoesgone/ItemDV?itemno=<%= hotItem1.get(0).getItemNo() %>';">
						<div class="single-product">
							<img class="img-fluid" src="/Shoesgone/resources/img/shoes_images/<%= hotItem2.get(0).getPicturepath() %>" alt="">
							<div class="product-details">
								<h6><%= hotItem1.get(0).getItemKrName() %></h6>
								<div class="price">
									<h6><%= hotItem1.get(0).getPrice() %>원</h6>
								</div>
								<div class="prd-bottom">
								</div>
							</div>
						</div>
					</div>
					<!-- single product -->
					<div class="col-lg-3 col-md-6" id="cursor-pointer" onclick="location.href='/Shoesgone/ItemDV?itemno=<%= hotItem1.get(1).getItemNo() %>';">
						<div class="single-product">
							<img class="img-fluid" src="/Shoesgone/resources/img/shoes_images/<%= hotItem2.get(1).getPicturepath() %>" alt="">
							<div class="product-details">
								<h6><%= hotItem1.get(1).getItemKrName() %></h6>
								<div class="price">
									<h6><%= hotItem1.get(1).getPrice() %>원</h6>
								</div>
								<div class="prd-bottom">
								</div>
							</div>
						</div>
					</div>
					<!-- single product -->
					<div class="col-lg-3 col-md-6" id="cursor-pointer" onclick="location.href='/Shoesgone/ItemDV?itemno=<%= hotItem1.get(2).getItemNo() %>';">
						<div class="single-product">
							<img class="img-fluid" src="/Shoesgone/resources/img/shoes_images/<%= hotItem2.get(2).getPicturepath() %>" alt="">
							<div class="product-details">
								<h6><%= hotItem1.get(2).getItemKrName() %></h6>
								<div class="price">
									<h6><%= hotItem1.get(2).getPrice() %>원</h6>
								</div>
								<div class="prd-bottom">
								</div>
							</div>
						</div>
					</div>
					<!-- single product -->
					<div class="col-lg-3 col-md-6" id="cursor-pointer" onclick="location.href='/Shoesgone/ItemDV?itemno=<%= hotItem1.get(3).getItemNo() %>';">
						<div class="single-product">
							<img class="img-fluid" src="/Shoesgone/resources/img/shoes_images/<%= hotItem2.get(3).getPicturepath() %>" alt="">
							<div class="product-details">
								<h6><%= hotItem1.get(3).getItemKrName() %></h6>
								<div class="price">
									<h6><%= hotItem1.get(3).getPrice() %>원</h6>
								</div>
								<div class="prd-bottom">
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="single-product-slider">
			<div class="container">
				<div class="row justify-content-center">
					<div class="col-lg-6 text-center">
						<div class="section-title">
							<h1></h1>			
						</div>
					</div>
				</div>
				<div class="row justify-content-center">
					<div class="col-lg-6 text-center">
						<div class="section-title">
							<h1>슈즈곤</h1>			
						</div>
					</div>
				</div>
					<div id="shoesgone-style"></div>
			</div>
		</div>
		<div class="row justify-content-center">
			<div class="col-lg-6 text-center">
				<div class="section-title">
					<h1></h1>			
				</div>
			</div>
		</div>
		<section id="ad2-style" onclick="location.href='/Shoesgone/ItemDV?itemno=22';">
			<div class="col-lg-4" id="ad-image-margin">
				<img class="img-fluid" src="/Shoesgone/resources/img/shoes_images/DH7695-600_0.png" alt="">
			</div>
			<div>
				<h1 id="white-color">나이키 x 파라 SB 덩크 로우 프로 앱스트랙트 아트</h1><br>
			</div>
		</section>
		<div class="single-product-slider">
			<div class="container">
				<div class="row justify-content-center">
					<div class="col-lg-6 text-center">
						<div class="section-title">
							<h1></h1>			
						</div>
					</div>
				</div>
				<div class="row justify-content-center">
					<div class="col-lg-6 text-center">
						<div class="section-title">
							<h1>추천 상품</h1>
						</div>
					</div>
				</div>
				<div class="row">
					<!-- single product -->
					<div class="col-lg-3 col-md-6" id="cursor-pointer" onclick="location.href='/Shoesgone/ItemDV?itemno=<%= recItem1.get(0).getItemNo() %>';">
						<div class="single-product">
							<img class="img-fluid" src="/Shoesgone/resources/img/shoes_images/<%= recItem2.get(0).getPicturepath() %>" alt="">
							<div class="product-details">
								<h6><%= recItem1.get(0).getItemKrName() %></h6>
								<div class="price">
									<h6><%= recItem1.get(0).getPrice() %>원</h6>
								</div>
								<div class="prd-bottom">
								</div>
							</div>
						</div>
					</div>
					<!-- single product -->
					<div class="col-lg-3 col-md-6" id="cursor-pointer" onclick="location.href='/Shoesgone/ItemDV?itemno=<%= recItem1.get(1).getItemNo() %>';">
						<div class="single-product">
							<img class="img-fluid" src="/Shoesgone/resources/img/shoes_images/<%= recItem2.get(1).getPicturepath() %>" alt="">
							<div class="product-details">
								<h6><%= recItem1.get(1).getItemKrName() %></h6>
								<div class="price">
									<h6><%= recItem1.get(1).getPrice() %>원</h6>
								</div>
								<div class="prd-bottom">
								</div>
							</div>
						</div>
					</div>
					<!-- single product -->
					<div class="col-lg-3 col-md-6" id="cursor-pointer" onclick="location.href='/Shoesgone/ItemDV?itemno=<%= recItem1.get(2).getItemNo() %>';">
						<div class="single-product">
							<img class="img-fluid" src="/Shoesgone/resources/img/shoes_images/<%= recItem2.get(2).getPicturepath() %>" alt="">
							<div class="product-details">
								<h6><%= recItem1.get(2).getItemKrName() %></h6>
								<div class="price">
									<h6><%= recItem1.get(2).getPrice() %>원</h6>
								</div>
								<div class="prd-bottom">
								</div>
							</div>
						</div>
					</div>
					<!-- single product -->
					<div class="col-lg-3 col-md-6" id="cursor-pointer" onclick="location.href='/Shoesgone/ItemDV?itemno=<%= recItem1.get(3).getItemNo() %>';">
						<div class="single-product">
							<img class="img-fluid" src="/Shoesgone/resources/img/shoes_images/<%= recItem2.get(3).getPicturepath() %>" alt="">
							<div class="product-details">
								<h6><%= recItem1.get(3).getItemKrName() %></h6>
								<div class="price">
									<h6><%= recItem1.get(3).getPrice() %>원</h6>
								</div>
								<div class="prd-bottom">
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="row justify-content-center">
			<div class="col-lg-6 text-center">
				<div class="section-title">
					<h1></h1>			
				</div>
			</div>
		</div>
		<section id="ad3-style" onclick="location.href='/Shoesgone/ItemDV?itemno=23';">
			<div class="col-lg-4" id="ad-image-margin">
				<img class="img-fluid" src="/Shoesgone/resources/img/shoes_images/GCOMS590-W55_0.png" alt="">
			</div>
			<div>
				<h1 id="white-color">골든구스 슈퍼스타 화이트 블랙탭 스니커즈</h1><br>
			</div>
		</section>
		<div class="single-product-slider">
			<div class="container">
				<div class="row justify-content-center">
					<div class="col-lg-6 text-center">
						<div class="section-title">
							<h1></h1>			
						</div>
					</div>
				</div>
				<div class="row justify-content-center">
					<div class="col-lg-6 text-center">
						<div class="section-title">
							<h1>새로운 즉시 구매가</h1>
						</div>
					</div>
				</div>
				<div class="row">
					<!-- single product -->
					<div class="col-lg-3 col-md-6" id="cursor-pointer" onclick="location.href='/Shoesgone/ItemDV?itemno=<%= newBuyPrice1.get(0).getItemNo() %>';">
						<div class="single-product">
							<img class="img-fluid" src="/Shoesgone/resources/img/shoes_images/<%= newBuyPrice2.get(0).getPicturepath() %>" alt="">
							<div class="product-details">
								<h6><%= newBuyPrice1.get(0).getItemKrName() %></h6>
								<div class="price">
									<h6><%= newBuyPrice3.get(0).getPrice() %>원</h6>
								</div>
								<div class="prd-bottom">
								</div>
							</div>
						</div>
					</div>
					<!-- single product -->
					<div class="col-lg-3 col-md-6" id="cursor-pointer" onclick="location.href='/Shoesgone/ItemDV?itemno=<%= newBuyPrice1.get(1).getItemNo() %>';">
						<div class="single-product">
							<img class="img-fluid" src="/Shoesgone/resources/img/shoes_images/<%= newBuyPrice2.get(1).getPicturepath() %>" alt="">
							<div class="product-details">
								<h6><%= newBuyPrice1.get(1).getItemKrName() %></h6>
								<div class="price">
									<h6><%= newBuyPrice3.get(1).getPrice() %>원</h6>
								</div>
								<div class="prd-bottom">
								</div>
							</div>
						</div>
					</div>
					<!-- single product -->
					<div class="col-lg-3 col-md-6" id="cursor-pointer" onclick="location.href='/Shoesgone/ItemDV?itemno=<%= newBuyPrice1.get(2).getItemNo() %>';">
						<div class="single-product">
							<img class="img-fluid" src="/Shoesgone/resources/img/shoes_images/<%= newBuyPrice2.get(2).getPicturepath() %>" alt="">
							<div class="product-details">
								<h6><%= newBuyPrice1.get(2).getItemKrName() %></h6>
								<div class="price">
									<h6><%= newBuyPrice3.get(2).getPrice() %>원</h6>
								</div>
								<div class="prd-bottom">
								</div>
							</div>
						</div>
					</div>
					<!-- single product -->
					<div class="col-lg-3 col-md-6" id="cursor-pointer" onclick="location.href='/Shoesgone/ItemDV?itemno=<%= newBuyPrice1.get(3).getItemNo() %>';">
						<div class="single-product">
							<img class="img-fluid" src="/Shoesgone/resources/img/shoes_images/<%= newBuyPrice2.get(3).getPicturepath() %>" alt="">
							<div class="product-details">
								<h6><%= newBuyPrice1.get(3).getItemKrName() %></h6>
								<div class="price">
									<h6><%= newBuyPrice3.get(3).getPrice() %>원</h6>
								</div>
								<div class="prd-bottom">
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="single-product-slider">
			<div class="container">
				<div class="row justify-content-center">
					<div class="col-lg-6 text-center">
						<div class="section-title">
							<h1></h1>			
						</div>
					</div>
				</div>
				<div class="row justify-content-center">
					<div class="col-lg-6 text-center">
						<div class="section-title">
							<h1>새로운 즉시 판매가</h1>
						</div>
					</div>
				</div>
				<div class="row">
					<!-- single product -->
					<div class="col-lg-3 col-md-6" id="cursor-pointer" onclick="location.href='/Shoesgone/ItemDV?itemno=<%= newSellPrice1.get(0).getItemNo() %>';">
						<div class="single-product">
							<img class="img-fluid" src="/Shoesgone/resources/img/shoes_images/<%= newSellPrice2.get(0).getPicturepath() %>" alt="">
							<div class="product-details">
								<h6><%= newSellPrice1.get(0).getItemKrName() %></h6>
								<div class="price">
									<h6><%= newSellPrice3.get(0).getPrice() %>원</h6>
								</div>
								<div class="prd-bottom">
								</div>
							</div>
						</div>
					</div>
					<!-- single product -->
					<div class="col-lg-3 col-md-6" id="cursor-pointer" onclick="location.href='/Shoesgone/ItemDV?itemno=<%= newSellPrice1.get(1).getItemNo() %>';">
						<div class="single-product">
							<img class="img-fluid" src="/Shoesgone/resources/img/shoes_images/<%= newSellPrice2.get(1).getPicturepath() %>" alt="">
							<div class="product-details">
								<h6><%= newSellPrice1.get(1).getItemKrName() %></h6>
								<div class="price">
									<h6><%= newSellPrice3.get(1).getPrice() %>원</h6>
								</div>
								<div class="prd-bottom">
								</div>
							</div>
						</div>
					</div>
					<!-- single product -->
					<div class="col-lg-3 col-md-6" id="cursor-pointer" onclick="location.href='/Shoesgone/ItemDV?itemno=<%= newSellPrice1.get(2).getItemNo() %>';">
						<div class="single-product">
							<img class="img-fluid" src="/Shoesgone/resources/img/shoes_images/<%= newSellPrice2.get(2).getPicturepath() %>" alt="">
							<div class="product-details">
								<h6><%= newSellPrice1.get(2).getItemKrName() %></h6>
								<div class="price">
									<h6><%= newSellPrice3.get(2).getPrice() %>원</h6>
								</div>
								<div class="prd-bottom">
								</div>
							</div>
						</div>
					</div>
					<!-- single product -->
					<div class="col-lg-3 col-md-6" id="cursor-pointer" onclick="location.href='/Shoesgone/ItemDV?itemno=<%= newSellPrice1.get(3).getItemNo() %>';">
						<div class="single-product">
							<img class="img-fluid" src="/Shoesgone/resources/img/shoes_images/<%= newSellPrice2.get(3).getPicturepath() %>" alt="">
							<div class="product-details">
								<h6><%= newSellPrice1.get(3).getItemKrName() %></h6>
								<div class="price">
									<h6><%= newSellPrice3.get(3).getPrice() %>원</h6>
								</div>
								<div class="prd-bottom">
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="row justify-content-center">
			<div class="col-lg-6 text-center">
				<div class="section-title">
					<h1></h1>			
				</div>
			</div>
		</div>
		<section id="ad4-style" onclick="location.href='/Shoesgone/ItemDV?itemno=24';">
			<div class="col-lg-4" id="ad-image-margin">
				<img class="img-fluid" src="/Shoesgone/resources/img/shoes_images/DD1877-002_0.png" alt="">
			</div>
			<div>
				<h1 id="white-color">나이키 x 사카이 블레이저 로우 아이언 그레이</h1><br>
			</div>
		</section>
		<div class="single-product-slider">
			<div class="container">
				<div class="row justify-content-center">
					<div class="col-lg-6 text-center">
						<div class="section-title">
							<h1></h1>
						</div>
					</div>
				</div>
				<div class="row justify-content-center">
					<div class="col-lg-6 text-center">
						<div class="section-title">
							<h1>발매 예정</h1>
						</div>
					</div>
				</div>
				<div class="row">
					<!-- single product -->
					<div class="col-lg-3 col-md-6">
						<div class="single-product">
							<img class="img-fluid" src="/Shoesgone/resources/img/shoes_images/555088-105_0.png" alt="">
							<div class="product-details">
								<h6>조던 1 레트로 하이 OG 블랙 모카</h6>
								<div class="price">
									<h6>457,000원</h6>
								</div>
								<div class="prd-bottom">
								</div>
							</div>
						</div>
					</div>
					<!-- single product -->
					<div class="col-lg-3 col-md-6">
						<div class="single-product">
							<img class="img-fluid" src="/Shoesgone/resources/img/shoes_images/555088-134_0.png" alt="">
							<div class="product-details">
								<h6>조던 1 레트로 하이 OG 유니버시티 블루</h6>
								<div class="price">
									<h6>357,000원</h6>
								</div>
								<div class="prd-bottom">
								</div>
							</div>
						</div>
					</div>
					<!-- single product -->
					<div class="col-lg-3 col-md-6">
						<div class="single-product">
							<img class="img-fluid" src="/Shoesgone/resources/img/shoes_images/555088-180_0.png" alt="">
							<div class="product-details">
								<h6>조던 1 레트로 하이 OG 일렉트로 오렌지</h6>
								<div class="price">
									<h6>176,000원</h6>
								</div>
								<div class="prd-bottom">
								</div>
							</div>
						</div>
					</div>
					<!-- single product -->
					<div class="col-lg-3 col-md-6">
						<div class="single-product">
							<img class="img-fluid" src="/Shoesgone/resources/img/shoes_images/555088-402_0.png" alt="">
							<div class="product-details">
								<h6>조던 1 레트로 하이 OG 하이퍼 로얄</h6>
								<div class="price">
									<h6>319,000원</h6>
								</div>
								<div class="prd-bottom">
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="row justify-content-center">
			<div class="col-lg-6 text-center">
				<div class="section-title">
					<h1></h1>			
				</div>
			</div>
		</div>
	</section>
	<!-- end product Area -->

	<%@ include file="views/common/footer.jsp" %>

	<script src="/Shoesgone/resources/js/instafeed.min.js"></script>
	<script>
	    var feed1 = new Instafeed({
	    	target: 'today-style',
	    	template: '<li><a href="{{link}}"><img title="{{caption}}" src="{{image}}" /></a></li>',
	    	limit: 6,
	    	accessToken: 'IGQVJXcEVqbjRwMVB2a2VvcEZACY3Y3am5fX3h1bHMtdnJadjMtVHhNdnhoZAFdPS194clRqSTItWXQ1TE5hbG5xVWk1aThydVl0VmJCZAWFnRU9zdkwwcUFTVkZAGcEVsZAWFIZAW5nV2RvSVl2VDhOM0tDcwZDZD'
	    });
	    feed1.run();
	    
	    var feed2 = new Instafeed({
	    	target: 'shoesgone-style',
	    	template: '<li><a href="{{link}}"><img title="{{caption}}" src="{{image}}" /></a></li>',
	    	limit: 6,
	    	accessToken: 'IGQVJXcEVqbjRwMVB2a2VvcEZACY3Y3am5fX3h1bHMtdnJadjMtVHhNdnhoZAFdPS194clRqSTItWXQ1TE5hbG5xVWk1aThydVl0VmJCZAWFnRU9zdkwwcUFTVkZAGcEVsZAWFIZAW5nV2RvSVl2VDhOM0tDcwZDZD'
	    });
	    feed2.run();
	</script>
</body>
</html>