/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.61
 * Generated at: 2021-07-16 09:29:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.model.vo.Member;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/common/footer.jsp", Long.valueOf(1625591806059L));
    _jspx_dependants.put("/views/common/menubar.jsp", Long.valueOf(1625635998753L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.model.vo.Member");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"views/common/error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	String str = null;
	//char ch = str.charAt(0);

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>first</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("div.lineA {\r\n");
      out.write("\theight: 100px;\r\n");
      out.write("\tborder: 1px solid gray;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\tleft: 120px;\r\n");
      out.write("\tmargin: 5px;\r\n");
      out.write("\tpadding: 5px;\r\n");
      out.write("}\r\n");
      out.write("div#banner {\r\n");
      out.write("\twidth: 500px;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("}\r\n");
      out.write("div#banner img {\r\n");
      out.write("\twidth: 450px;\r\n");
      out.write("\theight: 80px;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("}\r\n");
      out.write("div#loginBox {\r\n");
      out.write("\twidth: 274px;\r\n");
      out.write("\tfont-size: 10pt;\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("\tpadding-left: 20px;\r\n");
      out.write("}\r\n");
      out.write("div#loginBox button {\r\n");
      out.write("\twidth: 250px;\r\n");
      out.write("\theight: 35px;\r\n");
      out.write("\tbackground-color: navy;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\tmargin-top: 10px;\r\n");
      out.write("\tmargin-bottom: 15px;\r\n");
      out.write("\tfont-size: 14pt;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/first/resources/js/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function movePage(){\r\n");
      out.write("\tlocation.href = \"views/member/loginPage.html\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("$(function(){\r\n");
      out.write("\t//최근 등록된 공지글 3개 전송받아서 출력되게 함\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\turl: \"/first/ntop3\",\r\n");
      out.write("\t\ttype: \"get\",\r\n");
      out.write("\t\tdataType: \"json\",\r\n");
      out.write("\t\tsuccess: function(data){\r\n");
      out.write("\t\t\tconsole.log(\"success : \" + data);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//object --> string\r\n");
      out.write("\t\t\tvar str = JSON.stringify(data);\r\n");
      out.write("\t\t\t//string --> json \r\n");
      out.write("\t\t\tvar json = JSON.parse(str);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvalues = \"\";\r\n");
      out.write("\t\t\tfor(var i in json.list){\r\n");
      out.write("\t\t\t\tvalues += \"<tr><td>\" + json.list[i].no\r\n");
      out.write("\t\t\t\t\t\t+ \"</td><td><a href='/first/ndetail?noticeno=\"\r\n");
      out.write("\t\t\t\t\t\t+ json.list[1].no + \"'>\" \r\n");
      out.write("\t\t\t\t\t\t+ decodeURIComponent(json.list[i].title).replace(/\\+/gi, \" \")\r\n");
      out.write("\t\t\t\t\t\t+ \"</a></td><td>\" + json.list[i].date\r\n");
      out.write("\t\t\t\t\t\t+ \"</td></tr>\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$('#newnotice').html($('#newnotice').html() + values);\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\terror: function(jqXHR, textstatus, errorthrown){\r\n");
      out.write("\t\t\tconsole.log(\"error : \" + jqXHR + \", \" + textstatus\r\n");
      out.write("\t\t\t\t\t+ \", \" + errorthrown);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\t//ajax (notice top3)\r\n");
      out.write("\t\r\n");
      out.write("\t//조회수 많은 인기 게시글 상위 3개 조회 출력\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\turl: \"/first/btop3\",\r\n");
      out.write("\t\ttype : \"get\",\r\n");
      out.write("\t\tdataType : \"json\",\r\n");
      out.write("\t\tsuccess : function(data){\r\n");
      out.write("\t\t\tconsole.log(\"success : \" + data);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//object --> string\r\n");
      out.write("\t\t\tvar str = JSON.stringify(data);\r\n");
      out.write("\t\t\t//string --> json \r\n");
      out.write("\t\t\tvar json = JSON.parse(str);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvalues = \"\";\r\n");
      out.write("\t\t\tfor(var i in json.list){\r\n");
      out.write("\t\t\t\tvalues += \"<tr><td>\" + json.list[i].bnum\r\n");
      out.write("\t\t\t\t\t\t+ \"</td><td><a href='/first/bdetail?bnum=\" \r\n");
      out.write("\t\t\t\t\t\t\t\t+ json.list[i].bnum + \"'>\" \r\n");
      out.write("\t\t\t\t\t\t+ decodeURIComponent(json.list[i].btitle).replace(/\\+/gi, \" \")\r\n");
      out.write("\t\t\t\t\t\t+ \"</a></td><td>\" + json.list[i].rcount\r\n");
      out.write("\t\t\t\t\t\t+ \"</td></tr>\";\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$('#toplist').html($('#toplist').html() + values);\r\n");
      out.write("\t\t\t//$('#toplist').append(values);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\terror: function(jqXHR, textstatus, errorthrown){\r\n");
      out.write("\t\t\tconsole.log(\"error : \" + jqXHR + \", \" + textstatus\r\n");
      out.write("\t\t\t\t\t+ \", \" + errorthrown);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("});\t//document.ready\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header>\r\n");
      out.write("<h1>firstWebProject</h1>\r\n");
      out.write('\r');
      out.write('\n');

	//로그인 확인을 위해서 내장된 session 객체를 이용
	Member loginMember = (Member)session.getAttribute("loginMember");

      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title></title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("ul#menubar {\r\n");
      out.write("\tlist-style: none;\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\tleft: 150px;\r\n");
      out.write("\t/* top: -30px; */\r\n");
      out.write("}\r\n");
      out.write("ul#menubar li {\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\twidth: 120px;\r\n");
      out.write("\theight: 30px;\r\n");
      out.write("\tmargin-right: 5px;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("}\r\n");
      out.write("ul#menubar li a {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\twidth: 120px;\r\n");
      out.write("\theight: 30px;\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tbackground: orange;\r\n");
      out.write("\tcolor: navy;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\ttext-shadow: 1px 1px 2px white;\r\n");
      out.write("\tpadding-top: 5px;\r\n");
      out.write("}\r\n");
      out.write("ul#menubar li a:hover {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\twidth: 120px;\r\n");
      out.write("\theight: 30px;\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tbackground: navy;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\ttext-shadow: 1px 1px 2px navy;\r\n");
      out.write("\tpadding-top: 5px;\r\n");
      out.write("}\r\n");
      out.write("hr { clear: both; }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
 if(loginMember == null){ //로그인하지 않았을 때 
      out.write("\r\n");
      out.write("<ul id=\"menubar\">\r\n");
      out.write("\t<li><a href=\"/first/nlist\">공지사항</a></li>\r\n");
      out.write("\t<li><a href=\"#\">게시글</a></li>\r\n");
      out.write("\t<li><a href=\"#\">QnA</a></li>\r\n");
      out.write("\t<li><a href=\"#\">사진게시판</a></li>\r\n");
      out.write("\t<li><a href=\"/first/index.jsp\">홈</a></li>\r\n");
      out.write("</ul>\r\n");
 }else if(loginMember.getAdmin().equals("Y")){ //관리자가 로그인했을 때 
      out.write("\r\n");
      out.write("<ul id=\"menubar\">\r\n");
      out.write("\t<li><a href=\"/first/mlist\">회원관리</a></li>\r\n");
      out.write("\t<li><a href=\"/first/nlist.ad\">공지사항관리</a></li>\r\n");
      out.write("\t<li><a href=\"#\">게시글관리</a></li>\r\n");
      out.write("\t<li><a href=\"#\">사진게시판관리</a></li>\r\n");
      out.write("\t<li><a href=\"/first/index.jsp\">홈</a></li>\r\n");
      out.write("</ul>\r\n");
 }else { //일반 회원이 로그인했을 때 
      out.write("\r\n");
      out.write("<ul id=\"menubar\">\r\n");
      out.write("\t<li><a href=\"/first/nlist\">공지사항</a></li>\r\n");
      out.write("\t<li><a href=\"#\">게시글</a></li>\r\n");
      out.write("\t<li><a href=\"#\">QnA</a></li>\r\n");
      out.write("\t<li><a href=\"#\">암호화회원가입</a></li>\r\n");
      out.write("\t<li><a href=\"/first/index.jsp\">홈</a></li>\r\n");
      out.write("</ul>\r\n");
 } 
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<hr style=\"clear:both\">\r\n");
      out.write("<center>\r\n");
      out.write("\t<div id=\"banner\" class=\"lineA\">\r\n");
      out.write("\t\t<img src=\"resources/images/photo2.jpg\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
      out.write('\r');
      out.write('\n');
      out.write('	');
 if(loginMember == null){ 
      out.write("\r\n");
      out.write("\t<div id=\"loginBox\" class=\"lineA\">\r\n");
      out.write("\t\tfirst 사이트 방문을 환영합니다.<br>\r\n");
      out.write("\t\t<button onclick=\"movePage()\">로그인 하세요.</button>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<a>아이디/비밀번호 조회</a>\r\n");
      out.write("\t\t&nbsp; &nbsp;\r\n");
      out.write("\t\t<a href=\"views/member/enrollPage.html\">회원가입</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
 }else{ 
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write("\r\n");
      out.write("\t<div id=\"loginBox\" class=\"lineA\">\r\n");
      out.write("\t\t");
      out.print( loginMember.getUserName() );
      out.write(" 님.<br>\r\n");
      out.write("\t\t<button onclick=\"javascript:location.href='logout';\">로그아웃</button>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<a>쪽지</a> &nbsp; &nbsp; \t<a>메일</a>\r\n");
      out.write("\t\t&nbsp; &nbsp; \r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t<a href=\"/first/myinfo?userid=");
      out.print( loginMember.getUserId() );
      out.write("\">My Page</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write("</center>\r\n");
      out.write("</header>\r\n");
      out.write("<hr style=\"clear:both\">\r\n");
      out.write("<section>\r\n");
      out.write("<!-- 최근 등록된 공지글 3개 출력 : ajax -->\r\n");
      out.write("<div style=\"float:left; border:1px solid navy; padding:5px; margin:5px; margin-left:150px;\">\r\n");
      out.write("\t<h4>최신 공지사항</h4>\r\n");
      out.write("\t<table id=\"newnotice\" border=\"1\" cellspacing=\"0\">\r\n");
      out.write("\t\t<tr><th>번호</th><th>제목</th><th>날짜</th></tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- 조회수 많은 인기게시글 3개 출력 : ajax -->\r\n");
      out.write("<div style=\"float:left; border:1px solid navy; padding:5px; margin:5px;\">\r\n");
      out.write("\t<h4>인기 게시글</h4>\r\n");
      out.write("\t<table id=\"toplist\" border=\"1\" cellspacing=\"0\">\r\n");
      out.write("\t\t<tr><th>번호</th><th>제목</th><th>조회수</th></tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</div>\r\n");
      out.write("</section>\r\n");
      out.write("<hr style=\"clear:both;\">\r\n");
      out.write("<!-- html 주석태그 -->\r\n");
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title></title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("footer {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tbackground-color: navy;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<footer>\r\n");
      out.write("copyright@ict.org &nbsp; 자바,파이썬 기반 빅데이터 플랫폼 개발자 양성과정<br>\r\n");
      out.write("서울시 마포구 서교동 첨단빌딩 7층, TEL : 02-1234-5678, \r\n");
      out.write("FAX : 02-1234-5679\r\n");
      out.write("</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
