package com.bit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.model.Emp02Dao;
import com.bit.model.Emp02Dao2;
import com.bit.model.entity.Emp02Vo;

public class ListController implements Controller {
	Emp02Dao2 dao;
	
	public void setDao(Emp02Dao2 dao) {
		this.dao = dao;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<Emp02Vo> list = dao.selectAll();
		String viewName="list";
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("alist", list);
		mav.setViewName(viewName);
		return mav;
	}

}