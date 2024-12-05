
package part01;

public class Ex04 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		int sum = 0;
		for (int i:arr) { // : 뒤에는 무조건 배열이옴 for each 는 무조건 배열 전부를 돌아야함
			sum += i;
		}
		
		System.out.println(sum);
	}

}
