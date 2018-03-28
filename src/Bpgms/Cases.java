package Bpgms;

public class Cases {

	public static void main(String[] args) {
		/*String str="This Is Automation";
		char[] c=str.toCharArray();
		for(char b:c){
			if(b>='A' && b<='Z'){
				System.out.println(b);
			}
		}*/
		
		/*String str="This Is Automation";
		char[] c=str.toCharArray();
		for(char b:c){
			if(Character.isUpperCase(b)){
				System.out.println(b);
			}
		}*/
		
		String str="This Is Automation";
		char[] c=str.toCharArray();
		for(char b:c){
			if(Character.isLowerCase(b)){
				System.out.print(b);
			}
		}
	}

}
