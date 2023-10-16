package com.example.DevopsTask;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping(value="/get")
	public String gets() {
		return "Deploy my project";
	}


}
