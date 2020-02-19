package com.bit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.model.Emp01Dao;

public class ListController implements Controller {
	Emp01Dao emp01Dao;
	
	public void setEmp01Dao(Emp01Dao emp01Dao) {
		this.emp01Dao = emp01Dao;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return new ModelAndView("list","list",emp01Dao.selectAll());
	}

}
