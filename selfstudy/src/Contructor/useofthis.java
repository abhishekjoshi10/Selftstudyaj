package Contructor;

public class useofthis {
    public useofthis(int a, int b) {
    	System.out.println("top constructor is running with useofthis");
    }           
    public useofthis() {
    	this(150,300);
    	System.out.println("top constructor is running by useofthis");
    	
    }
    public static void main(String[]args) {
    	useofthis obj=new useofthis();
    }
}
