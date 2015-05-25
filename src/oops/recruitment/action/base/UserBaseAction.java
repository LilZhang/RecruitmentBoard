package oops.recruitment.action.base;

import oops.recruitment.service.UserManager;

import com.opensymphony.xwork2.ActionSupport;

public class UserBaseAction extends ActionSupport {
	protected UserManager mgr;

	public void setUserManager(UserManager mgr) {
		this.mgr = mgr;
	}

	
	
}
