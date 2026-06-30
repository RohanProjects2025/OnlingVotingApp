package in.vote.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.vote.app.entities.Candidate;
import in.vote.app.entities.User;
import in.vote.app.repositories.CandidateRepository;
import in.vote.app.repositories.UserRepository;

@SpringBootApplication
public class VotingAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(VotingAppApplication.class, args);
	}

	@Autowired
	public CandidateRepository canRepo;
	
	@Autowired
	public UserRepository userRepo;
	
	public void run(String... args) throws Exception{
	
		// Admin
		if(userRepo.count()==0) {
			User admin = new User();
			admin.setName("admin1");
			admin.setEmail("admin@gmail.com");
			admin.setPassword("admin");
			admin.setPhoneno(1234567890);
			admin.setStatus("admin");
			admin.setRole("Role_ADMIN");
			userRepo.save(admin);
		}
		
		
		// Candidate
		
		if(canRepo.count()==0) {
			
			Candidate candidate1 = new Candidate();
			candidate1.setCandidate("candidate1");
			candidate1.setVotes(0);
			canRepo.save(candidate1);
			
			Candidate candidate2 = new Candidate();
			candidate2.setCandidate("candidate2");
			candidate2.setVotes(0);
			canRepo.save(candidate2);
			
			Candidate candidate3 = new Candidate();
			candidate3.setCandidate("candidate3");
			candidate3.setVotes(0);
			canRepo.save(candidate3);
			
			Candidate candidate4 = new Candidate();
			candidate4.setCandidate("candidate4");
			candidate4.setVotes(0);
			canRepo.save(candidate4);
			
		}
	}
}
