package com.mod.interfac;

import java.util.List;

import com.mod.entity.MentorEntity;
import com.mod.model.MentorModel;
import com.mod.model.UserModel;

public interface UserService {

	boolean registerUser(UserModel userModel);
	List<MentorModel> searchMentor(String technology , String timingSlot);
	boolean getUserLoginStatus(UserModel userModel);

}
