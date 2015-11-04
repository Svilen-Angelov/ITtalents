package hw5;

import java.util.Arrays;

public class zad7 {
	
	public static void main(String[] args){
		
		double[][] matrix = {{45.4,-30,-17.3},
				{32.9,-98,54.7},
				{-40,-50,-33.3},
				{12.7,24,45}};
		
		int maxPos = 0;
		int row = 0;
		
		for(int i = 0; i < matrix.length; i++){
			
			int posCount = 0;
			
			for(int j = 0; j< matrix[0].length; j++){
				
				if(matrix[i][j] >= 0){
					
					posCount++;		
				}
			}
			if (posCount > maxPos){
				
				maxPos = posCount;
				row = i;
			}
		}
		
		if(row == 0){
			System.out.println(Arrays.deepToString(matrix));
		}else{
			for(int j = 0; j < matrix[0].length; j++){
				
				matrix[row][j] = matrix[0][j];
			}
			System.out.println(Arrays.deepToString(matrix));
		}
		
	}

}
