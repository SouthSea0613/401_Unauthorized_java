package part2;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

class MyInfo {
	String info;
	public MyInfo(String info) {
		this.info = info;
	}
	public String toString() {
		return info;
	}
}

public class Ex01 {
	//a.txt쓰기
	public static void main(String[] args) throws FileNotFoundException {
		//풀이2
		OutputStream out = new FileOutputStream("a.txt");
		//출력속도 향상(선택) 필터
		BufferedOutputStream bOut = new BufferedOutputStream(out);
		//바이트 스트림 --> 문자 스트림 변환 필터
		PrintStream pOut = new PrintStream(bOut);
		
		MyInfo mInfo = new MyInfo("저는 Java 프로그래머 입니다.");
		pOut.println("제 소개를 하겠습니다.");
		pOut.println(mInfo);
		pOut.printf("나이 %d, 몸무게 %dkg 입니다.", 24, 72);
		//pOut.flush();
		pOut.close(); // flush() --> end
		
		//풀이1
//		OutputStream out = new FileOutputStream("a.txt");
//		PrintStream pOut = new PrintStream(out);
//		
//		MyInfo mInfo = new MyInfo("저는 자바 프로그래머 입니다.");
//		pOut.println("제 소개를 하겠습니다.");
//		pOut.println(mInfo);
//		pOut.printf("나이 %d, 몸무게 %dkg입니다.", 24, 72);
//		pOut.close();
		
	}
}
