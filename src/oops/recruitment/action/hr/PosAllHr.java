package oops.recruitment.action.hr;

import java.util.List;

import oops.recruitment.action.base.HrBaseAction;

public class PosAllHr extends HrBaseAction {
	private List poses;

	public List getPoses() {
		return poses;
	}

	public void setPoses(List poses) {
		this.poses = poses;
	}
	public String execute() throws Exception
	{
		setPoses(mgr.getAllPos());
		return SUCCESS;
	}
}
