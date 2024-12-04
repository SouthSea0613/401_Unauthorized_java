package part1;

public class Ex07 {
	public static void main(String[] args) {
//		int i = 2;
//		//2-9단, 8번
//		while(i<=9) {
//			int j = 1;
//			//1-9, 9번
//			while (j <= 9) {
//				//72번 실행
//				System.out.println(i+"*"+j+"="+i*j);
//				j++;
//			}
//			System.out.println("--------------");
//			i++;  //2단, 3단,....
//		}
		int i, j;
		for(i=2; i<=9; i++) {
			for(j=1; j<=9; j++) {
				if(i<j) continue;
				System.out.println(i+"*"+j+"="+i*j);
			}
//			System.out.println("--------------");
		}
	}
}
