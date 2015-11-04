package hw1;

import java.util.Scanner;

public class zad5 {
	
	public static void main(String[] args){
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		int b = 0;
		int c = 0;
		
		do{
			System.out.println("Enter a different number:");
			b = sc.nextInt();
		}while (a == b);
		
		do{
			System.out.println("Enter a third different number:");
			c = sc.nextInt();
		}while (a == c || b == c);
		
		if (a<b){
			if (b<c){
				System.out.println(c +" "+ b +" "+a);
			}else if (c>a){
				System.out.println(b +" "+ c +" " +a);
			}else{
				System.out.println(b +" "+ a +" "+ c);
			}
		}
		if (a>b){
			if (c>a){
				System.out.println(c +" "+ a +" "+ b);
			}else if (c>b){
				System.out.println(a +" "+ c +" "+ b);
			}else{
				System.out.println(a +" "+ b +" " +c);
			}
		}

  }
}
