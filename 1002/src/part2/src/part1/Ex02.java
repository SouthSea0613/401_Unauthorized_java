package part1;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = { 8, 5, 16, 2, 4 }; // 1차원 배열
		// 최대값, 최소값 찾기
		int max, min;
		max = min = score[0]; // max=16 //< , > 보호로만 바뀜
		for (int i = 1; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
			}
			if (min > score[i]) {
				min = score[i];
			}

		}
		System.out.println("min=" + min);
		System.out.println("max=" + max);

	}// main
}// class
