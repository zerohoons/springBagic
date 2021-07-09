package com.ict.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ict.service.CalculService;

@Controller
public class MyController {
	/*
	 * CalculService cs = new CalculService();
	root-context,xml에서 객체를 생성해서 사용하는 방법 */
	@Autowired
	private CalculService cs;
	
	
	public void setCs(CalculService cs) {
		this.cs = cs;
	}
	
	@RequestMapping("add.do")
	public ModelAndView addCommand() {
		ModelAndView mv = new ModelAndView("result");
		int result = cs.plus();
		mv.addObject("result", result);
		return mv;
	}
	@RequestMapping("sub.do")
	public ModelAndView subCommand() {
		ModelAndView mv = new ModelAndView("result");
		int result = cs.minus();
		mv.addObject("result", result);
		return mv;
	}
	@RequestMapping("mul.do")
	public ModelAndView mulCommand() {
		ModelAndView mv = new ModelAndView("result");
		int result = cs.multi();
		mv.addObject("result", result);
		return mv;
	}
	@RequestMapping("div.do")
	public ModelAndView divCommand() {
		ModelAndView mv = new ModelAndView("result");
		int result = cs.divide();
		mv.addObject("result", result);
		return mv;
	}
	
	
}
