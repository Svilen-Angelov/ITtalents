package hw4;

import java.util.Scanner;

public class zad3 {
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		
		int[] array = new int[10];
		array[0] = n;
		array[1] = n;
		
		for(int i = 2; i < array.length; i++ ){
			
			array[i] = array[i-1] + array[i-2];
			
		}
		
		for(int i = 0; i< array.length; i++){
			System.out.print(array[i] + " ");
		}
	}
}
