package com.two;

import java.util.Scanner;

public class InputMethod {
	
	//�ֿܼ��� �ΰ��� ���� �Է� �ؼ�,
	// ����� �޼ҵ�(twoNumSum)���� ���
	//����� ��� �ǵ���
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1, num2;
		InputMethod im=new InputMethod();
		System.out.println("�μ��Է�");
		num1= sc.nextInt();
		num2= sc.nextInt();
		im.twoNumSum(num1,num2);
	}
	public void twoNumSum(int num1, int num2) {
		System.out.println("�μ��� �հ� : " + (num1+num2));
		}
}
