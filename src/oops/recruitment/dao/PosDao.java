package oops.recruitment.dao;

import java.util.List;

import oops.recruitment.domain.Hr;
import oops.recruitment.domain.Pos;
import oops.recruitment.domain.User;

public interface PosDao {
	Pos get(Integer id);
	Integer save(Pos pos);
	void update(Pos pos);
	void delete(Pos pos);
	void delete(Integer id);
	List<Pos> findAll();
	List<Pos> findByUser(User user);	
	List<Pos> findByHr(Hr hr);
}
