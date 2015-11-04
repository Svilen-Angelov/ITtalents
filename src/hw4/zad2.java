package hw4;

import java.util.Scanner;

public class zad2 {
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		do{
			System.out.println("Enter array length divisible by 2:");
			n = sc.nextInt();
		}while(n % 2 != 0);
		
		int[] array = new int[n];
		
		for (int i = 0; i < array.length /2; i++){
			
			System.out.println("Enter a number:");
			array[i] = sc.nextInt();
			array[array.length /2 + i] = array[i];
		}
		
		for (int i =0; i<array.length; i++){
			System.out.print(array[i] + " ");
		}
	}
}
