package com.one;

public class MethodTest {
	public static void main(String[] args) {
		// 자바에서는 함수를 메소드라고 한다.
		// 형태 - public void 메소드이름() {}

		// 객체 생성
		MethodTest mt = new MethodTest();
		mt.makeSum();
	}

	public void makeSum() {
		System.out.println("메소드에서 출력");
		
	}
}