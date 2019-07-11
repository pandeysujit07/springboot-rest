package com.lti.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.training.dto.StatusDTO;
import com.lti.training.dto.UserDTO;
import com.lti.training.service.RegisterService;

@RestController
public class RegisterController {
	@Autowired
	private RegisterService registerService;

	@RequestMapping(path= "/register", method = RequestMethod.POST)
	public StatusDTO register(@RequestBody UserDTO user) {
		StatusDTO status=registerService.register(user);
		return status;
		
	}
}
