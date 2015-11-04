package hw8;

import java.util.Scanner;

public class Zad1 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length :");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		
		for(int i = 0; i < array.length; i++){
			System.out.println("Enter array[" + i + "] :");
			array[i] = sc.nextInt();
		}
		
		System.out.println("It's " + allUnique(array) + " that all array elements are unique.");
		

	}
	
	static boolean allUnique(int[] array){
		
		boolean unique = true;
		
		for(int i = 0; i < array.length -1; i++){
			for(int j = i+1; j < array.length; j++){
				
				if(array[i] ==  array[j]){
					
					unique = false;
					return unique;
				}
			}
		}
		return unique;
	}

}
