package Bpgms_patterns;

public class Practice3 {

	public static void main(String[] args) {
		
		String s="abchakjfhabckjashdkjshabclkjhabc";
		/*String c="abc";
		int count=0;
		for (int i = 0; i < s.length()-2; i++) {
			String m=s.substring(i, i+3);
if(m.equals(c)){			
				count++;
			}
		}
		System.out.println(count);*/
		
		String[] b=s.split("abc");
		System.out.println(b.length);
		for(String cc:b){
			System.out.println(cc);
		}
		
	}
}
