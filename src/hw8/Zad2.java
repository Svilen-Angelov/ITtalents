package hw8;

import java.util.Scanner;

public class Zad2 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string:");
		String first = sc.nextLine();
		
		System.out.println("Enter the second string:");
		String second = sc.nextLine();
		
		System.out.println("It's " + isPrefix(first, second) + " that " + first + " is a prefix to " + second);
		
		if(substring(first, second) < 0){
			
			System.out.println(first + " is not a substring in " + second);
			
		}else{
			
			System.out.println(first + " starts in position : " + substring(first, second) + " in " + second);
		}
		
	

	}
	
	static boolean isPrefix(String first, String second){
		
		boolean prefix = true;
		
		if(first.length() > second.length()){
			
			prefix = false;
			return prefix;
		}
		
		for(int i = 0; i < first.length(); i++){
			if(first.charAt(i) != second.charAt(i)){
				
				prefix = false;
				return prefix;
			}
		}
		
		return prefix;

	}
	
	static int substring(String first, String second){
		
		for(int i = 0; i < second.length(); i++){
			
			String temp = "";
			int j = i;
			
			while(j < second.length()){
				
				temp += second.charAt(j);
				j++;
			}
			
			if(isPrefix(first, temp)){
				
				return i;
			}
		}
		
		return -1;
	}

}
