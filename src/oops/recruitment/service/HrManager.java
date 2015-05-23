package oops.recruitment.service;

import java.util.List;

import oops.recruitment.domain.Hr;
import oops.recruitment.exception.RecruitmentBoardException;
import oops.recruitment.vo.GePosBean;
import oops.recruitment.vo.HrAppBean;
import oops.recruitment.vo.HrReplyBean;

public interface HrManager {
	public static final int LOGIN_FAIL = 0;
	public static final int LOGIN_SUCC = 1;
	
	public static final int REPLY_FAIL = 0;
	public static final int REPLYEDED = 1;
	public static final int REPLY_SUCC = 2;
	
	int validLogin(Hr hr) throws RecruitmentBoardException ;
	List<GePosBean> getAllPos() throws RecruitmentBoardException ;
	List<GePosBean> getPos(String hrName) throws RecruitmentBoardException ;
	List<HrAppBean> getUserApp(String hrName) throws RecruitmentBoardException ;
	List<HrReplyBean> getUserReply(String hrName) throws RecruitmentBoardException ;
	List<HrReplyBean> getUserReplyByType(String hrName,int ReplyTypeNum) throws RecruitmentBoardException ;
	boolean replyApp(int appId, boolean repResult) throws RecruitmentBoardException ;
	boolean addPos(String hrName,String posName,double posSalary,String posText) throws RecruitmentBoardException;
}
