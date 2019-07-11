package com.lti.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.training.dao.RegisterDao;
import com.lti.training.dto.StatusDTO;
import com.lti.training.dto.UserDTO;
import com.lti.training.entity.User;

//@Component
@Service  //service is a type of component is spring
public class RegisterService {  //RegisterService contain business logic
		
	@Autowired
	private RegisterDao registerDao;
	
	@Transactional
	public StatusDTO register(UserDTO userDTO) {
		//copying the data from dto to entity
		User user=new User();
		user.setName(userDTO.getName());
		user.setAge(userDTO.getAge());
		user.setEmail(userDTO.getEmail());
		
		int id=registerDao.save(user);
		
		StatusDTO status=new StatusDTO();
		status.setId(id);
		status.setMessage("All izz well!");
		return status;
	}
	
}
