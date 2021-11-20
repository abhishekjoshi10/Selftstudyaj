package operator;

public class Allops {

	public static void main(String[] args) {
		int a=20;
		int b=50;
		
		if(a==b) {
			
			System.out.println("ok yes its equal");
		}
		if (a!=b) {
			System.out.println("no its not equal");
		}
		if(!(a>b)) {
			System.out.println("a is not equal to b");
		}
		   if ((a>b)&&(b==50)) {
				System.out.println("both condition should get satisfy");
			}
		   if ((a>b)||(b==50)) {
				System.out.println("Any one of the condition should get satisfy");
			}


		// TODO Auto-generated method stub

	}

}

