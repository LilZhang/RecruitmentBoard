package oops.recruitment.domain;

public class ReplyType {
	private Integer id;
	private String rttype;
	private Reply reply;
	public ReplyType() {}
	public ReplyType(Integer id, String rttype, Reply reply) {
		this.id = id;
		this.rttype = rttype;
		this.reply = reply;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRttype() {
		return rttype;
	}
	public void setRttype(String rttype) {
		this.rttype = rttype;
	}
	public Reply getReply() {
		return reply;
	}
	public void setReply(Reply reply) {
		this.reply = reply;
	}
	
	
	
	
}
