package Bpgms;

public class D10_sumofDisgits {

	public static void main(String[] args) {
		/*String s = "page 14 of 56";
		int count=0;
		char[] c=s.toCharArray();
		for(char b:c){
			if(Character.isDigit(b)){
				count++;
			}
		}
		System.out.println(count);
*/
		
		String s = "page 14 of 56";
		int sum=0;
		char[] c=s.toCharArray();
		for(char b:c){
			if(Character.isDigit(b)){
			sum=sum+Character.getNumericValue(b);
			}
		}
		System.out.println(sum);

	}

}
