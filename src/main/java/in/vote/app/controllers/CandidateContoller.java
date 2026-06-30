package in.vote.app.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import in.vote.app.entities.Candidate;
import in.vote.app.entities.User;
import in.vote.app.service.CandidateService;
import in.vote.app.service.UserService;
import jakarta.servlet.http.HttpSession;

@Controller
public class CandidateContoller {


    @Autowired
	private CandidateService canServ;
	
	@Autowired
	private UserService userServ;

	@PostMapping("/addcandidate")
	public String addCandidate(@RequestParam("candidate") String candidate, 
			HttpSession session) {
		
		User user = (User) session.getAttribute("loggedUser");
		
		if(user == null) {
			return "redirect:/login";
		}
		
		if(user.getStatus() == null) {
			try {
				Candidate selectedCan = canServ.getCandidateByCandidate(candidate);
				selectedCan.setVotes(selectedCan.getVotes() + 1);
				canServ.addCandidate(selectedCan);
				
				user.setStatus("Voted");
				userServ.addUser(user);
				
				session.setAttribute("vmsg", "Successfully Voted...");
			}
			catch(Exception e){
				session.setAttribute("vmsg", "Something went wrong...");
				e.printStackTrace();
			}
		}
		
		
		return "redirect:/user";
	}
    
}
