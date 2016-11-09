
public class Manager extends Employee {
	
	double projectAllowance;
	boolean projectCompletedOntime;

	public Manager(String name, int id, double basicSalary, double projectAllowance, boolean projectCompletedOntime) {
		super(name, id, basicSalary);
		this.projectAllowance = projectAllowance;
		this.projectCompletedOntime = projectCompletedOntime;
	}
	
	@Override
	public double calculateSalary() {
		
		if(projectCompletedOntime){
		return super.calculateSalary() + projectAllowance;
		
	}else{
		return super.calculateSalary();
		
	}
	
	}
}
