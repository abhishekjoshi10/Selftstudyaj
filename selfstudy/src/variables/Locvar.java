package variables;

public class Locvar {
  int a = 199;
  
  public void m1() {
	  int a = 20;
	  System.out.println(a);
	  System.out.println(this.a);
  }
     
	public static void main(String[] args) {
		Locvar ref = new Locvar();
		ref.m1();
		// TODO Auto-generated method stub

	}

}
