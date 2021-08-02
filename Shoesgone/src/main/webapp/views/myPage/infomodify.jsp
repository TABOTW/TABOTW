<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="information.model.vo.Information"%>
    
    <%
	Information information = (Information)request.getAttribute("information"); 
	

%>  
<!DOCTYPE html>
<html>

<head>
	<!-- meta character set -->
	<meta charset="UTF-8">
	<!-- Site Title -->
	<title>회원정보수정</title>

</head>

<body>

	<!-- Start Header Area -->

	<%@ include file="../common/menubar.jsp" %>

	<!-- End Header Area -->

	<!-- Start Banner Area -->
	<section class="banner-area organic-breadcrumb">
		<div class="container">
			<div class="breadcrumb-banner d-flex flex-wrap align-items-center justify-content-end">
				<div class="col-first">
					<h1>회원정보수정</h1>
					<nav class="d-flex align-items-center">
					</nav>
				</div>
			</div>
		</div>
	</section>
	
	<!--================Contact Area =================-->

	
	<section>
	<div><br><br><br>
	
	
<h2 align="center">회원정보수정</h2><br>
<hr>
<form id="iform" method="post" action="/Shoesgone/iupdate" onclick="">
<!-- 제출시(전송시 : submit 버튼 눌렀을 때)에 
유효성검사 실행되도록 함 
결과가 false 일 때 전송을 취소되게 해야 하므로 
return 함수명() 으로 실행해야 됨. 
onsubmit="return checkAll();"
-->

<table align="center" width="600">
<tr><th width="180">이름</th>
<td><input type="text" id="name" name="username" value="<%if(information.getUserName() != null){ %><%= information.getUserName() %><% }else{%><%}%>"></td></tr>
<tr><th width="180">아이디</th>
<td><input type="text" id="userid" name="userid" value="<%= information.getUserId() %>" readonly></td></tr>
<tr><th width="180">이메일</th>
<td><input type="email" id="email" name="email" value="<%if(information.getEmail() != null){ %><%= information.getEmail() %><% }else{%><%}%>" ></td></tr>
<tr><th width="180">*비밀번호</th>
<td><input type="password" id="userpwd" name="userpwd" size="30" placeholder="영문, 숫자, 특수문자 조합 8-16자" required><br>비밀번호를 입력하셔야 정보가 수정됩니다.</td></tr>
<tr><th width="180">휴대폰번호</th>
<td><input type="text" id="phone" name="phone" value="<%if(information.getPhone() != null){ %><%= information.getPhone() %><% }else{%><%}%>" ></td></tr>
<!-- input type="text" id="post" name="post" size="10" maxLength="5"> &nbsp; 
<input type="button" value="우편번호검색" onclick="return false;" class="genric-btn primary small"><br> -->
<tr><th width="180">우편번호</th>
					<td>
						<input type="text" name="address" class="postcodify_postcode5" size="6" value="<%if(information.getAddress() != null){ String[] address = information.getAddress().split(","); %><%= address[0] %><%}else{%> <%}%>">
						<button type="button" id="postcodify_search_button" " >검색</button>
					</td>
<tr>
					<th width="180">도로명주소</th>
					<td><input type="text" name="address" class="postcodify_address" value="<%if(information.getAddress() != null){ String[] address = information.getAddress().split(","); %><%= address[1] %><%}else{%> <%}%>"></td>
				</tr>
				<tr>
					<th width="180">상세주소</th>
					<td><input type="text" name="address" class="postcodify_extra_info" value="<%if(information.getAddress() != null){ String[] address = information.getAddress().split(","); %><%= address[2] %><%}else{%> <%}%>"></td>
				</tr>
				
							
					
					
					
					
					
					
