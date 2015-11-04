package hw3;

import java.util.Scanner;

public class zad6 {
	
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
		
		for(int i = n ; i <= m; i++){
			System.out.print(i + " ");
		}
	
	
	}
}
