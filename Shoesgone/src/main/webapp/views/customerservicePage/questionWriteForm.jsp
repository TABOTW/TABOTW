<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
<!-- meta character set -->
<meta charset="UTF-8">
<!-- Site Title -->
<title>주문상세보기</title>

<style type="text/css">
.orderdetail {
	align: center;
}

.th {
	text-align: center;
}

.page_wrap {
	text-align: center;
	font-size: 0;
}

.page_nation {
	display: inline-block;
}

.page_nation .none {
	display: none;
}

.page_nation a {
	display: block;
	margin: 0 3px;
	float: left;
	border: 1px solid #e6e6e6;
	width: 28px;
	height: 28px;
	line-height: 28px;
	text-align: center;
	background-color: #fff;
	font-size: 13px;
	color: #999999;
	text-decoration: none;
}

.page_nation .arrow {
	border: 1px solid #ccc;
}

.page_nation .pprev {
	background: #f8f8f8 url('img/page_pprev.png') no-repeat center center;
	margin-left: 0;
}

.page_nation .prev {
	background: #f8f8f8 url('img/page_prev.png') no-repeat center center;
	margin-right: 7px;
}

.page_nation .next {
	background: #f8f8f8 url('img/page_next.png') no-repeat center center;
	margin-left: 7px;
}

.page_nation .nnext {
	background: #f8f8f8 url('img/page_nnext.png') no-repeat center center;
	margin-right: 0;
}

.page_nation a.active {
	background-color: #42454c;
	color: #fff;
	border: 1px solid #42454c;
}
</style>

</head>

<body>

	<!-- Start Header Area -->
	<%@ include file="../common/menubar.jsp" %>
	<!-- End Header Area -->

	<!-- Start Banner Area -->
	<section class="banner-area organic-breadcrumb">
		<div class="container">
			<div
				class="breadcrumb-banner d-flex flex-wrap align-items-center justify-content-end">
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
		<br>
		<br>
		<br>
		<article>

			<div class="container" role="main">

				<h2>1:1문의</h2>

				<div class="row">
					<form action="/Shoesgone/quinsert" method="post">
						<table class="table table-striped"
							style="text-align: center; border: 1px solid #dddddd; width: 1000px;">

							<thead>
								<tr>
									<th colspan="2"
										style="background-color: #eeeeee; text-align: center;">게시판
										글쓰기 양식</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td><input type="text" class="form-control"
										placeholder="글 제목" name="title" maxlength="50"
										style="width: 950px;"></td>
								</tr>
								<tr>
									
									<td><input type="text" class="form-control" name="writer" style="width: 950px;" readonly
										value="<%= loginMember.getUserId() %>"></td>
								</tr>
								<tr>
									<td><textarea class="form-control" placeholder="글 내용"
											name="content" maxlength="2048"
											style="width: 950px; height: 350px;"></textarea></td>
								</tr>
							</tbody>
						</table>
						<!-- 글쓰기 버튼 생성 -->
						<center>
							<input type="submit" value="등록하기"
								class="genric-btn primary small"> &nbsp; <input
								type="reset" value="작성취소" class="genric-btn primary small">
							&nbsp; <input type="button" value="목록"
								class="genric-btn primary small"
								onclick="javascript:location.href='/Shoesgone/qulist?page=1'; return false;">
						</center>
					</form>
				</div>

			</div>






			<div></div>
			<br>
			<br>
			<br>

			</div>

		</article>



	</section>
	<!--================Contact Area =================-->

	<!-- start footer Area -->
		<%@ include file="../common/footer.jsp" %>
	<!-- End footer Area -->

</body>

</html>