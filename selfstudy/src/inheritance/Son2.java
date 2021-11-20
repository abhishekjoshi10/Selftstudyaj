package inheritance;

public class Son2 extends Son {
	public void m5() {
		System.out.println(" m5 sons secnd");
	}
	public void checkingveriable() {
		System.out.println(k);
		System.out.println("int"+d);
		System.out.println(a);
		System.out.println(Father.a);
		System.out.println(b);
		System.out.println(l);
	}
	public static void main(String[]arges) {
		Son2 a= new Son2();
		a.m1();
        a.m2();	
		m3();
		m4();
		a.m5();
		a.checkingveriable();
	}   

}
