package com.mod.convertor;

import com.mod.entity.MentorSkillEntity;
import com.mod.model.MentorSkillModel;

public class MentorSkillConvertor {
	
	MentorSkillModel mentorSkillModel = null;
	
	MentorSkillEntity mentorSkillEntity  = null;
	
	public MentorSkillModel mentorSkillEntityToModel(MentorSkillEntity mentorSkillEntity) {
		mentorSkillModel = new MentorSkillModel();
		mentorSkillModel.setMentorSkillId(mentorSkillEntity.getMentorSkillId());
		mentorSkillModel.setFees(mentorSkillEntity.getFees());
		mentorSkillModel.setSkillName(mentorSkillEntity.getSkillName());
		return mentorSkillModel;
		
	}
	
	public MentorSkillEntity mentorSkillModelToEntity(MentorSkillModel mentorSkillModel) {
		mentorSkillEntity = new MentorSkillEntity();
		mentorSkillEntity.setMentorSkillId(mentorSkillModel.getMentorSkillId());
		mentorSkillEntity.setFees(mentorSkillModel.getFees());
		mentorSkillEntity.setSkillName(mentorSkillModel.getSkillName());
		return mentorSkillEntity;
	}
	 
}
