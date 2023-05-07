/**
 * 1) return은 처리한 결과로 무언가를 작업하기 위해 사용한다
 * 아래의 문제를 보자
 * 
 * 온라인에서 물건을 구매하려고 한다
 * 내 계좌에는 1만원이 있고 물건 가격은 3천원이다
 * 물건을 계산하니 7천원의 거스름돈이 생겼다
 * 
 * 이 거스름돈(결과)를 다시 구매자에게 돌려준다 (return)
 * 
 * 
 * 
 * 2) 만약에 void를 사용하면 어떻게 될까?
 * void는 return을 하지 않는다
 * 아래의 문제를 보자
 * 
 * 온라인에서 물건을 구매하려고 한다
 * 내 계좌에는 1만원이 있고 물건 가격은 3천원이다
 * 물건을 계산하니 7천원의 거스름돈이 생겼다
 * 
 * 프로그램은 여기서 끝나게 된다
 * 왜냐하면 void는 return을 하지 않기 때문이다
 * 그렇기 때문에 거스름돈(결과)가 생겼지만 돌려주지 않고 끝난다
 * 
 * 이처럼 처리한 결과를 이용해서 다른 작업을 해야 할 때 사용하는 게 return이다
 */

package edu;

class Store {
	
	int wallet = 10000; // 내가 가진 돈 
	int price = 3000;   // 물건 가격
	int change;         // 거스름돈
	
	public int buyReturn() {
		change = wallet - price; // 10000원 - 3000원을 계산하고 나니 7000원이 남았다
		return change;           // 계산하고 남은 거스름돈(결과)를 구매자에게 돌려주어야하니까 return을 사용하는 것이다
	}
	
	public void buyNoReturn() {
		change = wallet - price; // 10000원 - 3000원을 계산하고 나니 7000원이 남았지만 돌려주지 않고 끝낸다
	}
	
}

public class Return은_왜받는거지 {
	
	public static void main(String[] args) {
		Store store = new Store();
		System.out.println("거스름돈을 받으세요. " + store.buyReturn() + "원");
	}
}
