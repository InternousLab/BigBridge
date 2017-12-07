package com.internouslab.application.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.internouslab.application.entity.UserInfoEntity;
import com.internouslab.application.repository.UserInfoRepository;
import com.internouslab.application.service.UserInfoServiceInterface;

@Service
public class UserInfoServiceImpl implements UserInfoServiceInterface{
	@Autowired
	UserInfoRepository userInfoRepository;
	
	@Autowired
	UserInfoEntity userInfoEntity;
	
	@Transactional
	@Override
	public UserInfoEntity findByUserNameAndPassword(String userName, String password) {
		return userInfoRepository.findByUserNameAndPassword(userName, password);
	}
}
