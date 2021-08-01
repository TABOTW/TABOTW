<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="orderlist.model.vo.Orderlist,loginPage.model.vo.Login, java.util.ArrayList"%>
<% 

ArrayList<Orderlist> list = (ArrayList<Orderlist>)request.getAttribute("list");
Orderlist orderlist = (Orderlist)request.getAttribute("orderlist");
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
	<title>주문내역조회</title>
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
.th{
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
	<section><br><br><br>
<div module="Myshop_OrderOldHistoryList">
    <!--@css(/css/module/myshop/orderOldHistoryList.css)-->
    <!--
        $login_url = /member/login.html
    -->
    <div class="title">
        <h2 align="center">주문내역조회</h2><hr><br>
    </div>
    <table class="th" border="1" summary="" align="center">
        <caption></caption>
        <thead>
            <tr>
                <th scope="col" class="number" width="80px">상품주문번호</th>
                <th scope="col" class="product" width="400px">상품정보</th>
                <th scope="col" class="price" width="120px">상품금액(수량)</th>
                <th scope="col" class="deliveryprice" width="80px">배송비</th>
                <th scope="col" class="state" width="80px">진행상태</th>
            </tr>
        </thead>
        <tbody class="{$list_display|display}">
            <%
							
            	
					
						for(int i = 0; i < list.size(); i++){
							
					%>
					
								<tr>
								 <td style = "text-align:center"><a href="/Shoesgone/odetail?orderNo=<%= list.get(i).getOrdersNo() %>"><%= list.get(i).getOrdersNo() %></a></td>
								 <td style = "text-align:center"><%= list.get(i).getItemEngName() %><br><%= list.get(i).getItemKrName() %>&nbsp;(size: <%= list.get(i).getShoesSize() %>)</td>
								 <td style = "text-align:center"><%= list.get(i).getPrice() %>(<%= list.get(i).getCount() %>)</td>
								 <td style = "text-align:center"><%= list.get(i).getDelFee() %></td>
								 <td style = "text-align:center"><%= list.get(i).getProgress() %></td> 
								
								</tr>
								<% }%>
								
        </tbody>
    </table>
  <div style="text-align:center;">
	<% if(currentPage <= 1){ %>
		[맨처음] &nbsp;
	<% }else{ %>
		<a href="/Shoesgone/olist?userNo=<%= loginMember.getUserNo() %>&page=1">[맨처음]</a> &nbsp;
	<% } %>
	<!-- 이전 페이지 그룹으로 이동 -->
	<% if((currentPage - 10) < startPage && 
			(currentPage - 10) > 1){ %>
		<a href="/Shoesgone/olist?userNo=<%= loginMember.getUserNo() %>&page=<%= startPage - 10 %>">[이전그룹]</a> &nbsp;
	<% }else{ %>
		[이전그룹] &nbsp;
	<% } %>
	
	<!-- 현재 페이지 그룹의 페이지 숫자 출력 -->
	<% for(int p = startPage; p <= endPage; p++){ 
			if(p == currentPage){
	%>
		 <font color="red" size="4"><b>[<%= p %>]</b></font>
		<% }else{ %>
			<a href="/Shoesgone/olist?userNo=<%= loginMember.getUserNo() %>&page=<%= p %>"><%= p %></a>
	<% }} %>
	
	<!-- 다음 페이지 그룹으로 이동 -->
	<% if((currentPage + 10) > endPage && 
			(currentPage + 10) < maxPage){ %>
		<a href="/Shoesgone/olist?userNo=<%= loginMember.getUserNo() %>&page=<%= endPage + 10 %>">[다음그룹]</a> &nbsp;
	<% }else{ %>
		[다음그룹] &nbsp;
	<% } %>
	
	<% if(currentPage >= maxPage){ %>
		[맨끝] &nbsp;
	<% }else{ %>
		<a href="/Shoesgone/olist?userNo=<%= loginMember.getUserNo() %>&page=<%= maxPage %>">[맨끝]</a> &nbsp;
	<% } %>
</div>
<center><a href="/Shoesgone/contact.jsp" class="genric-btn primary">목록보기</a></center>
<hr>
    <br><br><br>
</div>
</section>
	<!--================Contact Area =================-->

	<!-- start footer Area -->
		<%@ include file="../common/footer.html" %>
	
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


</body>
</html>