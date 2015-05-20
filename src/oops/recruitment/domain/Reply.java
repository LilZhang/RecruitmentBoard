package oops.recruitment.domain;

import java.util.Date;

public class Reply {
	private Integer id;
	private Date replyTime;
	private Date reviewTime;
	private Application application;
	private ReplyType replyType;
	private Hr hr;
	public Reply() {}
	public Reply(Integer id, Date replyTime, Date reviewTime,
			Application application, ReplyType replyType, Hr hr) {
		this.id = id;
		this.replyTime = replyTime;
		this.reviewTime = reviewTime;
		this.application = application;
		this.replyType = replyType;
		this.hr = hr;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getReplyTime() {
		return replyTime;
	}
	public void setReplyTime(Date replyTime) {
		this.replyTime = replyTime;
	}
	public Date getReviewTime() {
		return reviewTime;
	}
	public void setReviewTime(Date reviewTime) {
		this.reviewTime = reviewTime;
	}
	public Application getApplication() {
		return application;
	}
	public void setApplication(Application application) {
		this.application = application;
	}
	public ReplyType getReplyType() {
		return replyType;
	}
	public void setReplyType(ReplyType replyType) {
		this.replyType = replyType;
	}
	public Hr getHr() {
		return hr;
	}
	public void setHr(Hr hr) {
		this.hr = hr;
	}
	
	
	
}
