package me.w4springrain.springmvc.web.service;

import java.io.UnsupportedEncodingException;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

public interface AfterRunService {
	String getContentAsService() throws UnsupportedEncodingException;

	WebApplicationContext getContext();
	
	<T> T getBean(Class<T> beanType);
	
	ModelAndView getModelAndView();
	
	AfterRunService assertViewName(String viewName);
	
	AfterRunService assertModel(String name, Object value);
}
