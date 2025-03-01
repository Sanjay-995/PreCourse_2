package com.precourse2;

public class BinarySearchUsingRecursion {
	// Returns index of x if it is present in arr[l.. r], else return -1
	int binarySearch(int arr[], int l, int r, int x) {
		// Write your code here
		if(l<=r) {
			int mid = (l+r)/2;
			//System.out.println(mid + "q");
			if(arr[mid]==x) {
				return mid;
			}
			else if (arr[mid]>x) {
				return binarySearch(arr, l, mid-1, x);
			}
			else {
				return binarySearch(arr, mid+1, r, x);
			}			
		}
		return -1;
	}

	// Driver method to test above
	public static void main(String args[]) {
		BinarySearchUsingRecursion ob = new BinarySearchUsingRecursion();
		int arr[] = {2, 3, 4, 10, 40 };
		int n = arr.length;
		System.out.println(n);
		int x = 10;
		int result = ob.binarySearch(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}
}
