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
 * Servlet implementation class QuestionInsertServlet
 */
@WebServlet("/quinsert")
public class QuestionInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuestionInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 게시글 원글 등록 처리용 컨트롤러
		request.setCharacterEncoding("utf-8");
		
		RequestDispatcher view = null;
	

		// 5. 데이터베이스 board 테이블에 기록할 값 추출

		Question question = new Question();

		question.setQuestionTitle(request.getParameter("title"));
		question.setQuestionWriter(request.getParameter("writer"));
		question.setQuestionContent(request.getParameter("content"));



		// 6. 서비스 메소드로 전달하고 결과받기
		int result = new QuestionService().insertQuestion(question);

		// 7. 받은 결과로 성공/실패 페이지 내보내기
		if (result > 0) {
			response.sendRedirect("qulist?page=1");
		} else {
			view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", "새 게시 원글 등록 실패!");
			view.forward(request, response);
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
