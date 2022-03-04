package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.UserService;

@RestController
public class UsersController {
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/api/user", method = RequestMethod.GET)
	public ResponseEntity<Object> getProduct(){
		return new ResponseEntity<Object>(userService.getUsers(), HttpStatus.OK);
	}
}
