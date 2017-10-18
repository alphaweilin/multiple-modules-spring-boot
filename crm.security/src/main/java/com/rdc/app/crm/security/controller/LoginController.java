package com.rdc.app.crm.security.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("/")
    public String home(Map<String, Object> model) {
        return "security/home";
    }
	
	@RequestMapping("/login")
    public String login(Map<String, Object> model) {
        return "security/login";
    }

}