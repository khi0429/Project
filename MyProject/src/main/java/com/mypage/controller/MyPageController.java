package com.mypage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyPageController {

	@RequestMapping("/MyProject")
	public String myPage(){
		return "myPage";
	}
	
}
