package Bpgms;

public class D5_countSpace {

	public static void main(String[] args) {
		/*String str="this is an interview";
		int count=0;
		char[] c=str.toCharArray();
		for(char b:c){
			if(b==' '){
				count++;
			}
		}
		System.out.println(count);*/
		
		/*String str="this is an interview";
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==' '){
				count++;
			}
		}
		System.out.println(count);*/
		
		String str="this is an interview";
		String[] v=str.split(" ");
		System.out.println(v.length-1);

	}

}
