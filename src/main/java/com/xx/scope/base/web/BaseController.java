package com.xx.scope.base.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@Controller
public class BaseController {
	
	public ModelAndView handleFailureToModelAndView(Exception e, String message){
		e.printStackTrace();
		ModelAndView mv = new ModelAndView();
		MappingJackson2JsonView jsonView = new MappingJackson2JsonView();
		jsonView.addStaticAttribute("flag", "failure");
		jsonView.addStaticAttribute("failureMessage", message);
		mv.setView(jsonView);
		return mv;
	}
	
}
