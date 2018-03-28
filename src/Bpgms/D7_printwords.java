package Bpgms;

public class D7_printwords {

	public static void main(String[] args) {
		/*String str="this is an interview";
		String[] v=str.split(" ");
		for(String b:v){
			System.out.println(b);
		}*/
		
		/*String str="this is an interview";
		char[] c=str.toCharArray();
		for(char b:c){
			if(b==' ')
				System.out.println();
			else
				System.out.print(b);
		}*/
		
		String str1="this is an interview";
		System.out.print(str1.replace(' ', '\n'));
	}

}
