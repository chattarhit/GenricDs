package sampleproject.ArraySort;

public class ProgramLauncher {
	public static void main(String[] args) {

		QuickSort<String> quickSort = new QuickSort<String>();
		String[] arr = { "i", "h", "a" };
		int n = arr.length;
		quickSort.quickSort(arr, 0, n - 1);
		System.out.println("Sorted array: ");
		quickSort.printArray(arr, n);
	}
}
