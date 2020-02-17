package com.bit.config;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter2 implements Filter{

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("new filter before");
		System.out.println("new filter start");
		chain.doFilter(arg0, arg1);
		System.out.println("new filter after");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}
	
}