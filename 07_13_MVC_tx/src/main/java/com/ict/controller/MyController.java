package com.ict.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ict.service.MyService;
import com.ict.vo.CVO;
import com.ict.vo.TVO;
import com.ict.vo.VO;

@Controller
public class MyController {
	@Autowired MyService myService;
	@RequestMapping("result.do")
	public ModelAndView resultCommand(VO vo) {
		ModelAndView mv = new ModelAndView("result");
		try {
			vo.setCountnum(vo.getAmount());
			int res = myService.InsertCT(vo);

			mv.addObject("vo",vo);
			
			//res 값은 성공하면 1 실패하면 0;
			mv.addObject("res",res);
			
			return mv;
			} catch (Exception e) {
			System.out.println(e);
			return mv;
		}
	}

	@RequestMapping("result2.do")
	public ModelAndView result2Command(@ModelAttribute("cvo")CVO cvo,@ModelAttribute("tvo")TVO tvo) {
		ModelAndView mv = new ModelAndView("result");
		try {
			
			tvo.setCountnum(cvo.getAmount());
			int res = myService.InsertCT2(cvo,tvo);
			
			//res 값은 성공하면 1 실패하면 0;
			mv.addObject("res",res);
			mv.addObject("cvo",cvo);
			mv.addObject("tvo",tvo);
			
			return mv;
		} catch (Exception e) {
			System.out.println(e);
			return mv;
		}
	}
}
