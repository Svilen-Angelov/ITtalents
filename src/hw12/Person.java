package hw12;

public class Person {
	
	private String name;
	private int age;
	private boolean isMale;
	

	Person(String name, int age, boolean isMale){
		
		this.name = name;
		this.age = age;
		this.isMale = isMale;
	}
	
	public void showPersonInfo(){
		
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Sex : " + getSex());
		
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public boolean getIsMale(){
		return isMale;
	}
	
	public String getSex(){
		
		if(isMale == true){
			return "Male";
		}else if(isMale == false){
			return "Female";
		}else{
			return "Unspecified";
		}
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void setIsMale(boolean isMale){
		this.isMale = isMale;
	}

}
