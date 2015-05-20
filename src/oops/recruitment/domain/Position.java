package oops.recruitment.domain;

import java.util.Set;

public class Position {
	private Integer id;
	private String positionName;
	private String positionEnterprise;
	private int positionSalary;
	private Set<Application> applications;
	private Hr hr;
	public Position() {}
	public Position(Integer id, String positionName, String positionEnterprise,
			int positionSalary, Set<Application> applications, Hr hr) {
		this.id = id;
		this.positionName = positionName;
		this.positionEnterprise = positionEnterprise;
		this.positionSalary = positionSalary;
		this.applications = applications;
		this.hr = hr;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPositionName() {
		return positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	public String getPositionEnterprise() {
		return positionEnterprise;
	}
	public void setPositionEnterprise(String positionEnterprise) {
		this.positionEnterprise = positionEnterprise;
	}
	public int getPositionSalary() {
		return positionSalary;
	}
	public void setPositionSalary(int positionSalary) {
		this.positionSalary = positionSalary;
	}
	public Set<Application> getApplications() {
		return applications;
	}
	public void setApplications(Set<Application> applications) {
		this.applications = applications;
	}
	public Hr getHr() {
		return hr;
	}
	public void setHr(Hr hr) {
		this.hr = hr;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hr == null) ? 0 : hr.hashCode());
		result = prime
				* result
				+ ((positionEnterprise == null) ? 0 : positionEnterprise
						.hashCode());
		result = prime * result
				+ ((positionName == null) ? 0 : positionName.hashCode());
		result = prime * result + positionSalary;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (hr == null) {
			if (other.hr != null)
				return false;
		} else if (!hr.equals(other.hr))
			return false;
		if (positionEnterprise == null) {
			if (other.positionEnterprise != null)
				return false;
		} else if (!positionEnterprise.equals(other.positionEnterprise))
			return false;
		if (positionName == null) {
			if (other.positionName != null)
				return false;
		} else if (!positionName.equals(other.positionName))
			return false;
		if (positionSalary != other.positionSalary)
			return false;
		return true;
	}
	
	
	
}
