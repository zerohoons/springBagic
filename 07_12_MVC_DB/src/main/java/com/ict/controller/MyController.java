package com.ict.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ict.service.MyService;
import com.ict.vo.VO;

// controller -> service(interface)
@Controller
public class MyController {

	// autowired 할 때 Impl이 아닌 interface를 이용한다. -> 나중에 교체에 있어서 편리.
	@Autowired
	private MyService myService;

	@RequestMapping("list.do")
	public ModelAndView listCommand() {
		try {
			ModelAndView mv = new ModelAndView();
			List<VO> list = myService.getList();
			mv.addObject("list", list);
			return mv;
		} catch (Exception e) {
			System.out.println(e);
			return new ModelAndView("error");
		}
	}

	@RequestMapping("write.do")
	public ModelAndView writeCommand() {
		try {
			return new ModelAndView("write");
		} catch (Exception e) {
			System.out.println(e);
			return new ModelAndView("error");
		}
	}

	@RequestMapping("write_ok.do")
	public ModelAndView wirteokCommand(VO vo) {
		try {
			// redirect -> servlet-context를 들렸다가 list.do로 자동적으로 이동.
			ModelAndView mv = new ModelAndView("redirect:list.do");
			myService.getInsert(vo);
			return mv;
		} catch (Exception e) {
			System.out.println(e);
			return new ModelAndView("error");
		}
	}

	@RequestMapping("onelist.do")
	public ModelAndView oneListCommand(@RequestParam("idx") String idx) {
		try {
			ModelAndView mv = new ModelAndView("onelist");
			VO vo = myService.getOneList(idx);
			mv.addObject("vo", vo);
			return mv;
		} catch (Exception e) {
			System.out.println(e);
			return new ModelAndView("error");
		}
	}

	@RequestMapping("delete.do") // 값을 받아서 전달할 때 : modelAttribute를 이용
	public ModelAndView deleteCommand(@ModelAttribute("vo") VO vo) {
		return new ModelAndView("delete");
	}

	@RequestMapping("delete_ok.do")
	public ModelAndView deleteokCommand(@RequestParam("idx") String idx) {
		try {
			myService.getdelete(idx);
			return new ModelAndView("redirect:list.do");
		} catch (Exception e) {
			System.out.println(e);
			return new ModelAndView("error");
		}
	}

	@RequestMapping("update.do")
	public ModelAndView updateCommand(@ModelAttribute("idx") String idx) {
		try {
			ModelAndView mv = new ModelAndView("update");
			VO vo = myService.getOneList(idx);
			mv.addObject("vo", vo);
			return mv;
		} catch (Exception e) {
			System.out.println(e);
			return new ModelAndView("error");
		}
	}

	@RequestMapping("update_ok.do")
	public ModelAndView updateokCommand(VO vo) {
		try {
			myService.getUpdate(vo);
			return new ModelAndView("redirect:onelist.do");
		} catch (Exception e) {
			System.out.println(e);
			return new ModelAndView("error");
		}
	}
}
