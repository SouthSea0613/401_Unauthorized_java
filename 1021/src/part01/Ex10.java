package part01;

import java.io.*;

class MyInfo {
	String info;

	public MyInfo(String info) {
		this.info = info;
	}

	public String toString() {
		return info;
	}
}

public class Ex10 {
	public static void main(String[] args) throws IOException {
		OutputStream outputStream = new FileOutputStream("a.txt");
		PrintStream printStream = new PrintStream(outputStream);
		
		MyInfo mInfo = new MyInfo("저는 자바 프로그래머입니다.");
		printStream.printf("제 소개를 하겠습니다.\n");
		printStream.printf("%s\n", mInfo);
		printStream.printf("나이 %d, 몸무게 %dkg입니다.", 24, 72);
		printStream.close();
	}
}
