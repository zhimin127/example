package com.test.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ApplicationController {

	@RequestMapping("error.html")
	public ModelAndView error(){
		return new ModelAndView("error");
	}
}
