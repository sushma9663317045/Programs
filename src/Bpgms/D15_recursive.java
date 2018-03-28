package Bpgms;

public class D15_recursive {

	public static void main(String[] args) {
		
System.out.println(test(4));
	}
	
	static int test(int i){
		
		int sum=i;
		if(i>=1){
			sum=sum+test(i-1);
		}
		return sum;
	}

}
