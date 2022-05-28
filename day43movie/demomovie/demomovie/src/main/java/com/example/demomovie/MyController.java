package com.example.demomovie;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	@GetMapping("/main")
	public String mainPage() {
		return "main";
	}
	@GetMapping("/movie")
	public String moveiPage() {
		return "movie";	
	}
	@GetMapping("/sport")
	public String sportPage() {
		return "sport";
	}

}
