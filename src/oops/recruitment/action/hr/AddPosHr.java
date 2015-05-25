package oops.recruitment.action.hr;

import com.opensymphony.xwork2.ActionContext;

import oops.recruitment.action.base.HrBaseAction;
import oops.recruitment.action.base.WebConstant;

public class AddPosHr extends HrBaseAction {
	private String posName;
	private String posSalary;
	private String posText;
	private String tip;
	public String getPosName() {
		return posName;
	}
	public void setPosName(String posName) {
		this.posName = posName;
	}
	public String getPosSalary() {
		return posSalary;
	}
	public void setPosSalary(String posSalary) {
		this.posSalary = posSalary;
	}
	public String getPosText() {
		return posText;
	}
	public void setPosText(String posText) {
		this.posText = posText;
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
		String hrName = (String)ctx.getSession().get(WebConstant.USER);
		if(mgr.addPos(hrName, getPosName(), getPosSalary(), getPosText()))
		{
			setTip("发布成功");
			return SUCCESS;
		}
		else
		{
			setTip("出错：发布失败");
			return ERROR;
		}
	}
}
