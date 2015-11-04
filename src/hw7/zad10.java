package hw7;

import java.util.Scanner;

public class zad10 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		do{
			System.out.println("Enter a positive number:");
			n = sc.nextInt();
		}while(n <= 0);
		
		String numbers = "";
		
		for(int i = 0; i <= n; i++){
			
			numbers += i; //+ ", " ako iskame i zapetai.
		}
		
		System.out.printf("%s", numbers);
	}

}
