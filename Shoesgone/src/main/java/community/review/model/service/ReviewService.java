package community.review.model.service;

import static common.JDBCTemp.*;

import java.sql.Connection;
import java.util.ArrayList;

import community.review.model.dao.ReviewDao;
import community.review.model.vo.Review;

public class ReviewService {
	private ReviewDao bdao = new ReviewDao();
	
	public ArrayList<Review> selectTop3(){
		Connection conn = getConnection();
		ArrayList<Review> list = bdao.selectTop3(conn);
		close(conn);
		return list;
	}
	public Review selectReview(int ReviewNum) {
		Connection conn = getConnection();
		Review Review = bdao.selectReview(conn, ReviewNum);
		close(conn);
		return Review;
	}
	
	public void addReadCount(int ReviewNum) {
		Connection conn = getConnection();
		int result = bdao.updateReadCount(conn, ReviewNum);
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

	public ArrayList<Review> selectList(int startRow, int endRow) {
		Connection conn = getConnection();
		ArrayList<Review> list = bdao.selectList(conn, startRow, endRow);
		close(conn);
		return list;
	}

	public int insertOriginReview(Review Review) {
		Connection conn = getConnection();
		int result = bdao.insertOriginReview(conn, Review);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public int updateOrigin(Review Review) {
		Connection conn = getConnection();
		int result = bdao.updateOrigin(conn, Review);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
	
	public int updateReply(Review Review) {
		Connection conn = getConnection();
		int result = bdao.updateReply(conn, Review);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public void updateReplySeq(Review reply) {
		Connection conn = getConnection();
		int result = bdao.updateReplySeq(conn, reply);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);		
	}

	public int insertReplyReview(Review reply) {
		Connection conn = getConnection();
		int result = bdao.insertReplyReview(conn, reply);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public int deleteReview(int ReviewNum, int ReviewLevel) {
		Connection conn = getConnection();
		int result = bdao.deleteReview(conn, ReviewNum, ReviewLevel);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
}
