package Contructor;

public class multipleconstructorcanbepresent {
	
	public multipleconstructorcanbepresent(int a , boolean b) {
		System.out.println("1st multipleconstructorcanbepresentis running");
	}
        public void multipleconstructor() {
        	System.out.println("2nd multipleconstructorcanbepresent is running");
        }
	public static void main(String[] args) {
		multipleconstructorcanbepresent obj= new multipleconstructorcanbepresent(100,true);
              obj.multipleconstructor();
              System.out.println("hello");
               
		// TODO Auto-generated method stub

	}

}
