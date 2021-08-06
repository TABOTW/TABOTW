package community.gallery.model.vo;

import java.sql.Date;

public class Gallery implements java.io.Serializable {
	private static final long serialVersionUID = 113L;
	
	private int GalleryNo;  //게시글번호
	private String GalleryWriter; //게시글 작성자 아이디
	private String GalleryTitle;  //게시글 제목
	private String GalleryContent;  //게시글 내용
	private String GalleryOriginalFilename;  //첨부파일 원래이름
	private String GalleryRenameFilename;  //변경된 첨부파일이름
	private int GalleryRef;  //원글은 자기번호, 댓글은 원글번호
	private int GalleryLevel;  //원글 1, 댓글 2, 대댓글 3
	private int GalleryReplyRef;  //원글 0, 댓글은 자기번호, 대댓글은 참조하는 댓글번호
	private int GalleryReplySeq;  //댓글과 대댓글의 순번, 최근 댓글을 1
	private int GalleryReadCount; //읽은 조회수
	private java.sql.Date GalleryDate;  //게시글 등록 날짜
	
	public Gallery() {}

	public Gallery(String GalleryWriter, String GalleryTitle, String GalleryContent) {
		super();
		this.GalleryWriter = GalleryWriter;
		this.GalleryTitle = GalleryTitle;
		this.GalleryContent = GalleryContent;
	}

	public Gallery(String GalleryWriter, String GalleryTitle, 
			String GalleryContent, String GalleryOriginalFilename,
			String GalleryRenameFilename) {
		super();
		this.GalleryWriter = GalleryWriter;
		this.GalleryTitle = GalleryTitle;
		this.GalleryContent = GalleryContent;
		this.GalleryOriginalFilename = GalleryOriginalFilename;
		this.GalleryRenameFilename = GalleryRenameFilename;
	}

	public Gallery(int GalleryNo, String GalleryWriter, String GalleryTitle, String GalleryContent, String GalleryOriginalFilename,
			String GalleryRenameFilename, int GalleryRef, int GalleryLevel, int GalleryReplyRef, int GalleryReplySeq,
			int GalleryReadCount, Date GalleryDate) {
		super();
		this.GalleryNo = GalleryNo;
		this.GalleryWriter = GalleryWriter;
		this.GalleryTitle = GalleryTitle;
		this.GalleryContent = GalleryContent;
		this.GalleryOriginalFilename = GalleryOriginalFilename;
		this.GalleryRenameFilename = GalleryRenameFilename;
		this.GalleryRef = GalleryRef;
		this.GalleryLevel = GalleryLevel;
		this.GalleryReplyRef = GalleryReplyRef;
		this.GalleryReplySeq = GalleryReplySeq;
		this.GalleryReadCount = GalleryReadCount;
		this.GalleryDate = GalleryDate;
	}

	public int getGalleryNo() {
		return GalleryNo;
	}

	public void setGalleryNo(int GalleryNo) {
		this.GalleryNo = GalleryNo;
	}

	public String getGalleryWriter() {
		return GalleryWriter;
	}

	public void setGalleryWriter(String GalleryWriter) {
		this.GalleryWriter = GalleryWriter;
	}

	public String getGalleryTitle() {
		return GalleryTitle;
	}

	public void setGalleryTitle(String GalleryTitle) {
		this.GalleryTitle = GalleryTitle;
	}

	public String getGalleryContent() {
		return GalleryContent;
	}

	public void setGalleryContent(String GalleryContent) {
		this.GalleryContent = GalleryContent;
	}

	public String getGalleryOriginalFilename() {
		return GalleryOriginalFilename;
	}

	public void setGalleryOriginalFilename(String GalleryOriginalFilename) {
		this.GalleryOriginalFilename = GalleryOriginalFilename;
	}

	public String getGalleryRenameFilename() {
		return GalleryRenameFilename;
	}

	public void setGalleryRenameFilename(String GalleryRenameFilename) {
		this.GalleryRenameFilename = GalleryRenameFilename;
	}

	public int getGalleryRef() {
		return GalleryRef;
	}

	public void setGalleryRef(int GalleryRef) {
		this.GalleryRef = GalleryRef;
	}

	public int getGalleryLevel() {
		return GalleryLevel;
	}

	public void setGalleryLevel(int GalleryLevel) {
		this.GalleryLevel = GalleryLevel;
	}

	public int getGalleryReplyRef() {
		return GalleryReplyRef;
	}

	public void setGalleryReplyRef(int GalleryReplyRef) {
		this.GalleryReplyRef = GalleryReplyRef;
	}

	public int getGalleryReplySeq() {
		return GalleryReplySeq;
	}

	public void setGalleryReplySeq(int GalleryReplySeq) {
		this.GalleryReplySeq = GalleryReplySeq;
	}

	public int getGalleryReadCount() {
		return GalleryReadCount;
	}

	public void setGalleryReadCount(int GalleryReadCount) {
		this.GalleryReadCount = GalleryReadCount;
	}

	public java.sql.Date getGalleryDate() {
		return GalleryDate;
	}

	public void setGalleryDate(java.sql.Date GalleryDate) {
		this.GalleryDate = GalleryDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Gallery [GalleryNo=" + GalleryNo + ", GalleryWriter=" + GalleryWriter + ", GalleryTitle=" + GalleryTitle
				+ ", GalleryContent=" + GalleryContent + ", GalleryOriginalFilename=" + GalleryOriginalFilename
				+ ", GalleryRenameFilename=" + GalleryRenameFilename + ", GalleryRef=" + GalleryRef + ", GalleryLevel="
				+ GalleryLevel + ", GalleryReplyRef=" + GalleryReplyRef + ", GalleryReplySeq=" + GalleryReplySeq
				+ ", GalleryReadCount=" + GalleryReadCount + ", GalleryDate=" + GalleryDate + "]";
	}
	
}

