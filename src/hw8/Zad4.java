package hw8;

import java.util.Scanner;

public class Zad4 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 0;

		
		do{
			System.out.println("Enter a digit :");
			n = sc.nextInt();
		}while (n < 0 || n > 9);
		
		System.out.println("Enter the number :");
		int m = sc.nextInt();
		
		System.out.println("The number of times "+n+" is found in "+m+" is : "+countOf(n,m,0));
		


	}
	
	static int countOf(int digit, int number, int count){
		
		if(number == 0){
			
			return count;
		
		}else if(number % 10 == digit){
			
			count++;
			return countOf(digit, number / 10, count);
			
		}else{
			
			return countOf(digit, number / 10, count);
		}
	}
	

}
