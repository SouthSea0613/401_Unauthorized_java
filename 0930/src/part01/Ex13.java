package part01;

import java.util.Scanner;
// import java.util.Random;

public class Ex13 {

	public static void main(String[] args) {
		/* quiz
		 * 길이가 3
		 * 정수입력받아서 배열에 저장
		 * 배열의 합
		 */
		Scanner scanner = new Scanner(System.in);
		
		// Random random = new Random();
		// random.setSeed(System.currentTimeMillis());
		
		System.out.print("배열 길이 입력 : ");
		int[] arr = new int[scanner.nextInt()];
		// System.out.println(arr);	// 배열 주소값 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print("정수 입력 : ");
			arr[i] = scanner.nextInt();
		}
		
		int sum = 0;
		for (int i = 0; i < arr.length; i ++) {
			sum += arr[i];
		}
		
		System.out.println("합 : " + sum);
		System.out.println("평균 : " + (double)sum / arr.length);
	}

}
