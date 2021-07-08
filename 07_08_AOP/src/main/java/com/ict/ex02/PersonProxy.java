package com.ict.ex02;

public class PersonProxy {

	private Person person;
	private Before before;
	private After after;
	
	public void doPlay() {
		try {
			before.pre();
			person.doSomting();
			after.next();
		} catch (Exception e) {
			System.out.println("부모님이 오셨다.");
		}finally {
			System.out.println("공부를 한다.");
		}
	}
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	public Before getBefore() {
		return before;
	}

	public void setBefore(Before before) {
		this.before = before;
	}

	public After getAfter() {
		return after;
	}

	public void setAfter(After after) {
		this.after = after;
	}

}
