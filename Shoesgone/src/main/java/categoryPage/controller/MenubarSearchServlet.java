package categoryPage.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import categoryPage.model.service.ItemPictureService;
import categoryPage.model.vo.ItemPicture;

/**
 * Servlet implementation class MenubarSearchServlet
 */
@WebServlet("/menubarsearch")
public class MenubarSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MenubarSearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String menu = request.getParameter("menu");
		ArrayList<ItemPicture> search = new ItemPictureService().selectLookupList();
		
		if (menu == null) {
			menu = "main";
		}
		
		RequestDispatcher view = null;
		
		if (search.size() > 0) {
			if (menu.equals("main")) {
				view = request.getRequestDispatcher("mpageitem");
			} else if (menu.equals("shop")) {
				view = request.getRequestDispatcher("categorysort");
			} else if (menu.equals("admin")) {
				view = request.getRequestDispatcher("views/managerPage/adminIndex.jsp");
			} else if (menu.equals("mypage")) {
				view = request.getRequestDispatcher("contact.jsp");
			} else if (menu.equals("nlistadmin")) {
				view = request.getRequestDispatcher("nlist.ad");
			} else if (menu.equals("nlistcustomer")) {
				view = request.getRequestDispatcher("nlist");
			} else if (menu.equals("best")) {
				view = request.getRequestDispatcher("views/community/best/bestListView.jsp");
			} else if (menu.equals("review")) {
				view = request.getRequestDispatcher("views/community/review/reviewListView.jsp");
			} else if (menu.equals("gallery")) {
				view = request.getRequestDispatcher("views/community/gallery/galleryListView.jsp");
			} else if (menu.equals("free")) {
				view = request.getRequestDispatcher("freelist");
			} else if (menu.equals("qna")) {
				view = request.getRequestDispatcher("views/community/qna/qnaListView.jsp");
			} else if (menu.equals("login")) {
				view = request.getRequestDispatcher("views/loginPage/login.jsp");
			} else if (menu.equals("logout")) {
				view = request.getRequestDispatcher("logout");
			}
			request.setAttribute("search", search);
			
			view.forward(request, response);
		} else {
			view = request.getRequestDispatcher("views/common/error.jsp");
			
			request.setAttribute("message", "검색 조회 실패!");
			
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
