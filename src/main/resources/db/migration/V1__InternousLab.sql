set names utf8;

-- CREATE DATABASE internouslab;
USE internouslab;

CREATE TABLE IF NOT EXISTS user_info(
	id int not null primary key auto_increment,
	user_name varchar(16) not null unique,
	password varchar(16) not null,
	insert_date datetime not null,
	update_date datetime
	);

-- INSERT INTO user_info(user_name, password, insert_date) VALUES('internous', 'internous01', NOW());