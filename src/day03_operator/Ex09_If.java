package day03_operator;

import java.util.Scanner;

public class Ex09_If {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("수 입력 : ");
		num = sc.nextInt();
		if (num>10) {
			System.out.println("종속 문장 실행 1");
			System.out.println("종속 문장 실행 2");
			System.out.println("종속 문장 실행 3");
			System.out.println("종속 문장 실행 4");
			System.out.println("종속 문장 실행 5");
		}
		System.out.println("다음 문장들 실행");
		// 참일경우도 출력, 거짓인 경우 종속 문장은 제외 후 출력
		
	}
}
