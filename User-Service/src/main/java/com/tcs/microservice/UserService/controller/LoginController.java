package com.tcs.microservice.UserService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tcs.microservice.UserService.bean.UserBean;
import com.tcs.microservice.UserService.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@GetMapping("/login")
	public String showLogInPage(ModelMap model) {
		return "login";
	}

	@PostMapping("/login")
	public String showWelPage(ModelMap model, @RequestParam String name, @RequestParam String password) {

		boolean isValidUser = loginService.validateUser(name, password);

		if (!isValidUser) {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}
		model.put("name", name);
		model.put("password", password);
		return "welcome";
	}

	@GetMapping("/registration")
	public String showRegistrationPage(ModelMap model) {
		model.addAttribute("userform", new UserBean());
		return "registration";
	}

	@PostMapping("/registration")
	public UserBean resisterUser(@ModelAttribute("userform") UserBean userBean, ModelMap model) {
		return loginService.resgitserUser(userBean);
	}

}
