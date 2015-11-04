package hw4;

import java.util.Scanner;

public class zad6 {
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first array's length:");
		int n = sc.nextInt();
		int[] array1 = new int[n];
		
		for(int i = 0; i < array1.length; i++){
			
			System.out.println("Enter a number:");
			array1[i] = sc.nextInt();
		}
		
		System.out.println("Enter second array's length:");
		int m = sc.nextInt();
		int[] array2 = new int[m];
		boolean EqualArray = true;
		
		for(int i=0; i < array2.length; i++){
			
			System.out.println("Enter a number:");
			array2[i] = sc.nextInt();
			
			if (n == m){ // za da ne dava greshka ako 2riq e po-golqm.
				
				if (array2[i] != array1[i]){
					
					EqualArray = false;
					break; //Ako iskame potrebitelq da napishe 2riq masiv dokrai dori ako e razlichen go mahame tova.
				}
			}
		}
		
		if (n != m){
			System.out.println("The arrays have different length and are different.");
		}else{
			System.out.println("The arrays have equal length and it's " + EqualArray + " that they are equal.");
			
		}
	}
}
