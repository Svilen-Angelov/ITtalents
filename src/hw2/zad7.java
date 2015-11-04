package hw2;

import java.util.Scanner;

public class zad7 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n:");
		int n = sc.nextInt();
		int m = 0;
		
		for(int i = 1; i <= n; i++){
			m += 3;
			System.out.print(m);
			if(i == n){
				break;
			}
			System.out.print(",");
			
			
		}
		
	}
}
