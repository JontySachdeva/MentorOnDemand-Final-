package com.mod.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mod.convertor.MentorConvertor;
import com.mod.convertor.UserConvertor;
import com.mod.entity.MentorEntity;
import com.mod.entity.UserEntity;
import com.mod.interfac.UserDao;
import com.mod.interfac.UserService;
import com.mod.model.MentorModel;
import com.mod.model.UserModel;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	UserConvertor userConvertor = new UserConvertor();
	MentorConvertor mentorConvertor = new MentorConvertor();

	@Override
	public boolean registerUser(UserModel userModel) {
		UserEntity user = userConvertor.userModelToEntity(userModel);
		return userDao.persistUser(user);
	}

	@Override
	public List<MentorModel> searchMentor(String technology, String timingSlot) {
		List<MentorEntity> mentorList = userDao.getMentor(technology,timingSlot);
		
		List<MentorModel> mentorModelList = new ArrayList<MentorModel>();
        MentorModel mentorModel = null;
		
		for(int i=0; i<mentorList.size(); i++)
		{
			MentorEntity mentorEntity = mentorList.get(i);
     	    mentorModel = mentorConvertor.mentorEntityToModel(mentorEntity);
			mentorModelList.add(mentorModel);
		}
		
		
		return mentorModelList;
		
	}

	@Override
	public boolean getUserLoginStatus(UserModel userModel) {
		UserEntity userEntity = userConvertor.userModelToEntity(userModel);
		return userDao.validateUser(userEntity);
	}

}
