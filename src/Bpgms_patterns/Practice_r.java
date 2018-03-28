package Bpgms_patterns;

public class Practice_r {

	public static void main(String[] args) {
		String s = "ABCDEFG";
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if (j >= 3 - i) {
					System.out.print(s.charAt(j));
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
