package Bpgms;

public class D13_Reverse {

	public static void main(String[] args) {
		int n=1234;
		int rev=0;
		while(n>0){
			int rem=n%10;
			rev=rem+(rev*10);
			n=n/10;
		}
		System.out.println(rev);
	}

}
