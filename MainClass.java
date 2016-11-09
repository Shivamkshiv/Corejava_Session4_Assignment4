
public class MainClass {
	
	 public static void main(String[] args) {
		
		 Manager mn = new Manager("Shivam",21,50000.00,20000.00,true);
		 
		 
		 
		 System.out.println("Employee Manager - Details");
		 System.out.println("---------------------------");
		 
		 System.out.println("");
		 
		 
		 System.out.println("Manager name is " +mn.name);
		 System.out.println("Manager id is " +mn.id);
		 System.out.println("Manager total salary is " +mn.calculateSalary());
		 
		 
		 System.out.println("");
		 System.out.println("****************************");
	}

}
