package com.ict.ex04;
/* 
	 소년	
	 컴퓨터를 부팅한다. 		: 공통관심
	 컴퓨터로 게임을 한다.	 	: 핵심관심
	 컴퓨터로 영화보기를 한다. 	: 핵심관심
	 컴퓨터를 종료한다. 		: 공통관심
 */

import org.springframework.stereotype.Component;

@Component("boy")
public class Boy implements Person{

	@Override
	public void doSometing() {
		try {
			System.out.println("컴퓨터로 게임을 한다.");
			System.out.println("=====================");
			System.out.println("컴퓨터로 영화를 본다.");			
		} catch (Exception e) {
			return;
		}
	}

	@Override
	public void play() {
		System.out.println("운동하러 나갑니다.");
	}
	
}
