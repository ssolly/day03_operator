package day03_operator;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		// ���� �Է� �޾� ¦, Ȧ���� �����Ͽ� ����Ͻÿ�
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		num = sc.nextInt();
		System.out.println(num%2==0?"¦��":"Ȧ��");
		
		// ���� �Է� �޾� 3�� ����̸� ����Ͻÿ�
		System.out.println(num%3==0?"3�� ����̴�":"3�� ����� �ƴϴ�");
		
		// �� ���� �Է� �޾� ū ���� ����Ͻÿ�
		int num1,num2;
		System.out.print("�� �� �Է� : ");
		num1=sc.nextInt();
		//System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
		num2=sc.nextInt();
		
		System.out.println("num1 : "+num1+"  num2 : "+num2);
		System.out.println(num1>num2? "num1�� num2���� ũ��" : "num2�� num1���� ũ��");
		
	}
}
