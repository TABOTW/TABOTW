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
 * Servlet implementation class FreeReplyInsertServlet
 */
@WebServlet("/freereply")
public class FreeReplyInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FreeReplyInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 게시글 댓글 등록 처리용 컨트롤러
		//1.
		request.setCharacterEncoding("utf-8");
		
		//2.
		//댓글에 대한 원글 번호 추출
		int FreeNo = Integer.parseInt(request.getParameter("fNo"));
		int currentPage = Integer.parseInt(request.getParameter("page"));
		
		//댓글에 대한 값 추출해서 객체에 저장
		Free reply = new Free();
		
		reply.setFreeTitle(request.getParameter("title"));
		reply.setFreeWriter(request.getParameter("writer"));
		reply.setFreeContent(request.getParameter("content"));
		
		//원글 조회
		FreeService bservice = new FreeService();
		Free origin = bservice.selectFree(FreeNo);
		
		//댓글에 Free_level(댓글레벨), Free_ref (참조 원글번호)
		reply.setFreeLevel(origin.getFreeLevel() + 1);
		reply.setFreeRef(origin.getFreeRef());
		
		//Free_reply_ref (참조하는 댓글번호)
		//원글일 때 null, 원글의 댓글이면(level : 2) 자기번호,
		//댓글의 댓글이면(level : 3) 참조하는 댓글번호
		if(reply.getFreeLevel() == 3) {  //대댓글이면
			reply.setFreeReplyRef(origin.getFreeReplyRef());
		}
		
		//댓글의 순번 처리
		//최신 댓글이 무조건 1이 되게 함
		reply.setFreeReplySeq(1);
		//이전 댓글의 순번을 모두 1증가 처리함
		bservice.updateReplySeq(reply);  //update 로 1증가 처리
		
		//3.
		int result = bservice.insertReplyFree(reply);
		
		if(result > 0) {
			response.sendRedirect("/first/freelist?page=" + currentPage);
		}else {
			RequestDispatcher view = request.getRequestDispatcher(
					"views/common/error.jsp");
			request.setAttribute("message", 
					FreeNo + "번 게시글 댓글 등록 실패!");
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
