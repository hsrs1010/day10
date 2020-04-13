package com.one;

public class MethodTest2 {
	public void makeSum(int sNum, int eNum) {
		int start=sNum;
		int end=eNum;
		int sum=0;
		
		for (int i = start; i <= end; i++) {
			sum+=i;
		}
		System.out.println("시작 : " + start);
		System.out.println("종료 : " + end);
		System.out.println("sum : " + sum);
	}

	public static void main(String[] args) {
		//자바에서는 함수를 메소드라고 함
		// 형태
		//public void 메소드 이름(){}
		
		//객체 생성
		//전달 인수
		MethodTest2 mt=new MethodTest2();
		mt.makeSum(50,1000);
	}
		
	}
