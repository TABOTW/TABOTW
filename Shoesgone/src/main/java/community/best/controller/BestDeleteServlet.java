package community.best.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import community.best.model.service.BestService;

/**
 * Servlet implementation class BestDeleteServlet
 */
@WebServlet("/bestdelete")
public class BestDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BestDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 게시글(원글, 댓글, 대댓글) 삭제 처리용 컨트롤러
		
		int BestNo = Integer.parseInt(request.getParameter("bNo"));
		int BestLevel = Integer.parseInt(request.getParameter("level"));
		
		//서비스 메소드로 삭제 실행하고 결과받기		
		if(new BestService().deleteBest(BestNo, BestLevel) > 0) {
			//받은 결과가 성공일 때, 저장 폴더의 파일도 삭제 처리함
			String renameFileName = request.getParameter("rfile");
			if(renameFileName != null) {
				String savePath = request.getSession()
						.getServletContext().getRealPath(
								"/resources/community_upfiles/best");
				new File(savePath + "\\" + renameFileName).delete();
			}
			
			response.sendRedirect("/Shoesgone/bestlist?page=1");
		}else {
			RequestDispatcher view = request.getRequestDispatcher(
					"views/common/error.jsp");
			request.setAttribute("message", BestNo + "번 글 삭제 실패.");
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
