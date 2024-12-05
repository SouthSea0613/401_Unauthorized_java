package part2;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		//Random 생성자
		long start =System.currentTimeMillis()	;
		Random rnd = new Random(); // 안에 숫자를 씨앗(seed)라고 함 
		//rnd.setSeed(System.currentTimeMillis());
		for (int i = 0; i<6; i++) {
			System.out.println(rnd.nextInt(45)+1);
		}
		long end=System.currentTimeMillis();
		System.out.println("경과시간 : "+(end-start)/1000.+ "초");
		
	
	}
}
