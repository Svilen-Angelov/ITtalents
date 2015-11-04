package mergeAndHeap;

public class MergeSort {

	public static void main(String[] args) {
		int[] a = {1, -5, 7, 0, 14, 0, 2};
		
		sort(a);
		
		printArray(a);
	}
	
	static void sort(int[] a) {
		mergeSort(a, 0, a.length - 1);
	}
	
	static void mergeSort(int[] a, int from, int to) {
		
		if (from >= to) {
			return;
		}
		
		int middle = (from + to) / 2;
		
		mergeSort(a, from, middle);
		mergeSort(a, middle + 1, to);
		
		merge(a, from, middle, to);
	}
	
	static void merge(int[] a, int from, int middle, int to) {
		int[] merged = new int[to - from + 1];
		
		int firstIndex = from;
		int secondIndex = middle + 1;
		
		int next = 0;
		
		while(firstIndex <= middle && secondIndex <= to) {
			if (a[firstIndex] <= a[secondIndex]) {
				merged[next] = a[firstIndex];
				++firstIndex;
			} else {
				merged[next] = a[secondIndex];
				++secondIndex;
			}
			
			++next;
		}
		
		while (firstIndex <= middle) {
			merged[next] = a[firstIndex];
			++firstIndex;
			++next;
		}
		
		while (secondIndex <= to) {
			merged[next] = a[secondIndex];
			++secondIndex;
			++next;
		}
		
		for(int i=0; i < merged.length; ++i) {
			a[from + i] = merged[i];
		}
	}
	
	static void printArray(int[] a) {
		System.out.print("[");
		for(int i=0; i < a.length; ++i) {
			System.out.print(a[i]);
			
			if (i < a.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
	}
}
