package day03_operator;

import java.util.Scanner;

public class Ex08_If {
	/*
	 # ��� 
	  : ���α׷��� ���α׷��� �����Ѵ�
	  �� if ���ǽ�
	   - if (���ǽ�) {
	   		���ӹ��� : �߰�ȣ ���� ����
	   		���ǽ��� ���� ��� �߰�ȣ�� ������ ����
	   		}
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("1. ���� ����");
		System.out.println("2. ����� ����");
		System.out.println("3. ����");
		System.out.print(">>> : ");
		num=sc.nextInt();
		
		if (num==1) {
			System.out.println("���� ���� ����");
		} if (num==2) {
			System.out.println("����� ���� ����");
		} if (num==3) {
			System.out.println("������ �����մϴ�");
		}
	}
}
