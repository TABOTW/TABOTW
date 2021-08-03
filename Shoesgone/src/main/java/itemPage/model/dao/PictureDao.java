package itemPage.model.dao;

import static common.JDBCTemp.close;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import itemPage.model.vo.Picture;

public class PictureDao {

	public ArrayList<Picture> selectRegList(Connection conn) {
		ArrayList<Picture> list = new ArrayList<Picture>();
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select pictures_no, pictures_itemno, pictures_path "
				+ "from(select rownum, item.*, pictures.* "
				+ "    from item "
				+ "    join pictures on item.item_no = pictures.pictures_itemno "
				+ "    where pictures_path like '%0.png' "
				+ "    order by item_drop_date desc) "
				+ "where rownum <= 4";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				Picture picture = new Picture();
				
				// 컬럼값 꺼내서, 필드에 옮겨 기록하기 : 결과매핑
				picture.setPictureno(rset.getInt("pictures_no"));
				picture.setModelno(rset.getInt("pictures_itemno"));
				picture.setPicturepath(rset.getString("pictures_path"));
				
				list.add(picture);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		return list;
	}

	public ArrayList<Picture> selectHotList(Connection conn) {
		ArrayList<Picture> list = new ArrayList<Picture>();
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select * "
				+ "from pictures "
				+ "where pictures_itemno in (select item_no "
				+ "                        from(select rownum, item_no "
				+ "                            from(select count(*) order_count, orders.item_no "
				+ "                                from orders "
				+ "                                join item on orders.item_no = item.item_no "
				+ "                                group by orders.item_no "
				+ "                                order by 1 desc) "
				+ "                            where rownum <= 4)) "
				+ "and pictures_path like '%0.png'\n"
				+ "order by pictures_itemno";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				Picture picture = new Picture();
				
				// 컬럼값 꺼내서, 필드에 옮겨 기록하기 : 결과매핑
				picture.setPictureno(rset.getInt("pictures_no"));
				picture.setModelno(rset.getInt("pictures_itemno"));
				picture.setPicturepath(rset.getString("pictures_path"));
				
				list.add(picture);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		return list;
	}

	public ArrayList<Picture> selectRecList(Connection conn) {
		ArrayList<Picture> list = new ArrayList<Picture>();
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select pictures_no, pictures_itemno, pictures_path "
				+ "from(select rownum, item.*, pictures.* "
				+ "    from item "
				+ "    join pictures on item.item_no = pictures.pictures_itemno "
				+ "    where pictures_path like '%0.png' "
				+ "    order by item_views desc) "
				+ "where rownum <= 4";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				Picture picture = new Picture();
				
				// 컬럼값 꺼내서, 필드에 옮겨 기록하기 : 결과매핑
				picture.setPictureno(rset.getInt("pictures_no"));
				picture.setModelno(rset.getInt("pictures_itemno"));
				picture.setPicturepath(rset.getString("pictures_path"));
				
				list.add(picture);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		return list;
	}

	public ArrayList<Picture> selectNewBuyList(Connection conn) {
		ArrayList<Picture> list = new ArrayList<Picture>();
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select pictures_no, pictures_itemno, pictures_path "
				+ "from(select * "
				+ "    from(select rownum, sell_bid.* "
				+ "        from sell_bid "
				+ "        where price in (select max(sell_bid.price) "
				+ "                        from sell_bid "
				+ "                        join item on item.item_no = sell_bid.item_no "
				+ "                        group by item.item_no) "
				+ "        order by reg_date desc) "
				+ "    where rownum <=4) "
				+ "join pictures on pictures.pictures_itemno = item_no "
				+ "where pictures_path like '%0.png' "
				+ "order by reg_date desc";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				Picture picture = new Picture();
				
				// 컬럼값 꺼내서, 필드에 옮겨 기록하기 : 결과매핑
				picture.setPictureno(rset.getInt("pictures_no"));
				picture.setModelno(rset.getInt("pictures_itemno"));
				picture.setPicturepath(rset.getString("pictures_path"));
				
				list.add(picture);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		return list;
	}

	public ArrayList<Picture> selectNewSellList(Connection conn) {
		ArrayList<Picture> list = new ArrayList<Picture>();
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select pictures_no, pictures_itemno, pictures_path "
				+ "from(select * "
				+ "    from(select rownum, buy_bid.* "
				+ "        from buy_bid "
				+ "        where price in (select max(buy_bid.price) "
				+ "                        from buy_bid "
				+ "                        join item on item.item_no = buy_bid.item_no "
				+ "                        group by item.item_no) "
				+ "        order by reg_date desc) "
				+ "    where rownum <=4) "
				+ "join pictures on pictures.pictures_itemno = item_no "
				+ "where pictures_path like '%0.png' "
				+ "order by reg_date desc";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				Picture picture = new Picture();
				
				// 컬럼값 꺼내서, 필드에 옮겨 기록하기 : 결과매핑
				picture.setPictureno(rset.getInt("pictures_no"));
				picture.setModelno(rset.getInt("pictures_itemno"));
				picture.setPicturepath(rset.getString("pictures_path"));
				
				list.add(picture);
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
