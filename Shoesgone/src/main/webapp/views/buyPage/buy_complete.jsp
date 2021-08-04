<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- meta character set -->
<meta charset="UTF-8">

<%-- 페이지 이름 --%>
<title>Shoe's Gone</title>

<!-- CSS -->
<link rel="stylesheet" href="/Shoesgone/resources/css/ion.rangeSlider.css" />
<link rel="stylesheet" href="/Shoesgone/resources/css/ion.rangeSlider.skinFlat.css" />

</head>
<body>
	<%-- Menubar --%>
	<%@ include file="../common/menubar.jsp"%>

	<%-- Banner --%>
	<%@ include file="../common/buy_banner.html"%>

	<%-- Main Content --%>
	<!--================Single Product Area =================-->
	<div class="product_image_area">
		<div class="container">
			<div class="row s_product_inner">
				<div class="col-lg-6">
					<div class="s_Product_carousel">
						<div class="single-prd-item">
							<img class="img-fluid" src="/Shoesgone/resources/img/category/s-p1.jpg" alt="">
						</div>
						<div class="single-prd-item">
							<img class="img-fluid" src="/Shoesgone/resources/img/category/s-p1.jpg" alt="">
						</div>
						<div class="single-prd-item">
							<img class="img-fluid" src="/Shoesgone/resources/img/category/s-p1.jpg" alt="">
						</div>
					</div>
				</div>
				<div class="col-lg-5 offset-lg-1">
					<div class="s_product_text" style="margin-top: 0px">
						<h1>결제가 완료되었습니다.</h1>
						<h3>nike_dunk_low_black</h3>
						<h2>$149.99</h2>
						<ul class="list">
							<li><a class="active" href="#"><span>카테고리</span> : nike_dunk_low</a></li>
							<li><a href="#"><span>사이즈</span> : In 180mm</a></li>
							<li><a href="#"><span>발매년도</span> : 2021-06-07</a></li>
						</ul>
						<p style="margin-bottom: 20px">
							Mill Oil is an innovative oil
							filled radiator with the most modern technology. If you are
							looking for something that can make your interior look awesome,
							and at the same time give you the pleasant warm feeling during
							the winter.
						</p>
						<a class="primary-btn" href="/Shoesgone/index.html">계속 쇼핑 하기</a><br>

						<div class="card_area d-flex align-items-center">
							<div class="s_product_table">
								<h3>Specifications</h3>
								<table class="table">
									<tbody>
										<tr>
											<td>
												<h5>Width</h5>
											</td>
											<td>
												<h5>128mm</h5>
											</td>
										</tr>
										<tr>
											<td>
												<h5>Height</h5>
											</td>
											<td>
												<h5>508mm</h5>
											</td>
										</tr>
										<tr>
											<td>
												<h5>Depth</h5>
											</td>
											<td>
												<h5>85mm</h5>
											</td>
										</tr>
										<tr>
											<td>
												<h5>Weight</h5>
											</td>
											<td>
												<h5>52gm</h5>
											</td>
										</tr>
										<tr>
											<td>
												<h5>Quality checking</h5>
											</td>
											<td>
												<h5>yes</h5>
											</td>
										</tr>
										<tr>
											<td>
												<h5>Freshness Duration</h5>
											</td>
											<td>
												<h5>03days</h5>
											</td>
										</tr>
										<tr>
											<td>
												<h5>When packeting</h5>
											</td>
											<td>
												<h5>Without touch of hand</h5>
											</td>
										</tr>
										<tr>
											<td>
												<h5>Each Box contains</h5>
											</td>
											<td>
												<h5>60pcs</h5>
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
	</div>
	<!--================End Single Product Area =================-->

	<%-- Footer --%>
	<%@ include file="../common/footer.jsp"%>

</body>
</html>