package hw3;

import java.util.Scanner;

public class zad14 {
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of competitors.");
		int number = sc.nextInt();
		int result, bestResult = 0;
		int weight, bestWeight = 0;
		int bestNumber = 0;
		
		for(int i = 1; i <= number; i++){
			
			System.out.println("Enter this competitor's result:");
			result = sc.nextInt();
			System.out.println("Enter this competitor's weight:");
			weight = sc.nextInt();
			
			if(result > bestResult){
				bestResult = result;
				bestWeight = weight;
				bestNumber = i;
			}else if(result == bestResult){
				
				if(weight < bestWeight){
					bestWeight = weight;
					bestNumber = i;
				}
			}else{
				continue;
			}
		}
		
		System.out.println("The winner is number " + bestNumber);
	}

}
