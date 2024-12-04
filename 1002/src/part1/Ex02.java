package part1;

public class Ex02 {
	public static void main(String[] args) {
		int[] score = { 8, 5, 16, 2, 4 }; //1차원 배열
		// 최대 찾기
		int max;
		max=score[0];  //max=8 ----> 인덱스4까지 비교 후 16으로 변경
		for(int i = 1; i<score.length; i++) {
			if(max<score[i]) {
				max=score[i];
			}
		}
		
		System.out.println("max= "+max);
		// 최소 찾기
		int min;
		min = score[4];
		for (int i = 0; i < score.length; i++) {
			if (min > score[i]) {
				min = score[i];
			}
		}
	System.out.println("min= "+min);
	}
}
