package arrayjava;

public class Employees {

	
	int Emp_id, salary,
	 address, department;
	String name;
	
	public int getEmp_id() {
		return Emp_id;
	}
	public void setEmp_id(int Emp_id) {
		this.Emp_id=Emp_id;
	}
	public int getsalary() {
		return salary;
	}
	public void setsalary(int salary) {
		this.salary=salary;
	}
	public String getname() {
		return name;
	}
	public void setname(String string) {
		this.name=name;
	}
	public int getaddress() {
		return address;
	}
	public void setaddress(int address) {
		this.address=address;
	}
	
	public int department() {
		return department;
	}
	public void setdepartment(int department) {
		this.department=department;
	}
	public String toString() {  
			    return "Employee [emp_id = 1014 " + Emp_id + ", salary =15000 " + salary + ", name = abhishek " + name + ", address = aurangabad" + address  
					            + ", department = testing " + department + "]";  
				    }  
	
		
		public static void main(String args[]) {
			
			Employees ee= new Employees();
			
			ee.setEmp_id(0); 
			
		    int testing = 0;
			ee.setdepartment(testing);
		    
		    int aurangabad = 0;
			ee.setaddress(aurangabad);
		    
		    ee.setname("abhishek");
		  
		    ee.setsalary(30000);
		    
		    
		    System.out.println(ee);
			
		    int sal=ee.getsalary();
		    
		    if ((sal>=10000)&&(sal<=15000)) {
		    	
//		    	increamenting by 2 %
		    	
		    	int increment = (sal * 2)/100;  
		    	           sal = sal+increment; 
		    	           
		    	           ee.setsalary(sal);
		    	           System.out.println("\n salary is incremented\n");
		    	           System.out.println(ee);

		    }
		    
		    else if ((sal>=10000)&&(sal<=15000)) {
		    	
//		    	incrementing by 5%
		    	int increment = (sal*5)/100;
		    	sal= sal+ increment;
		    	System.out.println("\n salary is very incremented\n");
		    	System.out.println(ee);
		    }
		    
		    else {
		    	System.out.println("salary is not inremented");
		    	System.out.println(ee);
		    }
		    
		    
				
			
		}
		
	}

	
	

