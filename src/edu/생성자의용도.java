/**
 * 생성자는 객체를 생성함과 동시에 값을 초기화하기 위해 사용된다
 * 생성자의 특징은 클래스와 이름이 같고 데이터 타입이 없다
 */

package edu;

public class 생성자의용도 {
	String name;
	int age;
	
	생성자의용도(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		
		생성자의용도 test = new 생성자의용도("김상길", 25); // 생성자가 있으면 객체를 생성과 동시에 값을 초기화 해줄 수 있다
		System.out.println(test.name);
		System.out.println(test.age);

	}

}
