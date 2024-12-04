package Part1;

public class Ex02 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		String str="";
		try {
		int len=str.length();
		System.out.println("len: "+len);
			for(int i=0; i<=5; i++) {
			System.out.println(arr[i]);
			}
		} catch(ArrayIndexOutOfBoundsException | NullPointerException e) {  //1. 순차적으로 흐르기 때문에, 이쪽이 Exception 으로 부모를 쓰면, 무조건 처리하기 때문에 안 돼. --> 자식을 먼져 쓰자.
			System.out.println("인덱스 범위 예외 또는 널포인터 예외"); 
			System.out.println(e.getMessage()); //클래스명, 메세지
			e.printStackTrace();
		}
		System.out.println("정상 진행...");
	}
}