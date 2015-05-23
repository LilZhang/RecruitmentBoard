package oops.recruitment.dao.impl;

import java.util.List;

import oops.recruitment.dao.RepTypeDao;
import oops.recruitment.domain.RepType;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class RepTypeDaoHibernate extends HibernateDaoSupport implements RepTypeDao {

	@Override
	public RepType get(Integer id) {
		return getHibernateTemplate().get(RepType.class, id);
	}

	@Override
	public Integer save(RepType repType) {
		return (Integer)getHibernateTemplate().save(repType);
	}

	@Override
	public void update(RepType repType) {
		getHibernateTemplate().update(repType);
	}

	@Override
	public void delete(RepType repType) {
		getHibernateTemplate().delete(repType);
	}

	@Override
	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}

	@Override
	public List<RepType> findAll() {
		return (List<RepType>)getHibernateTemplate().find("from RepType");
	}

}
