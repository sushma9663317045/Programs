package Bpgms;

public class Ds_occuranceofduplicate {

	public static void main(String[] args) {
		String str="success";
		char[] c =str.toCharArray();
		int count=1;
		for (int i = 0; i < c.length-1; i++) {
			for (int j = i+1; j < c.length; j++) {
				if(c[i]==c[j]){
					c[j]=' ';
					count++;
				}
				
			}
			if(c[i]!=' ' && count>1){
				System.out.println(c[i]+"="+count);
				
			}
			count=1;
			
			
		}

	}

}
