package com.one;

public class TelevisionTest {
	public static void main(String[] args) {
		Television pizza=new Television();
		pizza.channel=7;
		pizza.volumn=10;
		pizza.OnOff=true;
		
		System.out.println("tv채널 : " + pizza.channel + 
				"이고 vol : " +pizza.volumn+"입니다.");
		
		Television donut=new Television();
		donut.channel=1;
		donut.volumn=5;
		donut.OnOff=false;
		
		System.out.println("tv채널 : " + donut.channel + 
				"이고 vol : " +donut.volumn+"입니다.");
	}
}
