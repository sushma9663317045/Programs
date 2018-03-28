package Bpgms;

public class D15_factorialrecursive {

	public static void main(String[] args) {
		System.out.println(test(4));
	}
	
	static int test(int i){
		int fact=i;
		if(fact<=0){
			return 1;
		}else{
			fact=fact*test(i-1);
		}
			
		return fact;
	}

}
