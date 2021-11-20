package dispatch;

public class A3 {
	void dynamicdispatch() {
		System.out.println("Inside A3's dynamic dispatch");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a=new A1();
		A2 b= new A2();
		A3 c=new A3();
		
		A1 r = a;
		r.dynamicdispatch();
		A2 r1= b;
		r1.dynamicdispatch();
		A3 r2= c;
		r2.dynamicdispatch();
	

	}

}
