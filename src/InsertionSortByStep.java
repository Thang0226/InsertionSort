public class InsertionSortByStep {
	static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			System.out.println(i + "th sort:");
			int pos = i;
			int temp = arr[i];
			while (pos > 0 && temp < arr[pos - 1]) {
				System.out.println(" Copy " + arr[pos - 1] + " to " + arr[pos]);
				arr[pos] = arr[pos - 1];
				pos--;
			}
			System.out.println(" Replace " + arr[pos] + " by " + temp);
			arr[pos] = temp;

			System.out.println("\tList after " + i + "th sort:");
			for (int number : arr) {
				System.out.print("\t" + number);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.println("List elements:");
		for (int number : list) {
			System.out.print(" " + number);
		}
		System.out.println();

		insertionSort(list);
		System.out.println("\nSorted list:");
		for (int number : list) {
			System.out.print(" " + number);
		}
	}
}
