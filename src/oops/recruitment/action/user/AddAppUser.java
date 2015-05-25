package oops.recruitment.action.user;

import com.opensymphony.xwork2.ActionContext;

import oops.recruitment.action.base.UserBaseAction;
import oops.recruitment.action.base.WebConstant;
import oops.recruitment.domain.App;

public class AddAppUser extends UserBaseAction {	
	private int posid;
	private String tip;
	
	public int getPosid() {
		return posid;
	}
	public void setPosid(int posid) {
		this.posid = posid;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	
	public String execute()throws Exception
	{
		ActionContext ctx = ActionContext.getContext();
		String userName = (String)ctx.getSession().get(WebConstant.USER);
		mgr.recruitApp(userName, getPosid());//?
		setTip("App Successfully !");
		return SUCCESS;
	}
}
