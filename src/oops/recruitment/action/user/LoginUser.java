package oops.recruitment.action.user;

import com.opensymphony.xwork2.ActionContext;

import oops.recruitment.action.base.WebConstant;
import oops.recruitment.action.base.UserBaseAction;
import oops.recruitment.domain.User;
import static oops.recruitment.service.UserManager.*;

public class LoginUser extends UserBaseAction {
	private User user;
	private String tip;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
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
		int result = mgr.validLogin(getUser());
		if(result == LOGIN_SUCC)
		{
			ctx.getSession().put(WebConstant.USER, user.getUserName());
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
