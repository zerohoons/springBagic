package com.ict.ex04;

import org.springframework.stereotype.Component;

/* 
	 소녀
	 컴퓨터를 부팅한다. 			: 공통관심
	 컴퓨터로 쇼핑을 한다.  		: 핵심관심
	 컴퓨터로 드라마 보기를 한다.  	: 핵심관심
	 컴퓨터를 종료한다. : 공통관심 	: 핵심관심
 */
@Component("girl")
public class Girl implements Person{

	@Override
	public void doSometing() {
		System.out.println("컴퓨터로 쇼핑을 한다.");
		System.out.println("=====================");
		System.out.println("컴퓨터로 드라마를 본다.");		
	}

	@Override
	public void play() {
		System.out.println("운동하러 나갑니다.");		
	}
}
