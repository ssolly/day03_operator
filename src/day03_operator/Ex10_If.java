package day03_operator;

import java.util.Scanner;

public class Ex10_If {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("�� �Է� : ");
		num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("¦��");
		} if (num%2!=0) {
			System.out.println("Ȧ��");
		}
	}
}
