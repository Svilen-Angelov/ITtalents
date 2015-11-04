package hw3;

import java.util.Scanner;

public class zad10 {
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int count = 0;
		int current;
		
		do{
			System.out.println("Enter a number:");
			current = sc.nextInt();
			
			if (current < 0){
				count++;
			}
		}while(current != 0);
		
		System.out.println("There were " + count + " negatives.");
	}

}
