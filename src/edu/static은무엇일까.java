/**
 * static이 붙은 변수는 메모리에 오로지 1개만 존재하게 된다 (클래스 변수 또는 정적 변수라고 한다)
 * 반면에 인스턴스 변수는 객체를 생성하면 선언한 개수만큼 메모리에 복사가 된다
 * 
 * 그렇다면 왜 이런 방법을 사용하는 걸까?
 * 
 * 객체를 생성하게 되면 그 객체는 메모리를 차지한다
 * 
 * 트럼프 카드를 예로 들면 트럼프 카드는 모든 카드의 가로, 세로의 크기가 동일하다
 * 그런데 이 가로, 세로 속성을 인스턴스 변수로 선언하면 객체를 생성할 때마다 복사가 될 것이다.
 * 트럼프 카드는 총 52장인데, 이걸 전부 객체로 만들면 똑같은 52개의 가로, 세로 변수가 생기게 되는 것이다
 * 그리고 그만큼 메모리를 차지하게 될 것이다
 * 그러니 이렇게 공통되는 가로, 세로를 클래스(정적) 변수로 선언해서 객체를 생성할 때 복사가 되지 않게 한다
 * 그리고 생성된 객체들은 클래스(정적) 변수를 참조하게 되기 때문에 클래스 변수의 값을 변경하면 생성된 모든
 * 객체가 변경된 값을 출력하는 것이다
 * 
 * 
 * 만약에 공통되는 부분을 관리하지 않고 무분별하게 생성하면 메모리에 쓰지도 않는 중복된 데이터가
 * 쌓이고 쌓여서 프로그램이 무거워지게 된다
 * 흔히 말하는 최적화를 못 했다라는 게 이런 것이다
 * 
 * 반면에 클래스 변수를 선언해서 공통되는 부분을 줄이면 메모리도 절약할 수 있다
 * 그만큼 프로그램도 가벼워지고 이런 걸 최적화를 잘 했다고 한다
 */

package edu;

class TrumpCard {
	String pattern; // static이 없으니까 인스턴스 변수다
	int num;
	static int width = 50; // static이 있으니 클래스(정적) 변수다
	static int height = 120;
}

public class static은무엇일까 {
	
	public static void main(String[] args) {
		
//		TrumpCard.width = 777; // 주석을 해제하고 실행해 보면 모든 객체의 width와 height가 수정된 걸 알 수 있다
//		TrumpCard.height = 888; // 클래스(정적) 변수는 1개 가지고 공유하기 때문이다
		
		TrumpCard trumpCard1 = new TrumpCard(); // 객체 생성
		trumpCard1.pattern = "Spades";
		trumpCard1.num = 5;
		System.out.println("trumpCard1의 문양은 : " + trumpCard1.pattern);
		System.out.println("trumpCard1의 숫자는 : " + trumpCard1.num);
		System.out.println("trumpCard1의 가로는 : " + trumpCard1.width); // 자세히 보면 노란 밑줄이 있다
		System.out.println("trumpCard1의 세로는 : " + trumpCard1.height); // 이클립스에서 작동은 되지만 주의할 필요가 있다고 알려주는 것이다
		System.out.println();
		
		TrumpCard trumpCard2 = new TrumpCard(); // 객체 생성
		trumpCard2.pattern = "Diamond"; 
		trumpCard2.num = 2;
		System.out.println("trumpCard2의 문양은 : " + trumpCard2.pattern);
		System.out.println("trumpCard2의 숫자는 : " + trumpCard2.num);
		System.out.println("trumpCard2의 가로는 : " + trumpCard2.width);
		System.out.println("trumpCard2의 세로는 : " + trumpCard2.height);
		System.out.println();

		TrumpCard trumpCard3 = new TrumpCard(); // 객체 생성
		trumpCard3.pattern = "Heart"; 
		trumpCard3.num = 8;
		System.out.println("trumpCard3의 문양은 : " + trumpCard3.pattern);
		System.out.println("trumpCard3의 숫자는 : " + trumpCard3.num);
		System.out.println("trumpCard3의 가로는 : " + trumpCard3.width);
		System.out.println("trumpCard3의 세로는 : " + trumpCard3.height);
		
		System.out.println(TrumpCard.width); // 클래스 변수는 이 방법으로 호출하는 것을 권장한다
		System.out.println(TrumpCard.height); // 왜냐하면 객체.변수 방식으로 호출하면 인스턴스 변수로 오해할 수도 있기 때문이다.
		
	}

}
