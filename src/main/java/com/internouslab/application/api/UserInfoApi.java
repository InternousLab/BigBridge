package com.internouslab.application.api;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.internouslab.application.entity.UserInfoEntity;
import com.internouslab.application.service.UserInfoServiceInterface;

@RestController
@RequestMapping("/InternousLabServer/UserInfo/")
public class UserInfoApi {
	
	@Autowired
	UserInfoServiceInterface userInfoServiceImpl;

	@RequestMapping(method = RequestMethod.POST)
	public UserInfoEntity getUserInfo(HttpServletRequest request) {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		return userInfoServiceImpl.findByUserNameAndPassword(userName, password);
	}
}
