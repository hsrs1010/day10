package com.one;

public class TelevisionTest {
	public static void main(String[] args) {
		Television pizza=new Television();
		pizza.channel=7;
		pizza.volumn=10;
		pizza.OnOff=true;
		
		System.out.println("tvä�� : " + pizza.channel + 
				"�̰� vol : " +pizza.volumn+"�Դϴ�.");
		
		Television donut=new Television();
		donut.channel=1;
		donut.volumn=5;
		donut.OnOff=false;
		
		System.out.println("tvä�� : " + donut.channel + 
				"�̰� vol : " +donut.volumn+"�Դϴ�.");
	}
}
