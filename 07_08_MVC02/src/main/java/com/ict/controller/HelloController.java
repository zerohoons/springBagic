package com.ict.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	//메소드를 만들 때 이름과 인자는 내 마음대로
	@RequestMapping(value ="hello.do", method =RequestMethod.GET )
	public ModelAndView HelloCommand() {
		ModelAndView mv = new ModelAndView("result");
		mv.addObject("msg","GET 방식");
		return mv;
	}

	@RequestMapping(value ="hello.do", method =RequestMethod.POST )
	public ModelAndView Hello2Command() {
		ModelAndView mv = new ModelAndView("result");
		mv.addObject("msg","POST 방식");
		return mv;
		
	}

	/*
	 * @RequestMapping("hello.do") public ModelAndView HelloeCommand() {
	 * ModelAndView mv = new ModelAndView("result"); 
	 * mv.addObject("msg","GET, POST 방식 둘 다");
	 * return mv; }
	 */
}