<%-- <input type="text" name="address" id="address" size="50" value="<%if(information.getAddress() != null){ %><%= information.getAddress() %><% }else{%><%}%>"> --%>
<!-- <input type="text" name="address2" id="address" size="50"> -->
</td></tr>
<tr><th width="180">신발사이즈</th><td>
<select name="shoesize">
<option  value="<%= information.getShoesSize() %>" selected><%= information.getShoesSize() %></option>
<option value="215">215</option>
<option value="220">220</option>
<option value="225">225</option>
<option value="230">230</option>
<option value="235">235</option>
<option value="240">240</option>
<option value="245">245</option>
<option value="250">250</option>
<option value="255">255</option>
<option value="260">260</option>
<option value="265">265</option>
<option value="270">270</option>
<option value="275">275</option>
<option value="280">280</option>
<option value="285">285</option>
<option value="290">290</option>
<option value="295">295</option>
<option value="300">300</option>
<option value="305">305</option>
<option value="310">310</option>
<option value="315">315</option>
<option value="320">320</option>
</select>
</td></tr>
<tr><th width="180">은행명</th><td>
<select name="bankname">
<option  value="<%= information.getBankName() %>" selected disabled hidden>선택하세요</option>
  	<option value="기업은행">기업은행</option>
	<option value="국민은행">국민은행</option>
	<option value="외환은행">외환은행</option>
	<option value="수협">수협</option>
	<option value="농협">농협</option>
	<option value="우리은행">우리은행</option>
	<option value="제일은행">제일은행</option>
	<option value="씨티은행">씨티은행</option>
	<option value="대구은행">대구은행</option>
	<option value="부산은행">부산은행</option>
	<option value="광주은행">광주은행</option>
	<option value="제주은행">제주은행</option>
	<option value="전북은행">전북은행</option>
	<option value="경남은행">경남은행</option>
	<option value="새마을금고">새마을금고</option>
	<option value="신협">신협</option>
	<option value="우체국">우체국</option> 
	<option value="하나은행">하나은행</option>
	<option value="신한은행">신한은행</option>
 
</select>
</td></tr>
<tr><th width="180">계좌번호</th>
<td><input type="text" id="accountno" name="accountno" size="50" value="<%if(information.getAccountNo() != null){ %><%= information.getAccountNo() %><% }else{%><%}%>" ></td></tr>

<tr><th colspan="2">
<br><br>
	<center><input type="submit" value="수정하기" class="genric-btn primary small">&nbsp;
	<a href="/Shoesgone/contact.jsp" class="genric-btn primary small">목록보기</a></center>
</th></tr>
</table><hr><br><br><br>
</form>
</div>
</section>
	<!--================Contact Area =================-->

	<!-- start footer Area -->
	<%@ include file="../common/footer.jsp" %>
	<!-- End footer Area -->

<script src="/Shoesgone/resources/js/jquery-validation-1.19.3/dist/jquery.validate.min.js"></script>
<script>
	/*  검색 단추를 누르면 팝업 레이어가 열리도록 설정한다. */
	$(function(){
		$("#postcodify_search_button").postcodifyPopUp();
	});
</script>
<!-- 유효성검사 자바스크립트 -->
<script type="text/javascript">
	$("#iform").validate({
		rules: {
		    userpwd: {
		    	required : true,
		    	pw_regexp: true,
		    	minlength: 8,
		    	maxlength: 16
			}
		  },
		  messages: {
		   
		    userpwd: {
		    	required: "영문, 숫자, 특수문자를 조합하여 입력해주세요. (8-16자)",
		    	pw_regexp: "영문, 숫자, 특수문자를 조합하여 입력해주세요. (8-16자)",
		    	minlength: "영문, 숫자, 특수문자를 조합하여 입력해주세요. (8-16자)",
		    	maxlength: "영문, 숫자, 특수문자를 조합하여 입력해주세요. (8-16자)"
		    }
		  },
		  errorClass: "error-info"
	});
	
	// 비밀번호 유효성 검사
	$.validator.addMethod("pw_regexp",  function( value, element ) {
		return this.optional(element) ||  /^.*(?=.*\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*$/.test(value);
   });
</script>

</body>
</html>