package com.one;

public class MethodTest4 {
	public static void main(String[] args) {
		// 문자와 숫자 전달

		// 자신의 객체 생성 mt4
		MethodTest4 mt4 = new MethodTest4();

		// 메소드를 만드세요 whoMsg
		// 메소드를 호출 하세요 whoMsg
		mt4.whoMsg("홍길동 선물", 5000);
	}

	public void whoMsg(String msg, int won){
		System.out.println(msg + " "+ won);
		if (won>50000) {
			System.out.println("gooooood");
		}else if (won>30000) {
			System.out.println("norrrrrrrmal");
		}else if(won>20000)
			System.out.println("돈 없을때 연락 하지마");
	}
}