package hw6;

import java.util.Scanner;

public class matrix4 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n:");
		int n = sc.nextInt();
		System.out.println("Enter m:");
		int m = sc.nextInt();
		
		int[][] matrix = new int [n][m];
		int number = 0;
		
		for(int i = 0; i < matrix[0].length; i++){
			
			if(i % 2 == 0){ // po tezi redove varvi normalno
				for(int j = 0; j < matrix.length; j++){
					
					number += 1;
					matrix[j][i] = number;
				}	
			}else{ // po tezi se obrushta
				for(int j = matrix.length - 1; j>= 0; j-- ){
					
					number += 1;
					matrix[j][i] = number;
				}
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
