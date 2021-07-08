package com.ict.ex02;

public class TestMain {
	public static void main(String[] args) {
		Boy boy = new Boy();
		Girl girl = new Girl();
		
		PersonProxy proxy = new PersonProxy();
		
		proxy.setPerson(girl);
		proxy.setBefore(new BeforeImpl());
		proxy.setAfter(new AfterImpl());
		
		proxy.doPlay();
	}
}
