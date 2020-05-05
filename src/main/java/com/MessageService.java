package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageService {

	@GetMapping("/hello")
	public String Hello() {
		return "Hello Folks!!!";
	}
	
	@GetMapping("/welcome")
	public String Welcome() {
		return "Welcome!!!";
	}
	
	@GetMapping("/devops")
	public String DevOps() {
		return "Happy learning DevOps Engineers!!!";
	}
	
}