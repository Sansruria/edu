
// 중복되는 코드를 줄여 가독성을 향상하고 재사용하기 위해서이다 

package edu.메소드.메소드활용예제;

public class 왜메소드를사용할까 {
	int age;
	String name;
	String gender;
	String address;
	String phoneNo;
	
	// 생성자
	public 왜메소드를사용할까(int age, String name, String gender, String address, String phoneNo) {
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.phoneNo = phoneNo;
	}
	
	// 메소드
	public void printPersonalInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("번호 : " + phoneNo);
		System.out.println("성별 : " + gender);
		System.out.println("주소 : " + address);
		System.out.println();
	}
	
	public static void main(String[] args) {
		왜메소드를사용할까 person1 = new 왜메소드를사용할까(45, "홍길동", "남자", "인천광역시 미추홀구", "010-1234-5678");
		왜메소드를사용할까 person2 = new 왜메소드를사용할까(37, "김길동", "남자", "서울광역시 영등포구", "010-1234-5678");
		왜메소드를사용할까 person3 = new 왜메소드를사용할까(61, "유길동", "여자", "강원도 춘천시", "010-1234-5678");
		왜메소드를사용할까 person4 = new 왜메소드를사용할까(88, "석길동", "남자", "경상도 통영시", "010-1234-5678");
		왜메소드를사용할까 person5 = new 왜메소드를사용할까(28, "춘길동", "여자", "경상도 남해군", "010-1234-5678");
		왜메소드를사용할까 person6 = new 왜메소드를사용할까(45, "최길동", "남자", "인천광역시 미추홀구", "010-1234-5678");
		왜메소드를사용할까 person7 = new 왜메소드를사용할까(47, "손길동", "여자", "서울광역시 영등포구", "010-1234-5678");
		왜메소드를사용할까 person8 = new 왜메소드를사용할까(65, "형길동", "여자", "강원도 춘천시", "010-1234-5678");
		왜메소드를사용할까 person9 = new 왜메소드를사용할까(78, "만길동", "남자", "경상도 통영시", "010-1234-5678");
		왜메소드를사용할까 person10 = new 왜메소드를사용할까(28, "윤길동", "여자", "경상도 남해군", "010-1234-5678");
		
		person1.printPersonalInfo();
		person2.printPersonalInfo();
		person3.printPersonalInfo();
		person4.printPersonalInfo();
		person5.printPersonalInfo();
		person6.printPersonalInfo();
		person7.printPersonalInfo();
		person8.printPersonalInfo();
		person9.printPersonalInfo();
		person10.printPersonalInfo();
		
	}

}
