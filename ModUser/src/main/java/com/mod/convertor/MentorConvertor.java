package com.mod.convertor;

import com.mod.entity.MentorEntity;
import com.mod.model.MentorModel;

public class MentorConvertor {

	MentorModel mentorModel = null;
	MentorEntity mentor = null;

	public MentorModel mentorEntityToModel(MentorEntity mentor) {
		mentorModel = new MentorModel();
		mentorModel.setMentorId(mentor.getMentorId());
		mentorModel.setFirstName(mentor.getFirstName());
		mentorModel.setLastName(mentor.getLastName());
		mentorModel.setEmail(mentor.getEmail());
		mentorModel.setExperience(mentor.getExperience());
		mentorModel.setContactNo(mentor.getContactNo());
		mentorModel.setLinkedUrl(mentor.getLinkedUrl());
		mentorModel.setPassword(mentor.getPassword());
		mentorModel.setTechnology(mentor.getTechnology());
		mentorModel.setTimingSlot(mentor.getTimingSlot());
		return mentorModel;
	}

	public MentorEntity mentorModelToEntity(MentorModel mentorModel) {
		mentor = new MentorEntity();
		mentor.setMentorId(mentorModel.getMentorId());
		mentor.setFirstName(mentorModel.getFirstName());
		mentor.setLastName(mentorModel.getLastName());
		mentor.setEmail(mentorModel.getEmail());
		mentor.setExperience(mentorModel.getExperience());
		mentor.setContactNo(mentorModel.getContactNo());
		mentor.setLinkedUrl(mentorModel.getLinkedUrl());
		mentor.setPassword(mentorModel.getPassword());
		mentor.setTechnology(mentorModel.getTechnology());
		mentor.setTimingSlot(mentorModel.getTimingSlot());
		return mentor;
	}

}
