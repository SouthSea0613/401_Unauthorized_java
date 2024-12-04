package part01;

public class Ex04 {

	public static void main(String[] args) {
		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
		}
		
		for (int j = 0; j < 5; j++) {
			System.out.println(j);
		}
		
		int start = 1, end = 100, sum = 0;
		
		for (int j = start; j <= end; j++) {
			sum += j;
		}
		// sum = (start + end) * (end - start + 1) / 2;
		/* while(start <= end) {
			sum += start++;
		} */
		System.out.println(sum);
	}

}
