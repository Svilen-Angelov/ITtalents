package hw2;

import java.util.Scanner;

public class zad5 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		System.out.println("Enter the first number:");
		a = sc.nextInt();
		System.out.println("Enter the second number:");
		b = sc.nextInt();
		
		if(a>b){
			while (b <= a){
				System.out.print(b + " ");
				b++;
			}
		}else if(a == b){
			System.out.println("The numbers are even.");
		}else{
			while (a <= b){
				System.out.print(a + " ");
				a++;
			}
		}
	}

}
