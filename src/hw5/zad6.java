package hw5;

import java.util.Arrays;
import java.util.Scanner;

public class zad6 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter n :\n");
		int n = sc.nextInt();
		
		int[][] matrix = new int[n][n];
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				
				System.out.printf("Enter an element:\n");
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter a and b:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a > b){
			int temp = b;
			b = a;
			a = temp;
		}
		
		for(int i=0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				
				if (matrix[i][j] > a && matrix[i][j] < b){
					matrix[i][j] = 0;
				}
			}
		}
		
		System.out.println(Arrays.deepToString(matrix));
//		for (int i = 0; i < matrix.length; i++){
//			for(int j = 0; j < matrix[0].length; j++){
//			
//			System.out.printf("%d ", matrix[i][j]);
//			}
//		System.out.println("");
//		}
  }
}
