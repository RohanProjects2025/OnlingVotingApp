package in.vote.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import in.vote.app.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	@Query("select v from User v where v.email =:email")
	public User getUserByEmail(@Param("email") String email);

}
