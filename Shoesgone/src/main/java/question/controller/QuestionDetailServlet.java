package question.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import question.model.service.QuestionService;
import question.model.vo.Question;

/**
 * Servlet implementation class QuestionDetailServlet
 */
@WebServlet("/qudetail")
public class QuestionDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public QuestionDetailServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int questionNo = Integer.parseInt(request.getParameter("qnum"));

		// 페이징 처리를 위한 목록 페이지 변수
		int currentPage = 1;
		if (request.getParameter("page") != null) {
			currentPage = Integer.parseInt(request.getParameter("page"));
		}

		// 서비스 객체 메소드 실행하고 결과받기
		QuestionService qservice = new QuestionService();

		// 해당 글에 대한 조회수 1증가 : update
		qservice.updateReadCount(questionNo);

		// 해당 게시글 리턴 받음 : select
		Question question = qservice.selectOne(questionNo);

		RequestDispatcher view = null;
		if (question != null) {
			view = request.getRequestDispatcher("views/customerservicePage/questionDetailView.jsp");
			request.setAttribute("question", question);
			request.setAttribute("currentPage", currentPage);
			view.forward(request, response);
		} else {
			view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", questionNo + "번 공지글 상세조회 실패!");
			view.forward(request, response);
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
