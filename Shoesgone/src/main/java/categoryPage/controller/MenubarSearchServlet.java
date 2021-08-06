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
import categoryPage.model.service.ItemService;
import categoryPage.model.service.NoticeService;
import categoryPage.model.vo.Item;
import categoryPage.model.vo.ItemPicture;
import categoryPage.model.vo.Notice;

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
		String text = request.getParameter("text");
		ArrayList<ItemPicture> search = new ItemPictureService().selectLookupList();
		ArrayList<Notice> notice = new NoticeService().selectNoticeList();
		ArrayList<Item> regItem = new ItemService().selectRegList();
		ArrayList<Item> hotItem = new ItemService().selectHotList();
		ArrayList<Item> recItem = new ItemService().selectRecList();
		ArrayList<Item> newBuyPrice = new ItemService().selectNewBuyList();
		ArrayList<Item> newSellPrice = new ItemService().selectNewSellList();
		ArrayList<Item> upcomingRelease = new ItemService().selectUpcomingList();
		
		if (menu == null) {
			menu = "main";
		}
		
		RequestDispatcher view = null;
		
		if (search.size() > 0 && notice.size() > 0 && regItem.size() > 0
				&& hotItem.size() > 0 && recItem.size() > 0 && newBuyPrice.size() > 0
				&& newSellPrice.size() > 0 && upcomingRelease.size() > 0) {
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
			} else if (menu.equals("registration")) {
				view = request.getRequestDispatcher("views/loginPage/registration.jsp");
			} else if (menu.equals("searchid")) {
				view = request.getRequestDispatcher("views/loginPage/searchId.jsp");
			} else if (menu.equals("searchpassword")) {
				view = request.getRequestDispatcher("views/loginPage/searchPassword.jsp");
			} else if (menu.equals("resultid")) {
				view = request.getRequestDispatcher("searchid");
			} else if (menu.equals("resultpassword")) {
				view = request.getRequestDispatcher("searchpwd");
			} else if (menu.equals("normallogin")) {
				view = request.getRequestDispatcher("login");
			} else if (menu.equals("notice1")) {
				view = request.getRequestDispatcher("ndetail?noticeNo=" + notice.get(0).getNoticeNo());
			} else if (menu.equals("notice2")) {
				view = request.getRequestDispatcher("ndetail?noticeNo=" + notice.get(1).getNoticeNo());
			} else if (menu.equals("notice3")) {
				view = request.getRequestDispatcher("ndetail?noticeNo=" + notice.get(2).getNoticeNo());
			} else if (menu.equals("notice4")) {
				view = request.getRequestDispatcher("ndetail?noticeNo=" + notice.get(3).getNoticeNo());
			} else if (menu.equals("notice5")) {
				view = request.getRequestDispatcher("ndetail?noticeNo=" + notice.get(4).getNoticeNo());
			} else if (menu.equals("notice6")) {
				view = request.getRequestDispatcher("ndetail?noticeNo=" + notice.get(5).getNoticeNo());
			} else if (menu.equals("notice7")) {
				view = request.getRequestDispatcher("ndetail?noticeNo=" + notice.get(6).getNoticeNo());
			} else if (menu.equals("faq")) {
				view = request.getRequestDispatcher("flist");
			} else if (menu.equals("regitem1")) {
				view = request.getRequestDispatcher("ItemDV?itemno=" + regItem.get(0).getItemNo());
			} else if (menu.equals("regitem2")) {
				view = request.getRequestDispatcher("ItemDV?itemno=" + regItem.get(1).getItemNo());
			} else if (menu.equals("regitem3")) {
				view = request.getRequestDispatcher("ItemDV?itemno=" + regItem.get(2).getItemNo());
			} else if (menu.equals("regitem4")) {
				view = request.getRequestDispatcher("ItemDV?itemno=" + regItem.get(3).getItemNo());
			} else if (menu.equals("hotitem1")) {
				view = request.getRequestDispatcher("ItemDV?itemno=" + hotItem.get(0).getItemNo());
			} else if (menu.equals("hotitem2")) {
				view = request.getRequestDispatcher("ItemDV?itemno=" + hotItem.get(1).getItemNo());
			} else if (menu.equals("hotitem3")) {
				view = request.getRequestDispatcher("ItemDV?itemno=" + hotItem.get(2).getItemNo());
			} else if (menu.equals("hotitem4")) {
				view = request.getRequestDispatcher("ItemDV?itemno=" + hotItem.get(3).getItemNo());
			} else if (menu.equals("recitem1")) {
				view = request.getRequestDispatcher("ItemDV?itemno=" + recItem.get(0).getItemNo());
			} else if (menu.equals("recitem2")) {
				view = request.getRequestDispatcher("ItemDV?itemno=" + recItem.get(1).getItemNo());
			} else if (menu.equals("recitem3")) {
				view = request.getRequestDispatcher("ItemDV?itemno=" + recItem.get(2).getItemNo());
			} else if (menu.equals("recitem4")) {
				view = request.getRequestDispatcher("ItemDV?itemno=" + recItem.get(3).getItemNo());
			} else if (menu.equals("newbuyprice1")) {
				view = request.getRequestDispatcher("ItemDV?itemno=" + newBuyPrice.get(0).getItemNo());
			} else if (menu.equals("newbuyprice2")) {
				view = request.getRequestDispatcher("ItemDV?itemno=" + newBuyPrice.get(1).getItemNo());
			} else if (menu.equals("newbuyprice3")) {
				view = request.getRequestDispatcher("ItemDV?itemno=" + newBuyPrice.get(2).getItemNo());
			} else if (menu.equals("newbuyprice4")) {
				view = request.getRequestDispatcher("ItemDV?itemno=" + newBuyPrice.get(3).getItemNo());
			} else if (menu.equals("newsellprice1")) {
				view = request.getRequestDispatcher("ItemDV?itemno=" + newSellPrice.get(0).getItemNo());
			} else if (menu.equals("newsellprice2")) {
				view = request.getRequestDispatcher("ItemDV?itemno=" + newSellPrice.get(1).getItemNo());
			} else if (menu.equals("newsellprice3")) {
				view = request.getRequestDispatcher("ItemDV?itemno=" + newSellPrice.get(2).getItemNo());
			} else if (menu.equals("newsellprice4")) {
				view = request.getRequestDispatcher("ItemDV?itemno=" + newSellPrice.get(3).getItemNo());
			} else if (menu.equals("upcomingrelease1")) {
				view = request.getRequestDispatcher("ItemDV?itemno=" + upcomingRelease.get(0).getItemNo());
			} else if (menu.equals("upcomingrelease2")) {
				view = request.getRequestDispatcher("ItemDV?itemno=" + upcomingRelease.get(1).getItemNo());
			} else if (menu.equals("upcomingrelease3")) {
				view = request.getRequestDispatcher("ItemDV?itemno=" + upcomingRelease.get(2).getItemNo());
			} else if (menu.equals("upcomingrelease4")) {
				view = request.getRequestDispatcher("ItemDV?itemno=" + upcomingRelease.get(3).getItemNo());
			} else if (menu.equals("ad1")) {
				view = request.getRequestDispatcher("ItemDV?itemno=21");
			} else if (menu.equals("ad2")) {
				view = request.getRequestDispatcher("ItemDV?itemno=22");
			} else if (menu.equals("ad3")) {
				view = request.getRequestDispatcher("ItemDV?itemno=23");
			} else if (menu.equals("ad4")) {
				view = request.getRequestDispatcher("ItemDV?itemno=24");
			} else if (menu.equals("sneakers")) {
				view = request.getRequestDispatcher("categoryfilter?category=sneakers");
			} else if (menu.equals("nike")) {
				view = request.getRequestDispatcher("categoryfilter?category=brand&brand=Nike");
			} else if (menu.equals("jordan")) {
				view = request.getRequestDispatcher("categoryfilter?category=brand&brand=Jordan");
			} else if (menu.equals("new balance")) {
				view = request.getRequestDispatcher("categoryfilter?category=brand&brand=New Balance");
			} else if (menu.equals("adidas")) {
				view = request.getRequestDispatcher("categoryfilter?category=brand&brand=adidas");
			} else if (menu.equals("golden goose")) {
				view = request.getRequestDispatcher("categoryfilter?category=brand&brand=Golden Goose");
			} else if (menu.equals("jordan 1")) {
				view = request.getRequestDispatcher("categoryfilter?category=collection&collection=Jordan 1");
			} else if (menu.equals("jordan 4")) {
				view = request.getRequestDispatcher("categoryfilter?category=collection&collection=Jordan 4");
			} else if (menu.equals("jordan 6")) {
				view = request.getRequestDispatcher("categoryfilter?category=collection&collection=Jordan 6");
			} else if (menu.equals("nike dunk")) {
				view = request.getRequestDispatcher("categoryfilter?category=collection&collection=Nike Dunk");
			} else if (menu.equals("air force")) {
				view = request.getRequestDispatcher("categoryfilter?category=collection&collection=Air Force");
			} else if (menu.equals("new balance 327")) {
				view = request.getRequestDispatcher("categoryfilter?category=collection&collection=New Balance 327");
			} else if (menu.equals("new balance 992")) {
				view = request.getRequestDispatcher("categoryfilter?category=collection&collection=New Balance 992");
			} else if (menu.equals("adidas yeezy")) {
				view = request.getRequestDispatcher("categoryfilter?category=collection&collection=Adidas Yeezy");
			} else if (menu.equals("x sacai")) {
				view = request.getRequestDispatcher("categoryfilter?category=collection&collection=x Sacai");
			} else if (menu.equals("luxury")) {
				view = request.getRequestDispatcher("categoryfilter?category=collection&collection=Golden Goose");
			} else if (menu.equals("size1")) {
				view = request.getRequestDispatcher("categoryfilter?category=size&size=215");
			} else if (menu.equals("size2")) {
				view = request.getRequestDispatcher("categoryfilter?category=size&size=220");
			} else if (menu.equals("size3")) {
				view = request.getRequestDispatcher("categoryfilter?category=size&size=225");
			} else if (menu.equals("size4")) {
				view = request.getRequestDispatcher("categoryfilter?category=size&size=230");
			} else if (menu.equals("size5")) {
				view = request.getRequestDispatcher("categoryfilter?category=size&size=235");
			} else if (menu.equals("size6")) {
				view = request.getRequestDispatcher("categoryfilter?category=size&size=240");
			} else if (menu.equals("size7")) {
				view = request.getRequestDispatcher("categoryfilter?category=size&size=245");
			} else if (menu.equals("size8")) {
				view = request.getRequestDispatcher("categoryfilter?category=size&size=250");
			} else if (menu.equals("size9")) {
				view = request.getRequestDispatcher("categoryfilter?category=size&size=255");
			} else if (menu.equals("size10")) {
				view = request.getRequestDispatcher("categoryfilter?category=size&size=260");
			} else if (menu.equals("size11")) {
				view = request.getRequestDispatcher("categoryfilter?category=size&size=265");
			} else if (menu.equals("size12")) {
				view = request.getRequestDispatcher("categoryfilter?category=size&size=270");
			} else if (menu.equals("size13")) {
				view = request.getRequestDispatcher("categoryfilter?category=size&size=275");
			} else if (menu.equals("size14")) {
				view = request.getRequestDispatcher("categoryfilter?category=size&size=280");
			} else if (menu.equals("size15")) {
				view = request.getRequestDispatcher("categoryfilter?category=size&size=285");
			} else if (menu.equals("size16")) {
				view = request.getRequestDispatcher("categoryfilter?category=size&size=290");
			} else if (menu.equals("size17")) {
				view = request.getRequestDispatcher("categoryfilter?category=size&size=295");
			} else if (menu.equals("size18")) {
				view = request.getRequestDispatcher("categoryfilter?category=size&size=300");
			} else if (menu.equals("size19")) {
				view = request.getRequestDispatcher("categoryfilter?category=size&size=305");
			} else if (menu.equals("size20")) {
				view = request.getRequestDispatcher("categoryfilter?category=size&size=310");
			} else if (menu.equals("size21")) {
				view = request.getRequestDispatcher("categoryfilter?category=size&size=315");
			} else if (menu.equals("size22")) {
				view = request.getRequestDispatcher("categoryfilter?category=size&size=320");
			} else if (menu.equals("size23")) {
				view = request.getRequestDispatcher("categoryfilter?category=size&size=325");
			} else if (menu.equals("size24")) {
				view = request.getRequestDispatcher("categoryfilter?category=size&size=330");
			} else if (menu.equals("price1")) {
				view = request.getRequestDispatcher("categoryfilter?category=price1&priceone=100000");
			} else if (menu.equals("price2")) {
				view = request.getRequestDispatcher("categoryfilter?category=price2&priceone=100000&pricetwo=300000");
			} else if (menu.equals("price3")) {
				view = request.getRequestDispatcher("categoryfilter?category=price2&priceone=300000&pricetwo=500000");
			} else if (menu.equals("price4")) {
				view = request.getRequestDispatcher("categoryfilter?category=price3&priceone=500000");
			} else if (menu.equals("sort-hot")) {
				view = request.getRequestDispatcher("categorysort?sortValue=sort-hot");
			} else if (menu.equals("sort-premium")) {
				view = request.getRequestDispatcher("categorysort?sortValue=sort-premium");
			} else if (menu.equals("sort-buy")) {
				view = request.getRequestDispatcher("categorysort?sortValue=sort-buy");
			} else if (menu.equals("sort-sell")) {
				view = request.getRequestDispatcher("categorysort?sortValue=sort-sell");
			} else if (menu.equals("sort-drop")) {
				view = request.getRequestDispatcher("categorysort?sortValue=sort-drop");
			} else if (menu.equals("text")) {
				view = request.getRequestDispatcher("menubarsearchenter?text=" + text);
			} else {
				for (int i = 0; i < search.size(); i++) {
					if (menu.equals("item" + (i + 1))) {
						view = request.getRequestDispatcher("ItemDV?itemno=" + search.get(i).getItemNo());
					}
				}
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