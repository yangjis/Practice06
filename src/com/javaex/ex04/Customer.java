package com.javaex.ex04;

public class Customer extends User{

	protected int point;
	
	public Customer() {}
	public Customer(String id, String password, String name, int point) {
		super(id, password, name);
		this.point = point;
	}
	
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	public void showInfo() {
		System.out.println("아이디:" + super.id + " /배스워드:" + super.password + " /이름:" + super.name + " /포인트:" + this.point);
	}

}
