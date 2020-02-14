package com.bit.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.bit.core.BitController;

public class AddController implements BitController {

	@Override
	public String execute(HttpServletRequest req) throws ServletException,
			IOException {
		return "add";
	}

}
