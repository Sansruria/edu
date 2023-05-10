package edu.메소드.메소드활용예제;

import java.util.Scanner;

public class AccountNonMethod {
	private int deposit = 0; // 현재 금액
	private int balance = 10000; // 예치 금액
	private int withdraw = 0; // 출금 금액
	private Scanner sc = new Scanner(System.in);
	
	public void run() throws Exception {
		process();
	}
	
	private void process() {
		int chooseNum = 0;
		
		for(;;) {
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			chooseNum = sc.nextInt();
			
			if(chooseNum <= 4 && chooseNum >= 1) {
				if (chooseNum == 1) {
					System.out.print("입력 : ");
					balance = sc.nextInt();
					deposit += balance;
				}
				else if (chooseNum == 2) {
					int result;

					System.out.print("입력 : ");
					withdraw = sc.nextInt();
					deposit -= withdraw;
				}
				else if (chooseNum == 3) {
					System.out.printf("현재 금액은 %d원 입니다\n", deposit);
				}
				else {
					sc.close(); // 프로그램 종료
					break;
				}
			}
			else {
				chooseNum = 0;
				System.out.println("1부터 4까지만 입력해 주세요");
			}
		}
	}
	
}
