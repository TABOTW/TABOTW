package community.qna.model.service;

import static common.JDBCTemp.*;

import java.sql.Connection;
import java.util.ArrayList;

import community.qna.model.dao.QnADao;
import community.qna.model.vo.QnA;

public class QnAService {
	private QnADao bdao = new QnADao();
	
	public ArrayList<QnA> selectTop3(){
		Connection conn = getConnection();
		ArrayList<QnA> list = bdao.selectTop3(conn);
		close(conn);
		return list;
	}
	public QnA selectQnA(int QnANo) {
		Connection conn = getConnection();
		QnA QnA = bdao.selectQnA(conn, QnANo);
		close(conn);
		return QnA;
	}
	
	public void addReadCount(int QnANo) {
		Connection conn = getConnection();
		int result = bdao.updateReadCount(conn, QnANo);
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

	public ArrayList<QnA> selectList(int startRow, int endRow) {
		Connection conn = getConnection();
		ArrayList<QnA> list = bdao.selectList(conn, startRow, endRow);
		close(conn);
		return list;
	}

	public int insertOriginQnA(QnA QnA) {
		Connection conn = getConnection();
		int result = bdao.insertOriginQnA(conn, QnA);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public int updateOrigin(QnA QnA) {
		Connection conn = getConnection();
		int result = bdao.updateOrigin(conn, QnA);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
	
	public int updateReply(QnA QnA) {
		Connection conn = getConnection();
		int result = bdao.updateReply(conn, QnA);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public void updateReplySeq(QnA reply) {
		Connection conn = getConnection();
		int result = bdao.updateReplySeq(conn, reply);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);		
	}

	public int insertReplyQnA(QnA reply) {
		Connection conn = getConnection();
		int result = bdao.insertReplyQnA(conn, reply);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public int deleteQnA(int QnANo, int QnALevel) {
		Connection conn = getConnection();
		int result = bdao.deleteQnA(conn, QnANo, QnALevel);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
}
