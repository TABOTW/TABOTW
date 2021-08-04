package information.model.service;

import static common.JDBCTemp.close;
import static common.JDBCTemp.commit;
import static common.JDBCTemp.getConnection;
import static common.JDBCTemp.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import information.model.dao.InformationDao;
import information.model.vo.Information;

public class InformationService {
	private InformationDao idao = new InformationDao();
	
	public Information selectMember(String userid) {
		Connection conn = getConnection();
		Information information = idao.selectMember(conn, userid);
		close(conn);
		return information;
	}
	public int updateMember(Information information) {
		Connection conn = getConnection();
		int result = idao.updateMember(conn, information);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
	
	public int updateName(Information information) {
		Connection conn = getConnection();
		int result = idao.updateName(conn, information);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
	
	public Information adminselectMember(int userNo) {
		Connection conn = getConnection();
		Information information = idao.adminSelectMember(conn, userNo);
		close(conn);
		return information;
	}
	
	// 관리자용 회원 정보 전체 리스트 출력용 메소드
	public ArrayList<Information> adminSelectList(){
		Connection conn = getConnection();
		ArrayList<Information> userList = idao.adminSelectList(conn);
		close(conn);
		
		return userList;
	}
	
	// 관리자용 회원 정보 수정용 메소드
	public int adminUserUpdate(Information userUp) {
		Connection conn = getConnection();
		int result = idao.adminUserUpdate(conn, userUp);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		
		return result;
	}

}
