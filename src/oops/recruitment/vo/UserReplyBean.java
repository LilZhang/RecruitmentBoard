package oops.recruitment.vo;

import java.util.Date;

public class UserReplyBean {
	private int id;
	private String posName;
	private String enterprise;
	private Date appTime;
	private Date replyTime;
	private String replyType;
	private String hrName;
	private String hrPn;
	
	public UserReplyBean() {}
	public UserReplyBean(int id, String posName, String enterprise,
			Date appTime, Date replyTime, String replyType, String hrName,
			String hrPn) {
		this.id = id;
		this.posName = posName;
		this.enterprise = enterprise;
		this.appTime = appTime;
		this.replyTime = replyTime;
		this.replyType = replyType;
		this.hrName = hrName;
		this.hrPn = hrPn;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPosName() {
		return posName;
	}
	public void setPosName(String posName) {
		this.posName = posName;
	}
	public String getEnterprise() {
		return enterprise;
	}
	public void setEnterprise(String enterprise) {
		this.enterprise = enterprise;
	}
	public Date getAppTime() {
		return appTime;
	}
	public void setAppTime(Date appTime) {
		this.appTime = appTime;
	}
	public Date getReplyTime() {
		return replyTime;
	}
	public void setReplyTime(Date replyTime) {
		this.replyTime = replyTime;
	}
	public String getReplyType() {
		return replyType;
	}
	public void setReplyType(String replyType) {
		this.replyType = replyType;
	}
	public String getHrName() {
		return hrName;
	}
	public void setHrName(String hrName) {
		this.hrName = hrName;
	}
	public String getHrPn() {
		return hrPn;
	}
	public void setHrPn(String hrPn) {
		this.hrPn = hrPn;
	}
	
	
	
}
