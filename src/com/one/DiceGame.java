package com.one;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
	// ȭ�鿡 �ֻ����� �����ּ���
	public static void main(String[] args) {
		// ����ڴ� enter
		// ȭ�鿡 ����� ��ȣ�� ��� �ǵ���
		// ��ǻ�Ͱ� �ֻ����� ���� ���
		// ����� enter
		// ��ǻ�Ͱ� ���巯�� �ֻ��� ���ڰ� ��� �ǰ�,
		// ���� ���ڰ� win, lose draw
		// ���� �ݺ�
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		while (true) {
			System.out.println("<<�ֻ��� ����>>");
			System.out.println("enter �Է�");
			sc.nextLine();
			int user1 = ran.nextInt(6) + 1;
			System.out.println("���� ����" + user1);
			
			System.out.println("enter �Է�");
			sc.nextLine();	
			int com1 = ran.nextInt(6) + 1;
			System.out.println("��ǻ�� ����" + com1);

			if (user1 > com1) {
				System.out.println("���� win");
				System.out.println(" ");
			}
			if (com1 > user1) {
				System.out.println("��ǻ�� win");
				System.out.println(" ");
			}
			if (user1 == com1) {
				System.out.println("���º�");
				System.out.println(" ");
			}
		}

	}
}