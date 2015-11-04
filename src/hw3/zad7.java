package hw3;

import java.util.Scanner;

public class zad7 {
	
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
		int sum = 0;
		int prod = 1;
		
		for(int i = n; i <= m; i++){
			sum += i;
			if (i == 0){
				continue;
			}
			prod *= i;
		}
		
		System.out.println("The sum is: " + sum);
		System.out.println("The product is: " + prod);
	}
}
