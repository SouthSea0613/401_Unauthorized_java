package part1;

public class Ex05 {
	public static void main(String[] args) {
		int[] arr=new int[] {10,20,30,40,50};
		
		int sum = 0;
//		for (int i = 0; i < arr.length; i++) { //얘는 범위 지정 가능
//			sum += arr[i];
//		}
		for (int e:arr) {  //범위 지정X, 지정한 배열 처음부터 끝까지 모두 복사
			sum += e;
		}
		System.out.println("sum: "+sum);
	}
}
