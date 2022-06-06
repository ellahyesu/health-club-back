package com.ellahyesu.test.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ellahyesu.test.model.TestUser;

@Repository
public interface TestRepository extends JpaRepository<TestUser, Integer> {
	
	//public void save();
	

    @Query(value = "select * from testuser", nativeQuery=true)
	public List<TestUser> findAll();
	
//	public List<TestUser> findFirst2ByUserNameLikeOrderByIdDesc(String userName);
	
}