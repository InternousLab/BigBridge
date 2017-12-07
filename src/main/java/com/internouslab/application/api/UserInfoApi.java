package com.internouslab.application.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.internouslab.application.entity.UserInfoEntity;
import com.internouslab.application.service.UserInfoServiceInterface;

@RestController
@RequestMapping("/InternousLabServer/UserInfo")
public class UserInfoApi {
	
	@Autowired
	UserInfoServiceInterface userInfoServiceImpl;

	@RequestMapping(method = RequestMethod.GET)
	public UserInfoEntity getUserInfo(@RequestParam(value = "userName") String userName, @RequestParam(value = "password") String password) {
		return userInfoServiceImpl.findByUserNameAndPassword(userName, password);
	}
}
