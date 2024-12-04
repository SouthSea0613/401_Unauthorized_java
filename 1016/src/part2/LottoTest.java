package part2;

import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class LottoTest {
	public static void main(String[] args) {
		Random rnd=new Random();
		int [] numbers=new int[6];{
		//Random 클래스 이용해서 위 배열에 중복되지 않는 로또번호를 저장후
		//정렬해서 저장 후 출력.
		for(int i=0; i<6; i++) {
			numbers[i]=rnd.nextInt(45)+1;
			for(int j=0; j<i; j++) {
				if(numbers[i] == numbers[j]) {
					i--;
					break;
			}
//			System.out.println(rnd.nextInt(45)+1);	
		}
		}			
		
		Arrays.sort(numbers);
		for(int e : numbers) {
			System.out.print(e+",");
		}
	}


//		for(int i=0; i<5; i++) {
//			System.out.println((int)(Math.random()*10)+1); //0~9 / +1 하면 1~10
//		}
//	}
//}

//		Random rnd = new Random();
//		int[] numbers = new int[6];
//		
//		for (int i = 0; i < numbers[i].length; i++) {-
//			arr[i][j]=rand.nextInt(45)+1;
//			for(int k=0;k<j;k++){
//			if(arr[i][j]==arr[i][k]){ //중복값 비교
//				j--; //한번 취소
//					break;

//			for(int j = 0; j < i; j++) {
//					if(numbers[i] == numbers[j]) {
//						i--;
//						break;
//					}
//				} 
//				System.out.println("로또번호: " + Arrays.toString(numbers));
//			}
//		}
//	}	

//		Random rnd=new Random();
//		int [] numbers=new int[6];{
//		//Random 클래스 이용해서 위 배열에 중복되지 않는 로또번호를 저장후
//		//정렬해서 저장 후 출력.
//		for(int i=0; i<6; i++) {
//			numbers[i]=rnd.nextInt(45)+1;
//			for(int j=0; j<i; j++) {
//				if(numbers[i] == numbers[j]) {
//					i--;
//					break;
//			}
//			System.out.println(rnd.nextInt(45)+1);	
//		}
//		}			
//		
//		Arrays.sort(numbers);
//		for(int e : numbers) {
//			System.out.print(e+",");
//		}
		
		
	}
	
}
