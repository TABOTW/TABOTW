package review.model.dao;

import static common.JDBCTemp.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import notice.model.vo.Notice;
import review.model.vo.Review;

public class ReviewDao {

	public ArrayList<Review> selectList(Connection conn) {
		ArrayList<Review> list = new ArrayList<Review>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from review order by noticeno desc";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				Notice notice = new Notice();
				
				notice.setNoticeNo(rset.getInt("noticeno"));
				notice.setNoticeWriter(rset.getString("noticewriter"));
				notice.setNoticeTitle(rset.getString("noticetitle"));
				notice.setNoticeContent(rset.getString("noticecontent"));
				notice.setNoticeDate(rset.getDate("noticedate"));
				
				list.add(notice);
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
