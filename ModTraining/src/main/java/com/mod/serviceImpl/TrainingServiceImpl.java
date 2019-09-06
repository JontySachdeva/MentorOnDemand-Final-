package com.mod.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mod.convertor.TrainingConvertor;
import com.mod.entity.TrainingEntity;
import com.mod.interfac.TrainingDao;
import com.mod.interfac.TrainingService;
import com.mod.model.TrainingModel;

@Service
public class TrainingServiceImpl implements TrainingService{
	
	TrainingConvertor trainingConvertor = new TrainingConvertor();
	
	@Autowired
	private TrainingDao trainingDao;

	@Override
	public List<TrainingModel> getUserCompletedTrainingList(int userId) {
    List<TrainingEntity> trainingList =trainingDao.getUserCompletedTrainingList(userId);
		
		List<TrainingModel> completedTrainingList = new ArrayList<TrainingModel>();
		TrainingModel trainingModel = null;
		
		for(int i=0; i<trainingList.size(); i++)
		{
			TrainingEntity trainingEntity = trainingList.get(i);
			trainingModel = trainingConvertor.trainingEntityToModel(trainingEntity);
			completedTrainingList.add(trainingModel);
		}
		
		
		return completedTrainingList;
	}

	@Override
	public List<TrainingModel> getMentorCompletedTrainingList(int mentorId) {
List<TrainingEntity> trainingList =trainingDao.getMentorCompletedTrainingList(mentorId);
		
		List<TrainingModel> completedTrainingList = new ArrayList<TrainingModel>();
		TrainingModel trainingModel = null;
		
		for(int i=0; i<trainingList.size(); i++)
		{
			TrainingEntity trainingEntity = trainingList.get(i);
			trainingModel = trainingConvertor.trainingEntityToModel(trainingEntity);
			completedTrainingList.add(trainingModel);
		}
		
		
		return completedTrainingList;
	}

	@Override
	public List<TrainingModel> getUserCurrentTrainingList(int userId) {
     List<TrainingEntity> trainingList =trainingDao.getUserCurrentTrainingList(userId);
		
		List<TrainingModel> currentTrainingList = new ArrayList<TrainingModel>();
		TrainingModel trainingModel = null;
		
		for(int i=0; i<trainingList.size(); i++)
		{
			TrainingEntity trainingEntity = trainingList.get(i);
			trainingModel = trainingConvertor.trainingEntityToModel(trainingEntity);
			currentTrainingList.add(trainingModel);
		}
		
		
		return currentTrainingList;
		
	}

	@Override
	public List<TrainingModel> getMentorCurrentTrainingList(int mentorId) {
List<TrainingEntity> trainingList =trainingDao.getMentorCurrentTrainingList(mentorId);
		
		List<TrainingModel> currentTrainingList = new ArrayList<TrainingModel>();
		TrainingModel trainingModel = null;
		
		for(int i=0; i<trainingList.size(); i++)
		{
			TrainingEntity trainingEntity = trainingList.get(i);
			trainingModel = trainingConvertor.trainingEntityToModel(trainingEntity);
			currentTrainingList.add(trainingModel);
		}
		
		
		return currentTrainingList;
  }
	
}
