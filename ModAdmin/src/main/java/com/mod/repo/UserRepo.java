package com.mod.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mod.entity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Integer> {
	
}
