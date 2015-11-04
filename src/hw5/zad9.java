package hw5;

import java.util.Scanner;

public class zad9 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a :");
		int a = sc.nextInt();
		System.out.println("Enter d :");
		int d = sc.nextInt();
		
		int[][] matrix = new int[4][4];
		
		int firstRowMul = 6; //purvo zapulvam purviq red
		
		for(int j = 0; j < matrix[0].length; j++){
			matrix[0][j] = a + (firstRowMul * d);
			firstRowMul++;
			}
		
		int lastColMul = 9; // posle posednata kolona
		
		for(int i = 0; i < matrix.length; i++){
			matrix[i][3] = a + (lastColMul * d);
			lastColMul++;
		}
		
		int lastRowMul = 15;
		
		for(int j = 0; j<matrix[0].length; j++){
			matrix[3][j] = a + (lastRowMul * d);
			lastRowMul--;
		}
		
		int thirdRowMul = 4; // 3tiq red bez polsedniq element
		
		for(int j = 0; j<matrix[0].length - 1; j++){
			matrix[2][j] = a + (thirdRowMul * d);
			thirdRowMul--;
		}
		
		matrix[1][0] = a + (5*d); // 3te elementa ot 2riq red koito nqmat nqkakva
		matrix[1][1] = a;         // zavisimost za cikul.
		matrix[1][2] = a + d;
		
		for(int i = 0; i<matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				System.out.printf("%d ", matrix[i][j]);
			}
			System.out.println("");
		}
		
		
	}
}
