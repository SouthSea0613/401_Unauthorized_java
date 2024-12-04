package exam;

public class Yoonsim{
	public static void main(String[] args) {
		// 윤심.version
		int[] arr = { 3, 2, 1, 5, 4, 99, 1555, 211, 5465165 };
		int temp;

		for (int j = 0; j < arr.length - 1; j++) {
			int max = arr[j];
			int idx = j;
			for (int i = j; i < arr.length; i++) {
				if (arr[i] > max) {
					max = arr[i];
					idx = i;
				}
			}
			temp = arr[j];
			arr[j] = arr[idx];
			arr[idx] = temp;
		}
//		min = arr[1];
//		idx = 1;
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] < min) {
//				min = arr[i];
//				idx = i;
//			}	
//		}
//		temp = arr[1];
//		arr[1] = arr[idx];
//		arr[idx] = temp;
//		
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
