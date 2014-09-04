package it.iapb51.tt.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	@RequestMapping("/home")
	public String showHome(Model model) {
		return "home";
	}
	
	@RequestMapping("/")
	public String showIndex(Model model) {
		return "index";
	}
	
	
}
