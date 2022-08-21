package com.xx.scope.page;

import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class BaseDispatcherServlet extends DispatcherServlet {
	@Override
	protected void doService(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("doService工作" + request.getRequestURI());
		super.doService(request, response);
	}
	
	@Override
	protected void doDispatch(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("doDispatch工作");
		super.doDispatch(request, response);
	}
}