package oops.recruitment.dao;

import java.util.List;

import oops.recruitment.domain.App;
import oops.recruitment.domain.Hr;
import oops.recruitment.domain.RepType;
import oops.recruitment.domain.Reply;
import oops.recruitment.domain.User;

public interface ReplyDao {
	Reply get(Integer id);
	Integer save(Reply reply);
	void update(Reply reply);
	void delete(Reply reply);
	void delete(Integer id);
	List<Reply> findAll();
	List<Reply> findByUser(User user);
	List<Reply> findByUserAndRepType(User user,RepType repType);
	List<Reply> findByHr(Hr hr);
	List<Reply> findByHrandRepType(Hr hr,RepType repType);
	Reply findByApp(App app);
}
