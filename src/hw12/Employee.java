package hw12;

public class Employee extends Person {
	
	private double daySalary;
	
	Employee(String name,int age, boolean isMale, double daySalary){
		
		super(name, age, isMale);
		this.daySalary = daySalary;
	}
	
	public double calculateOvertime(double hours){
		
		if(super.getAge() < 18){
			return 0;
		}else{
			return hours*daySalary*1.5;
		}
	}
	
	public void showEmployeeInfo(){
		
		super.showPersonInfo();
		System.out.println("Day Salary : " + daySalary);
	}
	
	public double getDaySalary(){
		return daySalary;
	}
	
	public void setDaySalary(double daySalary){
		this.daySalary = daySalary;
	}

}
