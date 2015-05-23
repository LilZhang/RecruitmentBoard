package oops.recruitment.vo;

import java.util.Date;

public class HrReplyBean {
	private int id;
	private String posName;
	private Date appTime;
	private String userName;
	private int userAge;
	private String userSchool;
	private String replyType;
	private Date replyTime;
	
	public HrReplyBean() {}

	public HrReplyBean(int id, String posName, Date appTime, String userName,
			int userAge, String userSchool, String replyType, Date replyTime) {
		this.id = id;
		this.posName = posName;
		this.appTime = appTime;
		this.userName = userName;
		this.userAge = userAge;
		this.userSchool = userSchool;
		this.replyType = replyType;
		this.replyTime = replyTime;
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

	public Date getAppTime() {
		return appTime;
	}

	public void setAppTime(Date appTime) {
		this.appTime = appTime;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getUserSchool() {
		return userSchool;
	}

	public void setUserSchool(String userSchool) {
		this.userSchool = userSchool;
	}

	public String getReplyType() {
		return replyType;
	}

	public void setReplyType(String replyType) {
		this.replyType = replyType;
	}

	public Date getReplyTime() {
		return replyTime;
	}

	public void setReplyTime(Date replyTime) {
		this.replyTime = replyTime;
	}
	
	
	
}
