package day03_operator;

public class Ex06_Op {

	/*
	 # ����������
	  - ++ : �ڱ� �ڽ��� 1 ������Ų��
	  - -- : �ڱ� �ڽ��� 1 ���ҽ�Ų��
	  - example
	     a++ = (a=a+1)
	     a-- = (a=a-1)
	 */
	
	public static void main(String[] args) {
		
		int su1=5;
		su1++;						// ��ġ �Ǵ� ����
		System.out.println(su1);
		++su1;						// ��ġ �Ǵ� ����
		System.out.println(su1);
		
		int n1,n2,n3;
		n1=10;
		n2=++n1;
		n1=10;
		n3=n1++;
		System.out.println(n2);
		System.out.println(n3);
	}
}
