package oops.recruitment.dao;

import java.util.List;

import oops.recruitment.domain.User;

public interface UserDao {
	User get(Integer id);
	Integer save(User user);
	void update(User user);
	void delete(User user);
	void delete(Integer id);
	List<User> findAll();
	List<User> findByNameAndPass(User user);
	User findByName(String name);
}
