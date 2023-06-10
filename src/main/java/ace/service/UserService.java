package ace.service;
import ace.bind.*;
import java.util.List;


public interface UserService {

	public String upsert(users users);

	public users getById(Integer cid);

	public List<users> getAllCourses();

	public String deleteById(Integer cid);
}
