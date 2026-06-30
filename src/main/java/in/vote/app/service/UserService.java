package in.vote.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.vote.app.entities.User;
import in.vote.app.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;

	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return this.userRepo.getUserByEmail(email);
	}

	public User addUser(User user) {
		// TODO Auto-generated method stub
		user.setRole("ROLE_NORMAL");
		return this.userRepo.save(user);
	}

}
