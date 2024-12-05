package part1;

import java.util.Scanner;

public class Ex05 {

	
	
	
	
	
	
	
	
	
	
	
	
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr = createArr();
		setArr(arr);
		showArr(arr);
	}

	private static void setArr(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 학생 응시과목수:");
			int subjectCnt = sc.nextInt();
			arr[i] = new int[subjectCnt];
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("과목 점수 입력: ");
				arr[i][j] = sc.nextInt();
			}
		}
	}
	private static int[][] createArr() {
		System.out.print("학생수 입력:");
		int stdCnt = sc.nextInt();
		int[][] arr = new int[stdCnt][];
		return arr;
	}

	private static void showArr(int[][] arr) {
		System.out.println("----------------------");
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			System.out.println(i + 1 + "번 학생 총점 : " + sum);
			System.out.println(i + 1 + "번 학생 평균 : " + (double) sum / arr[i].length);
		}
	}
}
