package com.mod.interfac;

import java.util.List;

import com.mod.model.TrainingModel;

public interface TrainingService {
	List<TrainingModel> getUserCompletedTrainingList(int userId);
	List<TrainingModel> getMentorCompletedTrainingList(int mentorId);
	List<TrainingModel> getUserCurrentTrainingList(int userId);
	List<TrainingModel> getMentorCurrentTrainingList(int mentorId);
}
