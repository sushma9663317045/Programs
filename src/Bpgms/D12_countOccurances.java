package Bpgms;

public class D12_countOccurances {

	public static void main(String[] args) {
		String str="this is auTomation";
		char c='t';
		int count=0;
		char[] ch=str.toLowerCase().toCharArray();
		for(char b:ch){
			if(b==c){
				count++;
			}
		}
		if(count>1){
			System.out.println("duplicate");
		}
		System.out.println(count);
	}

}
