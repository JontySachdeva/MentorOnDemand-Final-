package com.mod.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mod.entity.AdminEntity;

@Repository
public interface AdminRepo extends JpaRepository<AdminEntity, Integer> {
	
	

}
