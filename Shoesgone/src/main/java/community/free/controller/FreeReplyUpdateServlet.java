package community.free.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import community.free.model.service.FreeService;
import community.free.model.vo.Free;

/**
 * Servlet implementation class FreeReplyUpdateServlet
 */
@WebServlet("/Freereplyupdate")
public class FreeReplyUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FreeReplyUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 게시글 댓글/대댓글 수정 처리용 컨트롤러
		
		request.setCharacterEncoding("utf-8");
		
		Free reply = new Free();
		reply.setFreeNum(Integer.parseInt(
				request.getParameter("bnum")));
		reply.setFreeTitle(request.getParameter("title"));
		reply.setFreeContent(request.getParameter("content"));
		
		int currentPage = Integer.parseInt(request.getParameter("page"));
		
		int result = new FreeService().updateReply(reply);
				
		if (result > 0) {
			//수정 성공시 목록 보기의 해당 페이지 출력 요청
			//response.sendRedirect("blist?page=" + currentPage);
			
			//수정 성공시 해당 글의 상세보기 페이지 출력 요청
			response.sendRedirect("bdetail?bnum=" 
						+ reply.getFreeNum()+ "&page="
						+ currentPage);
			
		} else {
			RequestDispatcher view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", 
					reply.getFreeNum() + "번 게시 원글 수정 실패!");
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
