package itemPage.model.dao;

import static common.JDBCTemp.close;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import itemPage.model.vo.SellBid;

public class SellBidDao {

	public ArrayList<SellBid> selectNewBuyList(Connection conn) {
		ArrayList<SellBid> list = new ArrayList<SellBid>();
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select * "
				+ "from(select rownum, sell_bid.* "
				+ "    from sell_bid\n"
				+ "    where price in (select max(sell_bid.price) "
				+ "                    from sell_bid\n"
				+ "                    join item on item.item_no = sell_bid.item_no "
				+ "                    group by item.item_no) "
				+ "    order by reg_date desc) "
				+ "where rownum <=4";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				SellBid sellbid = new SellBid();
				
				// 컬럼값 꺼내서, 필드에 옮겨 기록하기 : 결과매핑
				sellbid.setSellBidNo(rset.getInt("sell_bid_no"));
				sellbid.setUserNo(rset.getInt("user_no"));
				sellbid.setItemNo(rset.getInt("item_no"));
				sellbid.setShoesSize(rset.getInt("shoes_size"));
				sellbid.setRegDate(rset.getDate("reg_date"));
				sellbid.setPrice(rset.getInt("price"));
				sellbid.setPenalty(rset.getString("penalty"));
				sellbid.setAddress(rset.getString("address"));

				list.add(sellbid);
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
