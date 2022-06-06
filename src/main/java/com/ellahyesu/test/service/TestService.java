package com.ellahyesu.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ellahyesu.test.model.TestUser;
import com.ellahyesu.test.repo.TestRepository;

@Service
public class TestService {
	
	@Autowired
	private TestRepository testRepository;
	
	public List<TestUser> findAll() {
		List<TestUser> members = new ArrayList<>();
		testRepository.findAll().forEach(e -> members.add(e));
        return members;
	}
	
}