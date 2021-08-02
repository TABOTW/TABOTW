package review.model.service;

import static common.JDBCTemp.close;
import static common.JDBCTemp.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import notice.model.vo.Notice;
import review.model.dao.ReviewDao;
import review.model.vo.Review;

public class ReviewService {
	private ReviewDao rdao = new ReviewDao();
	
}
