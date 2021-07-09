package com.ict.service;
/* 서비스 : DB 트랜잭션 처리, DB 결과를 가공. (DB를 다녀오는 건 DAO가 하는 일) 
 * DAO : DB 결과 받기*/

import org.springframework.stereotype.Service;

@Service("cs")
public class CalculService {
	public int plus() {
		return 5+3;
	}
	public int minus() {
		return 5-3;
	}
	public int multi() {
		return 5*3;
	}
	public int divide() {
		return 5/3;
	}
}
