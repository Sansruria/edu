package edu;

public class This예제 {
	
	String name;
	int age; // 우리는 멤버변수 중에서 인스턴스 변수다
	
	public This예제(String name, int age) { // ()안에 있는 것을 매개변수라고 한다.
		this.name = name;
		this.age = age;
		
		String ex1 = name;  // this가 없으면 매개변수를 가르킨다
		String ex2 = this.name; // this가 있으면 멤버변수를 가르킨다 (this가 안 붙은 name과 색을 비교해보자)
		                       // 이름만 같은 뿐 서로 다른 변수라는 걸 알 수 있다
	}

}

