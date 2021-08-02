package community.qna.model.vo;

import java.sql.Date;

public class QnA implements java.io.Serializable {
	private static final long serialVersionUID = 113L;
	
	private int QnANo;  //게시글번호
	private String QnAWriter; //게시글 작성자 아이디
	private String QnATitle;  //게시글 제목
	private String QnAContent;  //게시글 내용
	private String QnAOriginalFilename;  //첨부파일 원래이름
	private String QnARenameFilename;  //변경된 첨부파일이름
	private int QnARef;  //원글은 자기번호, 댓글은 원글번호
	private int QnALevel;  //원글 1, 댓글 2, 대댓글 3
	private int QnAReplyRef;  //원글 0, 댓글은 자기번호, 대댓글은 참조하는 댓글번호
	private int QnAReplySeq;  //댓글과 대댓글의 순번, 최근 댓글을 1
	private int QnAReadCount; //읽은 조회수
	private java.sql.Date QnADate;  //게시글 등록 날짜
	
	public QnA() {}

	public QnA(String QnAWriter, String QnATitle, String QnAContent) {
		super();
		this.QnAWriter = QnAWriter;
		this.QnATitle = QnATitle;
		this.QnAContent = QnAContent;
	}

	public QnA(String QnAWriter, String QnATitle, 
			String QnAContent, String QnAOriginalFilename,
			String QnARenameFilename) {
		super();
		this.QnAWriter = QnAWriter;
		this.QnATitle = QnATitle;
		this.QnAContent = QnAContent;
		this.QnAOriginalFilename = QnAOriginalFilename;
		this.QnARenameFilename = QnARenameFilename;
	}

	public QnA(int QnANo, String QnAWriter, String QnATitle, String QnAContent, String QnAOriginalFilename,
			String QnARenameFilename, int QnARef, int QnALevel, int QnAReplyRef, int QnAReplySeq,
			int QnAReadCount, Date QnADate) {
		super();
		this.QnANo = QnANo;
		this.QnAWriter = QnAWriter;
		this.QnATitle = QnATitle;
		this.QnAContent = QnAContent;
		this.QnAOriginalFilename = QnAOriginalFilename;
		this.QnARenameFilename = QnARenameFilename;
		this.QnARef = QnARef;
		this.QnALevel = QnALevel;
		this.QnAReplyRef = QnAReplyRef;
		this.QnAReplySeq = QnAReplySeq;
		this.QnAReadCount = QnAReadCount;
		this.QnADate = QnADate;
	}

	public int getQnANo() {
		return QnANo;
	}

	public void setQnANo(int QnANo) {
		this.QnANo = QnANo;
	}

	public String getQnAWriter() {
		return QnAWriter;
	}

	public void setQnAWriter(String QnAWriter) {
		this.QnAWriter = QnAWriter;
	}

	public String getQnATitle() {
		return QnATitle;
	}

	public void setQnATitle(String QnATitle) {
		this.QnATitle = QnATitle;
	}

	public String getQnAContent() {
		return QnAContent;
	}

	public void setQnAContent(String QnAContent) {
		this.QnAContent = QnAContent;
	}

	public String getQnAOriginalFilename() {
		return QnAOriginalFilename;
	}

	public void setQnAOriginalFilename(String QnAOriginalFilename) {
		this.QnAOriginalFilename = QnAOriginalFilename;
	}

	public String getQnARenameFilename() {
		return QnARenameFilename;
	}

	public void setQnARenameFilename(String QnARenameFilename) {
		this.QnARenameFilename = QnARenameFilename;
	}

	public int getQnARef() {
		return QnARef;
	}

	public void setQnARef(int QnARef) {
		this.QnARef = QnARef;
	}

	public int getQnALevel() {
		return QnALevel;
	}

	public void setQnALevel(int QnALevel) {
		this.QnALevel = QnALevel;
	}

	public int getQnAReplyRef() {
		return QnAReplyRef;
	}

	public void setQnAReplyRef(int QnAReplyRef) {
		this.QnAReplyRef = QnAReplyRef;
	}

	public int getQnAReplySeq() {
		return QnAReplySeq;
	}

	public void setQnAReplySeq(int QnAReplySeq) {
		this.QnAReplySeq = QnAReplySeq;
	}

	public int getQnAReadCount() {
		return QnAReadCount;
	}

	public void setQnAReadCount(int QnAReadCount) {
		this.QnAReadCount = QnAReadCount;
	}

	public java.sql.Date getQnADate() {
		return QnADate;
	}

	public void setQnADate(java.sql.Date QnADate) {
		this.QnADate = QnADate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "QnA [QnANo=" + QnANo + ", QnAWriter=" + QnAWriter + ", QnATitle=" + QnATitle
				+ ", QnAContent=" + QnAContent + ", QnAOriginalFilename=" + QnAOriginalFilename
				+ ", QnARenameFilename=" + QnARenameFilename + ", QnARef=" + QnARef + ", QnALevel="
				+ QnALevel + ", QnAReplyRef=" + QnAReplyRef + ", QnAReplySeq=" + QnAReplySeq
				+ ", QnAReadCount=" + QnAReadCount + ", QnADate=" + QnADate + "]";
	}
	
}

