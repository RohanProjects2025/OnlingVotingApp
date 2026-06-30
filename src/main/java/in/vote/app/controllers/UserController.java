package in.vote.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.vote.app.entities.User;
import in.vote.app.service.UserService;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {
	
	@Autowired
	private UserService userServ;

	@PostMapping("/createuser")
	public String createUser(@ModelAttribute User user, HttpSession session) {
		String email = user.getEmail();
		
		if (userServ.getUserByEmail(email) != null) {
			session.setAttribute("fail", "Registration Failed, Please try different Email Id");
			session.removeAttribute("success");
			return "redirect:/register";
		} else {
			userServ.addUser(user);
			session.setAttribute("success", "Registration Successful");
			session.removeAttribute("fail");
			return "redirect:/register";
		}
		
	}
	
	@GetMapping("/user")
	public String dashboard(Model m, HttpSession session) {
		
		User user = (User) session.getAttribute("loggedUser");
		m.addAttribute("username", user);
		m.addAttribute("user", user);
		m.addAttribute("title", "DASHBOARD");
		return "user/dashboard";
	}
	
}
