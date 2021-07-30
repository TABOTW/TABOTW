package itemPage.controller;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import itemPage.model.service.ItemDetailService;
import itemPage.model.vo.Item;

/**
 * Servlet implementation class AdminItemUpdateServlet
 */
@WebServlet("/itemupdate.ad")
public class AdminItemUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminItemUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		Item item = new Item();
		
		String from = request.getParameter("itemdropdate");
		SimpleDateFormat transFormat = new SimpleDateFormat("yy/MM/DD");
		Date to = null;
		try {
			to = (Date) transFormat.parse(from);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		item.setItemNo(Integer.parseInt(request.getParameter("itemno")));
		item.setItemEngName(request.getParameter("itemengname"));
		item.setItemKrName(request.getParameter("itemkrname"));
		item.setBrand(request.getParameter("itembrand"));
		item.setModelNo(request.getParameter("itemmodelno"));
		item.setShoesColors(request.getParameter("itemcolors"));
		item.setPrice(Integer.parseInt(request.getParameter("itemprice")));
		item.setDropDate(to);
		item.setShoesSizes(String.join(",", request.getParameterValues("size")));
		
		int result = new ItemDetailService().updateItem(item);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
