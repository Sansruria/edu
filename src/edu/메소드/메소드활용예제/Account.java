package edu.메소드.메소드활용예제;

import java.util.Scanner;

public class Account {
	private int deposit = 0; // 현재 금액
	private int balance = 10000; // 예치 금액
	private int withdraw = 0; // 출금 금액
	private Scanner sc = new Scanner(System.in);
	
	public void run() throws Exception {
		process();
	}
	
	private void process() throws Exception {
		int chooseNum = 0;
		
		for(;;) {
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			chooseNum = sc.nextInt();
			
			if(chooseNum <= 4 && chooseNum >= 1) {
				if (chooseNum == 1) {
					accountDeposit(); // 입금
				}
				else if (chooseNum == 2) {
					depositWithdrawal(); // 출금
				}
				else if (chooseNum == 3) {
					depositInquiry(); // 조회
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
	
	// 입금
	private void accountDeposit() {
		System.out.print("입금할 금액을 입력해 주세요 : ");
		balance = sc.nextInt();
		deposit += balance;
	}
	
	// 출금
	private void depositWithdrawal() throws Exception {
		try {
			int result;
			
			System.out.print("출금할 금액을 입력해 주세요 : ");
			withdraw = sc.nextInt();
			result = deposit - withdraw; // 현재금액 - 출금할 금액
			
			if (result < 0) {
				throw new Exception("잔액이 부족합니다.");
			}
			else {
				deposit -= withdraw;
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	// 조회
	private void depositInquiry() {
		System.out.printf("현재 금액은 %d원 입니다\n", deposit);
	}
	
}
