package com.one;

public class MethodTest2 {
	public void makeSum(int sNum, int eNum) {
		int start=sNum;
		int end=eNum;
		int sum=0;
		
		for (int i = start; i <= end; i++) {
			sum+=i;
		}
		System.out.println("���� : " + start);
		System.out.println("���� : " + end);
		System.out.println("sum : " + sum);
	}

	public static void main(String[] args) {
		//�ڹٿ����� �Լ��� �޼ҵ��� ��
		// ����
		//public void �޼ҵ� �̸�(){}
		
		//��ü ����
		//���� �μ�
		MethodTest2 mt=new MethodTest2();
		mt.makeSum(50,1000);
	}
		
	}
