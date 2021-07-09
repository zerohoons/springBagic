package com.ict.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

	//파라미터값 받기 : 1. JSP처럼 받기(request로 받기)
//	@RequestMapping("grades.do")
//	public ModelAndView GradesCommand(HttpServletRequest request) {
//		ModelAndView mv = new ModelAndView("result");
//		String name = request.getParameter("name");
//		int kor = Integer.parseInt(request.getParameter("kor"));
//		int eng = Integer.parseInt(request.getParameter("eng"));
//		int math = Integer.parseInt(request.getParameter("math"));
//		
//		//총점
//		int sum = myProcess.getSum(kor, eng, math);
//		//평균
//		double avg = myProcess.getAvg(sum);
//		//학점
//		String hak = myProcess.getHak(avg);
//		
//		mv.addObject("name",name);
//		mv.addObject("sum",sum);
//		mv.addObject("avg",avg);
//		mv.addObject("hak",hak);
//		
//		return mv;
//	}

	
	//파라미터값 받기 : 2. VO를 사용하여서 -> 자동으로 vo에 들어온다.
	//					   단, vo 이름이 같아야한다.
//	@RequestMapping("grades.do")
//	public ModelAndView GradesCommand2(VO vo) {
//		ModelAndView mv = new ModelAndView("result");
//		
//		//총점
//		int sum = myProcess.getSum2(vo.getKor(), vo.getEng(), vo.getMath());
//		//평균
//		double avg = myProcess.getAvg(sum);
//		//학점
//		String hak = myProcess.getHak(avg);
//		
//		/*
//		 * mv.addObject("name",vo.getName()); mv.addObject("sum",sum);
//		 * mv.addObject("avg",avg); mv.addObject("hak",hak);
//		 */
//		
//		//vo 에 결과를 저장할 수 있도록 만들자.
//		vo.setAvg(String.valueOf(avg));
//		vo.setSum(String.valueOf(sum));
//		vo.setHak(hak);
//		
//		mv.addObject("vo",vo);
//		return mv;
//	}
	
	//파라미터값 받기 : 3. Model 사용
					//	들어온 파라미터는 vo에 담고 리턴할 때, mvo라는 이름으로 데이터를 가지고 리턴한다.
//	@RequestMapping("grades.do")
//	public ModelAndView GradesCommand3(@ModelAttribute("mvo")VO vo) {
//		ModelAndView mv = new ModelAndView("result");
//		
//		//총점
//		int sum = myProcess.getSum2(vo.getKor(), vo.getEng(), vo.getMath());
//		//평균
//		double avg = myProcess.getAvg(sum);
//		//학점
//		String hak = myProcess.getHak(avg);
//		
//		//vo 에 결과를 저장할 수 있도록 만들자.
//		
//		vo.setAvg(String.valueOf(avg));
//		vo.setSum(String.valueOf(sum));
//		vo.setHak(hak);
//		
//		return mv;
//	}
	
	//파라미터가 하나 일때, 파라미터 어노테이션
	@RequestMapping("grades.do")
	public ModelAndView GradesCommand(VO vo, @RequestParam("cPage")String cPage) {
		ModelAndView mv = new ModelAndView("result");
		
		//총점
		int sum = myProcess.getSum2(vo.getKor(), vo.getEng(), vo.getMath());
		//평균
		double avg = myProcess.getAvg(sum);
		//학점
		String hak = myProcess.getHak(avg);
		
		/*
		 * mv.addObject("name",vo.getName()); mv.addObject("sum",sum);
		 * mv.addObject("avg",avg); mv.addObject("hak",hak);
		 */
		
		//vo 에 결과를 저장할 수 있도록 만들자.
		vo.setAvg(String.valueOf(avg));
		vo.setSum(String.valueOf(sum));
		vo.setHak(hak);
		
		mv.addObject("vo",vo);
		return mv;
	}
}
