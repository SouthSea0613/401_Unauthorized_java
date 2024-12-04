package part01;

import java.io.*;

public class Ex14 {	// 91페이지 예제 5번 정답
	public static void main(String[] args) throws IOException {
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("printf.txt")));
		
		out.printf("제 나이는 %d살 입니다.\n", 24);
		out.write("저는 자바가 좋습니다.\n");
		out.print("특히 I/O 부분에서 많은 매력을 느낍니다.\n");
		out.close();
		
		BufferedReader in = new BufferedReader(new FileReader("printf.txt"));
		String str;
		while (true) {
			str = in.readLine();
			if (str == null) {
				break;
			}
			System.out.println(str);
		}
		in.close();
	}
}
