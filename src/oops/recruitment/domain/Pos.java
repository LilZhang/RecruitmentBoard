package oops.recruitment.domain;

import java.util.Date;
import java.util.Set;

public class Pos {
	private Integer id;
	private String posName;
	private String posText;
	private String posSalary;
	private Date posPubTime;
	private Hr hr;
	private Set<App> apps;
	
	public Pos() {}
	public Pos(Integer id, String posName,String posText, String posSalary, Date posPubTime,
			Hr hr, Set<App> apps) {
		this.id = id;
		this.posName = posName;
		this.posText=posText;
		this.posSalary = posSalary;
		this.posPubTime = posPubTime;
		this.hr = hr;
		this.apps = apps;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPosName() {
		return posName;
	}
	public void setPosName(String posName) {
		this.posName = posName;
	}
	public String getPosText() {
		return posText;
	}
	public void setPosText(String posText) {
		this.posText = posText;
	}
	public String getPosSalary() {
		return posSalary;
	}
	public void setPosSalary(String posSalary) {
		this.posSalary = posSalary;
	}
	public Date getPosPubTime() {
		return posPubTime;
	}
	public void setPosPubTime(Date posPubTime) {
		this.posPubTime = posPubTime;
	}
	public Hr getHr() {
		return hr;
	}
	public void setHr(Hr hr) {
		this.hr = hr;
	}
	public Set<App> getApps() {
		return apps;
	}
	public void setApps(Set<App> apps) {
		this.apps = apps;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hr == null) ? 0 : hr.hashCode());
		result = prime * result + ((posName == null) ? 0 : posName.hashCode());
		result = prime * result
				+ ((posPubTime == null) ? 0 : posPubTime.hashCode());
		result = prime * result
				+ ((posSalary == null) ? 0 : posSalary.hashCode());
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
		Pos other = (Pos) obj;
		if (hr == null) {
			if (other.hr != null)
				return false;
		} else if (!hr.equals(other.hr))
			return false;
		if (posName == null) {
			if (other.posName != null)
				return false;
		} else if (!posName.equals(other.posName))
			return false;
		if (posPubTime == null) {
			if (other.posPubTime != null)
				return false;
		} else if (!posPubTime.equals(other.posPubTime))
			return false;
		if (posSalary == null) {
			if (other.posSalary != null)
				return false;
		} else if (!posSalary.equals(other.posSalary))
			return false;
		return true;
	}
}
