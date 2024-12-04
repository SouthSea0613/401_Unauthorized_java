package part01;

public class Ex03 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		String str = null;
		
		try {
			for(int i = 0; i <= 5; i++) {
				System.out.printf("%d\n", arr[i]);
			}
			int len = str.length();
		}
		catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
			// TODO: handle exception
			System.out.printf("Exception\n");
			System.out.printf("---\n");
			System.out.printf("%s\n", e.getMessage());
			System.out.printf("---\n");
			e.printStackTrace();
			System.out.printf("---\n");
		}
		System.out.printf("next line\n");
	}
}
