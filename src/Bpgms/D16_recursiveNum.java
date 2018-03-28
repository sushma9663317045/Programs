package Bpgms;

public class D16_recursiveNum {

	public static void main(String[] args) {
		test(4);

	}
	
	static void test(int i){
		if(i>0){
			System.out.println(i);
			test(i-1);
		}
	}

}
