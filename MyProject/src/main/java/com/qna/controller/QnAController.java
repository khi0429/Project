package com.qna.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QnAController {

	@RequestMapping("/qna")
	public String qna(){
		System.out.println("qna~~~~~~~~~~~");
		return "qna";
	}
	
}
