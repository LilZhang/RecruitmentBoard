package oops.recruitment.domain;

import java.util.Date;

public class Reply {
	private Integer id;
	private Date replyTime;
	private App app;
	private Hr hr;
	private RepType repType;
	
	public Reply() {}
	public Reply(Integer id, Date replyTime, App app, Hr hr, RepType repType) {
		this.id = id;
		this.replyTime = replyTime;
		this.app = app;
		this.hr = hr;
		this.repType = repType;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getReplyTime() {
		return replyTime;
	}
	public void setReplyTime(Date replyTime) {
		this.replyTime = replyTime;
	}
	public App getApp() {
		return app;
	}
	public void setApp(App app) {
		this.app = app;
	}
	public Hr getHr() {
		return hr;
	}
	public void setHr(Hr hr) {
		this.hr = hr;
	}
	public RepType getRepType() {
		return repType;
	}
	public void setRepType(RepType repType) {
		this.repType = repType;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((app == null) ? 0 : app.hashCode());
		result = prime * result + ((repType == null) ? 0 : repType.hashCode());
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
		Reply other = (Reply) obj;
		if (app == null) {
			if (other.app != null)
				return false;
		} else if (!app.equals(other.app))
			return false;
		if (repType == null) {
			if (other.repType != null)
				return false;
		} else if (!repType.equals(other.repType))
			return false;
		return true;
	}
	
	
	
	
}
