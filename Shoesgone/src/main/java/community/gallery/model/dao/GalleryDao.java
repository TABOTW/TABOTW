package community.gallery.model.dao;

import static common.JDBCTemp.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import community.gallery.model.vo.Gallery;

public class GalleryDao {

	public ArrayList<Gallery> selectTop3(Connection conn) {
		ArrayList<Gallery> list = new ArrayList<Gallery>();
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "SELECT * "
				+ "FROM (SELECT ROWNUM RNUM, Gallery_No, Gallery_TITLE, Gallery_READCOUNT "
				+ "        FROM (SELECT * FROM Gallery "
				+ "                WHERE Gallery_LEVEL = 1 "
				+ "                ORDER BY Gallery_READCOUNT DESC)) "
				+ "WHERE RNUM >= 1 AND RNUM <= 3";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				Gallery Gallery = new Gallery();
				
				Gallery.setGalleryNo(rset.getInt("Gallery_No"));
				Gallery.setGalleryTitle(rset.getString("Gallery_title"));
				Gallery.setGalleryReadCount(rset.getInt("Gallery_readcount"));
				
				list.add(Gallery);
			}			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}		
		
		return list;
	}
	public Gallery selectGallery(Connection conn, int GalleryNo) {
		Gallery Gallery = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from Gallery "
				+ "where Gallery_No = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, GalleryNo);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				Gallery = new Gallery();
				
				Gallery.setGalleryNo(GalleryNo);
				Gallery.setGalleryTitle(rset.getString("Gallery_title"));
				Gallery.setGalleryWriter(rset.getString("Gallery_writer"));
				Gallery.setGalleryContent(rset.getString("Gallery_content"));
				Gallery.setGalleryOriginalFilename(rset.getString("Gallery_original_filename"));
				Gallery.setGalleryRenameFilename(rset.getString("Gallery_rename_filename"));
				Gallery.setGalleryDate(rset.getDate("Gallery_date"));
				Gallery.setGalleryLevel(rset.getInt("Gallery_level"));
				Gallery.setGalleryRef(rset.getInt("Gallery_ref"));
				Gallery.setGalleryReplyRef(rset.getInt("Gallery_reply_ref"));
				Gallery.setGalleryReplySeq(rset.getInt("Gallery_reply_seq"));
				Gallery.setGalleryReadCount(rset.getInt("Gallery_readcount"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return Gallery;
	}

	public int updateReadCount(Connection conn, int GalleryNo) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update Gallery set "
				+ "Gallery_readcount = Gallery_readcount + 1 "
				+ "where Gallery_No = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, GalleryNo);
			
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
		
		String query = "select count(*) from Gallery";
		
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

	public ArrayList<Gallery> selectList(Connection conn, 
			int startRow, int endRow) {
		ArrayList<Gallery> list = new ArrayList<Gallery>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "SELECT * "
				+ "FROM (SELECT ROWNo RNo, Gallery_No, Gallery_TITLE, Gallery_WRITER,  "
				+ "                Gallery_ORIGINAL_FILENAME, Gallery_RENAME_FILENAME,  "
				+ "                Gallery_DATE, Gallery_LEVEL, Gallery_REF, Gallery_REPLY_REF,  "
				+ "                Gallery_REPLY_SEQ, Gallery_READCOUNT, Gallery_content "
				+ "        FROM (SELECT * FROM Gallery "
				+ "                ORDER BY Gallery_REF DESC, Gallery_REPLY_REF DESC, "
				+ "                          Gallery_LEVEL ASC, Gallery_REPLY_SEQ ASC)) "
				+ "WHERE RNo >= ? AND RNo <= ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Gallery Gallery  = new Gallery();
				
				Gallery.setGalleryNo(rset.getInt("Gallery_No"));
				Gallery.setGalleryTitle(rset.getString("Gallery_title"));
				Gallery.setGalleryWriter(rset.getString("Gallery_writer"));
				Gallery.setGalleryContent(rset.getString("Gallery_content"));				Gallery.setGalleryDate(rset.getDate("Gallery_date"));
				Gallery.setGalleryOriginalFilename(rset.getString("Gallery_original_filename"));
				Gallery.setGalleryRenameFilename(rset.getString("Gallery_rename_filename"));
				Gallery.setGalleryRef(rset.getInt("Gallery_ref"));
				Gallery.setGalleryLevel(rset.getInt("Gallery_level"));
				Gallery.setGalleryReplyRef(rset.getInt("Gallery_reply_ref"));
				Gallery.setGalleryReplySeq(rset.getInt("Gallery_reply_seq"));
				Gallery.setGalleryReadCount(rset.getInt("Gallery_readcount"));
				
				list.add(Gallery);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}

	public int insertOriginGallery(Connection conn, Gallery Gallery) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "insert into Gallery values ("
				+ "(select max(Gallery_No) + 1 from Gallery), "
				+ "?, ?, ?, ?, ?, sysdate, 1, "
				+ "(select max(Gallery_No) + 1 from Gallery), "
				+ "null, default, default)";		
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, Gallery.getGalleryTitle());
			pstmt.setString(2, Gallery.getGalleryWriter());
			pstmt.setString(3, Gallery.getGalleryContent());
			pstmt.setString(4, Gallery.getGalleryOriginalFilename());
			pstmt.setString(5, Gallery.getGalleryRenameFilename());
						
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public int updateOrigin(Connection conn, Gallery origin) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update Gallery set "
				+ "Gallery_title = ?, "
				+ "Gallery_content = ?, "
				+ "Gallery_original_filename = ?, "
				+ "Gallery_rename_filename = ? "
				+ "where Gallery_No = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, origin.getGalleryTitle());
			pstmt.setString(2, origin.getGalleryContent());
			pstmt.setString(3, origin.getGalleryOriginalFilename());
			pstmt.setString(4, origin.getGalleryRenameFilename());
			pstmt.setInt(5, origin.getGalleryNo());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}
	
	public int updateReply(Connection conn, Gallery reply) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update Gallery set "
				+ "Gallery_title = ?, "
				+ "Gallery_content = ? "
				+ "where Gallery_No = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, reply.getGalleryTitle());
			pstmt.setString(2, reply.getGalleryContent());
			pstmt.setInt(3, reply.getGalleryNo());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public int updateReplySeq(Connection conn, Gallery reply) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = null;
		
		//새로 등록할 댓글이 원글의 댓글일 때
		if(reply.getGalleryLevel() == 2) {
			query = "update Gallery set "
				+ "Gallery_reply_seq = Gallery_reply_seq + 1 "
				+ "where Gallery_ref = ? and Gallery_level = ?";
		}
		
		//새로 등록할 댓글이 댓글의 댓글일 때
		if(reply.getGalleryLevel() == 3) {
			query = "update Gallery set "
					+ "Gallery_reply_seq = Gallery_reply_seq + 1 "
					+ "where Gallery_ref = ? and Gallery_level = ? "
					+ "and Gallery_reply_ref = ?";
		}
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, reply.getGalleryRef());
			pstmt.setInt(2, reply.getGalleryLevel());
			
			if(reply.getGalleryLevel() == 3) {
				pstmt.setInt(3, reply.getGalleryReplyRef());
			}
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public int insertReplyGallery(Connection conn, Gallery reply) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = null;
		
		if(reply.getGalleryLevel()  == 2) {
			query = "insert into Gallery values ("
				+ "(select max(Gallery_No) + 1 from Gallery), "
				+ "?, ?, ?, null, null, sysdate, 2, ?, "
				+ "(select max(Gallery_No) + 1 from Gallery), "
				+ "?, default)";
		}		
		
		if(reply.getGalleryLevel()  == 3) {
			query = "insert into Gallery values ("
					+ "(select max(Gallery_No) + 1 from Gallery), "
					+ "?, ?, ?, null, null, sysdate, 3, ?, "
					+ "?, ?, default)";
		}
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, reply.getGalleryTitle());
			pstmt.setString(2, reply.getGalleryWriter());
			pstmt.setString(3, reply.getGalleryContent());
			pstmt.setInt(4, reply.getGalleryRef());
			
			if(reply.getGalleryLevel() == 2) {
				pstmt.setInt(5, reply.getGalleryReplySeq());
			}
			
			if(reply.getGalleryLevel() == 3) {
				pstmt.setInt(5, reply.getGalleryReplyRef());
				pstmt.setInt(6, reply.getGalleryReplySeq());
			}
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public int deleteGallery(Connection conn, 
			int GalleryNo, int GalleryLevel) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "delete from Gallery ";
		
		if(GalleryLevel == 1) {
			//원글 삭제시에는 원글, 댓글, 대댓글 모두 삭제됨
			query += "where Gallery_ref = ?";
		}
		
		if(GalleryLevel == 2) {
			//원글에 대한 댓글 삭제시, 대댓글 같이 삭제
			query += "where Gallery_reply_ref = ?";
		}
		
		if(GalleryLevel == 3) {
			//대댓글은 자기글만 삭제
			query += "where Gallery_No = ?";
		}
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, GalleryNo);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

}













