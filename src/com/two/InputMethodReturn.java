package com.two;

import java.util.Scanner;

public class InputMethodReturn {
	
	//Return
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1, num2;
		InputMethodReturn im=new InputMethodReturn();
		System.out.println("두수입력");
		num1= sc.nextInt();
		num2= sc.nextInt();
		int rtot=im.twoNumSum(num1,num2);
		
		System.out.println("두수의 합계 : " + rtot);
		
	}
	public int twoNumSum(int num1, int num2) {
		int tot= num1+num2;
		return tot;
		}
}
