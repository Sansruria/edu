package edu.생성자;

public class 생성자오버로딩예제 {
	String name;
	int age;
	int phoneNo;
	String address;

	생성자오버로딩예제(String name) {
		this.name = name;
	}
	
	생성자오버로딩예제(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	생성자오버로딩예제(String name, int age, int phoneNo) {
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
	}
	
	생성자오버로딩예제(String name, int age, int phoneNo, String address) {
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
		this.address = address;
	}

	public static void main(String[] args) {
//		생성자오버로딩예제 ss = new 생성자오버로딩예제("김상길", 10, 12345);
	
	}

}
