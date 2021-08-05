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
 * Servlet implementation class CategoryFilterServlet
 */
@WebServlet("/categoryfilter")
public class CategoryFilterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CategoryFilterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		ArrayList<ItemPicture> item = new ItemPictureService().selectSneakersList();
		
		RequestDispatcher view = null;
		
		// 데이터베이스 조회 성공에 따른 값 전달
		if (item.size() > 0) {
			view = request.getRequestDispatcher("views/categoryPage/category.jsp");
			
			request.setAttribute("item", item);

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
