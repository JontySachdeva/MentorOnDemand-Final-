package com.mod.interfac;

import java.util.List;

import com.mod.entity.MentorEntity;
import com.mod.entity.TrainingEntity;
import com.mod.model.TrainingModel;

public interface MentorDao {
	boolean persistMentor(MentorEntity mentor);
	 List <TrainingEntity> viewMentorList(int mentorId);
	 boolean validateMentor(MentorEntity mentorEntity);
	 boolean updateMentor(MentorEntity mentorEntity);
	 
	 
	 boolean mentorLogin(String email,String password);
}
