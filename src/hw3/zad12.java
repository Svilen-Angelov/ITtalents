package hw3;

import java.util.Scanner;

public class zad12 {
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int first;
		int second;
		int third;
		int sum = 0;
		
		do{
			System.out.println("Enter three players results:");
			first = sc.nextInt();
			second = sc.nextInt();
			third = sc.nextInt();
			
			sum = first + second + third;
			
			if (sum % 3 == 0 && sum != 0){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}while ( first != 0 && second != 0 && third != 0);
		
	}

}
