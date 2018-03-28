package Bpgms;

public class D9_printDigits {

	public static void main(String[] args) {
		/*String s = "page 14 of 56";
		char[]  c=s.toCharArray();
		for(char b:c){
			if(b>='a' && b<='z'){
				System.out.print(b);
			}
		}*/
		
		/*String s = "page 14 of 56";
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='a'&& s.charAt(i)<='z'){
				System.out.print(s.charAt(i));
			}
			
		}*/
		
		/*String s = "page 14 of 56";
		char[]  c=s.toCharArray();
		
			for(char b:c){
				if(Character.isAlphabetic(b)){
					System.out.print(b);
				}
			}*/
			
			String s1 = "page 14 of 56";
			char[]  c1=s1.toCharArray();
			
				for(char b:c1){
					if(Character.isDigit(b)){
						System.out.print(b);
					}
				}
		
		
		}
	}


