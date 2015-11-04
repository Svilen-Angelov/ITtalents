package hw1;

import java.util.Scanner;

public class zad6 {
	
	public static void main(String[] args){
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a1:");
		int a1 = sc.nextInt();
		int a2 = 0;
		int a3 = 0;
		
		do{
			System.out.println("Enter a2:");
			a2 = sc.nextInt();
		}while (a1 == a2);
		
		do{
			System.out.println("Enter a3:");
			a3 = sc.nextInt();
		}while (a1 == a3 || a2 == a3);
		
		int temp = 0;
		temp=a1;
		a1=a2;
		a2=a3;
		a3=temp;
		
		System.out.println(" a1: "+a1+" a2: "+a2+" a3: "+a3);
  }
}