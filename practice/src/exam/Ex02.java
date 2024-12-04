package exam;

public class Ex02 {
	public static void main(String[] args) {
		//내림차순 출력
		int[] arr = { 3, 2, 1, 5, 4 };
		int[] jieun = new int[5];
		int max = arr[0];	
		int idx = 0;

		for (int j = 0; j < arr.length; j++) {
			max = arr[j];	
			idx = j;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > max) {	
					max = arr[i];	
					idx = i;
				}
			}
			arr[idx] = 0;	
			jieun[j] = max;
		}
	
		for(int j : jieun) {
			System.out.println(j);
		}
	}
}
