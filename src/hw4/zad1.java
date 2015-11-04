package hw4;

import java.util.Scanner;

public class zad1 {
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length:");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		int min = 0;
		
		for(int i =0; i < array.length; i++){
			
			System.out.println("Enter a number:");
			array[i] = sc.nextInt();
			
			if(min == 0 && array[i] != 0 && array[i] % 3 == 0){ //tuk tursi 1voto takova chislo.
				
				min = array[i];
				
			}else if( min > array[i] && array[i] % 3 == 0 && array[i] > 0){
				// vuv primera vi -417 e nai-malkoto delimo na 3 no vie ste izveli 12 zatova dobavqm > 0.
				
				min = array[i];
			}
			
		}
		System.out.println("The smallest divider of 3 is :" + min);
		
	}
}