package loginPage.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import loginPage.model.service.LoginService;
import loginPage.model.vo.Login;

/**
 * Servlet implementation class NaverLoginServlet
 */
@WebServlet("/naverlogin")
public class NaverLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public NaverLoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1. 전송온 값에 한글이 있다면 인코딩 처리함
		request.setCharacterEncoding("utf-8");
		// 2. 전송온 값 꺼내서, 변수 또는 객체에 기록하기
		// String 변수 = request.getParameter("input의 이름");
		String userid = request.getParameter("requestValue");
		//String userpwd = request.getParameter("userpwd");
		// System.out.println(userid + ", " + userpwd);
		System.out.println(userid);
		// 웹에서는 단방향 알고리즘 적용 : SHA-512
		// 단방향 : 암호화만 하고, 복호화가 안되는 알고리즘
		// java.security.MessageDigest 클래스 이용함
		//String cryptoUserpwd = null;

//		try {
//			MessageDigest md = MessageDigest.getInstance("SHA-512");
//			// 패스워드 문자열을 암호문으로 바꾸려면, byte[]로 변환해야 함
//			byte[] pwdValues = userpwd.getBytes(Charset.forName("UTF-8"));
//			// 암호문으로 바꾸기
//			md.update(pwdValues);
//			// 암호화된 byte[]을 String으로 바꿈 : 암호문 상태임
//			cryptoUserpwd = Base64.getEncoder().encodeToString(pwdValues);
//			// 확인
//			System.out.println(cryptoUserpwd);
//			System.out.println(cryptoUserpwd.length());
//		} catch (NoSuchAlgorithmException e) {
//			e.printStackTrace();
//		}

		Login login = new LoginService().selectNaverLogin(userid);

		// 4. 받은 결과에 따라 성공/실패 페이지 내보내기
		if (login != null && login.getLoginOk().equals("Y")) { // 로그인 성공
			// 로그인 확인용 객체 생성함
			HttpSession session = request.getSession();
			System.out.println("생성된 세션 객체의 id : " + session.getId());

			// 로그인한 회원의 정보는 세션객체에 저장함
			session.setAttribute("loginMember", login);

			// 로그인 성공시 내보낼 페이지 지정
			response.sendRedirect("index.jsp");

		} else { // 로그인 실패
			response.setContentType("text/html; charset=UTF-8");
			
			PrintWriter out = response.getWriter();
			
			if (login != null && login.getLoginOk().equals("N")) {
				out.println(
						"<script>alert('로그인 제한된 회원입니다. 관리자에게 문의하세요.'); location.href='/Shoesgone/views/loginPage/login.jsp';</script>");
			}

			if (login == null) {
				out.println(
						"<script>alert('로그인 실패! 아이디 또는 암호를 다시 확인하고 로그인하세요.'); location.href='/Shoesgone/views/loginPage/login.jsp';</script>");
			}

			out.flush();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
