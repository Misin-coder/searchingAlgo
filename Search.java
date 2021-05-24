package searching;

public class Search {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 5, 7, 8, 10 };
		System.out.println(binarySearch(array, 100 ));

	}

	public static int linearSearch(int[] array, int target) {

		int length = array.length;

		for (int i = 0; i < length; i++) {
			if (target == array[i]) {
				return i;
			}
		}

		return -1;

		// time complexity is O(n), space is O(1)
	}

	// recursive way
	public static int binarySearch(int start, int end, int[] array, int target) {

		if (start <= end) {
			int midIndex = start + ( end - start) / 2;

			if (target == array[midIndex]) {
				return midIndex;
			} else if (target > array[midIndex]) {
				return binarySearch(midIndex + 1, end, array, target);
			} else {
				return binarySearch(start, midIndex - 1, array, target);
			}
		}
		return -1;

		// time O(logn) , space  O(1)
	}
	
	// iterative way
	
	public static int binarySearch(int[] array, int target) {
		
		int start = 0;
		int end = array.length - 1;
		
		while (start <= end) {
			int midIndex = start + ( end - start) / 2;
			if (target == array[midIndex]) {
				return midIndex;
			} else if (target > array[midIndex]) {
				start = midIndex + 1;
			} else {
				end = midIndex - 1;
			}			
		}
		return -1;
		
		// time (log n) ,  space  O(1) 
		
	}

}
