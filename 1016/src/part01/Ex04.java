package part01;

import java.util.InputMismatchException;
import java.util.Scanner;

// 음수 입력시 오류문구
class NumInputException extends Exception {
	public NumInputException() {
		super("양수를 입력해주세요.\n");
	}
}

// public class
public class Ex04 {
	// 음수 입력시 catch
	public static int readNum() throws NumInputException {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (num < 0) {
			scanner.nextLine();
			throw new NumInputException();
		} else {
			scanner.nextLine();
			return num;
		}
	}

	// main method
	public static void main(String[] args) {
		// 로또 장수 * 6 개의 배열 생성
		int[][] lottoPaper;
		while (true) {
			System.out.printf("구매할 로또 갯수 : ");
			try {
				lottoPaper = new int[readNum() * 5][6]; // 로또는 한장당 5개씩
				break;
			} catch (InputMismatchException e) {
				System.out.printf("정수를 입력해주세요\n");
			} catch (NumInputException e) {
				System.out.printf("%s", e.getMessage());
			}
		}

		// 로또 번호 생성
		for (int i = 0; i < lottoPaper.length; i++) {
			int j = 0;
			while (j < 6) { // 현재 뽑은 숫자가 중복이 아닐때까지 무한 반복
				int tmp = (int) (Math.random() * 45) + 1;

				boolean isExist = false; // 중복값 체크
				for (int k = 0; k < j; k++) {
					if (tmp == lottoPaper[i][k]) {
						isExist = true;
						break;
					}
				}

				if (!isExist) { // 현재 뽑은 숫자가 중복되지 않을 경우
					lottoPaper[i][j++] = tmp;
				}
			}

		}

		// 오름차순 정렬(sort 안쓰고)
		for (int i = 0; i < lottoPaper.length; i++) {	// 알고리즘
			for (int j = 5; j >= 0; j--) { // 순차비교 교환
				for (int k = 0; k < j; k++) {
					if (lottoPaper[i][k] > lottoPaper[i][k + 1]) {
						int tmp = lottoPaper[i][k];
						lottoPaper[i][k] = lottoPaper[i][k + 1];
						lottoPaper[i][k + 1] = tmp;
					}
				}
			}
		}

		// 출력
		for (int i = 0; i < lottoPaper.length; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.printf("%d", lottoPaper[i][j]);
				if (j < 5) { // 맨 끝에는 \t 생략
					System.out.printf("\t");
				}
			}
			if (i < lottoPaper.length - 1) {
				System.out.printf("\n"); // 맨 끝에는 \n 생략
			}
		}
	}
}
