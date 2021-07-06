package com.ict.ex04;

public class NonDI_Array {
	String[] arr1 = {"100","200","300","400"};
	int [] arr2 = {100,200,300,400};
	
	public void s_prn() {
		for (String k : arr1) {
			System.out.println(k+10);
		}
	}
	
	public void i_prn() {
		for (int k : arr2) {
			System.out.println(k+10);
		}
	}
}
