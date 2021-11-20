package abstraction;

public class Tester4 extends Tester3 {

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("implementing m4 method from Tester3");
	}
	  
	 public static void main(String[]args) {
		 Tester4 abc = new Tester4();
		 abc.m1();
		 abc.m2();
		 abc.m3();
		 abc.m4();
		 abc.m5();
		 
		 Tester4 gt= new Tester4();
		     gt.m1();
		     gt.m5();
		     m007(); 
		
	}
	 
	 

}
