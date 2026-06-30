package in.vote.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.vote.app.repositories.CandidateRepository;

@Controller
public class AdminController {

	@Autowired
	private CandidateRepository canRepo;

	@GetMapping("/admin")
	public String dashboard(Model m) {
		
		int c1 = canRepo.getNumOfVotes("candidate1");
		int c2 = canRepo.getNumOfVotes("candidate2");
		int c3 = canRepo.getNumOfVotes("candidate3");
		int c4 = canRepo.getNumOfVotes("candidate4");
		
		m.addAttribute("c1", c1);
		m.addAttribute("c2", c2);
		m.addAttribute("c3", c3);
		m.addAttribute("c4", c4);
		
		m.addAttribute("title", "DASHBOARD");
		
		return "admin/admin";
	}
}
