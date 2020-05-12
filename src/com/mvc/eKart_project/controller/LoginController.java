/**
 * 
 */
package com.mvc.eKart_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.eKart_project.service.LoginService;
import com.mvc.eKart_project.service.LoginServiceException;

/**
 * @author vivek
 *
 */
@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public String authenticateDetails(@RequestParam(value= "un", required= false) String userName, @RequestParam(value= "ps", required= false) String password) {
		System.out.println("It authenticate method");
		System.out.println(userName);
		System.out.println(password);
		try{
			
			String user = loginService.loginValidation(userName, password);
			System.out.println("UserName    "+user);
			return "Home";
		} catch(LoginServiceException ex){
		
			System.out.println("Exception in login uthentication    "+ex.getMessage());
			return "index";
		}
				
	}
}
