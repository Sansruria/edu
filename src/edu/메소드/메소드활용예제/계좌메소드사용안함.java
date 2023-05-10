package edu.메소드.메소드활용예제;

import java.util.Scanner;

public class 계좌메소드사용안함 {
	private int 현재금액 = 0; // 현재 금액
	private int 예치금액 = 10000; // 예치 금액
	private int 출금금액 = 0; // 출금 금액
	private Scanner sc = new Scanner(System.in);

    public void 실행() throws Exception {
		프로그램실행();
	}
	
	private void 프로그램실행() throws Exception {
		int 선택번호 = 0;
		
		for(;;) {
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			선택번호 = sc.nextInt();
			
			if(선택번호 <= 4 && 선택번호 >= 1) {
				if (선택번호 == 1) {
					System.out.print("금액을 입력해 주세요 : ");
					예치금액 = sc.nextInt();
					현재금액 += 예치금액;
				}
				else if (선택번호 == 2) {
					System.out.print("금액을 입력해 주세요 : ");
					출금금액 = sc.nextInt();
					현재금액 -= 출금금액;
				}
				else if (선택번호 == 3) {
					System.out.printf("현재 금액은 %d원 입니다\n", 현재금액);
				}
				else {
					sc.close(); // 프로그램 종료
					break;
				}
			}
			else {
				선택번호 = 0;
				System.out.println("1부터 4까지만 입력해 주세요");
			}
		}
	}
	
}
