/**
 * 변수의 수, 타입, 순서가 맞는 생성자가 알아서 호출된다 (오버로드예제.java 파일참고)
 * this(name);
 * this(name, address); <-- 문자열, 문자열이니까 2번 생성자를 호출한다
 * this(name, age);     <-- 문자열, 정수형이니까 3번 생성자를 호출한다
 * this(name, address, age);
 * this(name, address, age, height);
 * 
 * 그렇다면 이 기능은 왜 있는 걸까?
 * 그 이유는 중복된 코드가 제거되기 때문에 훨씬 깔끔해져서 보기가 좋아진다 (가독성이 좋아진다라고 한다)
 * 생성자This예제_this안쓴거.java 파일과 비교해 보자
 * 
 * 이 예제에서는 멤버변수가 5개 밖에 없어서 필요성을 못 느낄 수도 있겠지만, 실무에서는 많은 데이터를 요구한다
 * 도서관에서 책을 대여한다고 생각해보자 그러면 필요한 데이터가 무엇이 있을까?
 * 무슨 책인지,책의 저자, 책의 출판사...등등 책의 정보만 해도 입력해야할 데이터도 많은데
 * 누가 빌렸는지, 언제 빌렸는지, 언제 반납하는지와 같이 사용자의 정보까지 생각하면 더욱 많아진다
 * 그럴 때 매번 생성자를 만들 때마다 this.name, this.address 이렇게 모두 입력하기에는 피곤하기도 하고
 * 중복코드 때문에 가독성도 떨어진다
 * 이런 반복 작업을 줄이기 위해서 생성자 this() 기능이 있는 것이다
 */

package edu;

public class 생성자This예제_this사용한거 {
	
	String name; // 멤버변수 중에서 우리는 static이 없으니 인스턴스 변수야
	String address;
	int age;
	int height;
	int weight;
	
	// 1번 생성자 (문자열)
	public 생성자This예제_this사용한거(String name) {
		this.name = name;
	}
	
	// 2번 생성자 (문자열, 문자열)
	public 생성자This예제_this사용한거(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	// 3번 생성자 (문자열, 정수형)
	public 생성자This예제_this사용한거(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 4번 생성자 (문자열, 문자열, 정수형)
	public 생성자This예제_this사용한거(String name, String address, int age) {
		this(name, address); // 매개변수가 2개고 문자열, 문자열이니까 2번 생성자를 자동으로 호출한다
		this.age = age;
	}
	
	// 5번 생성자 (문자열, 문자열, 정수형, 정수형)
	public 생성자This예제_this사용한거(String name, String address, int age, int height) {
		this(name, address, age); // 매개변수가 3개고 문자열, 문자열, 정수형이니까 4번 생성자를 자동으로 호출한다
		this.height = height;
	}
	
	// 6번 생성자 (문자열, 문자열, 정수형, 정수형, 정수형)
	public 생성자This예제_this사용한거(String name, String address, int age, int height, int weight) {
		this(name, address, age); // 매개변수가 3개고 문자열, 문자열, 정수형이니까 4번 생성자를 자동으로 호출한다
		this.height = height;
		this.weight = weight;
	}
	
}



