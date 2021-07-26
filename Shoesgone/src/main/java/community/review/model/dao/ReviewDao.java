package community.review.model.dao;

import static common.JDBCTemp.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import community.review.model.vo.Review;

public class ReviewDao {

	public ArrayList<Review> selectTop3(Connection conn) {
		ArrayList<Review> list = new ArrayList<Review>();
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "SELECT * "
				+ "FROM (SELECT ROWNUM RNUM, Review_NUM, Review_TITLE, Review_READCOUNT "
				+ "        FROM (SELECT * FROM Review "
				+ "                WHERE Review_LEVEL = 1 "
				+ "                ORDER BY Review_READCOUNT DESC)) "
				+ "WHERE RNUM >= 1 AND RNUM <= 3";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				Review Review = new Review();
				
				Review.setReviewNum(rset.getInt("Review_num"));
				Review.setReviewTitle(rset.getString("Review_title"));
				Review.setReviewReadCount(rset.getInt("Review_readcount"));
				
				list.add(Review);
			}			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}		
		
		return list;
	}
	public Review selectReview(Connection conn, int ReviewNum) {
		Review Review = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from Review "
				+ "where Review_num = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, ReviewNum);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				Review = new Review();
				
				Review.setReviewNum(ReviewNum);
				Review.setReviewTitle(rset.getString("Review_title"));
				Review.setReviewWriter(rset.getString("Review_writer"));
				Review.setReviewContent(rset.getString("Review_content"));
				Review.setReviewOriginalFilename(rset.getString("Review_original_filename"));
				Review.setReviewRenameFilename(rset.getString("Review_rename_filename"));
				Review.setReviewDate(rset.getDate("Review_date"));
				Review.setReviewLevel(rset.getInt("Review_level"));
				Review.setReviewRef(rset.getInt("Review_ref"));
				Review.setReviewReplyRef(rset.getInt("Review_reply_ref"));
				Review.setReviewReplySeq(rset.getInt("Review_reply_seq"));
				Review.setReviewReadCount(rset.getInt("Review_readcount"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return Review;
	}

	public int updateReadCount(Connection conn, int ReviewNum) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update Review set "
				+ "Review_readcount = Review_readcount + 1 "
				+ "where Review_num = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, ReviewNum);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public int getListCount(Connection conn) {
		int listCount = 0;
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select count(*) from Review";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			 
			if(rset.next()) {
				listCount = rset.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		
		return listCount;
	}

	public ArrayList<Review> selectList(Connection conn, 
			int startRow, int endRow) {
		ArrayList<Review> list = new ArrayList<Review>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "SELECT * "
				+ "FROM (SELECT ROWNUM RNUM, Review_NUM, Review_TITLE, Review_WRITER,  "
				+ "                Review_ORIGINAL_FILENAME, Review_RENAME_FILENAME,  "
				+ "                Review_DATE, Review_LEVEL, Review_REF, Review_REPLY_REF,  "
				+ "                Review_REPLY_SEQ, Review_READCOUNT, Review_content "
				+ "        FROM (SELECT * FROM Review "
				+ "                ORDER BY Review_REF DESC, Review_REPLY_REF DESC, "
				+ "                          Review_LEVEL ASC, Review_REPLY_SEQ ASC)) "
				+ "WHERE RNUM >= ? AND RNUM <= ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Review Review  = new Review();
				
				Review.setReviewNum(rset.getInt("Review_num"));
				Review.setReviewTitle(rset.getString("Review_title"));
				Review.setReviewWriter(rset.getString("Review_writer"));
				Review.setReviewContent(rset.getString("Review_content"));				Review.setReviewDate(rset.getDate("Review_date"));
				Review.setReviewOriginalFilename(rset.getString("Review_original_filename"));
				Review.setReviewRenameFilename(rset.getString("Review_rename_filename"));
				Review.setReviewRef(rset.getInt("Review_ref"));
				Review.setReviewLevel(rset.getInt("Review_level"));
				Review.setReviewReplyRef(rset.getInt("Review_reply_ref"));
				Review.setReviewReplySeq(rset.getInt("Review_reply_seq"));
				Review.setReviewReadCount(rset.getInt("Review_readcount"));
				
				list.add(Review);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}

	public int insertOriginReview(Connection conn, Review Review) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "insert into Review values ("
				+ "(select max(Review_num) + 1 from Review), "
				+ "?, ?, ?, ?, ?, sysdate, 1, "
				+ "(select max(Review_num) + 1 from Review), "
				+ "null, default, default)";		
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, Review.getReviewTitle());
			pstmt.setString(2, Review.getReviewWriter());
			pstmt.setString(3, Review.getReviewContent());
			pstmt.setString(4, Review.getReviewOriginalFilename());
			pstmt.setString(5, Review.getReviewRenameFilename());
						
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public int updateOrigin(Connection conn, Review origin) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update Review set "
				+ "Review_title = ?, "
				+ "Review_content = ?, "
				+ "Review_original_filename = ?, "
				+ "Review_rename_filename = ? "
				+ "where Review_num = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, origin.getReviewTitle());
			pstmt.setString(2, origin.getReviewContent());
			pstmt.setString(3, origin.getReviewOriginalFilename());
			pstmt.setString(4, origin.getReviewRenameFilename());
			pstmt.setInt(5, origin.getReviewNum());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}
	
	public int updateReply(Connection conn, Review reply) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update Review set "
				+ "Review_title = ?, "
				+ "Review_content = ? "
				+ "where Review_num = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, reply.getReviewTitle());
			pstmt.setString(2, reply.getReviewContent());
			pstmt.setInt(3, reply.getReviewNum());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public int updateReplySeq(Connection conn, Review reply) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = null;
		
		//새로 등록할 댓글이 원글의 댓글일 때
		if(reply.getReviewLevel() == 2) {
			query = "update Review set "
				+ "Review_reply_seq = Review_reply_seq + 1 "
				+ "where Review_ref = ? and Review_level = ?";
		}
		
		//새로 등록할 댓글이 댓글의 댓글일 때
		if(reply.getReviewLevel() == 3) {
			query = "update Review set "
					+ "Review_reply_seq = Review_reply_seq + 1 "
					+ "where Review_ref = ? and Review_level = ? "
					+ "and Review_reply_ref = ?";
		}
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, reply.getReviewRef());
			pstmt.setInt(2, reply.getReviewLevel());
			
			if(reply.getReviewLevel() == 3) {
				pstmt.setInt(3, reply.getReviewReplyRef());
			}
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public int insertReplyReview(Connection conn, Review reply) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = null;
		
		if(reply.getReviewLevel()  == 2) {
			query = "insert into Review values ("
				+ "(select max(Review_num) + 1 from Review), "
				+ "?, ?, ?, null, null, sysdate, 2, ?, "
				+ "(select max(Review_num) + 1 from Review), "
				+ "?, default)";
		}		
		
		if(reply.getReviewLevel()  == 3) {
			query = "insert into Review values ("
					+ "(select max(Review_num) + 1 from Review), "
					+ "?, ?, ?, null, null, sysdate, 3, ?, "
					+ "?, ?, default)";
		}
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, reply.getReviewTitle());
			pstmt.setString(2, reply.getReviewWriter());
			pstmt.setString(3, reply.getReviewContent());
			pstmt.setInt(4, reply.getReviewRef());
			
			if(reply.getReviewLevel() == 2) {
				pstmt.setInt(5, reply.getReviewReplySeq());
			}
			
			if(reply.getReviewLevel() == 3) {
				pstmt.setInt(5, reply.getReviewReplyRef());
				pstmt.setInt(6, reply.getReviewReplySeq());
			}
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public int deleteReview(Connection conn, 
			int ReviewNum, int ReviewLevel) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "delete from Review ";
		
		if(ReviewLevel == 1) {
			//원글 삭제시에는 원글, 댓글, 대댓글 모두 삭제됨
			query += "where Review_ref = ?";
		}
		
		if(ReviewLevel == 2) {
			//원글에 대한 댓글 삭제시, 대댓글 같이 삭제
			query += "where Review_reply_ref = ?";
		}
		
		if(ReviewLevel == 3) {
			//대댓글은 자기글만 삭제
			query += "where Review_num = ?";
		}
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, ReviewNum);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

}













