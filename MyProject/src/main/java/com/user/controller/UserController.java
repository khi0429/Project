package com.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	
	@RequestMapping("user.test")
	public void testUser(){
		System.out.println("user.test들어옴");
	}

}
