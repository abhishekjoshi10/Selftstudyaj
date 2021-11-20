package Methods;

public class nonstatinnonstat {
       
	public void no1() {
		System.out.println("1 its my 1st nontatic in nonstatic program");
		
	} 
		public void no2() {
			no1();
			System.out.println("2 its my 1st nontatic in nonstatic program");

	}
		public void no3() {
			no2();
			System.out.println("3 its my 1st nontatic in nonstatic program");
		}
		
		public static void main(String[]args) {
			nonstatinnonstat a = new nonstatinnonstat();
		
			a.no3();
			
		}
}
