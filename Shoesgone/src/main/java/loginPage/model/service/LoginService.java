package loginPage.model.service;

import static common.JDBCTemp.close;
import static common.JDBCTemp.commit;
import static common.JDBCTemp.getConnection;
import static common.JDBCTemp.rollback;

import java.sql.Connection;

import loginPage.model.dao.LoginDao;
import loginPage.model.vo.Login;

public class LoginService {
	private LoginDao ldao = new LoginDao();

	public Login selectLogin(String userid, String userpwd) {
		Connection conn = getConnection();
		Login login = ldao.selectLogin(conn, userid, userpwd);
		close(conn);
		return login;
	}

	public int insertLogin(Login login) {
		Connection conn = getConnection();
		int result = ldao.insertLogin(conn, login);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public Login idValidate(String userid) {
		// TODO Auto-generated method stub
		Connection conn = getConnection();
		Login login = ldao.idValidate(conn, userid);
		close(conn);
		return login;
	}

	public Login selectNaverLogin(String userid) {
		Connection conn = getConnection();
		Login login = ldao.selectNaverLogin(conn, userid);
		close(conn);
		return login;
	}

	public Login searchId(String phone) {
		Connection conn = getConnection();
		Login login = ldao.searchId(conn, phone);
		close(conn);
		return login;
	}

	public int insertNaverLogin(Login newLogin) {
		Connection conn = getConnection();
		int result = ldao.insertNaverLogin(conn, newLogin);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public Login searchPassword(String phone, String email) {
		Connection conn = getConnection();
		Login login = ldao.searchPassword(conn, phone, email);
		close(conn);
		return login;
	}

	public void tempPassword(String randomPassword, String phone, String email) {
		Connection conn = getConnection();
		int result = ldao.tempPassword(conn, randomPassword, phone, email);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
	}

	public void updateLogin(Login newLogin, String cryptoUserpwd) {
		Connection conn = getConnection();
		int result = ldao.updateLogin(conn, newLogin, cryptoUserpwd);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
	}
}
