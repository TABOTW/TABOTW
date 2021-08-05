package community.reply.model.vo;

public class Reply implements java.io.Serializable {
	private static final long serialVersionUID = 113L;
	
	private int ReplyNo; //댓글 번호
	private int ChildReplyNo; //대댓글 번호
	private int ReplySeq; //
	private int ReplyLevel; //
	private String BoardType; //
	private int BoardNo; //
	private int ReplyWriter; //댓글작성자
	private String ReplyDate; //댓글 등록 일자
	private int ReplyLike; //추천수
	private String ReplyContent; //댓글내용
	
	public Reply() {}



	public Reply(int replyNo, int childReplyNo, int replySeq, int replyLevel, String boardType, int boardNo,
			int replyWriter, String replyDate, int replyLike, String replyContent) {
		super();
		this.ReplyNo = replyNo;
		this.ChildReplyNo = childReplyNo;
		this.ReplySeq = replySeq;
		this.ReplyLevel = replyLevel;
		this.BoardType = boardType;
		this.BoardNo = boardNo;
		this.ReplyWriter = replyWriter;
		this.ReplyDate = replyDate;
		this.ReplyLike = replyLike;
		this.ReplyContent = replyContent;
	}




	public int getReplyNo() {
		return ReplyNo;
	}

	public void setReplyNo(int replyNo) {
		ReplyNo = replyNo;
	}

	public int getChildReplyNo() {
		return ChildReplyNo;
	}

	public void setChildReplyNo(int childReplyNo) {
		ChildReplyNo = childReplyNo;
	}

	public int getReplySeq() {
		return ReplySeq;
	}

	public void setReplySeq(int replySeq) {
		ReplySeq = replySeq;
	}

	public int getReplyLevel() {
		return ReplyLevel;
	}

	public void setReplyLevel(int replyLevel) {
		ReplyLevel = replyLevel;
	}

	public String getBoardType() {
		return BoardType;
	}

	public void setBoardType(String boardType) {
		BoardType = boardType;
	}

	public int getBoardNo() {
		return BoardNo;
	}

	public void setBoardNo(int boardNo) {
		BoardNo = boardNo;
	}

	public int getReplyWriter() {
		return ReplyWriter;
	}

	public void setReplyWriter(int replyWriter) {
		ReplyWriter = replyWriter;
	}

	public String getReplyDate() {
		return ReplyDate;
	}

	public void setReplyDate(String replyDate) {
		ReplyDate = replyDate;
	}

	public int getReplyLike() {
		return ReplyLike;
	}

	public void setReplyLike(int replyLike) {
		ReplyLike = replyLike;
	}

	public String getReplyContent() {
		return ReplyContent;
	}

	public void setReplyContent(String replyContent) {
		ReplyContent = replyContent;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	@Override
	public String toString() {
		return "Reply [ReplyNo=" + ReplyNo + ", ChildReplyNo=" + ChildReplyNo + ", ReplySeq=" + ReplySeq
				+ ", ReplyLevel=" + ReplyLevel + ", BoardType=" + BoardType + ", BoardNo=" + BoardNo + ", ReplyWriter="
				+ ReplyWriter + ", ReplyDate=" + ReplyDate + ", ReplyLike=" + ReplyLike + ", ReplyContent="
				+ ReplyContent + "]";
	}




}


