package oops.recruitment.action.hr;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import oops.recruitment.action.base.HrBaseAction;
import oops.recruitment.action.base.WebConstant;

public class PosHr extends HrBaseAction {
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
		String hrName = (String)ctx.getSession().get(WebConstant.USER);
		setPoses(mgr.getPos(hrName));
		return SUCCESS;
	}
}
