package part2;

import java.util.Arrays;
import java.util.StringTokenizer;

public class LottoTest {
	public static void main(String[] args) {
		
		String strData = "11,22,33,44,55";
		String[] arr = strData.split(",");
		for(String s : arr) {
			System.out.println(s);
		}
		
//		StringTokenizer st = new StringTokenizer(strData, ": -");
//		while (st.hasMoreTokens())
//			System.out.println(st.nextToken());
//		
//		for(int i = 0; i < 5; i++) {
//			System.out.println((int)(Math.random()*10)); //0~9
//		}
//		
//		Lotto lotto = new Lotto();
//		lotto.inputGameCnt();
//		lotto.gameStart();
//		int [] numbers = new int [6];
//		//Random클래스 이용해서 위 배열에 중복되지 않는 로또번호를 저장 후 정렬해서 출력
//		
//		Arrays.sort(numbers);
//		for(int e : numbers) {
//			System.out.print(e+",");
//		}
	}

}
