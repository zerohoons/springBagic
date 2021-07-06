package com.ict.edu;

public class Service {
	private DAO dao;
	
	public Service() {
		System.out.println("서비스 생성자");
	}
	// 생성자
	public Service(DAO dao) {
		this.dao = dao;
		System.out.println("서비스 생성자");
	}
	
	// setter
	public void setDao(DAO dao) {
		this.dao = dao;
	}

	// 실행하고 싶은 메소드 
	public String biz() {
		return dao.prn();
	}
}
