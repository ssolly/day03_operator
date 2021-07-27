package day03_operator;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		// 수를 입력 받아 짝, 홀수를 구분하여 출력하시오
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		num = sc.nextInt();
		System.out.println(num%2==0?"짝수":"홀수");
		
		// 수를 입력 받아 3의 배수이면 출력하시오
		System.out.println(num%3==0?"3의 배수이다":"3의 배수가 아니다");
		
		// 두 수를 입력 받아 큰 수를 출력하시오
		int num1,num2;
		System.out.print("두 수 입력 : ");
		num1=sc.nextInt();
		//System.out.print("두번째 숫자를 입력하세요 : ");
		num2=sc.nextInt();
		
		System.out.println("num1 : "+num1+"  num2 : "+num2);
		System.out.println(num1>num2? "num1이 num2보다 크다" : "num2가 num1보다 크다");
		
	}
}
