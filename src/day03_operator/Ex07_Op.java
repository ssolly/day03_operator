package day03_operator;

public class Ex07_Op {

	/*
	 # ���׿�����(���ǿ�����)
	  - ���� = (��) ? (���ΰ��) : (������ ���);
	 */
	
	public static void main(String[] args) {
		
		int su=8;
		String s = (su%2==0)? "¦��":"Ȧ��";
		System.out.println(s);
		
		su=9;
		s = (su%2==0)? "¦��":"Ȧ��";
		System.out.println(s);
		
	}
}
