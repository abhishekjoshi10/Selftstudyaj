package accessmodifiers2;

import accessmodifiers.Publicaccess1; 
public class Publicaccess3{
	
	public void m1() {
		System.out.println("client =2");
	}
	public static void main(String[]args) {
		Publicaccess3 s= new Publicaccess3();
		Publicaccess1 v=new Publicaccess1();
		System.out.println(v.targetproducts);
		System.out.println(v.workinghours);
		s.m1();
	
		
	
	}


}
