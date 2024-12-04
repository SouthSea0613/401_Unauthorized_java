package part2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
	private int[][] arr; // new int[gameCnt][6];
	private int gameCnt; // 게임 수
	
//	public void inputGameCnt() {
//		Scanner key = new Scanner(System.in);
//		System.out.print("게임 수: ");
//		gameCnt = key.nextInt();
//		arr = new int[gameCnt][6];
//	}
//	
	public void gameStart() {
		Random rand = new Random();
		for(int i = 0; i < gameCnt; i++) {
			for(int j = 0; j < arr.length; j++) {
				arr[i][j] = rand.nextInt(45) + 1;
				for(int k = 0; k < j; k++) {
					if(arr[i][j] == arr[i][k]) { //중복 값 비교
						j--;  // 한번 취소
						break;
					}
				}
			}
		}
		sortArr(arr); // 배열 오름차순 정렬
		showLottoArr(arr);
	}
	
	private void sortArr(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			Arrays.sort(arr[i]);
		}
	}

	private void showLottoArr(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.println(arr[i][j]+",");
			System.out.println("");
			}
		}
	}
	
}
