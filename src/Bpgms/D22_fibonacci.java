package Bpgms;

public class D22_fibonacci {

	public static void main(String[] args) {
	int first=0;
	int sec=1;
	int res=0;
	System.out.println(first);
	System.out.println(sec);
	for (int i = 1; i <=8; i++) {
		res=first+sec;
		System.out.print(res+" ");
		first=sec;
		sec=res;
	}

	}

}
