package com.ict.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//일반 controller 는 modelAndview를 리턴한다.
// RestController는 리턴이 단순문자열 = text(text/html),
			//	   객체,ArrayList<VO>는 JSON 으로 브라우저에 표시되어진다.
//단, Spring Rest API 의 기본은 JSON이다.
//확인 : http://localhost:8090/접근URL
@Controller
public class MyController {
	@RequestMapping(value = "text.do", produces = "text/html; charset=utf-8")
	@ResponseBody
	public String textCommand() {
		StringBuffer sb = new StringBuffer();
		sb.append("1,홍길동,24,서울1/");
		sb.append("2,총길동,22,서울2/");
		sb.append("3,공길동,26,서울3/");
		sb.append("4,약길동,14,서울4/");
		sb.append("5,악길동,54,서울5/");
		sb.append("6,길동,223,서울6/");
		
		return sb.toString();
	}
}
