package com.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Users;
import com.app.entity.UsersExample;
import com.app.repository.UsersMapper;
import com.app.service.UserService;

@Service
public class UsersServiceImpl implements UserService{
	@Autowired
	UsersMapper usersMapper;
	@Autowired
	UsersExample usersExample;
	
	public List<Users> getUsers(){
		usersExample.clear();
		List<Users> UsersList = usersMapper.selectByExample(usersExample);
		return UsersList;
	}

}
