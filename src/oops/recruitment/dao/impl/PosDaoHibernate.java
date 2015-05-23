package oops.recruitment.dao.impl;

import java.util.List;

import oops.recruitment.dao.PosDao;
import oops.recruitment.domain.Hr;
import oops.recruitment.domain.Pos;
import oops.recruitment.domain.User;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class PosDaoHibernate extends HibernateDaoSupport implements PosDao {

	@Override
	public Pos get(Integer id) {
		return getHibernateTemplate().get(Pos.class, id);
	}

	@Override
	public Integer save(Pos pos) {
		return (Integer)getHibernateTemplate().save(pos);
	}

	@Override
	public void update(Pos pos) {
		getHibernateTemplate().update(pos);
	}

	@Override
	public void delete(Pos pos) {
		getHibernateTemplate().delete(pos);
	}

	@Override
	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}

	@Override
	public List<Pos> findAll() {
		return (List<Pos>)getHibernateTemplate().find("from Pos");
	}
		
	@Override
	public List<Pos> findByUser(User user) {
		return (List<Pos>)getHibernateTemplate().find("from Pos as p where p.apps.user = ?",user);	//the HQL may be incorrect.
	}

	@Override
	public List<Pos> findByHr(Hr hr) {
		return (List<Pos>)getHibernateTemplate().find("from Pos as p where p.hr = ?",hr);
	}

}
