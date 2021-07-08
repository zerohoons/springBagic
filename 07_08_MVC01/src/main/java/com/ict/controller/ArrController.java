package com.ict.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

// 어노테이션이 아니면 무조건 controller를 상속받는다.
public class ArrController implements Controller{
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView("out/result2");
			String[] dogName = {"땅콩이", "토리","댕댕이","바둑이"};
			ArrayList<String> carName = new ArrayList<String>();
			carName.add("제네시스");
			carName.add("BMW");
			carName.add("벤츠");
			carName.add("아우디");
			carName.add("허슬러");
			carName.add("코코아");
			
			mv.addObject("carName",carName);
			mv.addObject("dogName",dogName);
			
		return mv;
	}
}
