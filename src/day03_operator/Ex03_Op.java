package day03_operator;

public class Ex03_Op {

	/*
	 # ���� ���� ������
	  - example
	      a=10;
	      a=a+3; �� a+=3;
	      a=a*3; �� a*=3;
	 */
	
	public static void main(String[] args) {
		
		int su1,su2;
		su1=su2=5;
		
		System.out.println("su1+1=" + (su1+=1));
		// su1 = su1(5)+1 = 6
		System.out.println("su1-1="+(su1-=1));
		// su1 = su1(6)-1 = 5
		System.out.println("su1*su2="+(su1*=su2));
		// su1 = su1(5)*su2(5) = 25
		System.out.println("su1/su2="+(su1/=su2));
		// su1 = su1(25)/su2(5) = 5
		System.out.println("su1%su2="+(su1%=su2));
		// su1 = su1(5)%su2(5) = 0
	}
}
