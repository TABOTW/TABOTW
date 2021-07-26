package loginPage.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import loginPage.model.service.LoginService;
import loginPage.model.vo.Login;

/**
 * Servlet implementation class SearchIdServlet
 */
@WebServlet("/searchid")
public class SearchIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchIdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 전송온 값에 한글이 있다면 인코딩 처리함
		request.setCharacterEncoding("utf-8");

		// 2. 전송온 값 꺼내서, 변수 또는 객체에 기록하기
		// String 변수 = request.getParameter("input의 이름");
		String phone = request.getParameter("phone");
		// System.out.println(userid + ", " + userpwd);

		// 3. 서비스 메소드로 전달해서 실행하고 결과받기
		// Member member = new MemberService().selectLogin(userid, userpwd);
		Login login = new LoginService().selectPhone(phone);

		// 4. 받은 결과에 따라 성공/실패 페이지 내보내기
		if (login != null) { // 로그인 성공
			HttpSession session = request.getSession();
			
			session.setAttribute("loginMember", login);
			
			response.sendRedirect("/Shoesgone/views/loginPage/resultId.jsp");

		} else { // 로그인 실패
			response.setContentType("text/html; charset=UTF-8");

			PrintWriter out = response.getWriter();

			out.println(
						"<script>alert('일치하는 사용자 정보를 찾을 수 없습니다.'); location.href='/Shoesgone/views/loginPage/searchId.jsp';</script>");

			out.flush();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
