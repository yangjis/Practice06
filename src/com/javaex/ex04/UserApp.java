package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		Customer c1 = new Customer("jws", "j1234", "정우성", 1000);
		Customer c2 = new Customer("yjs", "y2345", "이효리", 2000);
		
		User uc = new Employee("master", "m7788", "운영자", 5000000);
		
		c1.showInfo();
		c2.showInfo();
		uc.showInfo();
		System.out.println("운자의 월급은 " + ((Employee)uc).salary + "원 입니다.");

	}

}
