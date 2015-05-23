package oops.recruitment.dao.impl;

import java.util.List;

import oops.recruitment.dao.AppDao;
import oops.recruitment.domain.App;
import oops.recruitment.domain.Hr;
import oops.recruitment.domain.User;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class AppDaoHibernate extends HibernateDaoSupport implements AppDao {

	@Override
	public App get(Integer id) {
		return getHibernateTemplate().get(App.class, id);
	}

	@Override
	public Integer save(App app) {
		return (Integer)getHibernateTemplate().save(app);
	}

	@Override
	public void update(App app) {
		getHibernateTemplate().update(app);
	}

	@Override
	public void delete(App app) {
		getHibernateTemplate().delete(app);
	}

	@Override
	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}

	@Override
	public List<App> findAll() {
		return (List<App>)getHibernateTemplate().find("from App");
	}

	@Override
	public List<App> findByUser(User user) {
		return (List<App>)getHibernateTemplate().find("from App as a where a.user = ?",user);
	}

	@Override
	public List<App> findByHr(Hr hr) {
		return (List<App>)getHibernateTemplate().find("from App as a where a.pos.hr = ?",hr);
	}

}
