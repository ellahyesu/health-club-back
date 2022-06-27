package com.ellahyesu.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainController {


	@GetMapping("/hello")
	public String helloWorld() {
	    return "hello!!!!!!!!!!fdfd!!";
	}
}
