package part02;

import java.util.Random;
import java.util.Scanner;

public class Ex1024_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int isWin = 0;

		while (isWin == 0) {
			System.out.printf("숫자입력(가위 = 0, 바위 = 1, 보 = 2) : ");
			int player = scanner.nextInt();
			int computer = random.nextInt(3);

			switch (player) {
			case 0: {
				System.out.printf("player = 가위, ");
				switch (computer) {
				case 0: {
					System.out.printf("computer = 가위\n");
					isWin = 0;
					System.out.printf("비겼습니다. 다시합니다.\n");
					break;
				}
				case 1: {
					System.out.printf("computer = 바위\n");
					isWin = -1;
					System.out.printf("player 졌습니다.\n");
					break;
				}
				case 2: {
					System.out.printf("computer = 보\n");
					isWin = 1;
					System.out.printf("player 이겼습니다.\n");
					break;
				}
				}
				break;
			}
			case 1: {
				System.out.printf("player = 바위, ");
				switch (computer) {
				case 0: {
					System.out.printf("computer = 가위\n");
					isWin = 1;
					System.out.printf("player 이겼습니다.\n");
					break;
				}
				case 1: {
					System.out.printf("computer = 바위\n");
					isWin = 0;
					System.out.printf("비겼습니다. 다시합니다.\n");
					break;
				}
				case 2: {
					System.out.printf("computer = 보\n");
					isWin = -1;
					System.out.printf("player 졌습니다.\n");
					break;
				}
				}
				break;
			}
			case 2: {
				System.out.printf("player = 보, ");
				switch (computer) {
				case 0: {
					System.out.printf("computer = 가위\n");
					isWin = -1;
					System.out.printf("player 졌습니다.\n");
					break;
				}
				case 1: {
					System.out.printf("computer = 바위\n");
					isWin = 1;
					System.out.printf("player 이겼습니다.\n");
					break;
				}
				case 2: {
					System.out.printf("computer = 보\n");
					isWin = 0;
					System.out.printf("비겼습니다. 다시합니다.\n");
					break;
				}
				}
				break;
			}
			}
		}
	}
}
