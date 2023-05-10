/**
 * 메소드는 무언가 처리하기 위해 사용된다
 * 메소드의 특징은 데이터 타입이 있고 데이터 타입에 따라 결과를 돌려준다 (return)
 */

package edu.메소드;

public class 메소드의용도 {
	String name;
	int age;
	
	void 메소드() { // void는 return을 하지 않고 그대로 종료하는 데이터 타입이다
		System.out.println(name); // name, age의 값을 화면에 출력한다
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		메소드의용도 test = new 메소드의용도();
		test.name = "김상길";
		test.age = 25;
		test.메소드();
		
	}

}
