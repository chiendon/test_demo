package com.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.entity.Users;

@Service
public interface UserService {
	public List<Users> getUsers();
}
