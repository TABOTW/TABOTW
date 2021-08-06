package community.free.model.vo;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Free implements java.io.Serializable {
	private static final long serialVersionUID = 113L;
	
	private int FreeNo;  //게시글번호
	private String FreeWriter; //게시글 작성자 아이디
	private String FreeTitle;  //게시글 제목
	private String FreeContent;  //게시글 내용
	private String FreeOriginalFilename;  //첨부파일 원래이름
	private String FreeRenameFilename;  //변경된 첨부파일이름
	private int FreeRef;  //원글은 자기번호, 댓글은 원글번호
	private int FreeLevel;  //원글 1, 댓글 2, 대댓글 3
	private int FreeReplyRef;  //원글 0, 댓글은 자기번호, 대댓글은 참조하는 댓글번호
	private int FreeReplySeq;  //댓글과 대댓글의 순번, 최근 댓글을 1
	private int FreeReadCount; //읽은 조회수
	private String FreeDate;  //게시글 등록 날짜
	
	public Free() {}

	public Free(String FreeWriter, String FreeTitle, String FreeContent) {
		super();
		this.FreeWriter = FreeWriter;
		this.FreeTitle = FreeTitle;
		this.FreeContent = FreeContent;
	}

	public Free(String FreeWriter, String FreeTitle, 
			String FreeContent, String FreeOriginalFilename,
			String FreeRenameFilename) {
		super();
		this.FreeWriter = FreeWriter;
		this.FreeTitle = FreeTitle;
		this.FreeContent = FreeContent;
		this.FreeOriginalFilename = FreeOriginalFilename;
		this.FreeRenameFilename = FreeRenameFilename;
	}

	public Free(int FreeNo, String FreeWriter, String FreeTitle, String FreeContent, String FreeOriginalFilename,
			String FreeRenameFilename, int FreeRef, int FreeLevel, int FreeReplyRef, int FreeReplySeq,
			int FreeReadCount, String FreeDate) {
		super();
		this.FreeNo = FreeNo;
		this.FreeWriter = FreeWriter;
		this.FreeTitle = FreeTitle;
		this.FreeContent = FreeContent;
		this.FreeOriginalFilename = FreeOriginalFilename;
		this.FreeRenameFilename = FreeRenameFilename;
		this.FreeRef = FreeRef;
		this.FreeLevel = FreeLevel;
		this.FreeReplyRef = FreeReplyRef;
		this.FreeReplySeq = FreeReplySeq;
		this.FreeReadCount = FreeReadCount;
		this.FreeDate = FreeDate;
	}

	public int getFreeNo() {
		return FreeNo;
	}

	public void setFreeNo(int FreeNo) {
		this.FreeNo = FreeNo;
	}

	public String getFreeWriter() {
		return FreeWriter;
	}

	public void setFreeWriter(String FreeWriter) {
		this.FreeWriter = FreeWriter;
	}

	public String getFreeTitle() {
		return FreeTitle;
	}

	public void setFreeTitle(String FreeTitle) {
		this.FreeTitle = FreeTitle;
	}

	public String getFreeContent() {
		return FreeContent;
	}

	public void setFreeContent(String FreeContent) {
		this.FreeContent = FreeContent;
	}

	public String getFreeOriginalFilename() {
		return FreeOriginalFilename;
	}

	public void setFreeOriginalFilename(String FreeOriginalFilename) {
		this.FreeOriginalFilename = FreeOriginalFilename;
	}

	public String getFreeRenameFilename() {
		return FreeRenameFilename;
	}

	public void setFreeRenameFilename(String FreeRenameFilename) {
		this.FreeRenameFilename = FreeRenameFilename;
	}

	public int getFreeRef() {
		return FreeRef;
	}

	public void setFreeRef(int FreeRef) {
		this.FreeRef = FreeRef;
	}

	public int getFreeLevel() {
		return FreeLevel;
	}

	public void setFreeLevel(int FreeLevel) {
		this.FreeLevel = FreeLevel;
	}

	public int getFreeReplyRef() {
		return FreeReplyRef;
	}

	public void setFreeReplyRef(int FreeReplyRef) {
		this.FreeReplyRef = FreeReplyRef;
	}

	public int getFreeReplySeq() {
		return FreeReplySeq;
	}

	public void setFreeReplySeq(int FreeReplySeq) {
		this.FreeReplySeq = FreeReplySeq;
	}

	public int getFreeReadCount() {
		return FreeReadCount;
	}

	public void setFreeReadCount(int FreeReadCount) {
		this.FreeReadCount = FreeReadCount;
	}

	public String getFreeDate() {
		return FreeDate;
	}

	public void setFreeDate(String FreeDate) {
		this.FreeDate = FreeDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Free [FreeNo=" + FreeNo + ", FreeWriter=" + FreeWriter + ", FreeTitle=" + FreeTitle
				+ ", FreeContent=" + FreeContent + ", FreeOriginalFilename=" + FreeOriginalFilename
				+ ", FreeRenameFilename=" + FreeRenameFilename + ", FreeRef=" + FreeRef + ", FreeLevel="
				+ FreeLevel + ", FreeReplyRef=" + FreeReplyRef + ", FreeReplySeq=" + FreeReplySeq
				+ ", FreeReadCount=" + FreeReadCount + ", FreeDate=" + FreeDate + "]";
	}
	
}

