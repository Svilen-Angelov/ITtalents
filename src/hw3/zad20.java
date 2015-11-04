package hw3;

import java.util.Scanner;

public class zad20 {
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N:");
		int n = sc.nextInt();
		int count = 0;
		
		if(n < 103){
			System.out.println("There are " + count + " matches.");
		}else{
			
			for(int i = 102; i < n; i++){
				
				if(i > 999){ // Ako za n e vuvedeno 4tiricifreno chislo
					break;
				}
				
				int first = i / 100;
				int second = (i / 10) % 10;
				int third = i % 10;
				
				if ((first != second) && (first != third) && (second != third)){
					
					count++;
				}
			}
			System.out.println("There are " + count + " matches.");
		}
	}
}
