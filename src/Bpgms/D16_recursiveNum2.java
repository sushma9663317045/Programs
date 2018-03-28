package Bpgms;

public class D16_recursiveNum2 {

	public static void main(String[] args) {
		test(4);

	}
	
	static void test(int i){
		if(i>=1){
			test(i-1);
			System.out.println(i);
		}
	}

}
