package com.ellahyesu.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/test_jsp")
    public String testJsp() {
        return "test/test"; 
    }
	
}
