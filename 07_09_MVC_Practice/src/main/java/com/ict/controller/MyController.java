package com.ict.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ict.Service.MyProcess;
import com.ict.VO.VO;

@Controller
public class MyController {
	@Autowired
	private MyProcess myProcess;

	public void setMyProcess(MyProcess myProcess) {
		this.myProcess = myProcess;
	}
	
	@RequestMapping("calc.do")
	public ModelAndView calculation(VO vo) {
		ModelAndView mv = new ModelAndView("result");
		
		int result = myProcess.calculation(vo.getNum1(), vo.getNum2(), vo.getCalc());
		
		mv.addObject("result", result);
		
		return mv;
	}
}
