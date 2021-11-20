package variables;

public class nonstaticvar {
	int a=11;

	public static void main(String[] args) {
		nonstaticvar a =new nonstaticvar();
		nonstaticvar b =new nonstaticvar();
		nonstaticvar c =new nonstaticvar();
		b.a=15;
		c.a=20;
		System.out.println(a.a);
		System.out.println(b.a);
		System.out.println(c.a);
		
		// TODO Auto-generated method stub

	}

}
