package Bpgms;

import java.util.Arrays;

public class D19_bubblesort {

	public static void main(String[] args) {
		/*
		 * int[] a ={4,3,2,1}; for (int i = 0; i < a.length-1; i++) { for (int j
		 * = i+1; j < a.length; j++) { if(a[i]>a[j]){ int temp=a[i]; a[i]=a[j];
		 * a[j]=temp; } }
		 * 
		 * } System.out.println(Arrays.toString(a));
		 */

		/*
		 * int[] a ={4,3,2,1}; for (int i = 0; i < a.length-1; i++) { for (int j
		 * = i+1; j < a.length; j++) { if(a[i]>a[j]){ int temp=a[i]; a[i]=a[j];
		 * a[j]=temp; } }
		 * 
		 * } System.out.println(a[a.length-2]);
		 */

		int[] a = { 1, 4, 9, 2, 3 };
		for (int i = 0; i < a.length; i++) {
			
			
					int temp = a[i];
					a[i] = a[a.length-i-1];
					a[a.length-i-1] = temp;
					
				}
			

		
		System.out.println(Arrays.toString(a));

	}

}
