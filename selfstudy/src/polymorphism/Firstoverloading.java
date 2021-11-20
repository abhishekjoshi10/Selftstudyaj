package polymorphism;

public class Firstoverloading {
	
//	public void method1(int a ) {
//		int bat=10;
//		 int b= 20;
//		
//	}
//	public void method11() {
//		System.out.println("1st overloading");
//	}
//	
//	public void method1() {
//		
//	 int a=50;
//		
//	}

	//this method calculates sum of 2 numbers
	public int sumOfNums(int i, int j) {
		return i + j;
	}
	
	public long sumOfNums(long i, long j) {
		return i + j;
	}
	
	public double sumOfNums(double i, double j) {
		return i + j;
	}
	
	public void printNumber(int i) {
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		 
		Firstoverloading a=new Firstoverloading();
		System.out.println(a.sumOfNums(1,2));
		
		System.out.println(a.sumOfNums(4l,6l));
		
		System.out.println(a.sumOfNums(1.2,2.5));
		
	}

}

//byte, short, int, long, fl oat, double, BigDecimal