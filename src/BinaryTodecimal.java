
public class BinaryTodecimal {

	public static void main(String[] args) {
		int n=1010;
		int mul=1;
		int sum=0;
		while(n>0){
			int rem=n%10;
			int res=mul*rem;
			sum=sum+res;
			mul=mul*2;
			n=n/10;
		}
		System.out.println(sum);

	}

}
