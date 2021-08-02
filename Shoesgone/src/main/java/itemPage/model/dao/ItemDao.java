package itemPage.model.dao;

import static common.JDBCTemp.close;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import itemPage.model.vo.Item;

public class ItemDao {

	public ArrayList<Item> selectRegList(Connection conn) {
		ArrayList<Item> list = new ArrayList<Item>();
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select * "
				+ "from(select rownum, item.* "
				+ "    from item "
				+ "	   order by item_drop_date desc) "
				+ "where rownum <= 4";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				Item item = new Item();
				
				// 컬럼값 꺼내서, 필드에 옮겨 기록하기 : 결과매핑
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
				
				list.add(item);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		return list;
	}

	public ArrayList<Item> selectHotList(Connection conn) {
		ArrayList<Item> list = new ArrayList<Item>();
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select * "
				+ "from item "
				+ "where item_no in (select item_no "
				+ "                from(select rownum, item_no "
				+ "                    from(select count(*) order_count, orders.item_no "
				+ "                        from orders "
				+ "                        join item on orders.item_no = item.item_no "
				+ "                        group by orders.item_no "
				+ "                        order by 1 desc) "
				+ "                    where rownum <= 4))";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				Item item = new Item();
				
				// 컬럼값 꺼내서, 필드에 옮겨 기록하기 : 결과매핑
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
				
				list.add(item);
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