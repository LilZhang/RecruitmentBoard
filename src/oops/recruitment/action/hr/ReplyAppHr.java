package oops.recruitment.action.hr;

import oops.recruitment.action.base.HrBaseAction;

public class ReplyAppHr extends HrBaseAction {
	private int appid;
	private String repRequest;
	private String tip;
	public int getAppid() {
		return appid;
	}
	public void setAppid(int appid) {
		this.appid = appid;
	}
	public String isRepRequest() {
		return repRequest;
	}
	public void setRepRequest(String repRequest) {
		this.repRequest = repRequest;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public String execute() throws Exception
	{
		if(mgr.replyApp(getAppid(), isRepRequest())){
			setTip("回复成功");
			return SUCCESS;
		}
		else
		{
			setTip("出错：回复失败");
			return ERROR;
		}
	}
}
