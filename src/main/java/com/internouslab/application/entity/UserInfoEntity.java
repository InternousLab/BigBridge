package com.internouslab.application.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

import javax.persistence.Column;

@Entity
@Table(name="user_info")
@Getter
@Setter
public class UserInfoEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="user_name", columnDefinition="varchar(16)", unique=true, nullable=false)
	private String userName;
	
	@Column(name="password", columnDefinition="varchar(16)", nullable=false)
	private String password;
	
	@Column(name="inser_date", columnDefinition="datetime", nullable=false)
	private Timestamp insertDate;
	
	@Column(name="update_date", columnDefinition="datetime", nullable=true)
	private Timestamp updateDate;
}
