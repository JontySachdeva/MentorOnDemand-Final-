package com.mod.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mod.convertor.AdminConvertor;
import com.mod.entity.AdminEntity;
import com.mod.entity.MentorEntity;
import com.mod.entity.UserEntity;
import com.mod.interfac.AdminService;
import com.mod.model.AdminModel;
import com.mod.repo.AdminRepo;
import com.mod.repo.MentorRepo;
import com.mod.repo.UserRepo;
import com.netflix.discovery.converters.Auto;


@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepo adminDao;
	
	@Autowired
	private MentorRepo mentorRepo;
	
	@Autowired
	private UserRepo userRepo;
	
	AdminConvertor adminConvertor = new AdminConvertor();
	

	@Override
	public boolean blockUser(int userId) {
	
		UserEntity userEntity=new UserEntity();
		userEntity.setUserStatus("Blocked");
		userEntity.setUserId(userId);
		 UserEntity save = userRepo.save(userEntity);
		 if(save==null)
			 return false;
		 return true;
	}

	@Override
	public boolean UnblockUser(int userId) {
		
		UserEntity userEntity=new UserEntity();
		userEntity.setUserStatus("Unblocked");
		userEntity.setUserId(userId);
		 UserEntity save = userRepo.save(userEntity);
		 if(save==null)
			 return false;
		 return true;
	}

	@Override
	public boolean blockMentor(int mentorId) {
	
		MentorEntity mentorEntity=new MentorEntity();
		mentorEntity.setMentorStatus("locked");
		mentorEntity.setMentorId(mentorId);
		 MentorEntity save = mentorRepo.save(mentorEntity);
		 if(save==null)
			 return false;
		 return true;
	}

	@Override
	public boolean UnblockMentor(int mentorId) {
		
		MentorEntity mentorEntity=new MentorEntity();
		mentorEntity.setMentorStatus("Unblocked");
		mentorEntity.setMentorId(mentorId);
		 MentorEntity save = mentorRepo.save(mentorEntity);
		 if(save==null)
			 return false;
		 return true;
	}

	//TODO To BE DONE LATER
	@Override
	public boolean getAdminLoginStatus(AdminModel adminModel) {
		AdminEntity adminEntity = adminConvertor.adminModelToEntity(adminModel);
		AdminEntity findById = adminDao.findById(adminEntity.getAdminId()).get();
		return true;
	}

	
}
