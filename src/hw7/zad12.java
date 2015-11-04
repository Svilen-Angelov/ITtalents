package hw7;

import java.util.Scanner;

public class zad12 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String word = "transatlantic";
		
		char[] unknown = new char[word.length()];
		
		for(int i=0; i < word.length(); i++){
			unknown[i] = '_';
			System.out.print(unknown[i] + " ");
		}
		
		int errors = 7;
		
		do{
			System.out.println("Enter a letter :");
			String letter = sc.next();
			                                    // dali e poznata bukvata.
			boolean correctLetter = false;
			
			for(int i = 0; i < word.length(); i++){
				if(letter.charAt(0) == word.charAt(i)){
					
					unknown[i] = letter.charAt(0);
					correctLetter = true;
				}		
			}
			                                   // dali e poznata cqlata duma.
			boolean isGuessed = true;
			
			for(int i = 0; i < unknown.length; i++){
				
				if(unknown[i] == '_'){
					
					for(int j = 0; j < unknown.length; j++){
						System.out.print(unknown[j] + " ");
					}
					System.out.println("");
					
					isGuessed = false;
					break;
				}
			}
			if(isGuessed == true){
				System.out.println("You win! The word was : " + word + ".");
				break;
			}
			
			if(correctLetter == false){	
				errors--;
				if(errors == 0){
					break;
				}
				
				System.out.println("No, no, no there is no \"" + letter.charAt(0) + "\" here. >:-)");
				System.out.println("You have " + errors + " tries left.");
			}
					
		}while(errors > 0);
		
		if(errors == 0){
			System.out.println("You lost! Better luck next time.");
			System.out.println("Ooh and by the way the correct word was " + word+".");
		}
	}

}
