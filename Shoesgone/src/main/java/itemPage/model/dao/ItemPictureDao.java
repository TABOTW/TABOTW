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

}
