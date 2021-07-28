package loginPage.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import loginPage.model.service.LoginService;
import loginPage.model.vo.Login;

/**
 * Servlet implementation class SearchPasswordServlet
 */
@WebServlet("/searchpwd")
public class SearchPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchPasswordServlet() {
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
		String email = request.getParameter("email");
		// System.out.println(userid + ", " + userpwd);

		// 3. 서비스 메소드로 전달해서 실행하고 결과받기
		// Member member = new MemberService().selectLogin(userid, userpwd);
		Login login = new LoginService().searchPassword(phone, email);

		// 4. 받은 결과에 따라 성공/실패 페이지 내보내기
		if (login != null) { // 로그인 성공
			HttpSession session = request.getSession();
			
			new LoginService().tempPassword(getRandomPassword(), phone, email);
			
			login = new LoginService().searchPassword(phone, email);
			session.setAttribute("loginMember", login);
			
			String userpwd = login.getUserPwd();
			String cryptoUserpwd = null;

			try {
				MessageDigest md = MessageDigest.getInstance("SHA-512");
				// 패스워드 문자열을 암호문으로 바꾸려면, byte[]로 변환해야 함
				byte[] pwdValues = userpwd.getBytes(Charset.forName("UTF-8"));
				// 암호문으로 바꾸기
				md.update(pwdValues);
				// 암호화된 byte[]을 String으로 바꿈 : 암호문 상태임
				cryptoUserpwd = Base64.getEncoder().encodeToString(pwdValues);
				// 확인
				System.out.println(cryptoUserpwd);
				System.out.println(cryptoUserpwd.length());
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}
			Login newLogin = new Login();

			newLogin.setUserPwd(login.getUserPwd());
			
			new LoginService().updateLogin(newLogin, cryptoUserpwd);
			
			response.sendRedirect("/Shoesgone/views/loginPage/resultPassword.jsp");

		} else { // 로그인 실패
			response.setContentType("text/html; charset=UTF-8");

			PrintWriter out = response.getWriter();

			out.println(
					"<script>alert('일치하는 사용자 정보를 찾을 수 없습니다.'); location.href='/Shoesgone/views/loginPage/searchPassword.jsp';</script>");

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

	public String getRandomPassword() {
		char[] charSet = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F',
				'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a',
				'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
				'w', 'x', 'y', 'z', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+' };
		StringBuffer sb = new StringBuffer();
		SecureRandom sr = new SecureRandom();
		sr.setSeed(new Date().getTime());

		int idx = 0;
		int len = charSet.length;
		for (int i = 0; i < 10; i++) {
			// idx = (int) (len * Math.random());
			idx = sr.nextInt(len); // 강력한 난수를 발생시키기 위해 SecureRandom을 사용한다.
			sb.append(charSet[idx]);
		}
		return sb.toString();
	}
}
