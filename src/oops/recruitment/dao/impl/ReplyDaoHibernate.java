package oops.recruitment.dao.impl;

import java.util.List;

import oops.recruitment.dao.ReplyDao;
import oops.recruitment.domain.App;
import oops.recruitment.domain.Hr;
import oops.recruitment.domain.RepType;
import oops.recruitment.domain.Reply;
import oops.recruitment.domain.User;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class ReplyDaoHibernate extends HibernateDaoSupport implements ReplyDao {

	@Override
	public Reply get(Integer id) {
		return getHibernateTemplate().get(Reply.class, id);
	}

	@Override
	public Integer save(Reply reply) {
		return (Integer)getHibernateTemplate().save(reply);
	}

	@Override
	public void update(Reply reply) {
		getHibernateTemplate().update(reply);
	}

	@Override
	public void delete(Reply reply) {
		getHibernateTemplate().delete(reply);
	}

	@Override
	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}

	@Override
	public List<Reply> findAll() {
		return (List<Reply>)getHibernateTemplate().find("from Reply");
	}

	@Override
	public List<Reply> findByUser(User user) {
		return (List<Reply>)getHibernateTemplate().find("from Reply as r where r.app.user = ?",user);
	}

	@Override
	public List<Reply> findByUserAndRepType(User user, RepType repType) {
		return (List<Reply>)getHibernateTemplate()
				.find("from Reply as r where r.app.user = ? and r.repType = ?",user,repType);
	}

	@Override
	public List<Reply> findByHr(Hr hr) {
		return (List<Reply>)getHibernateTemplate().find("from Reply as r where r.hr = ?",hr);
	}

	@Override
	public List<Reply> findByHrandRepType(Hr hr, RepType repType) {
		return (List<Reply>)getHibernateTemplate()
				.find("from Reply as r where r.hr = ? and r.repType = ?",hr,repType);
	}

	@Override
	public Reply findByApp(App app) {
		List<Reply> replys = (List<Reply>)getHibernateTemplate().find("from Reply as r where r.app = ?",app);
		if(replys != null && replys.size() >=1)
		{
			return replys.get(0);
		}
		return null;
	}
	
}
