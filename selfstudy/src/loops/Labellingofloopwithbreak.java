package loops;

public class Labellingofloopwithbreak {

	public static void main(String[] args) {
		outerloop: for(int i=1; i<=5;i++) {
			for( int k=1;k<=5;k++) {
				
				if(k==3) 
					break outerloop;
					
					System.out.println("this is inner loop:"+ k);
				}
					
				
			}
		 System.out.println("as it is set at no.3 , its out from loop");
		}
		

	}


