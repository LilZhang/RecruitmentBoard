package oops.recruitment.domain;

import java.util.Set;

public class Hr {
	private Integer id;
	private String hrName;
	private String hrPass;
	private String hrPn;
	private String comp;
	private Set<Pos> poses;
	private Set<Reply> replys;
	
	public Hr() {}

	public Hr(Integer id, String hrName, String hrPass, String hrPn,
			String comp, Set<Pos> poses, Set<Reply> replys) {
		this.id = id;
		this.hrName = hrName;
		this.hrPass = hrPass;
		this.hrPn = hrPn;
		this.comp = comp;
		this.poses = poses;
		this.replys = replys;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHrName() {
		return hrName;
	}

	public void setHrName(String hrName) {
		this.hrName = hrName;
	}

	public String getHrPass() {
		return hrPass;
	}

	public void setHrPass(String hrPass) {
		this.hrPass = hrPass;
	}

	public String getHrPn() {
		return hrPn;
	}

	public void setHrPn(String hrPn) {
		this.hrPn = hrPn;
	}

	public String getComp() {
		return comp;
	}

	public void setComp(String comp) {
		this.comp = comp;
	}

	public Set<Pos> getPoses() {
		return poses;
	}

	public void setPoses(Set<Pos> poses) {
		this.poses = poses;
	}

	public Set<Reply> getReplys() {
		return replys;
	}

	public void setReplys(Set<Reply> replys) {
		this.replys = replys;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hrName == null) ? 0 : hrName.hashCode());
		result = prime * result + ((hrPass == null) ? 0 : hrPass.hashCode());
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
		Hr other = (Hr) obj;
		if (hrName == null) {
			if (other.hrName != null)
				return false;
		} else if (!hrName.equals(other.hrName))
			return false;
		if (hrPass == null) {
			if (other.hrPass != null)
				return false;
		} else if (!hrPass.equals(other.hrPass))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
}
