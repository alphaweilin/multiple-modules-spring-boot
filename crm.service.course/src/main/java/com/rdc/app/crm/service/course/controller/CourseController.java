package com.rdc.app.crm.service.course.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CourseController {

	@GetMapping("/course/get")
	public String login(Map<String, Object> model) {
		return "course/get";
	}
}
