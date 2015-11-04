package hw10;

public class BuildHeap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/* buildHeap raboti za O(N) zashtoto ima cikul koito minava prez vsichki stoinosti, 
		 * a siftDown raboti s O(log N) zashtoto preskacha mnogo stoinosti i taka kato cqlo
		 * programata raboti s O(N.longN) koeto mai ne se broi za lineino vreme ...
		*/	
		int[] array = {1,5,3,0,44,23,43,21,19,4,16,17,47,12,2,9,56,100,34,23,45,7,8,12};
		
		System.out.print("The array : ");
		printArray(array);
		
		buildHeap(array);
		
		System.out.println();
		System.out.print("The Heap : ");
		printArray(array);
		

	}
	
	static void buildHeap(int[] a){
				
		for(int i = a.length-1; i > 0; i--){
			
			int k = i;

			while(k > 0){
				
				int p = (k-1)/2; // formula za mqstoto na parent-a.
				
				if(a[k] > a[p]){
				
					int temp = a[p];
					a[p] = a[k];
					a[k] = temp;
					
					siftDown(a,k);
					
					k=p;
					
				}else{
					break;
				}
			}
		}
	}
		
	
	static void siftDown(int[] a, int k){
		
		while (k < (a.length-1)/2){
			
			int z1 = k*2 + 1; // za mqstoto na 2te deca.
			int z2 = k*2 + 2;
			if(a[k] < a[z1]){
				
				int temp = a[k];
				a[k] = a[z1];
				a[z1] = temp;
				
				k=z1;
				
			}else if(a[k] < a[z2]){
				
				int temp = a[k];
				a[k] = a[z2];
				a[z2] = temp;
				
				k=z2;
				
			}else{
				break;
			}
		}
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

}
