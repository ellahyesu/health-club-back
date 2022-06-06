package com.ellahyesu.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ellahyesu.test.service.TestService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TestRestController {
	
	@Autowired
	TestService testService;
	
	@GetMapping("/getAllTestUser")
    public String getAllmembers() {
        return testService.findAll().toString();
    }
	
}
