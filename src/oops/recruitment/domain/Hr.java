package oops.recruitment.domain;

import java.util.Set;

public class Hr {
	private Integer id;
	private String name;
	private String pass;
	private Set<Position> positions;
	private Set<Reply> replys;
	public Hr() {}
	public Hr(Integer id, String name, String pass, Set<Position> positions,
			Set<Reply> replys) {
		this.id = id;
		this.name = name;
		this.pass = pass;
		this.positions = positions;
		this.replys = replys;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Set<Position> getPositions() {
		return positions;
	}
	public void setPositions(Set<Position> positions) {
		this.positions = positions;
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
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pass == null) ? 0 : pass.hashCode());
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pass == null) {
			if (other.pass != null)
				return false;
		} else if (!pass.equals(other.pass))
			return false;
		return true;
	}
	
	
	
}
