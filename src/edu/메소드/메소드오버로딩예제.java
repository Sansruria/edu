package edu.메소드;

public class 메소드오버로딩예제 {

	// 정수형, 정수형
	public int 메소드오버로딩예제 (int 정수1, int 정수2) {
		return 정수1 + 정수2;
	}

	// 정수형, 정수형, 정수형
	public int 메소드오버로딩예제 (int 정수1, int 정수2, int 정수3) {
		return 정수1 + 정수2 + 정수3;
	}
	
	// 정수형, 문자열
	public String 메소드오버로딩예제 (int 정수1, String 문자열2) {
		return 정수1 + 문자열2;
	}
	
	// 정수형, 정수형, 문자열
	public String 메소드오버로딩예제 (int 정수1, int 정수2, String 문자열3) {
		return 정수1 + 정수2 + 문자열3;
	}
	
	// 정수형, 문자열, 정수형
	public String 메소드오버로딩예제 (int 정수1, String 문자열2, int 정수3) {
		return 정수1 + 문자열2 + 정수3;
	}

	public static void main(String[] args) {
		
		메소드오버로딩예제 ss = new 메소드오버로딩예제(); // 오버로딩예제 객체 생성
		
		// 변수의 수, 타입, 순서가 맞는 생성자가 알아서 호출된다
		int sum1 = ss.메소드오버로딩예제(10, 20, 30); // 정수형, 정수형, 정수형인 생성자가 호출된다
		System.out.println(sum1);
		
		String str1 = ss.메소드오버로딩예제(10, "김상길"); // 정수형, 문자열인 생성자가 호출된다
		System.out.println(str1);
		
		int sum2 = ss.메소드오버로딩예제(10, 20); // 정수형, 정수형인 생성자가 호출된다
		System.out.println(sum2);
		
		String str2 = ss.메소드오버로딩예제(10, 20, "김상길"); // 정수형, 정수형, 문자열인 생성자가 호출된다
		System.out.println(str2);
		
		String str3 = ss.메소드오버로딩예제(10, "김상길", 20); // 정수형, 문자열, 정수형인 생성자가 호출된다
		System.out.println(str3);

	}

}
