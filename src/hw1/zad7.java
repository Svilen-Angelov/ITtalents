package hw1;

import java.util.Scanner;

public class zad7 {
	
	public static void main(String[] args){
		
		Scanner sc= new Scanner(System.in);
		
		int hour;
		do{
		System.out.println("Enter an hour:");
		hour = sc.nextInt();
		}while(hour < 0 || hour > 24);
		
		double cash;
		do{
			System.out.println("Enter amount of cash:");
			cash = sc.nextDouble();
         }while(cash < 0);
		
		System.out.println("Am i healthy?");
		boolean health = sc.nextBoolean();
		
		if (health == false){
			System.out.print("I will not go out and");
			if (cash > 0){
				System.out.println(" i will buy medicine.");
			}else{
				System.out.println(" i will drink tea.");
			}
		}else{
			if(cash < 10){
				System.out.println("I will go out for a cup of coffee.");
			}else{
				System.out.println("I will buy myself a Bentley.");
			}
			
			if(hour == 23){
				System.out.println("Programming time!");
			}
		}
		
		
	}

}
