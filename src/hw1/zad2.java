package hw1;

import java.util.Scanner;

public class zad2 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the integer A:");
		int a = sc.nextInt();
		System.out.println("Enter the integer B:");
		int b = sc.nextInt();
		
		int sum = a+b;
		int diff = a-b;
		int prod = a*b;
		int div = a/b;
		int rest = a%b;
		
		System.out.println("Suma: " + sum);
		System.out.println("Razlika: " + diff);
		System.out.println("Proizvedenie: " + prod);
		System.out.println("Celochisleno delenie: " + div);
		System.out.println("Ostatuk: " + rest);
		
		// Sega s double
		
		System.out.println("Enter the double X:");
		double x = sc.nextDouble();
		System.out.println("Enter the double Y:");
		double y = sc.nextDouble();
		
		double sum2 = x+y;
		double diff2 = x-y;
		double prod2 = x*y;
		double div2 = x/y;
		double rest2 = x%y;
		
		System.out.println("Suma: " + sum2);
		System.out.println("Razlika: " + diff2);
		System.out.println("Proizvedenie: " + prod2);
		System.out.println("Celochisleno delenie: " + div2);
		System.out.println("Ostatuk: " + rest2);
	}

}
