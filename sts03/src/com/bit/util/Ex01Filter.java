package com.bit.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Ex01Filter implements Filter{

	@Override
	public void destroy() {
		System.out.println("filter destroy...");
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		System.out.println("filter run..");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("filter init..");
	}

}
