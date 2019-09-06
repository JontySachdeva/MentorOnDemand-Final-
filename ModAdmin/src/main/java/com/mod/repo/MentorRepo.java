package com.mod.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mod.entity.MentorEntity;

public interface MentorRepo extends JpaRepository<MentorEntity, Integer> {

}
