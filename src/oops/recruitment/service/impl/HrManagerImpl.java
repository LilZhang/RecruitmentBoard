package oops.recruitment.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import oops.recruitment.dao.*;
import oops.recruitment.domain.*;
import oops.recruitment.exception.RecruitmentBoardException;
import oops.recruitment.service.HrManager;
import oops.recruitment.vo.GePosBean;
import oops.recruitment.vo.HrAppBean;
import oops.recruitment.vo.HrReplyBean;

public class HrManagerImpl implements HrManager {
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
		for(Pos p : poses)
		{
			result.add(new GePosBean(p.getId(),p.getPosName(),p.getPosSalary(),
					p.getPosText(),p.getPosPubTime(),p.getHr().getComp()));
		}
		return result;
	}

	@Override
	public List<GePosBean> getPos(String hrName)
			throws RecruitmentBoardException {
		Hr hr = hrDao.findByName(hrName);
		List<Pos> poses = posDao.findByHr(hr);
		List<GePosBean> result = new ArrayList<GePosBean>();
		for(Pos p : poses)
		{
			result.add(new GePosBean(p.getId(),p.getPosName(),p.getPosSalary(),
					p.getPosText(),p.getPosPubTime(),p.getHr().getComp()));
		}
		return result;
	}

	@Override
	public List<HrAppBean> getUserApp(String hrName)
			throws RecruitmentBoardException {
		Hr hr = hrDao.findByName(hrName);
		List<App> apps = appDao.findByHr(hr);
		List<HrAppBean> result = new ArrayList<HrAppBean>();
		for(App a : apps)
		{
			result.add(new HrAppBean(a.getId(),a.getPos().getPosName(),
					a.getAppTime(),a.getUser().getUserName(),a.getUser().getAge(),
					a.getUser().getSchool(),a.getUser().getUserPn()));
		}		
		return result;
	}

	@Override
	public List<HrReplyBean> getUserReply(String hrName)
			throws RecruitmentBoardException {
		Hr hr = hrDao.findByName(hrName);
		List<Reply> replys = replyDao.findByHr(hr);
		List<HrReplyBean> result = new ArrayList<HrReplyBean>();
		for(Reply r : replys)
		{
			result.add(new HrReplyBean(r.getId(),r.getApp().getPos().getPosName(),
					r.getApp().getAppTime(),r.getApp().getUser().getUserName(),
					r.getApp().getUser().getAge(),r.getApp().getUser().getSchool(),
					r.getRepType().getRtype(),r.getReplyTime()));
		}		
		return result;
	}

	@Override
	public List<HrReplyBean> getUserReplyByType(String hrName, int ReplyTypeNum)
			throws RecruitmentBoardException {
		Hr hr = hrDao.findByName(hrName);
		RepType repType = repTypeDao.get(ReplyTypeNum);
		List<Reply> replys = replyDao.findByHrandRepType(hr, repType);
		List<HrReplyBean> result = new ArrayList<HrReplyBean>();
		for(Reply r : replys)
		{
			result.add(new HrReplyBean(r.getId(),r.getApp().getPos().getPosName(),
					r.getApp().getAppTime(),r.getApp().getUser().getUserName(),
					r.getApp().getUser().getAge(),r.getApp().getUser().getSchool(),
					r.getRepType().getRtype(),r.getReplyTime()));
		}		
		return result;
	}

	@Override
	public boolean replyApp(int appId, boolean repResult)
			throws RecruitmentBoardException {
		App app = appDao.get(appId);
		Reply reply = replyDao.findByApp(app);
		if(repResult)
		{
			reply.setRepType(repTypeDao.get(2));
		}
		else
		{
			reply.setRepType(repTypeDao.get(3));
		}
		reply.setReplyTime(new Date());
		replyDao.update(reply);
		return true;
		
	}

	@Override
	public boolean addPos(String hrName, String posName, double posSalary,
			String posText) throws RecruitmentBoardException {
		Pos pos = new Pos();
		pos.setPosName(posName);
		pos.setPosSalary(posSalary);
		pos.setPosText(posText);
		pos.setHr(hrDao.findByName(hrName));
		pos.setPosPubTime(new Date());
		posDao.save(pos);
		return true;
	}

	@Override
	public int validLogin(Hr hr) throws RecruitmentBoardException {
		if(hrDao.findByNameAndPass(hr).size() >= 1)
		{
			return LOGIN_SUCC;
		}
		else
		{
			return LOGIN_FAIL;
		}
	}

}
