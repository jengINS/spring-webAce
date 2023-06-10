package ace.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

import ace.bind.*;

@Repository
public interface userRepository extends JpaRepository<users, Serializable>{
	
	

}


