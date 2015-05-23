package oops.recruitment.dao;

import java.util.List;

import oops.recruitment.domain.Hr;
import oops.recruitment.domain.Pos;

public interface HrDao {
	Hr get(Integer id);
	Integer save(Hr hr);
	void update(Hr hr);
	void delete(Hr hr);
	void delete(Integer id);
	List<Hr> findAll();	
	List<Hr> findByNameAndPass(Hr hr);
	Hr findByName(String name);
}
