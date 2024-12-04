package part01;

import java.io.*;

public class Ex13 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("String.txt"));
		String str;
		while (true) {
			str = in.readLine();
			if (str == null)
				break;
			System.out.println(str);	// readLine메소드 호출시 개행정보는 문자열의 구분자로 사용되고 버려진다. 따라서 문자열 출력 후 개행을 위해서는 println 메소드를 호출해야 한다.
		}
		in.close();
	}
}
