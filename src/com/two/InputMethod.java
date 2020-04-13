package com.two;

import java.util.Scanner;

public class InputMethod {
	
	//콘솔에서 두개의 값을 입력 해서,
	// 계산은 메소드(twoNumSum)에서 계산
	//결과가 출력 되도록
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1, num2;
		InputMethod im=new InputMethod();
		System.out.println("두수입력");
		num1= sc.nextInt();
		num2= sc.nextInt();
		im.twoNumSum(num1,num2);
	}
	public void twoNumSum(int num1, int num2) {
		System.out.println("두수의 합계 : " + (num1+num2));
		}
}
