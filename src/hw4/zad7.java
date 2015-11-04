package hw4;

import java.util.Scanner;

public class zad7 {
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length:");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		
		for(int i = 0; i < array.length; i++){
			System.out.println("Enter a number:");
			array[i] = sc.nextInt();
		}
		
		int[] array2 = new int[n];
		array2[0] = array[1];
		array2[n-1] = array[n-2];
		
		for(int i = 1; i < array2.length - 1; i++){
			array2[i] = array[i - 1] + array[i + 1];
		}
		
		for(int i = 0; i < array2.length; i++){
			System.out.print(array2[i] + " ");
		}
	}
}
