package oops.recruitment.dao;

import java.util.List;

import oops.recruitment.domain.RepType;

public interface RepTypeDao {
	RepType get(Integer id);
	Integer save(RepType repType);
	void update(RepType repType);
	void delete(RepType repType);
	void delete(Integer id);
	List<RepType> findAll();	
}
