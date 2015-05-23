package oops.recruitment.dao.impl;

import java.util.List;

import oops.recruitment.dao.HrDao;
import oops.recruitment.domain.Hr;
import oops.recruitment.domain.Pos;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class HrDaoHibernate extends HibernateDaoSupport implements HrDao {

	@Override
	public Hr get(Integer id) {
		return getHibernateTemplate().get(Hr.class, id);
	}

	@Override
	public Integer save(Hr hr) {
		return (Integer)getHibernateTemplate().save(hr);
	}

	@Override
	public void update(Hr hr) {
		getHibernateTemplate().update(hr);
	}

	@Override
	public void delete(Hr hr) {
		getHibernateTemplate().delete(hr);
	}

	@Override
	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}

	@Override
	public List<Hr> findAll() {
		return (List<Hr>)getHibernateTemplate().find("from Hr");
	}

	@Override
	public List<Hr> findByNameAndPass(Hr hr) {
		return (List<Hr>)getHibernateTemplate().
				find("from Hr as h where h.hrName = ? and h.hrPass = ?",hr.getHrName(),hr.getHrPass());
	}

	@Override
	public Hr findByName(String name) {
		List<Hr> hrs = (List<Hr>)getHibernateTemplate().find("from Hr as h where h.hrname = ?",name);
		if(hrs != null && hrs.size()>=1)
		{
			return hrs.get(0);
		}
		return null;
	}

	
	
}
