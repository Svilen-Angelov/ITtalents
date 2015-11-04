package hw9;

public class CombSort2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	      
		int[] array = {2,1,4,3,-4,-7,-13,0,0,55,44,-356,-6,90,76,-300,256};
		
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
		combSort2(a);
	}
	
static void combSort2(int[] a) {
		
		final int n = a.length;
		int gap = a.length;
		
		while (gap >= 1) {
			
			for(int i=0; i < n - 1; i++) {
				
				boolean sorted = true;
				
				for(int j=i; j < n - gap -1; j = j + gap) {
					
					if (a[j] > a[j+gap]) {
						
						sorted = false;
						
						int temp = a[j];
						a[j] = a[j+gap];
						a[j+gap] = temp;
					}
				}
				
				if (sorted && gap == 1) {
					break;
				}
			}
			
			gap = (int) (gap/1.3); 
		}				
	}
}
