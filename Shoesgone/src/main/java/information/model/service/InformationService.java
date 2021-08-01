package information.model.service;

import static common.JDBCTemp.close;
import static common.JDBCTemp.commit;
import static common.JDBCTemp.getConnection;
import static common.JDBCTemp.rollback;

import java.sql.Connection;

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

}
