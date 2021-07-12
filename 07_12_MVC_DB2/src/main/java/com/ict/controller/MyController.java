package com.ict.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ict.service.MyService;
import com.ict.vo.VO;

@Controller
public class MyController {

	@Autowired
	private MyService myService;

	@RequestMapping("list.do")
	public ModelAndView listCommand() {
		try {
			ModelAndView mv = new ModelAndView("list");
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

//	@RequestMapping(value = "write_ok.do", method = RequestMethod.GET)
//	public ModelAndView writeOkGetCommand() {
//		return new ModelAndView("redirect:write.do");
//	}

	// 파일을 업로드 하는 것은 무조건 POST 방식!
	@RequestMapping(value = "write_ok.do", method = RequestMethod.POST)
	public ModelAndView writeOkCommand(VO vo, HttpServletRequest request) {
		try {
			String path = request.getSession().getServletContext().getRealPath("/resources/upload");
			MultipartFile file = vo.getFile_name();
			
			if(file.isEmpty()) {
				vo.setF_name("");
				myService.getInsert(vo);
			}else {
				vo.setF_name(file.getOriginalFilename());
				myService.getInsert(vo);
				
				//실제 그림 복사해서 올리기
				byte[] in = file.getBytes();
				File out = new File(path, vo.getF_name());
				
				FileCopyUtils.copy(in, out);
			}
			
			
			return new ModelAndView("redirect:list.do");
		} catch (Exception e) {
			System.out.println(e);
			return new ModelAndView("error");
		}
	}

	@RequestMapping("onelist.do")
	public ModelAndView onelistCommand(@RequestParam("idx") String idx) {
		try {
			ModelAndView mv = new ModelAndView("onelist");
			VO vo = myService.getOnelist(idx);
			mv.addObject("vo", vo);
			return mv;
		} catch (Exception e) {
			System.out.println(e);
			return new ModelAndView("error");
		}
	}

	@RequestMapping("delete.do")
	public ModelAndView deleteCommand(@ModelAttribute("vo") VO vo) {
		return new ModelAndView("delete");
	}

	@RequestMapping("delete_ok.do")
	public ModelAndView deleteOkCommand(@RequestParam("idx") String idx) {
		try {
			myService.getDelete(idx);
			return new ModelAndView("redirect:list.do");
		} catch (Exception e) {
			System.out.println(e);
			return new ModelAndView("error");
		}
	}

	@RequestMapping("update.do")
	public ModelAndView updateCommand(@ModelAttribute("vo") VO vo) {
		return new ModelAndView("update");
	}

	@RequestMapping("update_ok.do")
	public ModelAndView updateOkCommand(@ModelAttribute("vo") VO vo) {
		try {
			myService.getUpdate(vo);
			return new ModelAndView("redirect:onelist.do");
		} catch (Exception e) {
			System.out.println(e);
			return new ModelAndView("error");
		}
	}
	
	@RequestMapping("download.do")
	public void downloadCommand(@RequestParam("f_name")String f_name,HttpServletRequest request ,HttpServletResponse response){
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			String path = request.getSession().getServletContext().getRealPath("/resources/upload/"+f_name);
			
			response.setContentType("application/x-msdownload");
			response.setHeader("Content-Disposition", "attachment; filename="+URLEncoder.encode(f_name, "utf-8"));
			
			File file = new File(new String(path.getBytes("utf-8")));
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(response.getOutputStream());
			
			FileCopyUtils.copy(bis, bos);
			
		} catch (Exception e) {

		}finally {
			try {
				bos.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
			}
		}
	}
}
