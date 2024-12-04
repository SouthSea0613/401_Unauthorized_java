package exam;

public class Basic {
	public static void main(String[] args) {
		int[] arr = { 3, 1, 2, 5, 4, 50, 51, 100};
		int temp;

		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = 0; i < arr.length - 1 - j; i++) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		for (int i : arr)
			System.out.println(i);
	}
}