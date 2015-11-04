package hw12;

public class InheritanceTest {

	public static void main(String[] args) {
		
		Person[] array = new Person[10];
		
		array[0] = new Person("Joan", 24, false);
		array[1] = new Person("Jim", 28, true);
		array[2] = new Student("Jane" , 18, false , 5.5);
		array[3] = new Student("Jacob", 15, true, 3.0);
		array[4] = new Employee("Jeremy", 17, true, 11.5);
		array[5] = new Employee("Jennifer", 28, false, 14.4);
		
		for(int i = 0; i < array.length; i++){
			
			if(array[i] instanceof Employee){	
				
				((Employee)array[i]).showEmployeeInfo();
				// Tova spored men shte raboti i bez da castvam kum Employee zashtoto nishto osven Employee
				// ne moje da vleze v tozi if , no compilatora davashe greshka i ne iskashe da runne programata.
				// Ima li po-dobro reshenie na problema ?
			}else if(array[i] instanceof Student){
				
				((Student)array[i]).showStudentInfo();
				
			}else if(array[i] instanceof Person){
				
				array[i].showPersonInfo();
				
			}else{
				continue;
			}
		}
		
		for(int i =0; i < array.length; i++){
			
			if(array[i] instanceof Employee){
				System.out.println("This worker is owed " + ((Employee)array[i]).calculateOvertime(2) + " dollars for 2 hours overtime.");
			}
		}

	}

}
