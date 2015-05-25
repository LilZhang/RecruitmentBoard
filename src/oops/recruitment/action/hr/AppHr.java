package oops.recruitment.action.hr;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import oops.recruitment.action.base.HrBaseAction;
import oops.recruitment.action.base.WebConstant;

public class AppHr extends HrBaseAction {
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
		String hrName = (String)ctx.getSession().get(WebConstant.USER);
		setApps(mgr.getHrApp(hrName));
		return SUCCESS;
	}
	
}
