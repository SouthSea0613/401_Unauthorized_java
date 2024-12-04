package part3;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto2 {
	public static void main(String[] args) {
		Random random = new Random();
		
		Set<Integer> lottoNumbers = new HashSet<>();
		
		//중복되지 않는 6개의 무작위 정수 생성
		while (lottoNumbers.size() < 6) {
			int number = random.nextInt(45) + 1; //1~45 사이의 숫자 생성
			lottoNumbers.add(number); //중복되지 않으면 추가 됨
		}
		//결과 출력
		System.out.println("생성된 로또 번호: "+lottoNumbers);
	}

}
