package exeptions;

public class Person {
	
	private String name;
	
	public boolean hasTheSameNameAs(Person person) {
		return name.equalsIgnoreCase(person.name);
	}

}
