package Bpgms;

public class D16_swap {

	public static void main(String[] args) {
		int a=2;
		int b=3;
		//int temp;
		
		/*temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);*/
		
		
		/*a=a+b;
		b=a-b;
		a=a-b;*/
		
		/*a=a*b;
		b=a/b;
		a=a/b;*/
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		
		System.out.println(a);
		System.out.println(b);

	}

}
