package com.ict.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ict.service.CalculService;

@Controller
public class CalculController {
	
	@Inject
	private CalculService cs;

	public void setCs(CalculService cs) {
		this.cs = cs;
	}
	
	@RequestMapping("calcul.do")
	public ModelAndView calculCommand(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("result");
		String cmd = request.getParameter("cmd");
		int result = 0;
		switch (cmd) {
		case "1":
			result = cs.plus();
			break;
		case "2":
			result = cs.minus();
			break;
		case "3":
			result = cs.multi();
			break;
		case "4":
			result = cs.divide();
			break;

		}
		mv.addObject("result",result);
		return mv;
	}

}
