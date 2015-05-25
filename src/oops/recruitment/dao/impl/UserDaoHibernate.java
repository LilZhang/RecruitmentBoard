package oops.recruitment.dao.impl;

import java.util.List;

import oops.recruitment.dao.UserDao;
import oops.recruitment.domain.User;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class UserDaoHibernate extends HibernateDaoSupport implements UserDao {

	@Override
	public User get(Integer id) {
		return getHibernateTemplate().get(User.class, id);
	}

	@Override
	public Integer save(User user) {
		return (Integer)getHibernateTemplate().save(user);
	}

	@Override
	public void update(User user) {
		getHibernateTemplate().update(user);
	}

	@Override
	public void delete(User user) {
		getHibernateTemplate().delete(user);
	}

	@Override
	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}

	@Override
	public List<User> findAll() {
		return (List<User>)getHibernateTemplate().find("from User");
	}

	@Override
	public List<User> findByNameAndPass(User user) {
		System.out.println("Testing UserDao");
		return (List<User>)getHibernateTemplate()
				.find("from User u where u.userName = ? and u.userPass = ?",
						user.getUserName(),user.getUserPass());
	}

	@Override
	public User findByName(String name) {
		List<User> users = (List<User>)getHibernateTemplate().find("from User as u where u.userName = ?",name);
		if(users != null && users.size() >= 1)
		{
			return users.get(0);
		}
		return null;
	}

}
