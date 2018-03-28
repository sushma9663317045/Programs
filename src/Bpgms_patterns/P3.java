package Bpgms_patterns;

public class P3 {

	public static void main(String[] args) {
		int star=1;
		int space=4;
		int size=5;
		
		String str="hello";
		for (int i = 0; i < size; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			int n=1;
			for (int j = 0; j < star; j++) {
				System.out.print(n+" ");
				n=n*(i-j)/(j+1);
			}
			System.out.println();
			star++;
			space--;
		}

	}

}
