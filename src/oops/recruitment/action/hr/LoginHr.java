package oops.recruitment.action.hr;

import static oops.recruitment.service.UserManager.LOGIN_SUCC;

import com.opensymphony.xwork2.ActionContext;

import oops.recruitment.action.base.HrBaseAction;
import oops.recruitment.action.base.WebConstant;
import oops.recruitment.domain.Hr;

public class LoginHr extends HrBaseAction {
	private Hr hr;
	private String tip;
	
	public Hr getHr() {
		return hr;
	}
	public void setHr(Hr hr) {
		this.hr = hr;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	
	public String execute() throws Exception
	{
		ActionContext ctx = ActionContext.getContext();
		int result = mgr.validLogin(getHr());
		if(result == LOGIN_SUCC)
		{
			ctx.getSession().put(WebConstant.USER, hr.getHrName());
			setTip("Login Successfully.");
			return SUCCESS;
		}
		else
		{
			setTip("Wrong username or password.");
			return LOGIN;
		}
	}
}
