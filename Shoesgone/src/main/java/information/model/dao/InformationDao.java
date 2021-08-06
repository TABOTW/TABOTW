package information.model.dao;

import static common.JDBCTemp.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import information.model.vo.Information;

public class InformationDao {
	

	public Information selectMember(Connection conn, String userid) {
		Information information = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from user_info "
				+ "where user_id = ?";				
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userid);			
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				information = new Information();
				
				//컬럼값 꺼내서, 필드에 옮겨 기록하기 : 결과매핑
				information.setUserNo(rset.getInt("user_no"));
				information.setUserName(rset.getString("user_name"));
				information.setUserId(userid);
				information.setUserPwd(rset.getString("user_pwd"));
				information.setEmail(rset.getString("email"));
				information.setPhone(rset.getString("phone"));
				information.setAddress(rset.getString("address"));
				information.setShoesSize(rset.getInt("shoes_size"));
				information.setPoint(rset.getInt("point"));
				information.setMgr(rset.getString("mgr"));
				information.setBankName(rset.getString("bank_name"));
				information.setAccountNo(rset.getString("account_no"));
				information.setLoginOk(rset.getString("login_ok"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		
		return information;
	
	}

	public int updateMember(Connection conn, Information information) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update user_info "
				+ "set "
				+ "USER_NAME = ?, "
				+ "USER_PWD = ?, "
				+ "EMAIL = ?, "
				+ "PHONE = ?, "
				+ "ADDRESS = ?, "
				+ "SHOES_SIZE = ?, "
				+ "BANK_NAME = ?, "
				+ "ACCOUNT_NO = ? "
				+ "where user_id = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, information.getUserName());
			pstmt.setString(2, information.getUserPwd());
			pstmt.setString(3, information.getEmail());
			pstmt.setString(4, information.getPhone());
			pstmt.setString(5, information.getAddress());
			pstmt.setInt(6, information.getShoesSize());
			pstmt.setString(7, information.getBankName());
			pstmt.setString(8, information.getAccountNo());
			pstmt.setString(9, information.getUserId());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}

	public int updateName(Connection conn, Information information) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update user_info "
				+ "set "
				+ "USER_NAME = ?, "
				+ "where user_id = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, information.getUserName());
			pstmt.setString(2, information.getUserId());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}
	
	public Information adminSelectMember(Connection conn, int userNo) {
		Information information = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from user_info "
				+ "where user_no = ?";				
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, userNo);			
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				information = new Information();
				
				//컬럼값 꺼내서, 필드에 옮겨 기록하기 : 결과매핑
				information.setUserNo(userNo);
				information.setUserName(rset.getString("user_name"));
				information.setUserId(rset.getString("user_id"));
				information.setUserPwd(rset.getString("user_pwd"));
				information.setEmail(rset.getString("email"));
				information.setPhone(rset.getString("phone"));
				information.setAddress(rset.getString("address"));
				information.setShoesSize(rset.getInt("shoes_size"));
				information.setPoint(rset.getInt("point"));
				information.setMgr(rset.getString("mgr"));
				information.setBankName(rset.getString("bank_name"));
				information.setAccountNo(rset.getString("account_no"));
				information.setLoginOk(rset.getString("login_ok"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		
		return information;
	
	}

	// 관리자용 회원 정보 전체 리스트 출력용 메소드
	public ArrayList<Information> adminSelectList(Connection conn) {
		ArrayList<Information> userList = new ArrayList<Information>();
		Statement stm = null;
		ResultSet rs = null;
		
		String query = "select * from user_info";
		
		try {
			stm = conn.createStatement();
			rs = stm.executeQuery(query);
			
			while(rs.next()) {
				Information user = new Information();
				
				user.setUserNo(rs.getInt("user_no"));
				user.setUserName(rs.getString("user_name"));
				user.setUserId(rs.getString("user_id"));
				user.setUserPwd(rs.getString("user_pwd"));
				user.setEmail(rs.getString("email"));
				user.setPhone(rs.getString("phone"));
				user.setAddress(rs.getString("address"));
				user.setShoesSize(rs.getInt("shoes_size"));
				user.setPoint(rs.getInt("point"));
				user.setMgr(rs.getString("mgr"));
				user.setBankName(rs.getString("bank_name"));
				user.setAccountNo(rs.getString("account_no"));
				user.setLoginOk(rs.getString("login_ok"));
				
				userList.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(stm);
		}
		
		return userList;
	}

	// 관리자용 회원정보수정용 메소드
	public int adminUserUpdate(Connection conn, Information userUp) {
		int result = 0;
		PreparedStatement ps = null;
		
		String query = "update user_info set mgr = ?, loginok = ? where user_no = ?";
		
		try {
			ps = conn.prepareStatement(query);
			
			ps.setString(1, userUp.getMgr());
			ps.setString(2, userUp.getLoginOk());
			ps.setInt(3, userUp.getUserNo());
			
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(ps);
		}
		
		return result;
	}
}