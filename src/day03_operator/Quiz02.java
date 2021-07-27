package day03_operator;

import java.util.Scanner;

public class Quiz02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//입력한 데이터가 3의 배수인 경우 출력
		int num;
		System.out.println("입력한 데이터가 3의 배수인 경우 출력");
		System.out.print("입력 : ");
		num = sc.nextInt();
		if (num%3==0) {
			System.out.println(num+"은 3의 배수입니다");
		} else {
			System.out.println(num+"은 3의 배수가 아닙니다");
		}
		
		// 입력한 수의 절대 값을 구하는 프로그램을 작성하시오
		int num1;
		System.out.println("입력한 수의 절대 값");
		System.out.print("입력 : ");
		num1 = sc.nextInt();
		if (num1>=0) {
			System.out.println(num1+"의 절대 값: "+num1);
		} else {
			System.out.println(num1+"의 절대값 : "+(-num1));
		}
		
		// 두 수를 입력 받아 큰 수를 출력 하시오
		int n1,n2;
		System.out.println("두 수 중 큰 수");
		System.out.print("입력 : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		if (n1>n2) {
			System.out.println(n1);
		} else {
			System.out.println(n2);
		}
		
		// 세 수를 입력 받아 큰 수를 출력하시오
		int a,b,c;
		System.out.println("세 수 중 큰 수");
		System.out.print("입력 : ");
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
		
		//두수를 입력 받아 큰 수가 짝수이면 출력하시오
		int numb1,numb2;
		System.out.print("입력 : ");
		numb1=sc.nextInt();
		numb2=sc.nextInt();

		if (numb1>numb2) {
			if (numb1%2==0) {
				System.out.println("두 수 중 큰 수가 짝수이면 출력 : "+numb1);
			}
		} else if (numb2>numb1) {
			if (numb2%2==0) {
				System.out.println("두 수 중 큰 수가 짝수이면 출력 : "+numb2);
			}
		} else if (numb1==numb2) {
			if (numb2%2==0) {
				System.out.println("두 수 중 큰 수가 짝수이면 출력 : "+numb2);
			}
		}
		
		// 두수를 입력받아 합이 짝수이고 3의 배수인 수를 출력하시오
		int sum;
		sum=numb1+numb2;
		if (sum%2==0 && sum%3==0) {
			System.out.println("두 수의 합이 짝수이고 3의 배수 : "+ sum);
		}
	}
}
