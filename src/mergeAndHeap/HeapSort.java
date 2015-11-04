package mergeAndHeap;

public class HeapSort {

	public static void main(String[] args) {
		int[] a = {1, -5, 7, 0, 14, 0, 2222};
		
		heapSort(a);
		
		MergeSort.printArray(a);
	}
	
	static void heapSort(int[] a) {
		int[] heap = new int[a.length + 1];
		heap[0] = 0;
		
		for(int i=0; i < a.length; ++i) {
			insert(heap, a[i]);
		}
		
		int next = 0;
		while (!empty(heap)) {
			int top = peek(heap);
			removeTop(heap);
			
			a[next] = top;
			++next;
		}
	}
	
	static boolean empty(int[] heap) {
		return size(heap) <= 0;
	}
	
	static int peek(int[] heap) {
		return heap[1];
	}
	
	static void removeTop(int[] heap) {
		
		int last = size(heap);
		
		heap[1] = heap[last];
		decrementSize(heap);
		siftDown(heap);
	}
	
	static void insert(int[] heap, int x) {
		
		int insertPosition = size(heap) + 1;
		
		heap[insertPosition] = x;
		incrementSize(heap);
		bubbleUp(heap);
	}
	
	static int size(int [] heap) {
		return heap[0];
	}
	
	static void incrementSize(int[] heap) {
		++heap[0];
	}
	
	static void decrementSize(int[] heap) {
		--heap[0];
	}
	
	static void siftDown(int[] heap) {
		
		int i = 1;
		
		while (2*i <= size(heap)) {
			int leftIndex = 2*i;
			int rightIndex = 2*i + 1;
			
			int minChildIndex = leftIndex;
			int minChild = heap[minChildIndex];
			
			if (2*i + 1 <= size(heap)) {
				minChildIndex = heap[leftIndex] <= heap[rightIndex] ? 
						leftIndex : rightIndex;
				minChild = heap[minChildIndex];
			}
			
			if (minChild < heap[i]) {
				heap[minChildIndex] = heap[i];
				heap[i] = minChild;
				i = minChildIndex;
			} else {
				break;
			}
		}
	}
	
	static void bubbleUp(int[] heap) {
		int i = size(heap);
		
		while (i > 1) {
			int parentIndex = i / 2;
			
			if (heap[i] < heap[parentIndex]) {
				int temp = heap[i];
				heap[i] = heap[parentIndex];
				heap[parentIndex] = temp;
				i = parentIndex;
			} else {
				break;
			}
		}
	}
}
