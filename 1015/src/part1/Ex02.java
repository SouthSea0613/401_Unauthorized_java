package part1;

public class Ex02 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		String str = null;
		try {
			int len = str.length();
			System.out.println("len: " + len);
			for (int i = 0; i <= 5; i++) {
				System.out.println(arr[i]);
			}
			//catch를 두 번 이상 사용 할 경우 Exception을 맨 마지막에 사용(부모니까!!!)
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위 예외");
			System.out.println(e);
			e.printStackTrace();
		} catch (NullPointerException e) { //모든 Exception 의 조상타입은 Exception!!!!! 암기
			System.out.println("널포인터 예외");
			System.out.println(e);
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("정상 진행........");
	}
}
