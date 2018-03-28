package Bpgms;

public class D17_search {

	public static void main(String[] args) {
		/*int[] a ={2,3,4,5,6,4};
		String msg="not found";
		for(int b:a){
			if(b==3){
				msg="found";
				
			}
		}
		System.out.println(msg);*/
		
		String[] a ={"nokia","moto","lenova","moto"};
		String msg="not found";
		String s="moto";
		int count=0;
		for(String b:a){
			if(b==s){
				msg="found";
				count++;
				
			}
		}
		System.out.println(msg);
		System.out.println(count);

	}

}
