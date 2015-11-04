package hw9;

public class CombSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	      
		int[] array = {1,3,-7,-30,50,4,-40,-3,3,100,75,-24,0,-1,-1,1,33,25,-4};
		
		System.out.print("Unsorted : ");
		printArray(array);
		
		sort(array);
		
		System.out.println();
		System.out.print("Sorted : ");
		printArray(array);

	}
	
	static void printArray(int[] a){
		System.out.print("[");
		
		for(int i = 0; i < a.length; i++){
			
			System.out.print(a[i]);
			
			if(i < a.length - 1){
				System.out.print(", ");
			}
		}
		System.out.print("]");
	}
	
	static void sort(int[] a){
		combSort(a);
	}
	
	static void combSort(int[] a){
				
			int gap = a.length;
			boolean sorted = false;
		
		while(sorted = false || gap > 1){
			
			sorted = true;
			
			if(gap > 1){
				gap = (int) (gap/1.3);
			}

		
			for(int i=0; i + gap < a.length; i++){
				
				if(a[i] > a[i+gap]){
					
					sorted = false;
					
					int temp = a[i];
					a[i] = a[i + gap];
					a[i + gap] = temp;
				}
			}		
		}
	}
}
