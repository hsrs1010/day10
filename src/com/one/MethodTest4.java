package com.one;

public class MethodTest4 {
	public static void main(String[] args) {
		// ���ڿ� ���� ����

		// �ڽ��� ��ü ���� mt4
		MethodTest4 mt4 = new MethodTest4();

		// �޼ҵ带 ���弼�� whoMsg
		// �޼ҵ带 ȣ�� �ϼ��� whoMsg
		mt4.whoMsg("ȫ�浿 ����", 5000);
	}

	public void whoMsg(String msg, int won){
		System.out.println(msg + " "+ won);
		if (won>50000) {
			System.out.println("gooooood");
		}else if (won>30000) {
			System.out.println("norrrrrrrmal");
		}else if(won>20000)
			System.out.println("�� ������ ���� ������");
	}
}