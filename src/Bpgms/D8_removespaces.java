package Bpgms;

public class D8_removespaces {

	public static void main(String[] args) {
		/*String str="this is an interview";
		String str2="";
		char[] c=str.toCharArray();
		for(char b:c){
			if(b!=' '){
				str2=str2+b;
			}
		}
		System.out.println(str2);*/
		
		String str="this is an interview";
		String str2="";
		
		for (int i = 0; i < str.length(); i++) {
			char a=str.charAt(i);
			if(a!=' '){
				str2=str2+str.charAt(i);
			}
			
		}
		System.out.println(str2);
		
		
	}

}
