package Array;

//Java code to find
//duplicates in O(n) time
//Testing

class FindDuplicate {
	// Function to print duplicates
	void printRepeating(int arr[], int size) {
		int i;
		System.out.println("The repeating elements are : ");

		for (i = 0; i < size; i++) {
			int j = Math.abs(arr[i]);
			if (arr[j] >= 0)
				arr[j] = -arr[j];
			else
				System.out.print(j + " ");
		}
	}

	// Driver code
	public static void main(String[] args) {
		FindDuplicate duplicate = new FindDuplicate();
		int arr[] = { 1, 2, 3, 1, 3, 6, 6 };
		int arr_size = arr.length;

		duplicate.printRepeating(arr, arr_size);
	}
}

// This code has been contributed by Mayank Jaiswal
