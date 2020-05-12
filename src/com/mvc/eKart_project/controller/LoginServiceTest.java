package com.mvc.eKart_project.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.mvc.eKart_project.service.LoginService;
import com.mvc.eKart_project.service.LoginServiceException;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(loader = AnnotationConfigContextLoader.class)
public class LoginServiceTest {
	
	@Autowired
	private LoginService loginService;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(loginService);
		MockMvcBuilders.standaloneSetup(loginService).build();
	}
	
	@Test
	public void successLoginValidation() throws LoginServiceException {
		
		String user = loginService.loginValidation("admin", "admin");
		Assert.assertEquals("admin", user);
	}

}
