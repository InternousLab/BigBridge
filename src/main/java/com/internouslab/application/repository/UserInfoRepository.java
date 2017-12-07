package com.internouslab.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.internouslab.application.entity.UserInfoEntity;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfoEntity, String> {
	public UserInfoEntity findByUserNameAndPassword(String userName, String password);
}
