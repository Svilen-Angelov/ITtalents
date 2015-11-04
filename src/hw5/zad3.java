package hw5;

public class zad3 {
	
	public static void main(String[] args){
		
		int[] arr = {1,0,-6,7,-231,40,-12};
		
		int[] arrReverse = new int[arr.length];
		
		for(int i = 0; i<arrReverse.length; i++){
			
			arrReverse[i] = arr[i] * -1;
			
			System.out.printf("%d ", arrReverse[i]);
		}
	}

}
