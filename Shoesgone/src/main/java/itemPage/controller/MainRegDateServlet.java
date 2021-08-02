package itemPage.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import itemPage.model.service.ItemService;
import itemPage.model.service.PictureService;
import itemPage.model.vo.Item;
import itemPage.model.vo.Picture;

/**
 * Servlet implementation class MainRegDateServlet
 */
@WebServlet("/mregdate")
public class MainRegDateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainRegDateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		ArrayList<Item> list1 = new ItemService().selectList();
		ArrayList<Picture> list2 = new PictureService().selectList();
		RequestDispatcher view = null;

		// 데이터베이스에 전화번호 값 유무에 따른 화면 구현
		if (list1.size() > 0 && list2.size() > 0) {
			view = request.getRequestDispatcher("index.jsp");
			
	        request.setAttribute("list1", list1);
	        request.setAttribute("list2", list2);
	        
	        view.forward(request, response);
		} else { 
			view = request.getRequestDispatcher("views/common/error.jsp");

			request.setAttribute("message", "발매 상품 조회 실패!");

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
