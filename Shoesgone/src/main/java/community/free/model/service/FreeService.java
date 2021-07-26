package community.free.model.service;

import static common.JDBCTemp.*;

import java.sql.Connection;
import java.util.ArrayList;

import community.free.model.dao.FreeDao;
import community.free.model.vo.Free;

public class FreeService {
	private FreeDao bdao = new FreeDao();
	
	public ArrayList<Free> selectTop3(){
		Connection conn = getConnection();
		ArrayList<Free> list = bdao.selectTop3(conn);
		close(conn);
		return list;
	}
	public Free selectFree(int FreeNo) {
		Connection conn = getConnection();
		Free Free = bdao.selectFree(conn, FreeNo);
		close(conn);
		return Free;
	}
	
	public void addReadCount(int FreeNo) {
		Connection conn = getConnection();
		int result = bdao.updateReadCount(conn, FreeNo);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
	}

	public int getListCount() {
		Connection conn = getConnection();
		int listCount = bdao.getListCount(conn);
		close(conn);
		return listCount;
	}

	public ArrayList<Free> selectList(int startRow, int endRow) {
		Connection conn = getConnection();
		ArrayList<Free> list = bdao.selectList(conn, startRow, endRow);
		close(conn);
		return list;
	}

	public int insertOriginFree(Free Free) {
		Connection conn = getConnection();
		int result = bdao.insertOriginFree(conn, Free);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public int updateOrigin(Free Free) {
		Connection conn = getConnection();
		int result = bdao.updateOrigin(conn, Free);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
	
	public int updateReply(Free Free) {
		Connection conn = getConnection();
		int result = bdao.updateReply(conn, Free);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public void updateReplySeq(Free reply) {
		Connection conn = getConnection();
		int result = bdao.updateReplySeq(conn, reply);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);		
	}

	public int insertReplyFree(Free reply) {
		Connection conn = getConnection();
		int result = bdao.insertReplyFree(conn, reply);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public int deleteFree(int FreeNo, int FreeLevel) {
		Connection conn = getConnection();
		int result = bdao.deleteFree(conn, FreeNo, FreeLevel);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
}
