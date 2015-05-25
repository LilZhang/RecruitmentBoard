package oops.recruitment.action.user;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import oops.recruitment.action.base.UserBaseAction;
import oops.recruitment.action.base.WebConstant;

public class AppUser extends UserBaseAction {
	private List apps;

	public List getApps() {
		return apps;
	}

	public void setApps(List apps) {
		this.apps = apps;
	}
	
	public String execute() throws Exception
	{
		ActionContext ctx = ActionContext.getContext();
		String userName = (String)ctx.getSession().get(WebConstant.USER);
		setApps(mgr.getUserApp(userName));
		return SUCCESS;
	}
}
