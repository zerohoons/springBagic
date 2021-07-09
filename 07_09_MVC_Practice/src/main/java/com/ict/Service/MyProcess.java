package com.ict.Service;

import org.springframework.stereotype.Service;

@Service("myProcess")
public class MyProcess {
	
	public int calculation(String num1, String num2, String clac) {
		int result = 0;
		
		//Integer ParseInt
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		
		//부호별 계산
		switch (clac) {
		case "plus":
			result = (int)(n1+n2);
			break;
		case "minus":
			result = (int)(n1-n2);
			
			break;
		case "multi":
			result = (int)(n1*n2);
			
			break;
		case "devid":
			result = n1/n2;
			
			break;
		}
		
		return result;
		
	}
}
