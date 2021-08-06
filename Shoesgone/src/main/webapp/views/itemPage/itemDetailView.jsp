<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="itemPage.model.vo.Item, itemPage.model.vo.Picture, java.util.ArrayList, community.review.model.vo.Review"%>
<%
//Item 객체를 가져옴
Item item = (Item) request.getAttribute("item");
ArrayList<Picture> plist = (ArrayList<Picture>) request.getAttribute("plist");
ArrayList<Integer> isizes = (ArrayList<Integer>) request.getAttribute("isizes");
ArrayList<Review> rlist = (ArrayList<Review>) request.getAttribute("rlist");
ArrayList<Picture> rplist = (ArrayList<Picture>) request.getAttribute("rplist");
ArrayList<String> rpnames = (ArrayList<String>) request.getAttribute("rpnames");

%>
<!DOCTYPE html>
<html>
<head>
<!-- meta character set -->
<meta charset="UTF-8">
<!-- Site Title -->
<title>SHOP</title>

<!--
            CSS
            ============================================= -->
<link rel="stylesheet"
	href="/Shoesgone/resources/css/ion.rangeSlider.css" />
<link rel="stylesheet"
	href="/Shoesgone/resources/css/ion.rangeSlider.skinFlat.css" />
<link rel="stylesheet"
	href="/Shoesgone/resources/plugins/slick/slick.css?after">
<link rel="stylesheet"
	href="/Shoesgone/resources/plugins/slick/slick-theme.css">
<link rel="stylesheet"
	href="/Shoesgone/resources/css/itemDetailView.css?after">
