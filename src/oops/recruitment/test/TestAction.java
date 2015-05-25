package oops.recruitment.test;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {
	private String userName;
	private String userPass;
	private String tip;
	

	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserPass() {
		return userPass;
	}


	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}


	public String getTip() {
		return tip;
	}


	public void setTip(String tip) {
		this.tip = tip;
	}


	public String execute()throws Exception
	{
		if(getUserName()=="lilzhang"&&getUserPass()=="123456")
		{
		setTip("Yes");
		return SUCCESS;
		}
		else
		{
		setTip("No");
		return LOGIN;
		}
	}
}
