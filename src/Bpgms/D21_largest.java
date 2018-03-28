package Bpgms;

public class D21_largest {

	public static void main(String[] args) {
		int[] a={7,2,1,9,7};
		int small=a[0];
		for(int b:a){
			if(b<small){
				small=b;
			}
		}
		System.out.println(small);
		
		
		int[] a1={7,2,1,9,7};
		int big=a[0];
		for(int b:a){
			if(b>big){
				big=b;
			}
		}
		System.out.println(big);


	}

}
