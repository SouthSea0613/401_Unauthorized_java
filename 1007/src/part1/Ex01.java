package part1;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("boxVolume(1):"+box(1));    //가로:1, 나머지 기본값1
		System.out.println("boxVolume(1):"+box(1,2));  //가로:1,세로:2
		System.out.println("boxVolume(1):"+box(1,2,3));//가로:1,세로:2,높이:3
	}

	private static int box(int width, int length, int height) {
				return width*length*height;
	}

	private static int box(int width, int length) {
				//return width*length*1;
				return box(width, length, 1);
	}

	private static int box(int width) {
				//return width*1*1;
				return box(width, 1, 1);
	}
}
