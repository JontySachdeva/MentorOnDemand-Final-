package com.mod.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mod.entity.AdminEntity;

public interface AdminRepo extends JpaRepository<AdminEntity, Integer> {
	
	
	
}
