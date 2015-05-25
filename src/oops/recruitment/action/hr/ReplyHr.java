package oops.recruitment.action.hr;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import oops.recruitment.action.base.HrBaseAction;
import oops.recruitment.action.base.WebConstant;

public class ReplyHr extends HrBaseAction {
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
		String hrName = (String)ctx.getSession().get(WebConstant.USER);
		setReplys(mgr.getHrReply(hrName));
		return SUCCESS;
	}
}
