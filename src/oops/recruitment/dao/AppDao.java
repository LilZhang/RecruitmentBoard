package oops.recruitment.dao;

import java.util.List;

import oops.recruitment.domain.App;
import oops.recruitment.domain.Hr;
import oops.recruitment.domain.User;

public interface AppDao {
	 App get(Integer id);
	 Integer save(App app);
	 void update(App app);
	 void delete(App app);
	 void delete(Integer id);
	 List<App> findAll();
	 List<App> findByUser(User user);
	 List<App> findByHr(Hr hr);
}
