package hw5;

public class zad5 {
	 
	public static void main(String[] args){
		
		int[][] matrix = new int[][] {{1,4,7,3} , {3,8,2,1} ,
				{9,-1,-5,-4} , {3,3,6,5} , {3,2,7,1}};
		
//		 Ot uslovieto bqh razbral che tursim 2riq nai-golqm element ot vseki red...
//		
//		for(int i = 0; i < matrix.length; i++){
//			
//			int row = i;
//			int secondToMax = Integer.MIN_VALUE;
//			int max = matrix[i][0];
//			for(int j = 1; j < matrix[0].length; j++){
//				if (matrix[i][j] > max){
//					secondToMax = max;
//					max = matrix[i][j];	
//				}else{
//					if (matrix[i][j] > secondToMax){
//						secondToMax = matrix[i][j];
//					}
//				}
//			}
//			System.out.println("Row " + row + " : " + secondToMax);
//		}
		
		int bestOfWorst = Integer.MIN_VALUE;
		
		for (int i = 0; i < matrix.length; i++){
			
			int min = Integer.MAX_VALUE;
			
			for(int j = 0; j < matrix[0].length; j++){
				
				if(matrix[i][j] < min){
					min = matrix[i][j];
				}
			}
			
			if(bestOfWorst < min){
				bestOfWorst = min;
			}
		}
		
		System.out.println("The biggest of the smallest elements from each row is : " + bestOfWorst);
	}

}
