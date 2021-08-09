/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.61
 * Generated at: 2021-07-16 09:31:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import board.model.vo.Board;
import member.model.vo.Member;

public final class boardDetailView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/board/../common/footer.jsp", Long.valueOf(1625591806059L));
    _jspx_dependants.put("/views/board/../common/menubar.jsp", Long.valueOf(1625635998753L));
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
    _jspx_imports_classes.add("board.model.vo.Board");
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

      out.write('\r');
      out.write('\n');

	Board board = (Board)request.getAttribute("board");
	int currentPage = ((Integer)request.getAttribute("currentPage")).intValue();

      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>first</title>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function moveUpdateView(){\r\n");
      out.write("\tlocation.href = \"/first/bupview?bnum=");
      out.print( board.getBoardNum() );
      out.write("&page=");
      out.print( currentPage );
      out.write("\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function requestDelete(){\r\n");
      out.write("\tlocation.href = \"/first/bdelete?bnum=");
      out.print( board.getBoardNum() );
      out.write("&level=");
      out.print( board.getBoardLevel() );
      out.write("&rfile=");
      out.print( board.getBoardRenameFilename() );
      out.write("\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function requestReply(){\r\n");
      out.write("\tlocation.href = \"/first/views/board/boardReplyForm.jsp?bnum=");
      out.print( board.getBoardNum() );
      out.write("&page=");
      out.print( currentPage );
      out.write("\";\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
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
      out.write("<hr>\r\n");
      out.write("<h1 align=\"center\">");
      out.print( board.getBoardNum() );
      out.write("번 게시글 상세보기</h1>\r\n");
      out.write("<br>\r\n");
      out.write("<table align=\"center\" width=\"500\" border=\"1\" cellspacing=\"0\" \r\n");
      out.write("cellpadding=\"5\">\r\n");
      out.write("<tr><th width=\"120\">제 목</th>\r\n");
      out.write("<td>");
      out.print( board.getBoardTitle() );
      out.write("</td></tr>\r\n");
      out.write("<tr><th>작성자</th><td>");
      out.print( board.getBoardWriter() );
      out.write("</td></tr>\r\n");
      out.write("<tr><th>등록날짜</th><td>");
      out.print( board.getBoardDate() );
      out.write("</td></tr>\r\n");
      out.write("<tr><th>첨부파일</th>\r\n");
      out.write("<td>\r\n");
      out.write("\t");
 if(board.getBoardOriginalFilename() != null){ 
      out.write("\r\n");
      out.write("\t\t<a href=\"/first/bfdown?ofile=");
      out.print( board.getBoardOriginalFilename() );
      out.write("&rfile=");
      out.print( board.getBoardRenameFilename() );
      out.write("\">\r\n");
      out.write("\t\t");
      out.print( board.getBoardOriginalFilename() );
      out.write("</a>\r\n");
      out.write("\t\r\n");
      out.write("\t");
 }else{ 
      out.write("\r\n");
      out.write("\t\t&nbsp;\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr><th>내 용</th><td>");
      out.print( board.getBoardContent() );
      out.write("</td></tr>\r\n");
      out.write("<tr><th colspan=\"2\">\r\n");
      out.write("\t");
      out.write('\r');
      out.write('\n');
      out.write('	');
 if(loginMember != null){ 
			if(loginMember.getUserId().equals(board.getBoardWriter())){
      out.write("\r\n");
      out.write("\t\t<button onclick=\"moveUpdateView(); return false;\">수정페이지로 이동</button> &nbsp;\r\n");
      out.write("\t\t<button onclick=\"requestDelete(); return false;\">글삭제</button>  &nbsp;\r\n");
      out.write("\t\t");
 }else if(loginMember.getAdmin().equals("Y")){ 
      out.write("\r\n");
      out.write("\t\t\t<button onclick=\"requestDelete(); return false;\">글삭제</button> &nbsp;\r\n");
      out.write("\t\t\t<button onclick=\"requestReply(); return false;\">댓글달기</button> &nbsp;\r\n");
      out.write("\t\t");
 }else{ //로그인했는데 본인글이 아닐 때 
      out.write("\r\n");
      out.write("\t\t\t<button onclick=\"requestReply(); return false;\">댓글달기</button>\r\n");
      out.write("\t");
 }} 
      out.write(" &nbsp;\r\n");
      out.write("\t<button onclick=\"javascript:location.href='/first/blist?page=");
      out.print( currentPage );
      out.write("';\">목록</button>\r\n");
      out.write("</th></tr>\r\n");
      out.write("</table>\r\n");
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
      out.write("</html>");
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
