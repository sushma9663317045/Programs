package Bpgms;

public class D26_Reverseeachword {

	public static void main(String[] args) {
		String str="This is automation";
		String[] v=str.split(" ");
		String[] v1 = new String[v.length];
		
		for (int i = 0; i < v.length; i++) {
			String str2="";
			for (int j = v[i].length()-1; j>=0; j--) {
				char c=v[i].charAt(j);
				str2=str2+c;
			}
			v1[i]=str2;
		}
		
		for (int i = 0; i < v1.length; i++) {
			System.out.print(v1[i]+" ");
		}
		System.out.println();
		
		for (int i = v1.length-1; i>=0; i--) {
			System.out.print(v1[i]+" ");
		}
		
		

	}

}
