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
 * Servlet implementation class CategoryItemServlet
 */
@WebServlet("/categoryitem")
public class CategoryItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CategoryItemServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		// 상품 페이지에 보낼 리스트 값
		ArrayList<ItemPicture> lookupItem = new ItemPictureService().selectLookupList();
		
		RequestDispatcher view = null;
		
		if (lookupItem.size() > 0) {
			view = request.getRequestDispatcher("category.jsp");
			
			request.setAttribute("lookupItem", lookupItem);
			
			view.forward(request, response);
		} else {
			view = request.getRequestDispatcher("views/common/error.jsp");
			
			request.setAttribute("message", "상품 조회 실패");
			
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
