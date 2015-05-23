package oops.recruitment.vo;

import java.util.Date;

public class HrAppBean {
	private int id;
	private String posName;
	private Date appTime;
	private String userName;
	private int userAge;
	private String userSchool;
	private String userPn;
	public HrAppBean() {}
	public HrAppBean(int id, String posName, Date appTime, String userName,
			int userAge, String userSchool, String userPn) {
		this.id = id;
		this.posName = posName;
		this.appTime = appTime;
		this.userName = userName;
		this.userAge = userAge;
		this.userSchool = userSchool;
		this.userPn = userPn;
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
	public String getUserPn() {
		return userPn;
	}
	public void setUserPn(String userPn) {
		this.userPn = userPn;
	}
	
	
	
	
	
}
