package Bpgms_patterns;

public class Reverse_echword {

	public static void main(String[] args) {
		String s = "madam malayalam mom";
		String[] v = s.split(" ");
		String rev = "";
		for (int i = v.length - 1; i >= 0; i--) {
			String revwords = "";
			for (int j = v[i].length() - 1; j >= 0; j--) {
				revwords = revwords + v[i].charAt(j);
			}
			rev = revwords + " " + rev;
		}
		System.out.println(rev);
	}
}
