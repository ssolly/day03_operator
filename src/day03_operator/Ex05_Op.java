package day03_operator;

public class Ex05_Op {

	/*
	 # �� ������
	  : true(��) �Ǵ� false(����)�� ǥ��
	  - || (or) : �ϳ��� ���� �����ϸ� ����� ��
	   �� true||false : true
	   �� false||false : false
	  - &&(and) : ��ΰ� ���� �� ��, �ϳ��� ������ ������ ����
	   �� true&&false : false
	   �� true&&true : true
	  - !(not) : ����� ���� �����ش�
	   �� !true : false
	   �� !false : true
	 */
	
	public static void main(String[] args) {
		
		System.out.println(false || true); //true
		System.out.println(true || true); // true
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(!true); //false
		
	}
}
