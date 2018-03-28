package Bpgms;

import java.util.Arrays;

public class D18_addarray {

	public static void main(String[] args) {
	int[] a = {1,2,3};
	int[] b={4,5,6};
	int[] c = new int[3];
	for (int i = 0; i < c.length; i++) {
		c[i]=a[i]+b[i];
	}
	
	
	for (int e:c) {
		System.out.println(e);
	}
	
	System.out.println(Arrays.toString(c));
	}

}
