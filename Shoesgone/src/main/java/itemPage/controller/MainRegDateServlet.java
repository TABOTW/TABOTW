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

		ArrayList<Item> regItem1 = new ItemService().selectRegList();
		ArrayList<Picture> regItem2 = new PictureService().selectRegList();
		ArrayList<Item> hotItem1 = new ItemService().selectHotList();
		ArrayList<Picture> hotItem2 = new PictureService().selectHotList();
		ArrayList<Item> recItem1 = new ItemService().selectRecList();
		ArrayList<Picture> recItem2 = new PictureService().selectRecList();
		
		RequestDispatcher view = null;

		// 데이터베이스에 전화번호 값 유무에 따른 화면 구현
		if (regItem1.size() > 0 && regItem2.size() > 0 && hotItem1.size() > 0 && hotItem2.size() > 0
				&& recItem1.size() > 0 && recItem2.size() > 0) {
			view = request.getRequestDispatcher("index.jsp");
			
	        request.setAttribute("regItem1", regItem1);
	        request.setAttribute("regItem2", regItem2);
	        request.setAttribute("hotItem1", hotItem1);
	        request.setAttribute("hotItem2", hotItem2);
	        request.setAttribute("recItem1", recItem1);
	        request.setAttribute("recItem2", recItem2);
	        
	        view.forward(request, response);
		} else { 
			view = request.getRequestDispatcher("views/common/error.jsp");

			request.setAttribute("message", "상품 조회 실패!");

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
