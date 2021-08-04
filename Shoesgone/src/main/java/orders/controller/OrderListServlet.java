package orders.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import itemPage.model.service.ItemDetailService;
import itemPage.model.vo.Item;
import itemPage.model.vo.Picture;
import itemregsta.model.service.ItemRegStaService;
import itemregsta.model.vo.ItemRegSta;

/**
 * Servlet implementation class OrderListServlet
 */
@WebServlet("/orlist")
public class OrderListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OrderListServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 페이지별로 출력되는 주문 상품 조회용 컨트롤러
		request.setCharacterEncoding("utf-8");

		// 출력할 상품 번호 받아오기
		int itemNo = Integer.parseInt(request.getParameter("itemno"));
		Item item = new ItemDetailService().selectOne(itemNo);
		ArrayList<Picture> plist = new ItemDetailService().selectPList(itemNo);
		int size = Integer.parseInt(request.getParameter("size"));
		
		// 상품번호가 일치하는 등록 상품 저장용 리스트
		ArrayList<ItemRegSta> list = null;
		
		// 리스트에 저장
		list = new ItemRegStaService().selectedRegList(itemNo, size);
		
		// 화면에 출력
		RequestDispatcher view = null;
		if (list.size() > 0) {
			view = request.getRequestDispatcher("views/buyPage/select_buy_list");
			
			request.setAttribute("item", item);
			request.setAttribute("plist", plist);
			request.setAttribute("size", size);
			
			view.forward(request, response);
		} else {
			view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", "목록 조회 실패");
			view.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
