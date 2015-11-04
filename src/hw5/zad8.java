package hw5;

public class zad8 {
	
	public static void main(String[] args){
		
		int[][] matrix = new int[][] {{1,4,7},{2,5,8},{3,6,9}};
		//raboti i za nekvadratni matrici.
		
		boolean isSorted = true;
		
		//proverqva po redove.
		for(int i = 0; i < matrix.length; i++){ 
			for(int j=0; j < matrix[0].length - 1; j++ ){
				
				if(matrix[i][j] > matrix[i][j+1]){
					
					isSorted = false;
					break;
				}
			}
		}
		
		//proverqva po koloni.
		for(int i=0; i < matrix[0].length; i++){
			for(int j=0; j < matrix.length - 1; j++){
				
				if (matrix[j][i] > matrix[j+1][i]){
					
					isSorted = false;
					break;
				}
			}
		}
		
		System.out.printf("Is the matrix sorted : %s%n", isSorted);
	}

}
