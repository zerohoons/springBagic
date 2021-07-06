package com.ict.ex03;

public class DI_MyProcess {
	private String name = "홍길동";
	private int age = 27 ;
	
	public DI_MyProcess() {}
	public DI_MyProcess(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// 실행하고 싶은 메소드 
	public void prn() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}
