package Bpgms_patterns;

public class P2 {

	public static void main(String[] args) {
		/*for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
		int star=3;
		int space=0;
		int size=3;
		int k=1;
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print(k++ +" ");
			}
			System.out.println();
			star--;
		}

	}

}
