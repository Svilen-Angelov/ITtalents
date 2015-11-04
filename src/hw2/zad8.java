package hw2;

import java.util.Scanner;

public class zad8 {
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n:");
		int n = sc.nextInt();
		int Nminus = n-1;
		
		for(int i = 1; i <= n; i++){
			int m = n;
			while(m > 0){
				System.out.print(Nminus);
				m--;
			}
			Nminus += 2;
			System.out.println();
			
		}
	}
}
