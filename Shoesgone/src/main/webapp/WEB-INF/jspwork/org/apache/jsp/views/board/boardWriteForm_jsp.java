/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.66
 * Generated at: 2021-07-12 01:19:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.model.vo.Member;

public final class boardWriteForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/board/../common/footer.jsp", Long.valueOf(1624868850178L));
    _jspx_dependants.put("/views/board/../common/menubar.jsp", Long.valueOf(1626052207533L));
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
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>first</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
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
      out.write("	list-style: none;\r\n");
      out.write("	position: relative;\r\n");
      out.write("	left: 150px;\r\n");
      out.write("	/* top: -30px; */\r\n");
      out.write("}\r\n");
      out.write("ul#menubar li {\r\n");
      out.write("	float: left;\r\n");
      out.write("	width: 120px;\r\n");
      out.write("	height: 30px;\r\n");
      out.write("	margin-right: 5px;\r\n");
      out.write("	padding: 0;\r\n");
      out.write("}\r\n");
      out.write("ul#menubar li a {\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	width: 120px;\r\n");
      out.write("	height: 30px;\r\n");
      out.write("	display: block;\r\n");
      out.write("	background: orange;\r\n");
      out.write("	color: navy;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	margin: 0;\r\n");
      out.write("	text-shadow: 1px 1px 2px white;\r\n");
      out.write("	padding-top: 5px;\r\n");
      out.write("}\r\n");
      out.write("ul#menubar li a:hover {\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	width: 120px;\r\n");
      out.write("	height: 30px;\r\n");
      out.write("	display: block;\r\n");
      out.write("	background: navy;\r\n");
      out.write("	color: white;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	margin: 0;\r\n");
      out.write("	text-shadow: 1px 1px 2px navy;\r\n");
      out.write("	padding-top: 5px;\r\n");
      out.write("}\r\n");
      out.write("hr { clear: both; }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
 if(loginMember == null){ //로그인하지 않았을 때 
      out.write("\r\n");
      out.write("<ul id=\"menubar\">\r\n");
      out.write("	<li><a href=\"/first/nlist\">공지사항</a></li>\r\n");
      out.write("	<li><a href=\"/first/blist?page=1\">게시글</a></li>\r\n");
      out.write("	<li><a href=\"#\">QnA</a></li>\r\n");
      out.write("	<li><a href=\"#\">사진게시판</a></li>\r\n");
      out.write("	<li><a href=\"/first/index.jsp\">홈</a></li>\r\n");
      out.write("</ul>\r\n");
 }else if(loginMember.getAdmin().equals("Y")){ //관리자가 로그인했을 때 
      out.write("\r\n");
      out.write("<ul id=\"menubar\">\r\n");
      out.write("	<li><a href=\"/first/mlist\">회원관리</a></li>\r\n");
      out.write("	<li><a href=\"/first/nlist.ad\">공지사항관리</a></li>\r\n");
      out.write("	<li><a href=\"/first/blist?page=1\">게시글관리</a></li>\r\n");
      out.write("	<li><a href=\"#\">사진게시판관리</a></li>\r\n");
      out.write("	<li><a href=\"/first/index.jsp\">홈</a></li>\r\n");
      out.write("</ul>\r\n");
 }else { //일반 회원이 로그인했을 때 
      out.write("\r\n");
      out.write("<ul id=\"menubar\">\r\n");
      out.write("	<li><a href=\"/first/nlist\">공지사항</a></li>\r\n");
      out.write("	<li><a href=\"/first/blist?page=1\">게시글</a></li>\r\n");
      out.write("	<li><a href=\"#\">QnA</a></li>\r\n");
      out.write("	<li><a href=\"#\">암호화회원가입</a></li>\r\n");
      out.write("	<li><a href=\"/first/index.jsp\">홈</a></li>\r\n");
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
      out.write("<hr>\r\n");
      out.write("<h1 align=\"center\">게시 원글 등록 페이지</h1>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<!-- form 에서 입력값들과 파일을 함께 전송하려면\r\n");
      out.write("반드시 속성을 추가해야 함 : enctype=\"multipart/form-data\" -->\r\n");
      out.write("<form action=\"/first/binsert\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("<table align=\"center\" width=\"500\" border=\"1\" cellspacing=\"0\" cellpadding=\"5\">\r\n");
      out.write("<tr><th>제 목</th><td><input type=\"text\" name=\"title\" size=\"50\"></td></tr>\r\n");
      out.write("<tr><th>작성자</th>\r\n");
      out.write("	<td><input type=\"text\" name=\"writer\" readonly \r\n");
      out.write("		value=\"");
      out.print( loginMember.getUserId() );
      out.write("\"></td></tr>\r\n");
      out.write("<tr><th>첨부파일</th><td><input type=\"file\" name=\"upfile\"></td></tr>\r\n");
      out.write("<tr><th>내 용</th>\r\n");
      out.write("	<td><textarea rows=\"5\" cols=\"50\" name=\"content\"></textarea></td></tr>\r\n");
      out.write("<tr><th colspan=\"2\">\r\n");
      out.write("	<input type=\"submit\" value=\"등록하기\"> &nbsp; \r\n");
      out.write("	<input type=\"reset\" value=\"작성취소\"> &nbsp;\r\n");
      out.write("	<input type=\"button\" value=\"목록\" \r\n");
      out.write("		onclick=\"javascript:location.href='/first/blist?page=1'; return false;\">\r\n");
      out.write("</th></tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<hr>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title></title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("footer {\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	background-color: navy;\r\n");
      out.write("	color: white;\r\n");
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
