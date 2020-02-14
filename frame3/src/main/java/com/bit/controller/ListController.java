package com.bit.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.bit.core.BitController;
import com.bit.model.EmpDao;

public class ListController implements BitController {

	@Override
	public String execute(HttpServletRequest req) throws ServletException,
			IOException {
		EmpDao dao=new EmpDao();
		
		try {
			req.setAttribute("list", dao.selectAll());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "list";
	}

}