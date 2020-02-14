package com.bit.core;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.controller.AddController;
import com.bit.controller.DetailController;
import com.bit.controller.IndexController;
import com.bit.controller.InsertController;
import com.bit.controller.IntroController;
import com.bit.controller.ListController;
import com.bit.model.EmpDao;

public class DispatchServlet extends HttpServlet{
	
	Map<String,String> map=new HashMap<>();
	
	@Override
	public void init() throws ServletException {
		map.put("/", "com.bit.controller.IndexController");
		map.put("/intro", "com.bit.controller.IntroController");
		map.put("/bbs/list", "com.bit.controller.ListController");
		map.put("/bbs/add", "com.bit.controller.AddController");
		map.put("/bbs/insert", "com.bit.controller.InsertController");
		map.put("/bbs/detail", "com.bit.controller.DetailController");
		map.put("/bbs/update", "com.bit.controller.UpdateController");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doBit(req,resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		doBit(req,resp);
	}
	protected void doBit(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url=req.getRequestURI();
		url=url.substring(req.getContextPath().length());
		BitController controller=null;

		String info=map.get(url);
		
		try {
			Class<?> clzz=Class.forName(info);
			controller=(BitController)clzz.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		String viewName=controller.execute(req);
		
		if (viewName.startsWith("redirect:")) {
//			resp.sendRedirect(viewName.replace("redirect", ""));
			resp.sendRedirect(viewName.substring(9));
		} else {
			String prifix = "/WEB-INF/view/";
			String suffix = ".jsp";
			viewName = prifix + viewName + suffix;
			RequestDispatcher rd = req.getRequestDispatcher(viewName);
			rd.forward(req, resp);
		}
	}
}
