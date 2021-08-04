package itemPage.model.dao;

import static common.JDBCTemp.close;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import itemPage.model.vo.ItemPicture;

public class ItemPictureDao {

	// 상품 페이지 초기 화면 데이터베이스 조회
	public ArrayList<ItemPicture> selectLookupList(Connection conn) {
		ArrayList<ItemPicture> list = new ArrayList<ItemPicture>();
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select * "
				+ "from item "
				+ "join pictures on item_no = pictures_itemno "
				+ "where pictures_path like '%0.png'";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				ItemPicture itempicture = new ItemPicture();
				
				itempicture.setItemNo(rset.getInt("item_no"));
				itempicture.setItemEngName(rset.getString("item_eng_name"));
				itempicture.setItemKrName(rset.getString("item_kr_name"));
				itempicture.setBrand(rset.getString("item_brand"));
				itempicture.setModelNo(rset.getString("item_modelno"));
				itempicture.setShoesColors(rset.getString("item_colors"));
				itempicture.setPrice(rset.getInt("item_price"));
				itempicture.setRegDate(rset.getDate("item_reg_date"));
				itempicture.setDropDate(rset.getDate("item_drop_date"));
				itempicture.setShoesSizes(rset.getString("item_sizes"));
				itempicture.setViews(rset.getInt("item_views"));
				
				itempicture.setPictureno(rset.getInt("pictures_no"));
				itempicture.setModelno(rset.getInt("pictures_itemno"));
				itempicture.setPicturepath(rset.getString("pictures_path"));
				
				list.add(itempicture);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		return list;
	}

	public ArrayList<ItemPicture> selectHotList(Connection conn) {
		ArrayList<ItemPicture> list = new ArrayList<ItemPicture>();
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select * "
				+ "from item "
				+ "join pictures on item_no = pictures_itemno "
				+ "where item_no in (select item_no "
				+ "                from(select rownum, item_no "
				+ "                    from(select count(*) order_count, orders.item_no "
				+ "                        from orders "
				+ "                        join item on orders.item_no = item.item_no "
				+ "                        group by orders.item_no "
				+ "                        order by 1 desc))) "
				+ "and pictures_path like '%0.png'";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				ItemPicture itempicture = new ItemPicture();
				
				itempicture.setItemNo(rset.getInt("item_no"));
				itempicture.setItemEngName(rset.getString("item_eng_name"));
				itempicture.setItemKrName(rset.getString("item_kr_name"));
				itempicture.setBrand(rset.getString("item_brand"));
				itempicture.setModelNo(rset.getString("item_modelno"));
				itempicture.setShoesColors(rset.getString("item_colors"));
				itempicture.setPrice(rset.getInt("item_price"));
				itempicture.setRegDate(rset.getDate("item_reg_date"));
				itempicture.setDropDate(rset.getDate("item_drop_date"));
				itempicture.setShoesSizes(rset.getString("item_sizes"));
				itempicture.setViews(rset.getInt("item_views"));
				
				itempicture.setPictureno(rset.getInt("pictures_no"));
				itempicture.setModelno(rset.getInt("pictures_itemno"));
				itempicture.setPicturepath(rset.getString("pictures_path"));
				
				list.add(itempicture);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		return list;
	}

	public ArrayList<ItemPicture> selectPremiumList(Connection conn) {
		ArrayList<ItemPicture> list = new ArrayList<ItemPicture>();
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select * "
				+ "from item "
				+ "join pictures on item_no = pictures_itemno "
				+ "where pictures_path like '%0.png' "
				+ "order by item_price desc";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				ItemPicture itempicture = new ItemPicture();
				
				itempicture.setItemNo(rset.getInt("item_no"));
				itempicture.setItemEngName(rset.getString("item_eng_name"));
				itempicture.setItemKrName(rset.getString("item_kr_name"));
				itempicture.setBrand(rset.getString("item_brand"));
				itempicture.setModelNo(rset.getString("item_modelno"));
				itempicture.setShoesColors(rset.getString("item_colors"));
				itempicture.setPrice(rset.getInt("item_price"));
				itempicture.setRegDate(rset.getDate("item_reg_date"));
				itempicture.setDropDate(rset.getDate("item_drop_date"));
				itempicture.setShoesSizes(rset.getString("item_sizes"));
				itempicture.setViews(rset.getInt("item_views"));
				
				itempicture.setPictureno(rset.getInt("pictures_no"));
				itempicture.setModelno(rset.getInt("pictures_itemno"));
				itempicture.setPicturepath(rset.getString("pictures_path"));
				
				list.add(itempicture);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		return list;
	}

