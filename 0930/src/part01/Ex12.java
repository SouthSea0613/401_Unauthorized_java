package part01;

// Array 자료구조
public class Ex12 {

	public static void main(String[] args) {
		// int[] score = new int[] {10, 20, 30, 40, 50};
		/*
		int[] score = new int[5];
		score = new int[] {10, 20, 30, 40, 50};
		*/
		int len = 50;
		int[] score = new int[len];
		for (int i = 0; i < len; i++) {
			score[i] = i + 50;
		}
		
		for (int i = 0; i < score.length; i++) {
			System.out.println(i + "번 요소(" + score[i] + ") : " + ((score[i] % 2 == 1) ? "홀수" : "짝수"));
		}
	}

}
