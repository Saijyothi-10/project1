package AQE.Project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Projectcontroller {
	
	@GetMapping("/get")
	public String getData() {
		return "Hello There.....";
	}


}
