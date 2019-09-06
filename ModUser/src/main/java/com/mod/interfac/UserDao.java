package com.mod.interfac;

import java.util.List;

import com.mod.entity.MentorEntity;
import com.mod.entity.UserEntity;
import com.mod.model.UserModel;

public interface UserDao {

	boolean persistUser(UserEntity user);
   List <MentorEntity> getMentor(String technology , String timingSlot);
  boolean validateUser(UserEntity userEntity);
}
