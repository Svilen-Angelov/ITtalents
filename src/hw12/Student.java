package hw12;

public class Student extends Person {
	
	private double score;
	
	/* Ne e vuzmojno da se suzdade konstruktor bez parametri v student zashtoto konstruktorite v subclassovete
	 * vinagi trqbva da nasledqvat konsruktor ot super klasa(ako nqma takuv se nasledqva defaultniq). 
	 * Tova moje da se opravi ili kato se suzdade konstruktor bez paramtri v Person 
	 * ili ako v Person nqma nikakvi konstruktori.
	*/

	Student(String name,int age, boolean isMale, double score){
		
		super(name, age, isMale);
		this.score = score;	
	}
	
	public void showStudentInfo(){
		
		super.showPersonInfo();
		
		System.out.println("Score : " + score);	
	}
	
	public double getScore(){	
		return score;
	}
	
	public void setScore(double score){
		this.score = score;
	}

}
