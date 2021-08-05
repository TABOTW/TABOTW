package community.qna.model.dao;

import static common.JDBCTemp.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import community.qna.model.vo.QnA;

public class QnADao {

	public ArrayList<QnA> selectTop3(Connection conn) {
		ArrayList<QnA> list = new ArrayList<QnA>();
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "SELECT * "
				+ "FROM (SELECT ROWNUM RNUM, QnA_No, QnA_TITLE, QnA_READCOUNT "
				+ "        FROM (SELECT * FROM QnA "
				+ "                WHERE QnA_LEVEL = 1 "
				+ "                ORDER BY QnA_READCOUNT DESC)) "
				+ "WHERE RNUM >= 1 AND RNUM <= 3";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				QnA QnA = new QnA();
				
				QnA.setQnANo(rset.getInt("QnA_No"));
				QnA.setQnATitle(rset.getString("QnA_title"));
				QnA.setQnAReadCount(rset.getInt("QnA_readcount"));
				
				list.add(QnA);
			}			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}		
		
		return list;
	}
	public QnA selectQnA(Connection conn, int QnANo) {
		QnA QnA = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from QnA "
				+ "where QnA_No = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, QnANo);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				QnA = new QnA();
				
				QnA.setQnANo(QnANo);
				QnA.setQnATitle(rset.getString("QnA_title"));
				QnA.setQnAWriter(rset.getInt("QnA_writer"));
				QnA.setQnAContent(rset.getString("QnA_content"));
				QnA.setQnAOriginalFilename(rset.getString("QnA_original_filename"));
				QnA.setQnARenameFilename(rset.getString("QnA_rename_filename"));
				QnA.setQnADate(rset.getDate("QnA_date"));
				QnA.setQnALevel(rset.getInt("QnA_level"));
				QnA.setQnARef(rset.getInt("QnA_ref"));
				QnA.setQnAReplyRef(rset.getInt("QnA_reply_ref"));
				QnA.setQnAReplySeq(rset.getInt("QnA_reply_seq"));
				QnA.setQnAReadCount(rset.getInt("QnA_readcount"));
				QnA.setQnALike(rset.getInt("QnA_like"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return QnA;
	}

	public int updateReadCount(Connection conn, int QnANo) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update QnA set "
				+ "QnA_readcount = QnA_readcount + 1 "
				+ "where QnA_No = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, QnANo);
			
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
		
		String query = "select count(*) from QnA";
		
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

	public ArrayList<QnA> selectList(Connection conn, 
			int startRow, int endRow, String orderBy) {
		ArrayList<QnA> list = new ArrayList<QnA>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		/*
		 * String query = "SELECT * " +
		 * "FROM (SELECT ROWNUM RNUM, QnA_No, QnA_TITLE, QnA_WRITER,  " +
		 * "                QnA_ORIGINAL_FILENAME, QnA_RENAME_FILENAME,  " +
		 * "                QnA_DATE, QnA_LEVEL, QnA_REF, QnA_REPLY_REF,  " +
		 * "                QnA_REPLY_SEQ, QnA_READCOUNT, QnA_content , QnA_like " +
		 * "        FROM (SELECT * FROM QnA " +
		 * "                ORDER BY QnA_REF DESC, QnA_REPLY_REF DESC, " +
		 * "                          QnA_LEVEL ASC, QnA_REPLY_SEQ ASC)) " +
		 * "WHERE RNUM >= ? AND RNUM <= ?";
		 */
		String query = "SELECT *"
				+ "FROM (SELECT ROWNUM RNUM, QnA_No, QnA_TITLE, QnA_WRITER,  "
				+ "                  QnA_DATE, QnA_READCOUNT, QnA_content , QnA_like "
				+ "            FROM (SELECT *"
				+ "		               FROM QnA "
				+ "                   ORDER BY " + orderBy
				+ "                 )"
				+ "      )"
				+ "WHERE RNUM >= ? AND RNUM <=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				QnA QnA  = new QnA();
				
				QnA.setQnANo(rset.getInt("QnA_No"));
				QnA.setQnATitle(rset.getString("QnA_title"));
				QnA.setQnAWriter(rset.getInt("QnA_writer"));
				QnA.setQnAContent(rset.getString("QnA_content"));				
				QnA.setQnADate(rset.getDate("QnA_date"));
				QnA.setQnAOriginalFilename(rset.getString("QnA_original_filename"));
				QnA.setQnARenameFilename(rset.getString("QnA_rename_filename"));
				QnA.setQnARef(rset.getInt("QnA_ref"));
				QnA.setQnALevel(rset.getInt("QnA_level"));
				QnA.setQnAReplyRef(rset.getInt("QnA_reply_ref"));
				QnA.setQnAReplySeq(rset.getInt("QnA_reply_seq"));
				QnA.setQnAReadCount(rset.getInt("QnA_readcount"));
				QnA.setQnALike(rset.getInt("QnA_like"));
				
				list.add(QnA);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}

	public int insertOriginQnA(Connection conn, QnA QnA) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "insert into QnA values ("
				+ "(select max(QnA_No) + 1 from QnA), "
				+ "?, ?, ?, ?, ?, sysdate, 1, "
				+ "(select max(QnA_No) + 1 from QnA), "
				+ "null, default, default)";		
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, QnA.getQnATitle());
			pstmt.setInt(2, QnA.getQnAWriter());
			pstmt.setString(3, QnA.getQnAContent());
			pstmt.setString(4, QnA.getQnAOriginalFilename());
			pstmt.setString(5, QnA.getQnARenameFilename());
						
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public int updateOrigin(Connection conn, QnA origin) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update QnA set "
				+ "QnA_title = ?, "
				+ "QnA_content = ?, "
				+ "QnA_original_filename = ?, "
				+ "QnA_rename_filename = ? "
				+ "where QnA_No = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, origin.getQnATitle());
			pstmt.setString(2, origin.getQnAContent());
			pstmt.setString(3, origin.getQnAOriginalFilename());
			pstmt.setString(4, origin.getQnARenameFilename());
			pstmt.setInt(5, origin.getQnANo());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}
	
	public int updateReply(Connection conn, QnA reply) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update QnA set "
				+ "QnA_title = ?, "
				+ "QnA_content = ? "
				+ "where QnA_No = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, reply.getQnATitle());
			pstmt.setString(2, reply.getQnAContent());
			pstmt.setInt(3, reply.getQnANo());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public int updateReplySeq(Connection conn, QnA reply) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = null;
		
		//새로 등록할 댓글이 원글의 댓글일 때
		if(reply.getQnALevel() == 2) {
			query = "update QnA set "
				+ "QnA_reply_seq = QnA_reply_seq + 1 "
				+ "where QnA_ref = ? and QnA_level = ?";
		}
		
		//새로 등록할 댓글이 댓글의 댓글일 때
		if(reply.getQnALevel() == 3) {
			query = "update QnA set "
					+ "QnA_reply_seq = QnA_reply_seq + 1 "
					+ "where QnA_ref = ? and QnA_level = ? "
					+ "and QnA_reply_ref = ?";
		}
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, reply.getQnARef());
			pstmt.setInt(2, reply.getQnALevel());
			
			if(reply.getQnALevel() == 3) {
				pstmt.setInt(3, reply.getQnAReplyRef());
			}
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public int insertReplyQnA(Connection conn, QnA reply) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = null;
		
		if(reply.getQnALevel()  == 2) {
			query = "insert into QnA values ("
				+ "(select max(QnA_No) + 1 from QnA), "
				+ "?, ?, ?, null, null, sysdate, 2, ?, "
				+ "(select max(QnA_No) + 1 from QnA), "
				+ "?, default)";
		}		
		
		if(reply.getQnALevel()  == 3) {
			query = "insert into QnA values ("
					+ "(select max(QnA_No) + 1 from QnA), "
					+ "?, ?, ?, null, null, sysdate, 3, ?, "
					+ "?, ?, default)";
		}
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, reply.getQnATitle());
			pstmt.setInt(2, reply.getQnAWriter());
			pstmt.setString(3, reply.getQnAContent());
			pstmt.setInt(4, reply.getQnARef());
			
			if(reply.getQnALevel() == 2) {
				pstmt.setInt(5, reply.getQnAReplySeq());
			}
			
			if(reply.getQnALevel() == 3) {
				pstmt.setInt(5, reply.getQnAReplyRef());
				pstmt.setInt(6, reply.getQnAReplySeq());
			}
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public int deleteQnA(Connection conn, 
			int QnANo, int QnALevel) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "delete from QnA ";
		
		if(QnALevel == 1) {
			//원글 삭제시에는 원글, 댓글, 대댓글 모두 삭제됨
			query += "where QnA_ref = ?";
		}
		
		if(QnALevel == 2) {
			//원글에 대한 댓글 삭제시, 대댓글 같이 삭제
			query += "where QnA_reply_ref = ?";
		}
		
		if(QnALevel == 3) {
			//대댓글은 자기글만 삭제
			query += "where QnA_No = ?";
		}
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, QnANo);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

}













