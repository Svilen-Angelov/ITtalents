package hw6;

import java.util.Scanner;

public class matrix3 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n:");
		int n = sc.nextInt();
		System.out.println("Enter m:");
		int m = sc.nextInt();
		
		int[][] matrix = new int [n][m];
		int number = 0;
		
		// uspqh da go napravq samo za kvadratni matrici.
        if(n < m){
	
        }else if(n == m){
        	
        	for (int i = 0; i < matrix.length*2; i++){
        		
        		int diag = i;
        		int j = 0;
        		
        		while(diag >= 0){
        			
        			if(diag < matrix.length && j < matrix.length){
        				
        			number += 1;
        			matrix[diag][j] = number;
        			
        			}
        			
        			diag--;
        			j++; 			
        		}
        	}
        	
        }else{
        	
        }
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}		
	}
}
