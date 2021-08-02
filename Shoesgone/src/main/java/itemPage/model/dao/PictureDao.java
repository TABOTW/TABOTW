package itemPage.model.dao;

import static common.JDBCTemp.close;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import itemPage.model.vo.Picture;

public class PictureDao {

	public ArrayList<Picture> selectList(Connection conn) {
		ArrayList<Picture> list = new ArrayList<Picture>();
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select pictures_no, pictures_itemno, pictures_path "
				+ "from(select rownum, item.*, pictures.* "
				+ "    from item "
				+ "    join pictures on item.item_no = pictures.pictures_itemno "
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

}
