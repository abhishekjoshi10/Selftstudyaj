package misc;

public class ArrayDemo {
	
	public static void main(String[] args) {
		// first method with size
//		int[] arr1 = new int[10];
//		for (int i = 0; i < 10; i++) {
//			arr1[i] = i;
//		}
//		
//		// 2nd method without size
//		int[] arr2 = {10,11,12,13,14,15,16,17,18,19};
//		
//		for (int i = 0; i < 10; i++) {
//			System.out.println(arr2[i]);
//		}
//		
//		String[] strArr = {"a", "b", "c", "d", "e"};
		
		Employee[] empArray = new Employee[10];
		
		Employee firstEmp = new Employee();
		firstEmp.setName("Abhishek");
		firstEmp.setAge(27);
		firstEmp.setSalary(20000);
		empArray[0] = firstEmp;
		
		Employee secondEmp = new Employee();
		secondEmp.setName("Rushikesh");
		secondEmp.setAge(20);
		secondEmp.setSalary(2000);
		empArray[1] = secondEmp;
		
		System.out.println(firstEmp);
		System.out.println(secondEmp);
	}

	//Firstoverloading
}
 