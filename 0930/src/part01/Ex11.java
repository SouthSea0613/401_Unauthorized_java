package part01;

public class Ex11 {

	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			for(int j = 2; j <= i; j++) {
				if (i < j) {
					continue;	// 반복문을 탈출하는게 아니라 밑에 줄을 실행 안하고 반복 실행
					// break;
				}
				System.out.print(i + " * " + j + " = " + i *j + "\t");
			}
			System.out.println("");
		}
	}

}
