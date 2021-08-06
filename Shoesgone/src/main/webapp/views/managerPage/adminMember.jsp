<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="information.model.vo.Information, java.util.ArrayList"
%>
<% 
	ArrayList<Information> users = (ArrayList<Information>) request.getAttribute("users");
%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>DataTable - Mazer Admin Dashboard</title>

<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Nunito:wght@300;400;600;700;800&display=swap" rel="stylesheet">
<link rel="stylesheet" href="/Shoesgone/resources/plugins/assets/css/bootstrap.css">

<link rel="stylesheet" href="/Shoesgone/resources/plugins/assets/vendors/simple-datatables/style.css">

<link rel="stylesheet" href="/Shoesgone/resources/plugins/assets/vendors/perfect-scrollbar/perfect-scrollbar.css">
<link rel="stylesheet" href="/Shoesgone/resources/plugins/assets/vendors/bootstrap-icons/bootstrap-icons.css">
<link rel="stylesheet" href="/Shoesgone/resources/plugins/assets/css/app.css">
<link rel="shortcut icon" href="/Shoesgone/resources/plugins/assets/images/favicon.svg" type="image/x-icon">


</head>

<body>
	<div id="app">
		<%@ include file="/views/managerPage/common/adminmenubar.jsp"%>
		<div id="main">
			<header class="mb-3">
				<a href="#" class="burger-btn d-block d-xl-none">
				<i class="bi bi-justify fs-3"></i>
				</a>
			</header>

			<div class="page-heading">
				<div class="page-title">
					<div class="row">
						<div class="col-12 col-md-6 order-md-1 order-last">
							<h3>회원현황</h3>
							<br>
						</div>
						<div class="col-12 col-md-6 order-md-2 order-first">
							<nav aria-label="breadcrumb" class="breadcrumb-header float-start float-lg-end">
								<ol class="breadcrumb">
									<li class="breadcrumb-item"><a href="index.html">Dashboard</a></li>
									<li class="breadcrumb-item active" aria-current="page">DataTable</li>
								</ol>
							</nav>
						</div>
					</div>
				</div>
				<section class="section">
					<div class="card">
						<div class="card-header" style="padding: unset; padding-top: 10px; padding-right: 35px;">
							<button type="button" class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#ItemADD" style="float: right;">회원추가</button>
							<div class="modal fade" id="ItemADD" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
								<div class="modal-dialog modal-dialog-centered modal-dialog-centered modal-dialog-scrollable" role="document">
									<div class="modal-content">
										<div class="modal-header">
											<h5 class="modal-title" id="ItemADDTitle">회원정보 수정</h5>
											<button type="button" class="close rounded-pill" data-bs-dismiss="modal" aria-label="Close" style="background: black;">
												<i data-feather="x"></i>
											</button>
										</div>
										<div class="modal-body">
											<form action="/Shoesgone/userinsert.ad" method="post" enctype="multipart/form-data">
												<div class="form-group">
													<label for="itemengname">영문명</label>
													<input type="text" class="form-control" name="itemengname" value="">
													<label for="itemkrname">국문명</label>
													<input type="text" class="form-control" name="itemkrname" value="">
													<label for="itembrand">브랜드</label>
													<input type="text" class="form-control" name="itembrand" value="">
													<label for="itemmodelno">모델 번호</label>
													<input type="text" class="form-control" id="ItemADDmodelno" name="itemmodelno" value="">
													<input type="button" class="btn btn-sm btn-outline-primary" value="중복체크" onclick="return dupmodelCheck();"><br>
													<label for="itemcolors">색상(,로만구분)</label>
													<input type="text" class="form-control" id="ItemADDcolors" name="itemcolors" value="">
													<label for="itemprice">가격(원)</label>
													<input type="number" class="form-control" name="itemprice" value="">
													<label for="itemdropdate">발매일자</label>
													<input type="date" class="form-control" name="itemdropdate" value="">
													<label for="itempictures">첨부파일</label>
													<input type="file" class="form-control" name="itempictures" value="" multiple>
													<h5 class="card-title" style="font-size: 1rem; color: rgba(35, 28, 99, .7);">사이즈</h5>
													<div class="card-content">
														<div class="card-body" id="shoessizes" style="padding: 0;">
															<ul class="list-unstyled mb-0">
																<% for(int k=0; k<25; k++){ %>
																<li class="d-inline-block me-2 mb-1">
																	<div class="form-check">
																		<div class="checkbox">
																			<input type="checkbox" name="shoessize"
																				class="form-check-input" value="<%= k*5 + 200 %>">
																			<label for="checkbox1"><%= k*5 + 200 %></label>
																		</div>
																	</div>
																</li>
																<% } %>
															</ul>
														</div>
													</div>
													<input type="submit" class="btn btn-primary ml-1" value="등록하기" style="float: right;">
													<input type="reset" class="btn btn-light-secondary" value="초기화" style="float: right; margin-right: 5px;"> <br>
												</div>
											</form>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="card-body">
							<table class="table table-striped" id="table1">
								<thead>
									<tr>
										<th>회원번호</th>
										<th>회원이름</th>
										<th>아이디</th>
										<th>주소</th>
										<th>관리자여부</th>
										<th>로그인여부</th>
										<th>수정하기</th>
									</tr>
								</thead>
								<tbody>
									<% for(Information i : users){ %>
									<tr>
										<td><%= i.getUserNo() %></td>
										<td><%= i.getUserName() %></td>
										<td><%= i.getUserId() %></td>
										<td><%= i.getAddress() %></td>
										<td><%= i.getMgr() %></td>
										<td><%= i.getLoginOk() %></td>
										<td>
											<button type="button" class="btn btn-secondary" data-bs-toggle="modal" data-bs-target="#exampleModalCenter<%= i.getUserNo() %>">수정하기</button>
											<div class="modal fade" id="exampleModalCenter<%= i.getUserNo() %>" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
												<div class="modal-dialog modal-dialog-centered modal-dialog-centered modal-dialog-scrollable" role="document">
													<div class="modal-content">
														<div class="modal-header">
															<h5 class="modal-title" id="exampleModalCenterTitle">회원정보수정</h5>
															<button type="button" class="close rounded-pill" data-bs-dismiss="modal" aria-label="Close" style="background: black;">
																<i data-feather="x"></i>
															</button>
														</div>
														<div class="modal-body">
															<form action="/Shoesgone/userupdate.ad" method="post">
																<div class="form-group">
																	<label for="userno">회원번호</label>
																	<input type="number" class="form-control" name="userno" value="<%= i.getUserNo() %>" readonly>
																	<label for="username">회원이름</label>
																	<input type="text" class="form-control" name="username" value="<%= i.getUserName() %>" readonly>
																	<label for="userid">ID</label>
																	<input type="text" class="form-control" name="userid" value="<%= i.getUserId() %>" readonly>
																	<label for="email">이메일</label>
																	<input type="email" class="form-control" name="email" value="<%= i.getEmail() %>" readonly>
																	<label for="phone">전화번호</label>
																	<input type="tel" class="form-control" name="phone" value="<%= i.getPhone() %>" readonly>
																	<label for="address">주소</label>
																	<input type="text" class="form-control" name="address" value="<%= i.getAddress() %>" readonly>
																	<label for="mrg">관리자 여부</label>
																	<input type="number" class="form-control" name="mrg" value="<%= i.getMgr() %>">
																	<label for="loginok">로그인 가능 여부</label>
																	<input type="text" class="form-control" name="loginok" value="<%= i.getLoginOk() %>">
																</div>
																<input type="submit" class="btn btn-primary ml-1" value="수정하기" style="float: right;">
																<input type="reset" class="btn btn-light-secondary" value="초기화" style="float: right; margin-right: 5px;">
																<br>
															</form>
														</div>
													</div>
												</div>
											</div>
										</td>
									</tr>
									<% } %>
								</tbody>
							</table>
						</div>
					</div>
				</section>
			</div>
			<%@ include file="/views/managerPage/common/adminfooter.jsp"%>
		</div>
	</div>
	<script src="/Shoesgone/resources/plugins/assets/vendors/perfect-scrollbar/perfect-scrollbar.min.js"></script>
	<script src="/Shoesgone/resources/plugins/assets/js/bootstrap.bundle.min.js"></script>

	<script src="/Shoesgone/resources/plugins/assets/vendors/simple-datatables/simple-datatables.js?after"></script>
	<script type="text/javascript" src="/Shoesgone/resources/js/jquery-3.6.0.min.js"></script>
	<script>
        // Simple Datatable
        let table1 = document.querySelector('#table1');
        let dataTable = new simpleDatatables.DataTable(table1);
    </script>
	<script type="text/javascript">
    function dupmodelCheck(){
    	//jQuery.ajax();
    	$.ajax({
    		url: "/Shoesgone/dupmodelno",
    		type: "post",
    		data: {modelno: $("#ItemADDmodelno").val()},
    		success: function(data){
    			console.log("success : " + data);
    			if(data == "ok"){
    				alert("등록가능합니다.");
    				$("#ItemADDcolors").focus();
    			}else{
    				alert("이미 사용중인 아이디입니다.");
    				$("#ItemADDmodelno").select();
    			}
    		},
    		error: function(jqXHR, textStatus, errorThrown){
    			console.log("error : " + jqXHR + ", " 
    					+ textStatus + ", " + errorThrown);
    			return false;
    		}
    	});
    }
    </script>
	<script src="/Shoesgone/resources/plugins/assets/js/main.js"></script>
</body>

</html>