package oops.recruitment.action.user;

import java.util.List;

import oops.recruitment.action.base.UserBaseAction;



public class PosAllUser extends UserBaseAction {
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
