package Bpgms_patterns;

public class Stringreverse {

	public static void main(String[] args) {
		/*String s="AMITHBV";
		
		String rev="";
		for (int i = s.length()-2; i >0; i--) {
			rev=rev+s.charAt(i);
		}
		String revall="";
		revall=s.charAt(0)+rev+s.charAt(s.length()-1);
		System.out.println(revall);*/
		
		String s="AMITHBV";
		char[] ch=s.toCharArray();
		
		String rev="";
		for (int i = ch.length-2; i >0; i--) {
			rev=rev+ch[i];
		}
		String revall="";
		revall=ch[0]+rev+ch[ch.length-1];
		System.out.println(revall);

	}

}
