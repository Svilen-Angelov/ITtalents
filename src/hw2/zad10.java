package hw2;

import java.util.Scanner;

public class zad10 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n;
		do{
			System.out.println("Enter the number n:");
			n = sc.nextInt();
			
		}while (n <= 1);
		// tozi purvi "if" e zashtoto "for" blocka mi ne raboti za 2 i 3.
		
		if(n == 2 || n ==3){
			System.out.println("The number is a prime.");
			
		}else{
			    for(int i = 2; i <= n/2; i++){ // n/2 spestqva izlishni proverki.
			    	
			    	if (n % i == 0){
			    		System.out.println("The number is not a prime.");
			    		break;
					}
			    	if (i == n/2){
			    		System.out.println("The number is prime.");
			    		}
			}
		}
	}
}
