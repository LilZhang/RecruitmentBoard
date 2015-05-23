package oops.recruitment.domain;

import java.util.Date;
import java.util.Set;

public class Pos {
	private Integer id;
	private String posName;
	private String posText;
	private double posSalary;
	private Date posPubTime;
	private Hr hr;
	private Set<App> apps;
	
	public Pos() {}
	public Pos(Integer id, String posName,String posText, double posSalary, Date posPubTime,
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
	public double getPosSalary() {
		return posSalary;
	}
	public void setPosSalary(double posSalary) {
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
		result = prime * result + ((posName == null) ? 0 : posName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(posSalary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (posName == null) {
			if (other.posName != null)
				return false;
		} else if (!posName.equals(other.posName))
			return false;
		if (Double.doubleToLongBits(posSalary) != Double
				.doubleToLongBits(other.posSalary))
			return false;
		return true;
	}
	
	
	
	
	
}
