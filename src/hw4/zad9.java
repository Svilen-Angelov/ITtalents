package hw4;

import java.util.Scanner;

public class zad9 {
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length:");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		
		for(int i =0; i < array.length; i++){
			
			System.out.println("Enter a number:");
			array[i] = sc.nextInt();			
		}
	//  Reshenieto s pomoshten masiv :
		
	//	int[] array2 = new int[n];
		
	//	for(int i =0; i < array2.length; i++){
			
	//		array2[i] = array[array.length - 1 - i];
	//	}
		
		for(int i = 0; i < array.length /2; i++){
			
			int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
		
		for(int i =0; i < array.length; i++){
			
			System.out.print(array[i] + " ");
		}
		
	}
}
