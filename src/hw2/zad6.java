package hw2;

import java.util.Scanner;

public class zad6 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n;
		int sum = 0;
		do{
			System.out.println("Enter a positive number:");
			n = sc.nextInt();
		}while(n <= 0);
		
		for (int i = 1; i <= n; i++){
			sum += i;
		}
		
		System.out.println("The result is: " + sum);
		
		
		
	}

}
