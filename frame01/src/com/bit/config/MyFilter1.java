package com.bit.config;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyFilter1 implements Filter{

	@Override
	public void destroy() {
		System.out.println("Filter destroy..");		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("before Filter..");
		System.out.println("login check");
		HttpSession session=((HttpServletRequest)req).getSession();
		String url=((HttpServletRequest)req).getRequestURI();
		if(url.equals("/frame01/") || url.equals("/frame01/login.jsp") || url.equals("/frame01/login.bit")){
			chain.doFilter(req, res);
			System.out.println("afterFilter..");
		}else if(session.getAttribute("login")!=null) {
			chain.doFilter(req, res);
			System.out.println("afterFilter..");
		}else{
			((HttpServletResponse)res).sendRedirect("login.jsp");
		}
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("Filter init..");
	}

}
