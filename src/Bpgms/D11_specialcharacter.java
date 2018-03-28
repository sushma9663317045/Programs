package Bpgms;

public class D11_specialcharacter {

	public static void main(String[] args) {
		String str="#1@Te&t";
		String num="";
		String letter="";
		String spec="";
		char[] c=str.toCharArray();
		for(char b:c){
			if(Character.isDigit(b)){
				num=num+b;
			}
			else if(Character.isLetter(b)){
				letter=letter+b;
			}
			else{
				spec=spec+b;
			}
				
		}
		System.out.println(num);
		System.out.println(letter);
		System.out.println(spec);

	}

}
