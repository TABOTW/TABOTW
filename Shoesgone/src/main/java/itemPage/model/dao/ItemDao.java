package itemPage.model.dao;

import static common.JDBCTemp.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import itemPage.model.vo.Item;

public class ItemDao {

	public Item selectItem(Connection conn) {
		Item item = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from item order by item_drop_date desc;";
		
		try {
			pstmt = conn.prepareStatement(query);
			
			rset = pstmt.executeQuery();
			
			if (rset.next()) {
				item = new Item();
				
				item.setItemNo(rset.getInt("item_no"));
				item.setItemEngName(rset.getString("item_eng_name"));
				item.setItemKrName(rset.getString("item_kr_name"));
				item.setBrand(rset.getString("item_brand"));
				item.setModelNo(rset.getString("item_modelno"));
				item.setShoesColors(rset.getString("item_colors"));
				item.setPrice(rset.getInt("item_price"));
				item.setRegDate(rset.getDate("item_reg_date"));
				item.setDropDate(rset.getDate("item_drop_date"));
				item.setShoesSizes(rset.getString("item_sizes"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return item;
	}

}