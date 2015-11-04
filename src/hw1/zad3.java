package hw1;

import java.util.Scanner;

public class zad3 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		int a = sc.nextInt();
		
		System.out.println("Enter the second number:");
		int b = sc.nextInt();
		
		int c;
		c = a;
		a = b;
		b = c;
		
		System.out.println("The first number is now: " +a);
		System.out.println("The second number is now: " +b);
	}

}
