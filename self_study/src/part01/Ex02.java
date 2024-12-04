package part01;

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		int train_amount = 1000; // Param 1 : 학습횟수
		float learn_rate = 0.005f; // param 2 : 학습률

		Random random = new Random();

		int x = random.nextInt();
		int y = random.nextInt();
		if (x < 0) {
			x = -x;
		}
		if (y < 0) {
			y = -y;
		}

		double change_amount = 1.0f; // a 변화량
		double a = 1.0f; // 초기값

		System.out.printf("(x, y) = (%d, %d), answer = %f\n", x, y, (double)y / (double)x);
		for (int j = 0; j < train_amount; j++) {
			System.out.printf("학습 %d회 : ", j + 1);
			if (x * a < y) {
				a += change_amount * learn_rate;
			} else {
				a -= change_amount * learn_rate;
			}
			System.out.printf("%f\n", a);
		}
		System.out.printf("오차 : %s\n", Math.abs((double)y / (double)x - a));
	}
}
