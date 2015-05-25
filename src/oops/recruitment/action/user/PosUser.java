package oops.recruitment.action.user;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import oops.recruitment.action.base.UserBaseAction;
import oops.recruitment.action.base.WebConstant;

public class PosUser extends UserBaseAction {
	private List poses;

	public List getPoses() {
		return poses;
	}

	public void setPoses(List poses) {
		this.poses = poses;
	}
	
	public String execute() throws Exception
	{
		ActionContext ctx = ActionContext.getContext();
		String userName = (String)ctx.getSession().get(WebConstant.USER);
		setPoses(mgr.getPos(userName));
		return SUCCESS;
	}
}
