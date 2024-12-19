package part01;

import java.util.Random;

@FunctionalInterface
interface RndGenerate{
	int rand();  //입력값 없고, 난수를 반환
}

public class Ex06 {
	public static void main(String[] args) {
		RndGenerate gen = () ->{
			Random rnd = new Random();
			return rnd.nextInt(50);  //return 생략불가
		};
		System.out.println(gen.rand());
	}
}
