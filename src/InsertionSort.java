public class InsertionSort {
	static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int pos = i;
			int temp = arr[i];
			while (pos > 0 && temp < arr[pos - 1]) {
				arr[pos] = arr[pos-1];
				pos--;
			}
			arr[pos] = temp;
		}
	}

	public static void main(String[] args) {
		insertionSort(list);
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}
}
