package itemPage.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import itemPage.model.service.ItemService;
import itemPage.model.vo.Item;

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

		Item item = new ItemService().selectItem();
		RequestDispatcher view;

		// 데이터베이스에 전화번호 값 유무에 따른 화면 구현
		if (item != null) {
			view = null;
			
			view = request.getRequestDispatcher("index.jsp");
			
	        request.setAttribute("item", item);
	        
	        view.forward(request, response);
		} else { 
			view = request.getRequestDispatcher("views/common/error.jsp");

			request.setAttribute("message", "페이지 오류!");

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
