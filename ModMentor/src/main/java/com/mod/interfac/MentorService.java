package com.mod.interfac;

import java.util.List;

import com.mod.entity.TrainingEntity;
import com.mod.model.MentorModel;
import com.mod.model.TrainingModel;

public interface MentorService {

	boolean registerMentor(MentorModel mentorModel);
	List<TrainingModel> viewMentorList(int mentorId);
	boolean getMentorLoginStatus(MentorModel mentorModel);
	boolean updateMentor(MentorModel mentorModel);
	
	boolean mentorLogin(String email,String password);

}