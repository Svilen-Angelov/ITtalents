package hw3;

import java.util.Scanner;

public class zad9 {
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n,m;
		
		do{
			System.out.println("Enter N:");
			n = sc.nextInt();
			
			System.out.println("Enter M:");
			m = sc.nextInt();
		}while (n == m);
		
		if (n > m){
			int temp = n;
			n = m;
			m = temp;
		}
		System.out.print("Divisible by 3: ");
		for(int i = n; i <= m; i++){
			if(i % 3 == 0){
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		System.out.print("Divisible by 2: ");
		for(int i = n; i <= m; i++){
			if(i % 2 == 0){
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		System.out.print("Divisible by 5: ");
		for(int i = n; i <= m; i++){
			if(i % 5 == 0){
				System.out.print(i + " ");
			}
		}
	}
}
