<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="itemPage.model.vo.Item, orders.model.vo.Orders"%>
<% 
	// 로그인 확인을 위한 session 객체 사용
	// 상품 정보 조회를 위한 session 객체 사용
	// 이 부분은 추후 머지하면서 수정해주세요.
	Login loginmember = new Login();
	Item item = new Item();
	Orders order = new Orders();
%>
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

<!-- jQuery와 Postcodify를 로딩한다. -->
<script>
	/*  검색 단추를 누르면 팝업 레이어가 열리도록 설정한다. */
	function searchaddress(){
		$("#postcodify_search_button").postcodifyPopUp();
	}
</script>

<body>
	<%-- Menubar --%>
	<%@ include file="../common/menubar.jsp" %>
		
	<%-- Banner --%>
	<%@ include file="../common/buy_banner.html" %>
	
	<%-- Main Content --%>
	<!-- Start body Area -->
	<div class="product_image_area">
		<div class="container">
			<div class="row s_product_inner">
				<div class="col-lg-6">
					<div class="s_Product_carousel">
						<div class="single-prd-item">
							<img class="img-fluid" src="/Shoesgone/resources/img/category/s-p1.jpg"
								alt="">
						</div>
						<div class="single-prd-item">
							<img class="img-fluid" src="/Shoesgone/resources/img/category/s-p1.jpg"
								alt="">
						</div>
						<div class="single-prd-item">
							<img class="img-fluid" src="/Shoesgone/resources/img/category/s-p1.jpg"
								alt="">
						</div>
					</div>
				</div>
				<div class="col-lg-5 offset-lg-1">
					<div class="s_product_text">
						<h3>즉시 구매하기</h3>
						<h4>Faded SkyBlu Denim Jeans</h4>
						<a class="primary-btn">즉시 구매가 : $149.99</a><br>
						<a class="primary-btn" href="/Shoesgone/views/buyPage/tender_buy.jsp">최저 판매가 : $159.99</a><br>
						<a class="primary-btn"><span>Size</span> : 255</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<section class="checkout_area section_gap">
		<div class="container">
			<div class="cupon_area">
				<div class="check_title">
					<h2>
						포인트 사용하기 <a href="#">(잔여 포인트 조회하기)</a>
					</h2>
				</div>
				<input type="text" placeholder="사용할 포인트를 입력해주세요.">
				<a class="tp_btn" href="#">포인트 적용</a>
			</div>
			<div class="billing_details">
				<div class="row">
					<div class="col-lg-8">
						<h3>배송지 입력</h3>
						<form class="row contact_form" action="/Shoesgone/orderupdate" method="post" novalidate="novalidate">
							<input type="hidden" name="userno" value="<%= loginmember.getUserNo() %>">
							<input type="hidden" name="userid" value="<%= loginmember.getUserId() %>">
							<input type="hidden" name="itemno" value="<%= item.getItemNo() %>">
							<div class="col-md-6 form-group p_star">
								<input type="number" class="form-control" id="size" name="size" placeholder="<%= order.getSize() %>" readonly><br>
								<input type="text" class="form-control" id="username" name="username" placeholder="이름" value="<%= loginmember.getUserName() %>" readonly><br>
								<input type="tel" class="form-control" id="phone" name="phone" placeholder="전화번호" value="<%= loginmember.getPhone() %>" readonly><br>
								<input type="email" class="form-control" id="email" name="email" placeholder="이메일" value="<%= loginmember.getEmail() %>" readonly><br>
								<input type="text" class="form-control postcodify_postcode5" id="post" name="post" placeholder="우편번호" required>
								<button type="button" id="postcodify_search_button" onclick="searchaddress();">검색</button><br><br>
								<input type="text" class="form-control postcodify_address" id="address" name="address" placeholder="주소" required><br>
								<input type="text" class="form-control postcodify_extra_info" id="detailaddress" name="detailaddress" placeholder="상세주소" required><br>
							</div>
							<div class="col-md-12 form-group">
								<div class="creat_account">
									<h3>배송 요청사항</h3>
								</div>
								<textarea class="form-control" name="etc" id="etc" rows="1" placeholder="배송시 요청사항(예:부재시 문 앞에 놓아주세요.)"></textarea>
							</div>
						</form>
					</div>
					<div class="col-lg-4">
						<div class="order_box">
							<h2>Your Order</h2>
							<ul class="list">
								<li><a>제품명 <span>가격</span></a></li>
								<li><a href="#">슈즈곤 신발 1 <span class="middle">x 01</span> <span class="last">150000</span></a></li>
							</ul>
							<ul class="list list_2">
								<li><a href="#">제품 가격 총합 <span>150000</span></a></li>
								<li><a href="#">배송비 <span>2500</span></a></li>
								<li><a href="#">전체가격 <span>150000</span></a></li>
							</ul>
							<div class="payment_item">
								<div class="radion_btn">
									<input type="radio" id="f-option5" name="selector">
									<label for="f-option5">Check payments</label>
									<div class="check"></div>
								</div>
								<p>
									Please send a check to Store Name, Store Street, Store
									Town, Store State / County, Store Postcode.
								</p>
							</div>
							<div class="payment_item active">
								<div class="radion_btn">
									<input type="radio" id="f-option6" name="payment" value="card" required>
									<label for="f-option6">Paypal </label>
									<img src="/Shoesgone/resources/img/product/card.jpg" alt="">
									<div class="check"></div>
								</div>
								<p>
									Pay via PayPal; you can pay with your credit card if you
									don’t have a PayPal account.
								</p>
							</div>
							<div class="creat_account">
								<input type="radio" id="f-option4" name="payment" value="account" required>
								<label for="f-option4"><a href="#">검수 기준</a>과 <a href="#">개인 정보 정책</a>에 동의합니다. </label>
							</div>
							<input type="submit" value="상품 등록하기"> &nbsp;
							<input type="reset" value="등록취소">
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- End body Area -->
	
	<%-- Footer --%>
	<%@ include file="../common/footer.jsp" %>
	
	<%-- JS --%>
	<script src="//d1p7wdleee1q2z.cloudfront.net/post/search.min.js"></script>
</body>
</html>