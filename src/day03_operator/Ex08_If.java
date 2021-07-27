package day03_operator;

import java.util.Scanner;

public class Ex08_If {
	/*
	 # 제어문 
	  : 프로그램의 프로그램을 제어한다
	  ㅁ if 조건식
	   - if (조건식) {
	   		종속문장 : 중괄호 안의 내용
	   		조건식이 참인 경우 중괄호의 내용이 실행
	   		}
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("1. 쉬운 게임");
		System.out.println("2. 어려운 게임");
		System.out.println("3. 종료");
		System.out.print(">>> : ");
		num=sc.nextInt();
		
		if (num==1) {
			System.out.println("쉬운 게임 시작");
		} if (num==2) {
			System.out.println("어려운 게임 시작");
		} if (num==3) {
			System.out.println("게임을 종료합니다");
		}
	}
}
