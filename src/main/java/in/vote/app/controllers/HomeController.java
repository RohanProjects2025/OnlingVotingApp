package in.vote.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.vote.app.entities.User;
import in.vote.app.service.UserService;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userServ;

	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/dologin")
	public String doLogin(@RequestParam String email, @RequestParam String password, 
			              HttpSession session) {
		User user = userServ.getUserByEmail(email);
		
		if(user == null) {
			session.setAttribute("msg", "Invalid Email");
			session.removeAttribute("msg1");
			return "redirect:/login";
		}
		if(!user.getPassword().equals(password)) {
			session.setAttribute("msg1", "Invalid Password");
			session.removeAttribute("msg");
			return "redirect:/login";
		}
		session.setAttribute("loggedUser", user);
		
		if(user.getRole().equals("Role_ADMIN")) {
			return "redirect:/admin";
		}
		return "redirect:/user";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/login";
	}
}
