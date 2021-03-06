package com.bit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.model.Emp02Dao;
import com.bit.model.Emp02Dao2;
import com.bit.model.entity.Emp02Vo;

public class DetailController implements Controller{
	Emp02Dao2 dao;
	
	public void setDao(Emp02Dao2 dao) {
		this.dao = dao;
	}
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav=new ModelAndView();
		Emp02Vo bean=dao.selectOne(Integer.parseInt(request.getParameter("sabun")));
		mav.setViewName("detail");
		mav.addObject("bean",bean);
		
		return mav;
	}

}
