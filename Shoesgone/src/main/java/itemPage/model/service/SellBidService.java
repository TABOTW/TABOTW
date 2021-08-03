package itemPage.model.service;

import static common.JDBCTemp.close;
import static common.JDBCTemp.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import itemPage.model.dao.SellBidDao;
import itemPage.model.vo.SellBid;

public class SellBidService {
	private SellBidDao sdao = new SellBidDao();

	public ArrayList<SellBid> selectNewBuyList() {
		Connection conn = getConnection();
		ArrayList<SellBid> list = sdao.selectNewBuyList(conn);
		close(conn);
		return list;
	}
}
