package itemPage.model.dao;

import static common.JDBCTemp.close;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import itemPage.model.vo.BuyBid;

public class BuyBidDao {

	public ArrayList<BuyBid> selectNewSellList(Connection conn) {
		ArrayList<BuyBid> list = new ArrayList<BuyBid>();
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select * "
				+ "from(select rownum, buy_bid.* "
				+ "    from buy_bid "
				+ "    where price in (select max(buy_bid.price) "
				+ "                    from buy_bid "
				+ "                    join item on item.item_no = buy_bid.item_no "
				+ "                    group by item.item_no) "
				+ "    order by reg_date desc) "
				+ "where rownum <=4";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				BuyBid buybid = new BuyBid();
				
				// 컬럼값 꺼내서, 필드에 옮겨 기록하기 : 결과매핑
				buybid.setBuyBidNo(rset.getInt("buy_bid_no"));
				buybid.setUserNo(rset.getInt("user_no"));
				buybid.setItemNo(rset.getInt("item_no"));
				buybid.setShoesSize(rset.getInt("shoes_size"));
				buybid.setRegDate(rset.getDate("reg_date"));
				buybid.setPrice(rset.getInt("price"));
				buybid.setAddress(rset.getString("address"));

				list.add(buybid);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		return list;
	}
}
