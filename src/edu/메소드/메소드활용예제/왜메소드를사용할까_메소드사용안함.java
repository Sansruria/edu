package edu.메소드.메소드활용예제;

public class 왜메소드를사용할까_메소드사용안함 {
	int age;
	String name;
	String gender;
	String address;
	String phoneNo;
	
	// 생성자
	public 왜메소드를사용할까_메소드사용안함(int age, String name, String gender, String address, String phoneNo) {
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.phoneNo = phoneNo;
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
		
		System.out.println("이름 : " + person1.name);
		System.out.println("나이 : " + person1.age);
		System.out.println("번호 : " + person1.phoneNo);
		System.out.println("성별 : " + person1.gender);
		System.out.println("주소 : " + person1.address);
		System.out.println();
		
		System.out.println("이름 : " + person2.name);
		System.out.println("나이 : " + person2.age);
		System.out.println("번호 : " + person2.phoneNo);
		System.out.println("성별 : " + person2.gender);
		System.out.println("주소 : " + person2.address);
		System.out.println();
		
		System.out.println("이름 : " + person3.name);
		System.out.println("나이 : " + person3.age);
		System.out.println("번호 : " + person3.phoneNo);
		System.out.println("성별 : " + person3.gender);
		System.out.println("주소 : " + person3.address);
		System.out.println();
		
		System.out.println("이름 : " + person4.name);
		System.out.println("나이 : " + person4.age);
		System.out.println("번호 : " + person4.phoneNo);
		System.out.println("성별 : " + person4.gender);
		System.out.println("주소 : " + person4.address);
		System.out.println();
		
		System.out.println("이름 : " + person5.name);
		System.out.println("나이 : " + person5.age);
		System.out.println("번호 : " + person5.phoneNo);
		System.out.println("성별 : " + person5.gender);
		System.out.println("주소 : " + person5.address);
		System.out.println();
		
		System.out.println("이름 : " + person6.name);
		System.out.println("나이 : " + person6.age);
		System.out.println("번호 : " + person6.phoneNo);
		System.out.println("성별 : " + person6.gender);
		System.out.println("주소 : " + person6.address);
		System.out.println();
		
		System.out.println("이름 : " + person7.name);
		System.out.println("나이 : " + person7.age);
		System.out.println("번호 : " + person7.phoneNo);
		System.out.println("성별 : " + person7.gender);
		System.out.println("주소 : " + person7.address);
		System.out.println();
		
		System.out.println("이름 : " + person8.name);
		System.out.println("나이 : " + person8.age);
		System.out.println("번호 : " + person8.phoneNo);
		System.out.println("성별 : " + person8.gender);
		System.out.println("주소 : " + person8.address);
		System.out.println();
		
		System.out.println("이름 : " + person9.name);
		System.out.println("나이 : " + person9.age);
		System.out.println("번호 : " + person9.phoneNo);
		System.out.println("성별 : " + person9.gender);
		System.out.println("주소 : " + person9.address);
		System.out.println();
		
		System.out.println("이름 : " + person10.name);
		System.out.println("나이 : " + person10.age);
		System.out.println("번호 : " + person10.phoneNo);
		System.out.println("성별 : " + person10.gender);
		System.out.println("주소 : " + person10.address);
		System.out.println();
	}

}
