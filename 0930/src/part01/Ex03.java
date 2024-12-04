package part01;

public class Ex03 {

	public static void main(String[] args) {
		/* 윤년
		 * 1. 4년마다 유년
		 * 2. 100년마다 평년
		 * 3. 400년마다 윤년
		 * */
		int year = 1000;
		String year4 = null;
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			year4 = "윤년";
		}
		else {
			year4 = "평년";
		}
		System.out.println(year4);
	}

}
