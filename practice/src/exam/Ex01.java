package exam;

public class Ex01 {
	public static void main(String[] args) {
		//오름차순 출력
		int[] arr = { 3, 2, 1, 5, 4 };
		int[] jieun = new int[5];
		int min = arr[0];	
		int idx = 0;

		for (int j = 0; j < arr.length; j++) {
			min = arr[j];	
			idx = j;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] < min) {	
					min = arr[i];	
					idx = i;
				}
			}
			arr[idx] = 6;	
			jieun[j] = min;
		}
	
		for(int j : jieun) {
			System.out.println(j);
		}
	}
}
