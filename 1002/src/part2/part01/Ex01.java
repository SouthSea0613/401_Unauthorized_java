package part01;

public class Ex01 {

	public static void main(String[] args) {
		int[] score = {4, 5, 2, 1, 3};
		int min = score[0], min_seq = 0, max = score[0], max_seq = 0;
		
		for (int i = 1; i < score.length; i++) {
			if (min > score[i]) {
				min = score[i];
				min_seq = i;
			}
			
			if (max < score[i]) {
				max = score[i];
				max_seq = i;
			}
		}
		
		System.out.println("최소값 : " + (min_seq + 1) + "번째, " + min);
		System.out.println("최대값 : " + (max_seq + 1) + "번째, " + max);
	}

}
