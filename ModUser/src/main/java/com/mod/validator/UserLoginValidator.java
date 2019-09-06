package com.mod.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.mod.interfac.UserService;
import com.mod.model.UserModel;



@Component("LoginValidator")
public class UserLoginValidator implements Validator {

	@Autowired
	private UserService userService;
		
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return arg0.equals(UserModel.class);
		
	}

	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub
		UserModel userModel=(UserModel)arg0;
		boolean loginResult=userService.getUserLoginStatus(userModel);
		if(loginResult==false)
		{
			arg1.rejectValue("email","com.cognizant.controller.wrongUserName");
			arg1.rejectValue("password","com.cognizant.controller.wrongPassword");			
		}
	}

}
