package oops.recruitment.service;

import java.util.List;

import oops.recruitment.domain.User;
import oops.recruitment.exception.RecruitmentBoardException;
import oops.recruitment.vo.*;

public interface UserManager {
	public static final int LOGIN_FAIL = 0;
	public static final int LOGIN_SUCC = 1;
	
	public static final int APP_FAIL = 0;
	public static final int APPED = 1;
	public static final int APP_SUCC = 2;
	
	int validLogin(User user) throws RecruitmentBoardException ;
	List<GePosBean> getAllPos() throws RecruitmentBoardException ;
	List<GePosBean> getPos(String userName) throws RecruitmentBoardException ;
	List<UserAppBean> getUserApp(String userName) throws RecruitmentBoardException ;
	List<UserReplyBean> getUserReply(String userName) throws RecruitmentBoardException ;
	List<UserReplyBean> getUserReplyByType(String userName,int ReplyTypeNum) throws RecruitmentBoardException ;
	boolean recruitApp(String userName,int posId) throws RecruitmentBoardException ;
}
