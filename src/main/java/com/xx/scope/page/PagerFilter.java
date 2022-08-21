package com.xx.scope.page;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

//implements Filter
public class PagerFilter {
	public static final String PAGE_SIZE_NAME = "pagesize";
	public void destroy() {
		System.out.println("destroy++++++++++++++++++++++++++++++++++++++++++++++");
	}

	public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
		 HttpServletRequest httpRequest = (HttpServletRequest)request;
		 SystemContext.setOffset(getOffset(httpRequest));
		 SystemContext.setPagesize(getPagesize(httpRequest));
		 try{
			 chain.doFilter(request, response);
			 
		 }finally{
			 SystemContext.removeOffset();
			 SystemContext.removePagesize();
		 }
	}
	

	public void init(FilterConfig arg0) throws ServletException {
		
	}

	private int getOffset(HttpServletRequest request){
		int offset = 0;
		try{
			offset = Integer.parseInt(request.getParameter("pager.offset"));
			//System.out.println(offset);
		}catch (Exception e) {
			
		}
		return offset;
	}
	
	private int getPagesize(HttpServletRequest httpRequest){
//		return 10;
		String psvalue = httpRequest.getParameter("pagesize");
		if(psvalue != null && !psvalue.trim().equals("")){
			Integer ps = 0;
			try {
				ps = Integer.parseInt(psvalue);
			} catch (Exception e) {
			}
			if(ps != 0){
				httpRequest.getSession().setAttribute(PAGE_SIZE_NAME, ps);
			}
		}
		
		Integer pagesize = (Integer)httpRequest.getSession().getAttribute(PAGE_SIZE_NAME);
		if(pagesize == null){
			httpRequest.getSession().setAttribute(PAGE_SIZE_NAME, 10);
			pagesize = 10;
//			return pagesize;
		}
		
		return pagesize;
	}
	
}
