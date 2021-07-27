package loginPage.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import loginPage.model.service.LoginService;
import loginPage.model.vo.Login;




@WebServlet("/kakaologin")
public class KakaoLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		// 2. 인증코드 받기 
		String code = request.getParameter("code");
		System.out.println("code : " + code);
		
		// 3. 토큰 받기(인증코드를 이용해야 됨)
		String reqURL = "https://kauth.kakao.com/oauth/token";
		try {
			URL url = new URL(reqURL);
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			// POST 요청이므로 
			conn.setRequestMethod("POST");
			conn.setDoOutput(true);
			
			// 필수 파라미터값 보내기 
			BufferedWriter bw = 
					new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
			StringBuffer sb = new StringBuffer();
			sb.append("grant_type=authorization_code");
			sb.append("&client_id=999b3da31dfc63667c43a9de93bdc59d");
			sb.append("&redirect_uri=http://localhost:8080/Shoesgone/kakaologin");
			sb.append("&code="+code);
			bw.write(sb.toString());
			bw.flush();
			
			// 인증코드로 토큰 요청이 성공적으로 끝나며  redirect_uri로 토큰을 받을 수 있다.
			int responseCode = conn.getResponseCode();
			// System.out.println(responseCode);
			
			// 받은 코드 읽기
			BufferedReader br =
					new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line = "";
			StringBuffer sb2 = new StringBuffer();
			while((line=br.readLine())!=null) {
				sb2.append(line);
			}
			br.close();
			bw.close();
						
					
			// 받은 정보가 JSON 이므로 json-sample-1.1.1.jar를 다운받아서 파싱하자 
			JSONParser parser = new JSONParser();
			Object obj = parser.parse(sb2.toString());
			JSONObject j_obj = (JSONObject)obj;
			
			String access_token = (String) j_obj.get("access_token");
			
			// MyMember에서 사용하기 위해서  session에 저장
			request.getSession().setAttribute("access_token", access_token);
			response.sendRedirect("/Shoesgone/index.jsp");
			
			Login login = new Login();
			
			HttpSession session = request.getSession();
			
			session.setAttribute("loginMember", login);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	
	}
}









