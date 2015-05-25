package oops.recruitment.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import oops.recruitment.dao.*;
import oops.recruitment.domain.*;
import oops.recruitment.exception.RecruitmentBoardException;
import oops.recruitment.service.UserManager;
import oops.recruitment.vo.GePosBean;
import oops.recruitment.vo.UserAppBean;
import oops.recruitment.vo.UserReplyBean;

public class UserManagerImpl implements UserManager {
	private AppDao appDao;
	private HrDao hrDao;
	private PosDao posDao;
	private ReplyDao replyDao;
	private RepTypeDao repTypeDao;
	private UserDao userDao;
	

	public void setAppDao(AppDao appDao) {
		this.appDao = appDao;
	}

	public void setHrDao(HrDao hrDao) {
		this.hrDao = hrDao;
	}

	public void setPosDao(PosDao posDao) {
		this.posDao = posDao;
	}

	public void setReplyDao(ReplyDao replyDao) {
		this.replyDao = replyDao;
	}

	public void setRepTypeDao(RepTypeDao repTypeDao) {
		this.repTypeDao = repTypeDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<GePosBean> getAllPos() throws RecruitmentBoardException {
		List<Pos> poses = posDao.findAll();
		List<GePosBean> result = new ArrayList<GePosBean>();
		for (Pos p : poses)
		{
			result.add(new GePosBean(p.getId(),
					p.getPosName(),p.getPosSalary(),p.getPosText(),
					p.getPosPubTime(),p.getHr().getComp()));
		}		
		return result;
	}

	@Override
	public List<GePosBean> getPos(String userName)
			throws RecruitmentBoardException {
		User user = userDao.findByName(userName);
		List<App> apps = appDao.findByUser(user);
		List<GePosBean> result = new ArrayList<GePosBean>();
		for(App a : apps)
		{
			result.add(new GePosBean(a.getPos().getId(),a.getPos().getPosName(),
					a.getPos().getPosSalary(),a.getPos().getPosText(),a.getPos().getPosPubTime(),
					a.getPos().getHr().getComp()));
		}
		/*
		List<Pos> poses = posDao.findByUser(user);		
		for(Pos p : poses)
		{
			result.add(new GePosBean(p.getId(),p.getPosName(),
					p.getPosSalary(),p.getPosText(),p.getPosPubTime(),p.getHr().getComp()));
		}		
		*/
		return result;
	}

	@Override
	public List<UserAppBean> getUserApp(String userName)
			throws RecruitmentBoardException {
		User user = userDao.findByName(userName);
		List<App> apps = appDao.findByUser(user);
		List<UserAppBean> result = new ArrayList<UserAppBean>();
		for(App a : apps)
		{
			result.add(new UserAppBean(a.getId(),a.getPos().getPosName(),
					a.getPos().getHr().getComp(),a.getAppTime()));
		}		
		return result;
	}

	@Override
	public List<UserReplyBean> getUserReply(String userName)
			throws RecruitmentBoardException {
		User user = userDao.findByName(userName);
		List<Reply> replys = replyDao.findByUser(user);
		List<UserReplyBean> result = new ArrayList<UserReplyBean>();
		for(Reply r : replys)
		{
			result.add(new UserReplyBean(r.getId(),r.getApp().getPos().getPosName(),
					r.getHr().getComp(),r.getApp().getAppTime(),r.getReplyTime(),
					r.getRepType().getRtype(),r.getHr().getHrName(),r.getHr().getHrPn()));
		}
		
		return result;
	}

	@Override
	public List<UserReplyBean> getUserReplyByType(String userName,
			int ReplyTypeNum) throws RecruitmentBoardException {
		User user = userDao.findByName(userName);
		RepType repType = repTypeDao.get(ReplyTypeNum);
		List<Reply> replys = replyDao.findByUserAndRepType(user, repType);
		List<UserReplyBean> result = new ArrayList<UserReplyBean>();
		for(Reply r : replys)
		{
			result.add(new UserReplyBean(r.getId(),r.getApp().getPos().getPosName(),
					r.getHr().getComp(),r.getApp().getAppTime(),r.getReplyTime(),
					r.getRepType().getRtype(),r.getHr().getHrName(),r.getHr().getHrPn()));		}		
		return result;
	}

	@Override
	public boolean recruitApp(String userName, int posId)
			throws RecruitmentBoardException {
		App app = new App();
		User user = userDao.findByName(userName);
		Pos pos = posDao.get(posId);
		app.setUser(user);
		app.setPos(pos);
		app.setAppTime(new Date());
		Reply emptyReply = new Reply();
		emptyReply.setHr(pos.getHr());
		emptyReply.setRepType(repTypeDao.get(1));
		emptyReply.setApp(app);
		app.setReply(emptyReply);	//@_@
		appDao.save(app);
		replyDao.save(emptyReply);
		return true;
	}

	@Override
	public int validLogin(User user) throws RecruitmentBoardException {
		if(userDao.findByNameAndPass(user).size() >= 1)
		{
			return LOGIN_SUCC;
		}
		else
		{
			return LOGIN_FAIL;
		}
	}
	
}
