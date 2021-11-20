package Arguments;

public class ArgAndnoreturn {
	public void argsbutnoreturn(int a, int b ) {
		int c= a+b;
		System.out.println(c);
	}
	

	public static void main(String[] args) {
		ArgAndnoreturn obj= new ArgAndnoreturn();
		obj.argsbutnoreturn(10, 10);

	}

}
