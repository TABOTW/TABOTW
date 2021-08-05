package community.review.model.vo;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Review implements java.io.Serializable {
	private static final long serialVersionUID = 113L;
	
	private int ReviewNo;  //게시글번호
	private int ReviewWriter; //게시글 작성자 아이디
	private String ReviewTitle;  //게시글 제목
	private String ReviewContent;  //게시글 내용
	private String ReviewOriginalFilename;  //첨부파일 원래이름
	private String ReviewRenameFilename;  //변경된 첨부파일이름
	private int ReviewRef;  //원글은 자기번호, 댓글은 원글번호
	private int ReviewLevel;  //원글 1, 댓글 2, 대댓글 3
	private int ReviewReplyRef;  //원글 0, 댓글은 자기번호, 대댓글은 참조하는 댓글번호
	private int ReviewReplySeq;  //댓글과 대댓글의 순번, 최근 댓글을 1
	private int ReviewReadCount; //읽은 조회수
	private java.sql.Date ReviewDate;  //게시글 등록 날짜
	private int ReviewItemNo; //리뷰하는 물품 번호
	private int ReviewStar; //별점
	private int ReviewLike; //추천수
	
	public Review() {}

	public Review(int ReviewWriter, String ReviewTitle, String ReviewContent) {
		super();
		this.ReviewWriter = ReviewWriter;
		this.ReviewTitle = ReviewTitle;
		this.ReviewContent = ReviewContent;
	}

	public Review(int ReviewWriter, String ReviewTitle, 
			String ReviewContent, String ReviewOriginalFilename,
			String ReviewRenameFilename) {
		super();
		this.ReviewWriter = ReviewWriter;
		this.ReviewTitle = ReviewTitle;
		this.ReviewContent = ReviewContent;
		this.ReviewOriginalFilename = ReviewOriginalFilename;
		this.ReviewRenameFilename = ReviewRenameFilename;
	}

	public Review(int ReviewNo, int ReviewWriter, String ReviewTitle, String ReviewContent, String ReviewOriginalFilename,
			String ReviewRenameFilename, int ReviewRef, int ReviewLevel, int ReviewReplyRef, int ReviewReplySeq,
			int ReviewReadCount, Date ReviewDate, int reviewItemNo, int reviewStar, int reviewLike) {
		super();
		this.ReviewNo = ReviewNo;
		this.ReviewWriter = ReviewWriter;
		this.ReviewTitle = ReviewTitle;
		this.ReviewContent = ReviewContent;
		this.ReviewOriginalFilename = ReviewOriginalFilename;
		this.ReviewRenameFilename = ReviewRenameFilename;
		this.ReviewRef = ReviewRef;
		this.ReviewLevel = ReviewLevel;
		this.ReviewReplyRef = ReviewReplyRef;
		this.ReviewReplySeq = ReviewReplySeq;
		this.ReviewReadCount = ReviewReadCount;
		this.ReviewDate = ReviewDate;
		this.ReviewItemNo = ReviewItemNo;
		this.ReviewStar = ReviewStar;
		this.ReviewLike = ReviewLike;
	}

	public int getReviewNo() {
		return ReviewNo;
	}

	public void setReviewNo(int ReviewNo) {
		this.ReviewNo = ReviewNo;
	}

	public int getReviewWriter() {
		return ReviewWriter;
	}

	public void setReviewWriter(int ReviewWriter) {
		this.ReviewWriter = ReviewWriter;
	}

	public String getReviewTitle() {
		return ReviewTitle;
	}

	public void setReviewTitle(String ReviewTitle) {
		this.ReviewTitle = ReviewTitle;
	}

	public String getReviewContent() {
		return ReviewContent;
	}

	public void setReviewContent(String ReviewContent) {
		this.ReviewContent = ReviewContent;
	}

	public String getReviewOriginalFilename() {
		return ReviewOriginalFilename;
	}

	public void setReviewOriginalFilename(String ReviewOriginalFilename) {
		this.ReviewOriginalFilename = ReviewOriginalFilename;
	}

	public String getReviewRenameFilename() {
		return ReviewRenameFilename;
	}

	public void setReviewRenameFilename(String ReviewRenameFilename) {
		this.ReviewRenameFilename = ReviewRenameFilename;
	}

	public int getReviewRef() {
		return ReviewRef;
	}

	public void setReviewRef(int ReviewRef) {
		this.ReviewRef = ReviewRef;
	}

	public int getReviewLevel() {
		return ReviewLevel;
	}

	public void setReviewLevel(int ReviewLevel) {
		this.ReviewLevel = ReviewLevel;
	}

	public int getReviewReplyRef() {
		return ReviewReplyRef;
	}

	public void setReviewReplyRef(int ReviewReplyRef) {
		this.ReviewReplyRef = ReviewReplyRef;
	}

	public int getReviewReplySeq() {
		return ReviewReplySeq;
	}

	public void setReviewReplySeq(int ReviewReplySeq) {
		this.ReviewReplySeq = ReviewReplySeq;
	}

	public int getReviewReadCount() {
		return ReviewReadCount;
	}

	public void setReviewReadCount(int ReviewReadCount) {
		this.ReviewReadCount = ReviewReadCount;
	}

	public java.sql.Date getReviewDate() {
		return ReviewDate;
	}

	public void setReviewDate(java.sql.Date ReviewDate) {
		this.ReviewDate = ReviewDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public int getReviewItemNo() {
		return ReviewItemNo;
	}

	public void setReviewItemNo(int reviewItemNo) {
		this.ReviewItemNo = ReviewItemNo;
	}
	public int getReviewStar() {
		return ReviewStar;
	}

	public void setReviewStar(int reviewStar) {
		this.ReviewStar = ReviewStar;
	}
	public int getReviewLike() {
		return ReviewLike;
	}

	public void setReviewLike(int reviewLike) {
		this.ReviewLike = ReviewLike;
	}

	@Override
	public String toString() {
		return "Review [ReviewNo=" + ReviewNo + ", ReviewWriter=" + ReviewWriter + ", ReviewTitle=" + ReviewTitle
				+ ", ReviewContent=" + ReviewContent + ", ReviewOriginalFilename=" + ReviewOriginalFilename
				+ ", ReviewRenameFilename=" + ReviewRenameFilename + ", ReviewRef=" + ReviewRef + ", ReviewLevel="
				+ ReviewLevel + ", ReviewReplyRef=" + ReviewReplyRef + ", ReviewReplySeq=" + ReviewReplySeq
				+ ", ReviewReadCount=" + ReviewReadCount + ", ReviewDate=" + ReviewDate + ", ReviewItemNo="
				+ ReviewItemNo + ", ReviewStar=" + ReviewStar + ", ReviewLike=" + ReviewLike + "]";
	}

	


		
	
	
}

