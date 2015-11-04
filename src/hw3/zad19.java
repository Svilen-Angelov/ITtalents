package hw3;

import java.util.Scanner;

public class zad19 {
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		do{
			System.out.println("Enter N:");
			n = sc.nextInt();
		}while (n <= 0 || n > 27);
		
		for (int i = 100; i < 1000; i++){
			
			int sum = 0;
			
			sum += i % 10;
			sum += (i / 10) % 10;
			sum += i / 100;
			
			if( sum > n){
				System.out.print(i + " ");
			}
			
		}
		
	}
}
