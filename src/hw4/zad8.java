package hw4;

import java.util.Scanner;

public class zad8 {
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array length: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		
		for(int i =0; i< array.length; i++){
			
			System.out.println("Enter a number:");
			array[i] = sc.nextInt();
		}
		
		int maxLength = 1; //kolko e dulga nai-dulgata redica.
		int maxLast = 0; // koi i e posledniq element.

		
		for(int i = 0; i < array.length - 1; i++){
			
			int temp = 1;
			
			for (int j = i+1; j < array.length; j++){
				
				if (array[i] != array[j]){
					break;
				}
				
				temp++;
				
				if(maxLength < temp){
					
					maxLength = temp;
					maxLast = j;
				}
			}
		}

		while (maxLength > 0){
			System.out.print(array[maxLast] + " ");
			
			maxLength--;
			maxLast--;
			
		}
		

	}
}
