package com.ict.controller;

import java.io.File;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ict.VO.VO;

@Controller
public class MyController2 {
	@RequestMapping(value = "f_up2.do", method=RequestMethod.GET)
	public ModelAndView getUpCommand() {
		return new ModelAndView("index");
	}
	
	@RequestMapping(value = "f_up2.do", method=RequestMethod.POST)
	public ModelAndView postUpCommand(VO vo , HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("result");
		try {
			String path = request.getSession().getServletContext().getRealPath("/resources/upload");
			String name = vo.getName();
			String file_name = vo.getFile_name().getOriginalFilename();
			String file_type = vo.getFile_name().getContentType();
			long size = vo.getFile_name().getSize()/1024;
			SimpleDateFormat day = new SimpleDateFormat("yyyy년 MM월 dd일 mm분 E요일");
			
			//올릴 파일을  byte[]로 만든다.
			byte[]in = vo.getFile_name().getBytes();
			
			//저장 장소 및 이름 지정
			File out = new File(path, file_name);
			
			String lastday = day.format(out.lastModified());
			
			//복사
			FileCopyUtils.copy(in, out);
			
			mv.addObject("name",name);
			mv.addObject("file_name",file_name);
			mv.addObject("file_type",file_type);
			mv.addObject("size",size);
			mv.addObject("lastday",lastday);
			
		} catch (Exception e) {
			System.out.println("MyController2 : "+ e);
		}
		return mv;
	}
}
