package part2;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		//Random생성자 내부에
		//System.out.println(System.currentTimeMillis()); //씨앗 심는놈
		
		long start=System.currentTimeMillis();
		Random rnd=new Random(12); //씨앗 seed
		rnd.setSeed(System.currentTimeMillis()); //기존 씨앗을 바꾸는것.
		for(int i=0; i<6; i++) {
			System.out.println(rnd.nextInt(45)+1);
		}
		long end=System.currentTimeMillis();
		System.out.println("경과시간: "+(end-start)/1000.+"초");
	}
}