</head>
<body id="itemdetail">
	
	<%@ include file="../common/menubar.jsp" %>
	
	<!-- Start Banner Area -->
	<section class="banner-area organic-breadcrumb">
		<div class="container">
			<div
				class="breadcrumb-banner d-flex flex-wrap align-items-center justify-content-end">
				<div class="col-first">
					<h1>Product Details Page</h1>
					<nav class="d-flex align-items-center">
						<a href="index.html">Home<span class="lnr lnr-arrow-right"></span></a>
						<a href="#">Shop<span class="lnr lnr-arrow-right"></span></a> <a
							href="single-product.html">product-details</a>
					</nav>
				</div>
			</div>
		</div>
	</section>
	<!-- End Banner Area -->
	<!--================Single Product Area =================-->
	<div class="product_image_area">
		<div class="container">
			<div class="row s_product_inner">
				<div class="col-lg-6">
					<div class="your-class">
						<%
						for (Picture p : plist) {
						%>
						<div>
							<img class="img-fluid"
								src="/Shoesgone/resources/img/shoes_images/<%=p.getPicturepath()%>"
								alt="">
						</div>
						<%
						}
						%>
					</div>
				</div>
				<div class="col-lg-5 offset-lg-1">
					<div class="s_product_text" style="margin-top: 0px">
						<h3><%=item.getItemEngName()%></h3>
						<h4><%=item.getItemKrName()%></h4>
						<div class="detail_size lg">
							<div class="title">
								<span class="title_txt">사이즈</span>
							</div>
							<div class="size">
								<a href="#" class="btn_size"> <span class="btn_text">모든사이즈</span>
								</a>
							</div>
						</div>
						<div class="detail_price lg">
							<div class="title">
								<span class="title_txt">최근 거래가</span>
							</div>
							<div class="price">
								<span class="price_txt">minimum price</span>
							</div>
						</div>
						<div class="card_area d-flex align-items-center">
							<a class="primary-btn" href="#">구매하기</a> <a class="primary-btn"
								href="#">판매하기</a>
							<!-- <a class="icon_btn" href="#"><i class="lnr lnr lnr-diamond"></i></a>
							<a class="icon_btn" href="#"><i]\ class="lnr lnr lnr-heart"></i></a> -->
						</div>
						<br>
						<div class="s_product_table">
							<h3>제품 상세정보</h3>
							<table class="table_specification">
								<tbody>
									<tr>
										<td>
											<h5>브랜드</h5>
										</td>
										<td>
											<h5><%=item.getBrand()%></h5>
										</td>
									</tr>
									<tr>
										<td>
											<h5>모델 번호</h5>
										</td>
										<td>
											<h5><%=item.getModelNo()%></h5>
										</td>
									</tr>
									<tr>
										<td>
											<h5>신발 색상</h5>
										</td>
										<td>
											<h5><%=item.getShoesColors()%></h5>
										</td>
									</tr>
									<tr>
										<td>
											<h5>발매가</h5>
										</td>
										<td>
											<h5><%=item.getPrice()%></h5>
										</td>
									</tr>
									<tr>
										<td>
											<h5>발매일</h5>
										</td>
										<td>
											<h5><%=item.getDropDate()%></h5>
										</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--================End Single Product Area =================-->
	<hr>
	<!--================Product Description Area =================-->
	<div class="product_extra_area">
		<div class="container">
			<div class="row s_product_inner">
				<div class="col-lg-6">
					<div class="shoes_statistics">
						<div>
							<h4>거래추이</h4>
							<table class="graph_options">
								<tr>
									<td><select class="graph_size" id="graph_size" onchange=reloadPage()>
											<option value = "0">사이즈별</option>
											<% for(int i:isizes){ %>
											<option value="<%= i %>"><%= i %></option>
											<% } %>
									</select></td>
									<td><select class="graph_days" id="graph_days" onchange=reloadPage()>
											<option value="1" selected>일별</option>
											<option value="7">주별</option>
											<option value="30">월별</option>
									</select></td>
								</tr>
							</table>
							<div>
								<iframe id="iframecontext" src="" width="100%" height="280px" frameborder=0 framespacing=0></iframe>
							</div>
						</div>
						<br>
						<h5>거래기록</h5>
						<br>
						<div>
							<img class="sales_record"
								src="product_detail_example/resources/img/product_detail_example/yeezy_sales_record.png">
						</div>
						<br>
					</div>
					<div class="sales_detail">
						<a class="primary-btn" href="#"
							style="text-align: center; margin: auto;">거래내역 자세히 보기</a>
					</div>
				</div>
				<div class="col-lg-6">
					<div class="size_recommend_box">
						<strong>사이즈 추천</strong>
						<p class="box_recommend_size">고객의 추천사이즈로 주관적입니다.</p>
						<div class="size_recommend_table" style="overflow-y: scroll; height: 150px;">
							<table class="idpagereview" border="1" cellspacing="0">
								<tr><th>번호</th><th>제목</th><th>별점</th><th>조회수</th></tr>
								<% for(Review r : rlist){ %>
								<tr>
									<td><%= r.getReviewNo() %></td>
									<td><%= r.getReviewTitle() %></td>
									<td><%= r.getReviewStar() %>/10</td>
									<td><%= r.getReviewReadcount() %></td>
								</tr>
								<% } %>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--================End Product Description Area =================-->
	<hr>
	<!--================ Start Related Product Area =================-->
	<div class="product_extra_area">
		<div class="container">
			<div class="slick-related">
			  	<% for (int i=0; i<rplist.size(); i++) { %>
					<div>
						<img class="img-fluid" src="/Shoesgone/resources/img/shoes_images/<%= rplist.get(i).getPicturepath() %>" alt="">
						<p> <%= rpnames.get(i) %>
					</div>
				<% } %>
			</div>
		</div>
	</div>
	<!--================ End Related Product Area =================-->
	<!-- End related-product Area -->

	<%@ include file="../common/footer.jsp" %>

	<script type="text/javascript"
		src="/Shoesgone/resources/plugins/slick/slick.js"></script>
	<script type="text/javascript"
		src="/Shoesgone/resources/plugins/slick/slick.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			$('.your-class').slick({
				slide : 'div',
				infinite : true,
				dots : true,
				infinite : true,
				speed : 500,
				fade : true,
				cssEase : 'linear',
				prevArrow : "<button type='button' class='slick-prev'>Previous</button>", // 이전 화살표 모양 설정
				nextArrow : "<button type='button' class='slick-next'>Next</button>", // 다음 화살표 모양 설정
				draggable : true
			});
			$('.slick-related').slick({
				  dots: true,
				  infinite: false,
				  speed: 300,
				  slidesToShow: 4,
				  slidesToScroll: 4,
				  responsive: [
				    {
				      breakpoint: 1024,
				      settings: {
				        slidesToShow: 3,
				        slidesToScroll: 3,
				        infinite: true,
				        dots: true
				      }
				    },
				    {
				      breakpoint: 600,
				      settings: {
				        slidesToShow: 2,
				        slidesToScroll: 2
				      }
				    },
				    {
				      breakpoint: 480,
				      settings: {
				        slidesToShow: 1,
				        slidesToScroll: 1
				      }
				    }
				    // You can unslick at a given breakpoint now by adding:
				    // settings: "unslick"
				    // instead of a settings object
				  ]
				});
		});
				
	</script>
	<script type="text/javascript">
		$(document).ready(function() {
			var itemno = <%= item.getItemNo() %>
			var graphoption1 = document.getElementById("graph_size");
			var graphoption2 = document.getElementById("graph_days");
			graphoption1 = graphoption1.options[graphoption1.selectedIndex].value;
			graphoption2 = graphoption2.options[graphoption2.selectedIndex].value;
			
			document.getElementById("iframecontext").src = "/Shoesgone/ItemDG?itemno=1&option1=0&option2=1";
		});
	</script>
	<script>
	function reloadPage() {
		var itemno = <%= item.getItemNo() %>
		var option1 = document.getElementById("graph_size");
		var option2 = document.getElementById("graph_days");
		option1 = option1.options[option1.selectedIndex].value;
		option2 = option2.options[option2.selectedIndex].value;
		
		document.getElementById("iframecontext").src = "/Shoesgone/ItemDG?itemno="+itemno+"&option1="+option1+"&option2="+option2;
	}
	</script>
</body>
</html>