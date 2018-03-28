
public class Apple {

	
		private static Apple a1;
		
		private Apple(){
			
		}
		
		static Apple getApple(){
			if(a1==null)
				a1=new Apple();
				return a1;
			
			
		}
		
		void getapp(){
			System.out.println("hi");
		}

	

}
