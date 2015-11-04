package hw3;

import java.util.Scanner;

public class zad13 {
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int num;
		int maxNeg = 0;
		
		do{
			System.out.println("Enter a number:");
			num = sc.nextInt();
			
			if (maxNeg == 0 && num < 0){ // Tova e za purvoto otricatelno.
				maxNeg = num;
			}
			
			if(num > maxNeg && num < 0){ // Tova e za ostanalite.
				maxNeg = num;
			}
			
			System.out.println("The bigget negative number is:" + maxNeg);
			
		}while (num != -1);
		
	}
}
