<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="point.model.vo.Point,loginPage.model.vo.Login, java.util.ArrayList"%>
   <% 

ArrayList<Point> list = (ArrayList<Point>)request.getAttribute("list");
 ArrayList<Point> pointlist = (ArrayList<Point>)request.getAttribute("pointlist");
Login loginMember = (Login)session.getAttribute("loginMember");
int listCount = ((Integer)request.getAttribute("listCount")).intValue();
int startPage = ((Integer)request.getAttribute("startPage")).intValue();
int endPage = ((Integer)request.getAttribute("endPage")).intValue();
int maxPage = ((Integer)request.getAttribute("maxPage")).intValue();
int currentPage = ((Integer)request.getAttribute("currentPage")).intValue();
	%>
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
	<title>포인트조회</title>
	<!--
            CSS
            ============================================= -->
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
	.point{
	text-align : center;

	}
	.page_wrap {
	text-align:center;
	font-size:0;
 }
.page_nation {
	display:inline-block;
}
.page_nation .none {
	display:none;
}
.page_nation a {
	display:block;
	margin:0 3px;
	float:left;
	border:1px solid #e6e6e6;
	width:28px;
	height:28px;
	line-height:28px;
	text-align:center;
	background-color:#fff;
	font-size:13px;
	color:#999999;
	text-decoration:none;
}
.page_nation .arrow {
	border:1px solid #ccc;
}
.page_nation .pprev {
	background:#f8f8f8 url('img/page_pprev.png') no-repeat center center;
	margin-left:0;
}
.page_nation .prev {
	background:#f8f8f8 url('img/page_prev.png') no-repeat center center;
	margin-right:7px;
}
.page_nation .next {
	background:#f8f8f8 url('img/page_next.png') no-repeat center center;
	margin-left:7px;
}
.page_nation .nnext {
	background:#f8f8f8 url('img/page_nnext.png') no-repeat center center;
	margin-right:0;
}
.page_nation a.active {
	background-color:#42454c;
	color:#fff;
	border:1px solid #42454c;
}
	</style>
</head>

<body>

	<!-- Start Header Area -->
	<%@ include file="../common/menubar.html" %>
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
	
	<!--================Contact Area =================-->
	<section>
	<% 
		int pointamount = 0;
	for(int i = 0; i < pointlist.size(); i++){ 
		
	pointamount +=  pointlist.get(i).getPoint();
	}%>
<div width="960px"><br><br><br>
<h2 align="center">포인트 조회</h2>
<hr width="960px" color="black">
<center>총 적립금 :<%= pointamount %> 원 </center>
<hr width="960px" color="black">
</div>
<div><table border="1" summary="적립 내역 목록 입니다" class="point" align="center">
<caption></caption>
    
        <colgroup >
<col width="15%">
<col width="15%">
<col width="25%">
<col width="auto">
</colgroup>
<thead><tr>
<th scope="col" width="100">주문날짜</th>
                <th scope="col" >적립금</th>
                <th scope="col">관련 주문</th>
                <th scope="col">적립내용</th>
            </tr></thead>
<tbody class="pointtable">
<%
							
						
							
						for(int i = 0; i < list.size(); i++){
					%>
<tr class="first xans-record-">
<td><%= list.get(i).getRegistDate() %></td>
<td class="mileage"><%= list.get(i).getPoint() %></td>
<td><a href="/Shoesgone/odetail?orderNo=<%= list.get(i).getOrderNo() %>""><%= list.get(i).getOrderNo() %></a></td>
<td><%= list.get(i).getHistory() %></td>
            </tr>
            
            <% }	%>
</tbody>

<!-- <tbody class="displaynone"><tr>
<td colspan="4" class="nodata">적립내역이 없습니다.</td>
            </tr></tbody> -->
            
</table>
 <%-- 페이징 처리 --%>
<div style="text-align:center;">
	<% if(currentPage <= 1){ %>
		[맨처음] &nbsp;
	<% }else{ %>
		<a href="/Shoesgone/plist?userNo=<%= loginMember.getUserNo() %>&page=1">[맨처음]</a> &nbsp;
	<% } %>
	<!-- 이전 페이지 그룹으로 이동 -->
	<% if((currentPage - 10) < startPage && 
			(currentPage - 10) > 1){ %>
		<a href="/Shoesgone/plist?userNo=<%= loginMember.getUserNo() %>&page=<%= startPage - 10 %>">[이전그룹]</a> &nbsp;
	<% }else{ %>
		[이전그룹] &nbsp;
	<% } %>
	
	<!-- 현재 페이지 그룹의 페이지 숫자 출력 -->
	<% for(int p = startPage; p <= endPage; p++){ 
			if(p == currentPage){
	%>
		 <font color="red" size="4"><b>[<%= p %>]</b></font>
		<% }else{ %>
			<a href="/Shoesgone/plist?userNo=<%= loginMember.getUserNo() %>&page=<%= p %>"><%= p %></a>
	<% }} %>
	
	<!-- 다음 페이지 그룹으로 이동 -->
	<% if((currentPage + 10) > endPage && 
			(currentPage + 10) < maxPage){ %>
		<a href="/Shoesgone/plist?userNo=<%= loginMember.getUserNo() %>&page=<%= endPage + 10 %>">[다음그룹]</a> &nbsp;
	<% }else{ %>
		[다음그룹] &nbsp;
	<% } %>
	
	<% if(currentPage >= maxPage){ %>
		[맨끝] &nbsp;
	<% }else{ %>
		<a href="/Shoesgone/plist?userNo=<%= loginMember.getUserNo() %>&page=<%= maxPage %>">[맨끝]</a> &nbsp;
	<% } %>
</div>
   
</div></div><hr><center><a href="/Shoesgone/contact.jsp" class="genric-btn primary">목록보기</a></center><br><br><br>
</section>
	<!--================Contact Area =================-->

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
							<li><img src="img/i1.jpg" alt=""></li>
							<li><img src="img/i2.jpg" alt=""></li>
							<li><img src="img/i3.jpg" alt=""></li>
							<li><img src="img/i4.jpg" alt=""></li>
							<li><img src="img/i5.jpg" alt=""></li>
							<li><img src="img/i6.jpg" alt=""></li>
							<li><img src="img/i7.jpg" alt=""></li>
							<li><img src="img/i8.jpg" alt=""></li>
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