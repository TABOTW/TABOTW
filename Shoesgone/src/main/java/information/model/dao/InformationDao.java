package information.model.dao;

import static common.JDBCTemp.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import information.model.vo.Information;
import loginPage.model.vo.Login;

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

	public ArrayList<Login> adminselectAllMembers(Connection conn) {
		ArrayList<Login> users = new ArrayList<Login>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from user_info order by mgr asc";		
		
		try {
			pstmt = conn.prepareStatement(query);			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Login user = new Login();
				
				user.setUserNo(rset.getInt("USER_NO"));
				user.setUserName(rset.getString("USER_NAME"));
				user.setUserId(rset.getString("USER_ID"));
				//비밀번호는 필요하지 않음
				user.setEmail(rset.getString("EMAIL"));
				user.setPhone(rset.getString("PHONE"));
				user.setAddress(rset.getString("ADDRESS"));
				user.setShoesSize(rset.getInt("SHOES_SIZE"));
				user.setPoint(rset.getInt("POINT"));
				user.setMgr(rset.getString("MGR"));
				user.setBankName(rset.getString("BANK_NAME"));
				//계좌번호 불필요
				user.setLoginOk(rset.getString("LOGIN_OK"));
				
				users.add(user);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		
		return users;
	}

	public Login adminselectMGRLOKMember(Connection conn, int userno) {
		Login user = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from user_info where user_no = ?";				
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, userno);			
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				user = new Login();
				
				//컬럼값 꺼내서, 필드에 옮겨 기록하기 : 결과매핑
				//두가지, MGR과 LOK값
				user.setUserNo(rset.getInt("USER_NO"));
				user.setMgr(rset.getString("MGR"));
				user.setLoginOk(rset.getString("LOGIN_OK"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		
		return user;
	}

	public int adminupdateMGR(Connection conn, int userno, String mgrstatus) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "UPDATE USER_INFO "
				+ "SET "
				+ "MGR = ? "
				+ "WHERE USER_NO = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(2, userno);
			pstmt.setString(1, mgrstatus);
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}

	public int adminupdateLOK(Connection conn, int userno, String lokstatus) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "UPDATE USER_INFO "
				+ "SET "
				+ "LOGIN_OK = ? "
				+ "WHERE USER_NO = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(2, userno);
			pstmt.setString(1, lokstatus);
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}
}
