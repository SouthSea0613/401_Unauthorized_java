package practice;

public class Ex02 {
	// 10.24 1
	public static void main(String[] args) {
		int[] arr = { 1, 2 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-------------------");

		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
