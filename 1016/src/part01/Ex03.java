package part01;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
		Random random = new Random();	// seed
		// random.setSeed(System.currentTimeMillis());
		
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d\n", (random.nextInt(10) + 1));
		}
		long end = System.currentTimeMillis();
		System.out.printf("경과시간 : %.3fs\n", (end - start) / 1000.);
	}
}
