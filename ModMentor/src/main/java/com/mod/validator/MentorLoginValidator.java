package com.mod.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.mod.interfac.MentorService;
import com.mod.model.MentorModel;


@Component("LoginValidator")
public class MentorLoginValidator implements Validator {

	@Autowired
	private MentorService mentorService;
		
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return arg0.equals(MentorModel.class);
		
	}

	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub
		MentorModel mentorModel=(MentorModel)arg0;
		boolean loginResult=mentorService.getMentorLoginStatus(mentorModel);
		if(loginResult==false)
		{
			arg1.rejectValue("email","com.mod.controller.wrongUserName");
			arg1.rejectValue("password","com.mod.controller.wrongPassword");			
		}
	}

}
