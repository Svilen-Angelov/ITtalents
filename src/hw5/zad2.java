package hw5;

import java.util.Scanner;

public class zad2 {
	
public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length:");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		int zeroesCount = 0;
		
		for(int i = 0; i < array.length; i++){
			System.out.println("Enter a number :");
			array[i] = sc.nextInt();
			
			if(array[i] == 0){
				
				zeroesCount++;
			}
		}
		System.out.printf("There are %d zeroes\n", zeroesCount);
		
		
	}


}
