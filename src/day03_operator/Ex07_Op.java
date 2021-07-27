package day03_operator;

public class Ex07_Op {

	/*
	 # 삼항연산자(조건연산자)
	  - 변수 = (식) ? (참인경우) : (거짓인 경우);
	 */
	
	public static void main(String[] args) {
		
		int su=8;
		String s = (su%2==0)? "짝수":"홀수";
		System.out.println(s);
		
		su=9;
		s = (su%2==0)? "짝수":"홀수";
		System.out.println(s);
		
	}
}
