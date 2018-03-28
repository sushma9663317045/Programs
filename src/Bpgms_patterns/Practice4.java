package Bpgms_patterns;

public class Practice4 {

	public static void main(String[] args) {
		String st = "this is automation";
		String[] s = st.split(" ");
		
		String[] v = new String[s.length];
		
		for(int i=0 ; i<s.length ; i++)
		{
			String s1 = "";
			for(int j=s[i].length()-1 ; j>=0 ; j--)
			{
				s1=s1+s[i].charAt(j);
				
			}
			
			v[i]=s1;
		}
		
		for(String a : v){
			System.out.print(a+" ");
		}
		
		
//		for(int i=v.length-1 ; i>=0 ; i--)
//		{
//			System.out.print(v[i]+" ");
//		}
		
	
	}
}
