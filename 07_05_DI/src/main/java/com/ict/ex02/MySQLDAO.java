package com.ict.ex02;

public class MySQLDAO implements DAO{
	public  MySQLDAO() {
		System.out.println("MySQL 생성자");
	}
	
	@Override
	public void prn() {
		System.out.println("MySQL 실행 메소드");
	}

}
