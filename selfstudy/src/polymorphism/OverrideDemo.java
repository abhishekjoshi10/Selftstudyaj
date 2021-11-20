package polymorphism;

public class OverrideDemo {
	
	public static void main(String[] args) {
		MyInterface pc = new ParentClass();
		pc.printSomething("Hello");
		
		MyInterface cc = new ChildClass();
		cc.printSomething("Java");
	}

}
