package oops.recruitment.vo;

import java.util.Date;

public class UserAppBean {
	private int id;
	private String posName;
	private String enterprise;
	private Date appTime;
	public UserAppBean() {}
	public UserAppBean(int id, String posName, String enterprise, Date appTime) {
		this.id = id;
		this.posName = posName;
		this.enterprise = enterprise;
		this.appTime = appTime;
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
	
	
	
	
	
}