	public ArrayList<ItemPicture> selectBuyList(Connection conn) {
		ArrayList<ItemPicture> list = new ArrayList<ItemPicture>();
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select * "
				+ "from(select * "
				+ "    from(select rownum, sell_bid.* "
				+ "        from sell_bid "
				+ "        where price in (select min(sell_bid.price) "
				+ "                        from sell_bid "
				+ "                        join item on item.item_no = sell_bid.item_no "
				+ "                        group by item.item_no) "
				+ "        order by reg_date desc)) "
				+ "join item using(item_no) "
				+ "join pictures on item_no = pictures_itemno "
				+ "where pictures_path like '%0.png' "
				+ "order by price";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				ItemPicture itempicture = new ItemPicture();
				
				itempicture.setItemNo(rset.getInt("item_no"));
				itempicture.setItemEngName(rset.getString("item_eng_name"));
				itempicture.setItemKrName(rset.getString("item_kr_name"));
				itempicture.setBrand(rset.getString("item_brand"));
				itempicture.setModelNo(rset.getString("item_modelno"));
				itempicture.setShoesColors(rset.getString("item_colors"));
				itempicture.setPrice(rset.getInt("price"));
				itempicture.setRegDate(rset.getDate("item_reg_date"));
				itempicture.setDropDate(rset.getDate("item_drop_date"));
				itempicture.setShoesSizes(rset.getString("item_sizes"));
				itempicture.setViews(rset.getInt("item_views"));
				
				itempicture.setPictureno(rset.getInt("pictures_no"));
				itempicture.setModelno(rset.getInt("pictures_itemno"));
				itempicture.setPicturepath(rset.getString("pictures_path"));
				
				list.add(itempicture);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		return list;
	}

	public ArrayList<ItemPicture> selectSellList(Connection conn) {
		ArrayList<ItemPicture> list = new ArrayList<ItemPicture>();
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select * "
				+ "from(select * "
				+ "    from(select rownum, buy_bid.* "
				+ "        from buy_bid "
				+ "        where price in (select max(buy_bid.price) "
				+ "                        from buy_bid "
				+ "                        join item on item.item_no = buy_bid.item_no "
				+ "                        group by item.item_no) "
				+ "        order by reg_date desc)) "
				+ "join item using(item_no) "
				+ "join pictures on item_no = pictures_itemno "
				+ "where pictures_path like '%0.png' "
				+ "order by price desc";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				ItemPicture itempicture = new ItemPicture();
				
				itempicture.setItemNo(rset.getInt("item_no"));
				itempicture.setItemEngName(rset.getString("item_eng_name"));
				itempicture.setItemKrName(rset.getString("item_kr_name"));
				itempicture.setBrand(rset.getString("item_brand"));
				itempicture.setModelNo(rset.getString("item_modelno"));
				itempicture.setShoesColors(rset.getString("item_colors"));
				itempicture.setPrice(rset.getInt("price"));
				itempicture.setRegDate(rset.getDate("item_reg_date"));
				itempicture.setDropDate(rset.getDate("item_drop_date"));
				itempicture.setShoesSizes(rset.getString("item_sizes"));
				itempicture.setViews(rset.getInt("item_views"));
				
				itempicture.setPictureno(rset.getInt("pictures_no"));
				itempicture.setModelno(rset.getInt("pictures_itemno"));
				itempicture.setPicturepath(rset.getString("pictures_path"));
				
				list.add(itempicture);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		return list;
	}

	public ArrayList<ItemPicture> selectDropList(Connection conn) {
		ArrayList<ItemPicture> list = new ArrayList<ItemPicture>();
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select * "
				+ "from item "
				+ "join pictures on item_no = pictures_itemno "
				+ "where pictures_path like '%0.png' "
				+ "order by item_drop_date desc";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				ItemPicture itempicture = new ItemPicture();
				
				itempicture.setItemNo(rset.getInt("item_no"));
				itempicture.setItemEngName(rset.getString("item_eng_name"));
				itempicture.setItemKrName(rset.getString("item_kr_name"));
				itempicture.setBrand(rset.getString("item_brand"));
				itempicture.setModelNo(rset.getString("item_modelno"));
				itempicture.setShoesColors(rset.getString("item_colors"));
				itempicture.setPrice(rset.getInt("item_price"));
				itempicture.setRegDate(rset.getDate("item_reg_date"));
				itempicture.setDropDate(rset.getDate("item_drop_date"));
				itempicture.setShoesSizes(rset.getString("item_sizes"));
				itempicture.setViews(rset.getInt("item_views"));
				
				itempicture.setPictureno(rset.getInt("pictures_no"));
				itempicture.setModelno(rset.getInt("pictures_itemno"));
				itempicture.setPicturepath(rset.getString("pictures_path"));
				
				list.add(itempicture);
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
