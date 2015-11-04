package hw4;

import java.util.Scanner;

public class zad4 {
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length:");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		
		for (int i = 0; i< array.length; i++){
			
			System.out.println("Enter a number:");
			array[i]= sc.nextInt();
			
		}
		
		boolean isMirrored = true;
		int i = 0;
		while(i < array.length/2){
			if (array[i] != array[array.length - 1 -i]){
				isMirrored = false;
				break;
			}
			i++;
		}
		System.out.println("Is the array mirrored: " + isMirrored);
	}
}
