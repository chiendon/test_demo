package com.app.controller;

import org.kopitubruk.util.json.JSONUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping(value = "api/home", method = RequestMethod.GET)
	public ResponseEntity<String> home() {
		return new ResponseEntity<String>(JSONUtil.toJSON("Home"), HttpStatus.OK);
	}
}
