package com.tcs.microservice.UserService.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tcs.microservice.UserService.bean.UserBean;

@Service
public class LoginService {

	public boolean validateUser(String name, String password) {
		Map<String, String> uriVariable = new HashMap<>();
		uriVariable.put("name", name);
		uriVariable.put("password", password);
		String URL = "http://localhost:7072/login/name/{name}/password/{password}";
		ResponseEntity<UserBean> responseEntity = new RestTemplate().getForEntity(URL, UserBean.class, uriVariable);

		return responseEntity.getBody().getFlag();

	}

	public UserBean resgitserUser(UserBean userBean) {

		String URL = "http://localhost:7072/user-registration";
		UserBean userBean1 = new RestTemplate().postForObject(URL, userBean, UserBean.class);

		return userBean1;
	}

}
