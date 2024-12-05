package part1;

//Comd+sift+z --> JVM --> StudentTest.main()호출  자신없으면 static 붙이지 말기 
public class Ex01 {
	public static void main(String[] args) { // 메인메소드를 인스턴스 메소드로 만들면 에러 뜸
		System.out.println("boxVolum(1) : "+box(1)); //가로 : 1
		System.out.println("boxVolum(1,2) : "+box(1,2)); //가로 : 1 세로 : 2
		System.out.println("boxVolum(1,2,3) : "+box(1,2,3)); //가로 :1 세로 :2 높이 :3
	}

	private static int box(int width, int length, int height) {
		return width*length*height;
	}
	private static int box(int width, int length) {
		//return width*length*1;
		return box(width,length,1);
	}

	private static int box(int width) {
		//return width*1*1;
		return box(width,1,1);
	}
}