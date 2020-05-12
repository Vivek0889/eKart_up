package com.mvc.eKart_project.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.mvc.eKart_project.service.LoginService;

@RunWith(SpringJUnit4ClassRunner.class)
public class Test_Controller {

	@Mock
	private LoginService loginService;
	
	@InjectMocks
	private LoginController loginController;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(loginController);
		MockMvcBuilders.standaloneSetup(loginController).build();
	}
	
	@Test
	public void validLoginTest() {
		
	}


}
