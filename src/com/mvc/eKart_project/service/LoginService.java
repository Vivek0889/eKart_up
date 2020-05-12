package com.mvc.eKart_project.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class LoginService {
		public String loginValidation(String username, String password) throws LoginServiceException{
			if("admin".equalsIgnoreCase(username) && "admin".equals(password)) {

				return username;
			} else{
			
				throw new LoginServiceException("Invalid Username/Password.");
			}
			
		}
	}
