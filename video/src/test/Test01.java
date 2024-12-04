package test;

public class Test01 {
	public static void main(String[] args) {
//		정렬 알고리즘을 활용하여 배열에 저장된 정수 데이터를 오름차순, 내림차순으로 정렬 하시오.
//		 
//		실습용 배열 데이터는 아래와 같다. 
//
//		int[]  arr= { 3, 2, 1, 5, 4 };
//
//		Arrays 객체에서 제공하는 sort 메서드를 사용하지 않고 중첩 for문을 활용하도록 한다. 

		int[] arr = { 3, 2, 1, 5, 4 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("내림차순");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("오름차순");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

}
