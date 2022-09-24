package sampleproject.ArraySort;

public class QuickSort<T extends Comparable<? super T>> {
	public void quickSort(T[] array, int startIndex, int endIndex) {
		if (startIndex < endIndex) {
			int pivot = partition(array, startIndex, endIndex);
			quickSort(array, startIndex, pivot - 1);
			quickSort(array, pivot + 1, endIndex);
		}
	}

	/**
	 * Partiton the array
	 * @param array the array which use for quick sort
	 * @param startIndex
	 * @param endIndex
	 * @returns after incrementing value
	 */
	private int partition(T[] array, int startIndex, int endIndex) {
		T pivot = array[startIndex];
		int leftIndex = startIndex - 1;
		for (int rightIndex = startIndex; rightIndex <= endIndex - 1; rightIndex++) {
			if (array[rightIndex].compareTo(pivot) <= 0) {
				leftIndex++;
				swap(array, leftIndex, rightIndex);
			}
		}

		return (leftIndex + 1);
	}

	private void swap(T[] array, int leftIndex, int rightIndex) {
		T temp = array[leftIndex];
		array[leftIndex] = array[rightIndex];
		array[rightIndex] = temp;
	}
	public void printArray(T[] arr, int size)
	{
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

}
