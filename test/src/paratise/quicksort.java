package paratise;

import java.util.Arrays;

public class quicksort {

	static void sort(int[] list, int low, int high) {
		int start = low;
		int end = high;
		int key = list[low];
		while (start < end) {
			while (start < end && list[end] >= key) 
				end--;
			if (key >= list[end]) {
				int temp = list[end];
				list[end] = list[start];
				list[start] = temp;

			}
			while (start < end && list[start] <= key)
				start++;
			
			if (list[start] >= key) {
				int temp = list[start];
				list[start] = list[end];
				list[end] = temp;

			}
		}
	
		if (start > low)
			sort(list, low, start - 1);
		if (end < high)
			sort(list, end + 1, high);

	}

	public static void main(String args[]) {
		int a[] = { 21, 11, 34, 99, 88, 77, 43 };
		int start = 0;
		int end = a.length - 1;
		sort(a, start, end);
		System.out.println(Arrays.toString(a));

	}
}
