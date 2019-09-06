package com.mod.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mod.convertor.MentorConvertor;
import com.mod.convertor.TrainingConvertor;
import com.mod.entity.MentorEntity;
import com.mod.entity.TrainingEntity;
import com.mod.interfac.MentorDao;
import com.mod.interfac.MentorService;
import com.mod.model.MentorModel;
import com.mod.model.TrainingModel;

@Service
public class MentorServiceImpl implements MentorService {

	@Autowired
	private MentorDao mentorDao;
	
	MentorConvertor mentorConvertor = new MentorConvertor();
	TrainingConvertor trainingConvertor = new TrainingConvertor();

	@Override
	public boolean registerMentor(MentorModel mentorModel) {
		MentorEntity mentor = mentorConvertor.mentorModelToEntity(mentorModel);
		return mentorDao.persistMentor(mentor);
	}

	@Override
	public List<TrainingModel> viewMentorList(int mentorId) {
		TrainingModel trainingModel = null;
		List<TrainingModel> mentorModelHistoryList = new ArrayList<TrainingModel>();
		List<TrainingEntity> mentorEntityHistoryList = mentorDao.viewMentorList(mentorId);
		for(int i=0; i< mentorEntityHistoryList.size(); i++)
		{
			TrainingEntity trainingEntity = mentorEntityHistoryList.get(i);
			trainingModel = trainingConvertor.trainingEntityToModel(trainingEntity);
			mentorModelHistoryList.add(trainingModel);
		}
		
		return mentorModelHistoryList;
	}

	@Override
	public boolean getMentorLoginStatus(MentorModel mentorModel) {
		MentorEntity mentorEntity = mentorConvertor.mentorModelToEntity(mentorModel);
		return mentorDao.validateMentor(mentorEntity);
	}

	@Override
	public boolean updateMentor(MentorModel mentorModel) {
		MentorEntity mentorEntity = mentorConvertor.mentorModelToEntity(mentorModel);
		return mentorDao.updateMentor(mentorEntity);
		
	}

	@Override
	public boolean mentorLogin(String email, String password) {
	
		return mentorDao.mentorLogin(email , password);
	}

	

}
