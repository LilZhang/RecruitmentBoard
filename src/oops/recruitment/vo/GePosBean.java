package oops.recruitment.vo;

import java.util.Date;

public class GePosBean {
	private int id;
	private String name;
	private String salary;
	private String descText;
	private Date pubTime;
	private String enterprise;
	
	public GePosBean() {}

	public GePosBean(int id, String name, String salary, String descText,
			Date pubTime, String enterprise) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.descText = descText;
		this.pubTime = pubTime;
		this.enterprise = enterprise;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getDescText() {
		return descText;
	}

	public void setDescText(String descText) {
		this.descText = descText;
	}

	public Date getPubTime() {
		return pubTime;
	}

	public void setPubTime(Date pubTime) {
		this.pubTime = pubTime;
	}

	public String getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(String enterprise) {
		this.enterprise = enterprise;
	}
	
	
	
	
}
