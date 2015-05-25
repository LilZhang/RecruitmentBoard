package oops.recruitment.action.base;

import oops.recruitment.service.HrManager;

import com.opensymphony.xwork2.ActionSupport;

public class HrBaseAction extends ActionSupport {
	protected HrManager mgr;

	public void setHrManager(HrManager mgr) {
		this.mgr = mgr;
	}

	
	
}
