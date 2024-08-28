package algorithms;

public class qucksort {
	public static void main(String[] args) {
		int[] arr = { 9, -1, 2, -6, 11, 13, 3, 14 };
		System.out.println("Arrya Before Sort");
		for (int i : arr) {
			System.out.print(i + ",");
		}
		System.out.println();
		int[] sorted_array = sort(arr, 0, arr.length - 1);

		System.out.println("Arrya After Sort");
		for (int i : arr) {
			System.out.print(i + ",");
		}
	}

	private static int[] sort(int[] arr, int low, int high) {

		if (low < high) {
			int p = partition(arr, low, high);
			System.out.println("Pivot index Is :" + p);
			// Sort Left Side pivot elements
			sort(arr, low, p - 1);
			// Sort Right Side pivot elements
			sort(arr, p + 1, high);
		}

		return arr;
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int j = low;
		int i = low;

		while (i <= high) {

			if (arr[i] <= pivot) {
				// Swap
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				j++;
			}
			i++;
		}

		return j - 1;
	}
}