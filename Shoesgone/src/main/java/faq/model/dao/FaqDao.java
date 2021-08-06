package faq.model.dao;

import static common.JDBCTemp.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import faq.model.vo.Faq;

public class FaqDao {

	public ArrayList<Faq> selectList(Connection conn, 
			int startRow, int endRow){
		ArrayList<Faq> list = new ArrayList<Faq>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from (select rownum rnum, faq_no, faq_title, faq_writer, "
				+ "				faq_date, faq_content, faq_readcount, faq_available "
				+ "            from faq where faq_available = 1 order by faq_no desc) "
				+ "            where rnum >=? and rnum <= ?";
		
		try {
			
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			rset = pstmt.executeQuery();
			while(rset.next()) {
				Faq faq = new Faq();
				
				faq.setFaqNo(rset.getInt("faq_no"));
				faq.setFaqTitle(rset.getString("faq_title"));
				faq.setFaqWriter(rset.getString("faq_writer"));
				faq.setFaqDate(rset.getDate("faq_date"));
				faq.setFaqContent(rset.getString("faq_content"));
				faq.setFaqReadcount(rset.getInt("faq_readcount"));
				faq.setFaqavailable(rset.getInt("faq_available"));
				
					
				list.add(faq);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}
	
	//공지글번호로 한 개 조회 : 공지사항 상세보기용
			public Faq selectOne(Connection conn, int faqNo) {
				Faq faq = null;
				PreparedStatement pstmt = null;
				ResultSet rset = null;
				
				String query = "select * from faq "
						+ "where faq_no = ?";
				
				try {
					pstmt = conn.prepareStatement(query);
					pstmt.setInt(1, faqNo);
					
					rset = pstmt.executeQuery();
					
					if(rset.next()) {
						faq = new Faq();
						
						faq.setFaqNo(rset.getInt("faq_no"));
						faq.setFaqTitle(rset.getString("faq_title"));
						faq.setFaqWriter(rset.getString("faq_writer"));
						faq.setFaqDate(rset.getDate("faq_date"));
						faq.setFaqContent(rset.getString("faq_content"));
						faq.setFaqReadcount(rset.getInt("faq_readcount"));
						faq.setFaqavailable(rset.getInt("faq_available"));
						
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					close(rset);
					close(pstmt);
				}
				
				return faq;
			}
			

			
			public int updateReadCount(Connection conn, int faqNo) {
				int result = 0;
				PreparedStatement pstmt = null;
				
				String query = "update faq set "
						+ "faq_readcount = faq_readcount + 1 "
						+ "where faq_no = ?";
				
				try {
					pstmt = conn.prepareStatement(query);
					pstmt.setInt(1, faqNo);
					
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
				
				String query = "select count(*) from faq";
				
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


}
