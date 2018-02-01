
public class lessCount {
	
	/**
	 * Returns the number of elements in the heap that are less than target
	 * 
	 * @param pq
	 *            is a minheap containing heap.length-1 elements in indices
	 *            [1,heap.length-1]
	 */
	public static int lessCount(int[] pq, int target) {
		return lessCount(pq, 1, target);
	}

	/**
	 * Helper method that returns # elements in subheap rooted/starting at index
	 * that are less than target
	 * 
	 * @param heap
	 *            is a minheap containing heap.length-1 elements in indices
	 *            [1,heap.length-1]
	 * @param index
	 *            is in the range [1,heap.length-1]
	 */
	public static int lessCount(int[] heap, int index, int target) {
		// TODO Complete in discussion
		if(heap[1]>=target) return 0;
		return indicator(heap, index, target)+lessCount(heap, 2*index, target)+lessCount(heap, 2*index+1, target);
	}
	
	public static int indicator(int[] heap, int index, int target) {
		if(heap[index]<target)
			return 1;
		return 0;
	}
}
