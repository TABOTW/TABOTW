package community.review.model.vo;

import java.sql.Date;

public class Review implements java.io.Serializable {
	private static final long serialVersionUID = 113L;
	
	private int ReviewNo;  //리뷰글 번호
	private String ReviewTitle; //리뷰글 제목
	private int ReviewWriterNo; //리뷰글 작성자 번호
	private java.sql.Date ReviewDate; //리뷰글 작설 날짜
	private String ReviewContent; //리뷰글 내용
	private int ReviewItemNo; //리뷰글 상품 번호
	private int ReviewStar; //리뷰글 별점
	private int ReviewLike; //리뷰글 좋아요수
	private int ReviewReadcount; //리뷰글 조회수
	
	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Review(int reviewNo, String reviewTitle, int reviewWriterNo, Date reviewDate, String reviewContent,
			int reviewItemNo, int reviewStar, int reviewLike, int reviewReadcount) {
		super();
		ReviewNo = reviewNo;
		ReviewTitle = reviewTitle;
		ReviewWriterNo = reviewWriterNo;
		ReviewDate = reviewDate;
		ReviewContent = reviewContent;
		ReviewItemNo = reviewItemNo;
		ReviewStar = reviewStar;
		ReviewLike = reviewLike;
		ReviewReadcount = reviewReadcount;
	}

	public int getReviewNo() {
		return ReviewNo;
	}

	public void setReviewNo(int reviewNo) {
		ReviewNo = reviewNo;
	}

	public String getReviewTitle() {
		return ReviewTitle;
	}

	public void setReviewTitle(String reviewTitle) {
		ReviewTitle = reviewTitle;
	}

	public int getReviewWriterNo() {
		return ReviewWriterNo;
	}

	public void setReviewWriterNo(int reviewWriterNo) {
		ReviewWriterNo = reviewWriterNo;
	}

	public java.sql.Date getReviewDate() {
		return ReviewDate;
	}

	public void setReviewDate(java.sql.Date reviewDate) {
		ReviewDate = reviewDate;
	}

	public String getReviewContent() {
		return ReviewContent;
	}

	public void setReviewContent(String reviewContent) {
		ReviewContent = reviewContent;
	}

	public int getReviewItemNo() {
		return ReviewItemNo;
	}

	public void setReviewItemNo(int reviewItemNo) {
		ReviewItemNo = reviewItemNo;
	}

	public int getReviewStar() {
		return ReviewStar;
	}

	public void setReviewStar(int reviewStar) {
		ReviewStar = reviewStar;
	}

	public int getReviewLike() {
		return ReviewLike;
	}

	public void setReviewLike(int reviewLike) {
		ReviewLike = reviewLike;
	}

	public int getReviewReadcount() {
		return ReviewReadcount;
	}

	public void setReviewReadcount(int reviewReadcount) {
		ReviewReadcount = reviewReadcount;
	}

	@Override
	public String toString() {
		return "Review [ReviewNo=" + ReviewNo + ", ReviewTitle=" + ReviewTitle + ", ReviewWriterNo=" + ReviewWriterNo
				+ ", ReviewDate=" + ReviewDate + ", ReviewContent=" + ReviewContent + ", ReviewItemNo=" + ReviewItemNo
				+ ", ReviewStar=" + ReviewStar + ", ReviewLike=" + ReviewLike + ", ReviewReadcount=" + ReviewReadcount
				+ "]";
	}
	
	
	
}

