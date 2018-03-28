package Bpgms;

public class D4_palindrome {

	public static void main(String[] args) {
		/*String s="madam";
		String s2="";
		for (int i = s.length()-1; i >=0; i--) {
			s2=s2+s.charAt(i);
			
		}
		if(s2.equals(s))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");*/
		
		/*String s="madam";
		StringBuffer sb1 = new StringBuffer(s);
		String s2=sb1.reverse().toString();
		if(s2.equals(s))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");*/
		
		String s="madam";
		StringBuffer sb1 = new StringBuffer(s);
		String s2=sb1.reverse().toString();
		if(s2.equalsIgnoreCase(s))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");

	}

}
