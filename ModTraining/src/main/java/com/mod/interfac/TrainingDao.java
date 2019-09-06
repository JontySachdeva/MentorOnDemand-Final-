package com.mod.interfac;

import java.util.List;

import com.mod.entity.TrainingEntity;
import com.mod.model.TrainingModel;

public interface TrainingDao {
	
		List<TrainingEntity> getUserCompletedTrainingList(int userId);
		List<TrainingEntity> getMentorCompletedTrainingList(int mentorId);
		List<TrainingEntity> getUserCurrentTrainingList(int userId);
		List<TrainingEntity>  getMentorCurrentTrainingList(int mentorId);
}
