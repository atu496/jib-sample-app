package com.atu496.jib.pl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.atu496.jib.domain.service.SampleService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class IndexController {

	@Autowired
	SampleService service;

	@GetMapping("/")
	public ModelAndView get(ModelAndView mav) {
		log.info(service.get());
		mav.setViewName("index");
		return mav;
	}
}
