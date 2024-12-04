package part2;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		// Random 생성자
		long start = System.currentTimeMillis();
		Random rnd = new Random(); // seed
		// rnd.setSeed(System.currentTimeMillis());
		for (int i = 0; i < 6; i++) {
			// System.out.println(rnd.nextInt(45)+1); // 1-45
			System.out.println(rnd.nextInt(100) % 45 + 1); // 1-45
		}
		long end = System.currentTimeMillis();
		System.out.println("경과시간: " + (end - start) / 1000. + "초");
	}
}
