package day03_operator;

import java.util.Scanner;

public class Quiz02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//�Է��� �����Ͱ� 3�� ����� ��� ���
		int num;
		System.out.println("�Է��� �����Ͱ� 3�� ����� ��� ���");
		System.out.print("�Է� : ");
		num = sc.nextInt();
		if (num%3==0) {
			System.out.println(num+"�� 3�� ����Դϴ�");
		} else {
			System.out.println(num+"�� 3�� ����� �ƴմϴ�");
		}
		
		// �Է��� ���� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�
		int num1;
		System.out.println("�Է��� ���� ���� ��");
		System.out.print("�Է� : ");
		num1 = sc.nextInt();
		if (num1>=0) {
			System.out.println(num1+"�� ���� ��: "+num1);
		} else {
			System.out.println(num1+"�� ���밪 : "+(-num1));
		}
		
		// �� ���� �Է� �޾� ū ���� ��� �Ͻÿ�
		int n1,n2;
		System.out.println("�� �� �� ū ��");
		System.out.print("�Է� : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		if (n1>n2) {
			System.out.println(n1);
		} else {
			System.out.println(n2);
		}
		
		// �� ���� �Է� �޾� ū ���� ����Ͻÿ�
		int a,b,c;
		System.out.println("�� �� �� ū ��");
		System.out.print("�Է� : ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if (a>b&&a>c) {
			System.out.println(a);
		} else if (b>a&&b>c) {
			System.out.println(b);
		} else if (c>a&&c>b) {
			System.out.println(c);
		}
		
		//�μ��� �Է� �޾� ū ���� ¦���̸� ����Ͻÿ�
		int numb1,numb2;
		System.out.print("�Է� : ");
		numb1=sc.nextInt();
		numb2=sc.nextInt();

		if (numb1>numb2) {
			if (numb1%2==0) {
				System.out.println("�� �� �� ū ���� ¦���̸� ��� : "+numb1);
			}
		} else if (numb2>numb1) {
			if (numb2%2==0) {
				System.out.println("�� �� �� ū ���� ¦���̸� ��� : "+numb2);
			}
		} else if (numb1==numb2) {
			if (numb2%2==0) {
				System.out.println("�� �� �� ū ���� ¦���̸� ��� : "+numb2);
			}
		}
		
		// �μ��� �Է¹޾� ���� ¦���̰� 3�� ����� ���� ����Ͻÿ�
		int sum;
		sum=numb1+numb2;
		if (sum%2==0 && sum%3==0) {
			System.out.println("�� ���� ���� ¦���̰� 3�� ��� : "+ sum);
		}
	}
}
