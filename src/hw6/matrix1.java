package hw6;

import java.util.Scanner;

public class matrix1 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n:");
		int n = sc.nextInt();
		System.out.println("Enter m:");
		int m = sc.nextInt();
		
		int[][] matrix = new int [n][m];
		int number = 0;
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				
				number += 1;
				matrix[i][j] = number;
			}
		}
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}		
	}

}
