package com.one;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
	// 화면에 주사위를 굴려주세요
	public static void main(String[] args) {
		// 사용자는 enter
		// 화면에 사용자 번호가 출력 되도록
		// 컴퓨터가 주사위를 굴릴 까요
		// 사용자 enter
		// 컴퓨터가 만드러낸 주사위 숫자가 출력 되고,
		// 높은 숫자가 win, lose draw
		// 무한 반복
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		while (true) {
			System.out.println("<<주사위 게임>>");
			System.out.println("enter 입력");
			sc.nextLine();
			int user1 = ran.nextInt(6) + 1;
			System.out.println("유저 숫자" + user1);
			
			System.out.println("enter 입력");
			sc.nextLine();	
			int com1 = ran.nextInt(6) + 1;
			System.out.println("컴퓨터 숫자" + com1);

			if (user1 > com1) {
				System.out.println("유저 win");
				System.out.println(" ");
			}
			if (com1 > user1) {
				System.out.println("컴퓨터 win");
				System.out.println(" ");
			}
			if (user1 == com1) {
				System.out.println("무승부");
				System.out.println(" ");
			}
		}

	}
}