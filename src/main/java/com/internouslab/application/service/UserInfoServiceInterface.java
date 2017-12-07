package com.internouslab.application.service;

import com.internouslab.application.entity.UserInfoEntity;

public interface UserInfoServiceInterface {	
	public UserInfoEntity findByUserNameAndPassword(String userName, String password);
}
