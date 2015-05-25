package oops.recruitment.action.user;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import oops.recruitment.action.base.UserBaseAction;
import oops.recruitment.action.base.WebConstant;

public class ReplyUser extends UserBaseAction {
	private List replys;

	public List getReplys() {
		return replys;
	}

	public void setReplys(List replys) {
		this.replys = replys;
	}
	public String execute() throws Exception
	{
		ActionContext ctx = ActionContext.getContext();
		String userName = (String)ctx.getSession().get(WebConstant.USER);
		setReplys(mgr.getUserReply(userName));
		return SUCCESS;
	}
}
