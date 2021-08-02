package review.model.vo;

import java.sql.Date;

public class Review implements java.io.Serializable {
	private static final long serialVersionUID = 113L;
	
	private int reviewNum;  //게시글번호
	private int reviewWriterNo; //리뷰글 작성자 아이디
	private int reviewItemNo; //리뷰하는 물품 번호
	private String reviewTitle;  //리뷰글 제목
	private int reviewStar;
	private String reviewContent;  //리뷰글 내용
	private String reviewOriginalFilename;  //첨부파일 원래이름
	private String reviewRenameFilename;  //변경된 첨부파일이름
	private int reviewReadCount; //읽은 조회수
	private java.sql.Date reviewDate;  //리뷰글 등록 날짜
	
	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Review(int reviewNum, int reviewWriterNo, int reviewItemNo, String reviewTitle, int reviewStar,
			String reviewContent, String reviewOriginalFilename, String reviewRenameFilename, int reviewReadCount,
			Date reviewDate) {
		super();
		this.reviewNum = reviewNum;
		this.reviewWriterNo = reviewWriterNo;
		this.reviewItemNo = reviewItemNo;
		this.reviewTitle = reviewTitle;
		this.reviewStar = reviewStar;
		this.reviewContent = reviewContent;
		this.reviewOriginalFilename = reviewOriginalFilename;
		this.reviewRenameFilename = reviewRenameFilename;
		this.reviewReadCount = reviewReadCount;
		this.reviewDate = reviewDate;
	}

	public int getReviewNum() {
		return reviewNum;
	}

	public void setReviewNum(int reviewNum) {
		this.reviewNum = reviewNum;
	}

	public int getReviewWriterNo() {
		return reviewWriterNo;
	}

	public void setReviewWriter(int reviewWriterNo) {
		this.reviewWriterNo = reviewWriterNo;
	}
	
	public int getReviewItemNo() {
		return reviewItemNo;
	}

	public void setReviewItemNo(int reviewItemNo) {
		this.reviewItemNo = reviewItemNo;
	}

	public String getReviewTitle() {
		return reviewTitle;
	}

	public void setReviewTitle(String reviewTitle) {
		this.reviewTitle = reviewTitle;
	}
	
	public int getReviewStar() {
		return reviewStar;
	}

	public void setReviewStar(int reviewStar) {
		this.reviewStar = reviewStar;
	}

	public String getReviewContent() {
		return reviewContent;
	}

	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}

	public String getreviewOriginalFilename() {
		return reviewOriginalFilename;
	}

	public void setreviewOriginalFilename(String reviewOriginalFilename) {
		this.reviewOriginalFilename = reviewOriginalFilename;
	}

	public String getreviewRenameFilename() {
		return reviewRenameFilename;
	}

	public void setreviewRenameFilename(String reviewRenameFilename) {
		this.reviewRenameFilename = reviewRenameFilename;
	}

	public int getReviewReadCount() {
		return reviewReadCount;
	}

	public void setReviewReadCount(int reviewReadCount) {
		this.reviewReadCount = reviewReadCount;
	}

	public java.sql.Date getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(java.sql.Date reviewDate) {
		this.reviewDate = reviewDate;
	}

	@Override
	public String toString() {
		return "Review [reviewNum=" + reviewNum + ", reviewWriterNo=" + reviewWriterNo + ", reviewItemNo="
				+ reviewItemNo + ", reviewTitle=" + reviewTitle + ", reviewContent=" + reviewContent
				+ ", reviewOriginalFilename=" + reviewOriginalFilename + ", reviewRenameFilename=" + reviewRenameFilename
				+ ", reviewReadCount=" + reviewReadCount + ", reviewDate=" + reviewDate + "]";
	}
	
	
}
