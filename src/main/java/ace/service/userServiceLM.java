package ace.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import ace.bind.*;
import ace.repo.*;

@Service
public class userServiceLM implements UserService {

	@Autowired
	private userRepository userrepository;
	
	

	
	@Override
	public String upsert(users users) {
		// TODO Auto-generated method stub
		userrepository.save(users); // upsert (insert / update based on PK)

		return "success";
	}

	@Override
	public users getById(Integer cid) {
		Optional<users> findById = userrepository.findById(cid);

		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<users> getAllCourses() {
		return userrepository.findAll();
	}

	@Override
	public String deleteById(Integer cid) {
		if (userrepository.existsById(cid)) {
			userrepository.deleteById(cid);
			return "Delete Success";
		} else {
			return "No Record Found";
		}
	}

}
