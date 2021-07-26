package community.free.model.dao;

import static common.JDBCTemp.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import community.free.model.vo.Free;

public class FreeDao {

	public ArrayList<Free> selectTop3(Connection conn) {
		ArrayList<Free> list = new ArrayList<Free>();
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "SELECT * "
				+ "FROM (SELECT ROWNUM RNUM, Free_NO, Free_TITLE, Free_READCOUNT "
				+ "        FROM (SELECT * FROM Free "
				+ "                WHERE Free_LEVEL = 1 "
				+ "                ORDER BY Free_READCOUNT DESC)) "
				+ "WHERE RNUM >= 1 AND RNUM <= 3";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				Free Free = new Free();
				
				Free.setFreeNo(rset.getInt("Free_n"));
				Free.setFreeTitle(rset.getString("Free_title"));
				Free.setFreeReadCount(rset.getInt("Free_readcount"));
				
				list.add(Free);
			}			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}		
		
		return list;
	}
	public Free selectFree(Connection conn, int FreeNO) {
		Free Free = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from Free "
				+ "where Free_NO = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, FreeNO);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				Free = new Free();
				
				Free.setFreeNo(FreeNO);
				Free.setFreeTitle(rset.getString("Free_title"));
				Free.setFreeWriter(rset.getString("Free_writer"));
				Free.setFreeContent(rset.getString("Free_content"));
				// TODO 여기.. 컬럼 정리해야 함
				//Free.setFreeOriginalFilename(rset.getString("Free_original_filename"));
				//Free.setFreeRenameFilename(rset.getString("Free_rename_filename"));
				Free.setFreeDate(rset.getDate("Free_date"));
				//Free.setFreeLevel(rset.getInt("Free_level"));
				//Free.setFreeRef(rset.getInt("Free_ref"));
				//Free.setFreeReplyRef(rset.getInt("Free_reply_ref"));
				//Free.setFreeReplySeq(rset.getInt("Free_reply_seq"));
				Free.setFreeReadCount(rset.getInt("Free_readcount"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return Free;
	}

	public int updateReadCount(Connection conn, int FreeNO) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update Free set "
				+ "Free_readcount = Free_readcount + 1 "
				+ "where Free_NO = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, FreeNO);
			
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
		
		String query = "select count(*) from Free";
		
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

	public ArrayList<Free> selectList(Connection conn, 
			int startRow, int endRow) {
		ArrayList<Free> list = new ArrayList<Free>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "SELECT * "
				+ "FROM (SELECT ROWNUM RNUM, Free_NO, Free_TITLE, Free_WRITER,  "
				+ "                Free_ORIGINAL_FILENAME, Free_RENAME_FILENAME,  "
				+ "                Free_DATE, Free_LEVEL, Free_REF, Free_REPLY_REF,  "
				+ "                Free_REPLY_SEQ, Free_READCOUNT, Free_content "
				+ "        FROM (SELECT * FROM Free "
				+ "                ORDER BY Free_REF DESC, Free_REPLY_REF DESC, "
				+ "                          Free_LEVEL ASC, Free_REPLY_SEQ ASC)) "
				+ "WHERE RNUM >= ? AND RNUM <= ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Free Free  = new Free();
				
				Free.setFreeNo(rset.getInt("Free_no"));
				Free.setFreeTitle(rset.getString("Free_title"));
				Free.setFreeWriter(rset.getString("Free_writer"));
				Free.setFreeContent(rset.getString("Free_content"));				Free.setFreeDate(rset.getDate("Free_date"));
				Free.setFreeOriginalFilename(rset.getString("Free_original_filename"));
				Free.setFreeRenameFilename(rset.getString("Free_rename_filename"));
				Free.setFreeRef(rset.getInt("Free_ref"));
				Free.setFreeLevel(rset.getInt("Free_level"));
				Free.setFreeReplyRef(rset.getInt("Free_reply_ref"));
				Free.setFreeReplySeq(rset.getInt("Free_reply_seq"));
				Free.setFreeReadCount(rset.getInt("Free_readcount"));
				
				list.add(Free);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}

	public int insertOriginFree(Connection conn, Free Free) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "insert into Free values ("
				+ "(select max(Free_NO) + 1 from Free), "
				+ "?, ?, ?, ?, ?, sysdate, 1, "
				+ "(select max(Free_NO) + 1 from Free), "
				+ "null, default, default)";		
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, Free.getFreeTitle());
			pstmt.setString(2, Free.getFreeWriter());
			pstmt.setString(3, Free.getFreeContent());
			pstmt.setString(4, Free.getFreeOriginalFilename());
			pstmt.setString(5, Free.getFreeRenameFilename());
						
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public int updateOrigin(Connection conn, Free origin) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update Free set "
				+ "Free_title = ?, "
				+ "Free_content = ?, "
				+ "Free_original_filename = ?, "
				+ "Free_rename_filename = ? "
				+ "where Free_NO = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, origin.getFreeTitle());
			pstmt.setString(2, origin.getFreeContent());
			pstmt.setString(3, origin.getFreeOriginalFilename());
			pstmt.setString(4, origin.getFreeRenameFilename());
			pstmt.setInt(5, origin.getFreeNo());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}
	
	public int updateReply(Connection conn, Free reply) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update Free set "
				+ "Free_title = ?, "
				+ "Free_content = ? "
				+ "where Free_NO = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, reply.getFreeTitle());
			pstmt.setString(2, reply.getFreeContent());
			pstmt.setInt(3, reply.getFreeNo());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public int updateReplySeq(Connection conn, Free reply) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = null;
		
		//새로 등록할 댓글이 원글의 댓글일 때
		if(reply.getFreeLevel() == 2) {
			query = "update Free set "
				+ "Free_reply_seq = Free_reply_seq + 1 "
				+ "where Free_ref = ? and Free_level = ?";
		}
		
		//새로 등록할 댓글이 댓글의 댓글일 때
		if(reply.getFreeLevel() == 3) {
			query = "update Free set "
					+ "Free_reply_seq = Free_reply_seq + 1 "
					+ "where Free_ref = ? and Free_level = ? "
					+ "and Free_reply_ref = ?";
		}
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, reply.getFreeRef());
			pstmt.setInt(2, reply.getFreeLevel());
			
			if(reply.getFreeLevel() == 3) {
				pstmt.setInt(3, reply.getFreeReplyRef());
			}
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public int insertReplyFree(Connection conn, Free reply) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = null;
		
		if(reply.getFreeLevel()  == 2) {
			query = "insert into Free values ("
				+ "(select max(Free_NO) + 1 from Free), "
				+ "?, ?, ?, null, null, sysdate, 2, ?, "
				+ "(select max(Free_NO) + 1 from Free), "
				+ "?, default)";
		}		
		
		if(reply.getFreeLevel()  == 3) {
			query = "insert into Free values ("
					+ "(select max(Free_NO) + 1 from Free), "
					+ "?, ?, ?, null, null, sysdate, 3, ?, "
					+ "?, ?, default)";
		}
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, reply.getFreeTitle());
			pstmt.setString(2, reply.getFreeWriter());
			pstmt.setString(3, reply.getFreeContent());
			pstmt.setInt(4, reply.getFreeRef());
			
			if(reply.getFreeLevel() == 2) {
				pstmt.setInt(5, reply.getFreeReplySeq());
			}
			
			if(reply.getFreeLevel() == 3) {
				pstmt.setInt(5, reply.getFreeReplyRef());
				pstmt.setInt(6, reply.getFreeReplySeq());
			}
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public int deleteFree(Connection conn, 
			int FreeNO, int FreeLevel) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "delete from Free ";
		
		if(FreeLevel == 1) {
			//원글 삭제시에는 원글, 댓글, 대댓글 모두 삭제됨
			query += "where Free_ref = ?";
		}
		
		if(FreeLevel == 2) {
			//원글에 대한 댓글 삭제시, 대댓글 같이 삭제
			query += "where Free_reply_ref = ?";
		}
		
		if(FreeLevel == 3) {
			//대댓글은 자기글만 삭제
			query += "where Free_NO = ?";
		}
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, FreeNO);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

}













