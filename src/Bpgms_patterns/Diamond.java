package Bpgms_patterns;

public class Diamond {

	public static void main(String[] args) {
		int size=5;
		int spaces=size-1;
		int star=1;
		for (int i = 0; i < size; i++) {
			for (int k = 0; k < spaces; k++) {
				System.out.print("  ");
			}
			for (int j = 0; j < star; j++) {
				if(j==0 || i==4 || j==star-1)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
			star=star+2;
			spaces--;
			
		}

	}

}
