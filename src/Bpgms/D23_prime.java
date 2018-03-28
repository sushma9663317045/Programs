package Bpgms;

public class D23_prime {

	public static void main(String[] args) {
		int n=9;
		String msg="prime";
		for (int i = 2; i < n; i++) {
			if(n%i==0){
				msg="not prime";
			}
		}
		System.out.println(msg);


	}

}
