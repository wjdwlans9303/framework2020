package com.bit.core;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

public interface BitController {

	String execute(HttpServletRequest req) 
			throws ServletException, IOException;
}