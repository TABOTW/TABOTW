package question.model.service;

import static common.JDBCTemp.close;
import static common.JDBCTemp.commit;
import static common.JDBCTemp.getConnection;
import static common.JDBCTemp.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import notice.model.vo.Notice;
import question.model.vo.Question;

public class QuestionService {

//	public ArrayList<Question> selectList(int startRow, int endRow){
//		Connection conn = getConnection();
//		ArrayList<Question> list = qdao.selectList(conn, startRow, endRow);
//		close(conn);
//		return list;
//	}
//	
//
//	
//	public Question selectOne(int questionNo) {
//		Connection conn = getConnection();
//		Notice notice = qdao.selectOne(conn, questionNo);
//		close(conn);
//		return notice;
//	}
//	
//
//	
//	public void updateReadCount(int questionNo) {
//		Connection conn = getConnection();
//		int result = qdao.updateReadCount(conn, questionNo);
//		if(result > 0) {
//			commit(conn);
//		}else {
//			rollback(conn);
//		}
//		close(conn);
//	}
//
//	public int getListCount() {
//		Connection conn = getConnection();
//		int listCount = qdao.getListCount(conn);
//		close(conn);
//		return listCount;
//	}
	
//	public int insertOriginBoard(Question question) {
//		Connection conn = getConnection();
//		int result = qdao.insertOriginBoard(conn, question);
//		if(result > 0) {
//			commit(conn);
//		}else {
//			rollback(conn);
//		}
//		close(conn);
//		return result;
//	}		

}
