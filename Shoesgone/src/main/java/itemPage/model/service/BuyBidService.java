package itemPage.model.service;

import static common.JDBCTemp.close;
import static common.JDBCTemp.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import itemPage.model.dao.BuyBidDao;
import itemPage.model.vo.BuyBid;

public class BuyBidService {
	private BuyBidDao bdao = new BuyBidDao();

	public ArrayList<BuyBid> selectNewSellList() {
		Connection conn = getConnection();
		ArrayList<BuyBid> list = bdao.selectNewSellList(conn);
		close(conn);
		return list;
	}
}
