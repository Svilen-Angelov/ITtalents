package hw1;

import java.util.Scanner;

public class zad4 {
	
	public static void main(String[] args){
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		int b = 0;
		
		do{
			System.out.println("Enter a different number:");
			b = sc.nextInt();
		}while (a == b);
		
		if(a > b){
			System.out.println(b + " " + a);
		}else {
			System.out.println(a + " " + b);
		}
		
	}

}
